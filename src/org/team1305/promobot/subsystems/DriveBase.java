/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1305.promobot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team1305.promobot.RobotMap;
import org.team1305.promobot.commands.DriveArcadeWithSmoothing;

/**
 *
 * @author Root 1
 */
public class DriveBase extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private final RobotDrive chassis = new RobotDrive( RobotMap.PWM_LEFT_FRONT_DRIVE_MOTOR,
                                                       RobotMap.PWM_LEFT_REAR_DRIVE_MOTOR,
                                                       RobotMap.PWM_RIGHT_FRONT_DRIVE_MOTOR,
                                                       RobotMap.PWM_RIGHT_REAR_DRIVE_MOTOR);
    public boolean inHighGear = true; //whether or not the robot is in "high gear"
    
    
    
    
                
    public DriveBase() {
        //change RobotDrive expiry from default 1/10th second to 1 second so
        //don't keep getting "Robot Drive... Output not updated often enough." messages
        //chassis.setExpiration(1.0);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveArcadeWithSmoothing());
    }
    
    public void arcadeDrive(double move, double rotate) {
        chassis.arcadeDrive(move, rotate, true);
        
    }
    public void stop(){
        chassis.arcadeDrive(0.0, 0.0);
    }
    
    public void updateStatus(){
        //SmartDashboard.putData("ArcadeMove", chassis.isAlive().toString());
    }
    
    public void driveWithSmoothing(double move, double rotate){  
    }
}
