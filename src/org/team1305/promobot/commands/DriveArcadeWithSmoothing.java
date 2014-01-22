/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1305.promobot.commands;

import edu.wpi.first.wpilibj.PIDController;
import org.team1305.promobot.ManualPIDLink;

/**
 *
 * @author Paul Belanger
 */
public class DriveArcadeWithSmoothing extends CommandBase {
    
    //Values for PID driving
    final double DRIVE_P = -0.0;
    final double DRIVE_I = 0.4;
    final double DRIVE_D = -0.01;
    
    final double STEER_P = -0.0;
    final double STEER_I = 0.4;
    final double STEER_D = -0.01;
    //and the objects
    ManualPIDLink driveLink = new ManualPIDLink();
    ManualPIDLink steerLink = new ManualPIDLink();
    PIDController drivePID = new PIDController(DRIVE_P,
                                               DRIVE_I,
                                               DRIVE_D,
                                               driveLink,
                                               driveLink);
    PIDController steerPID = new PIDController(STEER_P,
                                               STEER_I,
                                               STEER_D,
                                               steerLink,
                                               steerLink);
    double moveValue;
    double steerValue;
    
    public DriveArcadeWithSmoothing() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(driveBase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        drivePID.setOutputRange(-1.0, 1.0);
        steerPID.setOutputRange(-1.0, 1.0);
        
        drivePID.setInputRange(-1.0, 1.0);
        steerPID.setInputRange(-1.0, 1.0);
        
        drivePID.enable();
        steerPID.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //first, we get the stick values and set them as the PIDSetpoints
        drivePID.setSetpoint(oi.getDriveStickValue());
        steerPID.setSetpoint(oi.getTurnStickValue());
        //and pull the output to apply to the victors.
        driveBase.arcadeDrive(drivePID.get(), steerPID.get());
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
