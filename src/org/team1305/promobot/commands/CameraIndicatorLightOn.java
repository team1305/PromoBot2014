/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1305.promobot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import org.team1305.promobot.RobotMap;

/**
 *
 * @author Kim
 */
public class CameraIndicatorLightOn extends CommandBase {
    
    public CameraIndicatorLightOn() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(camera);
        this.setTimeout(1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        camera.SetIndicatorLights(true, false, false);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
