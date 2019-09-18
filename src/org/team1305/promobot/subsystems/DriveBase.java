/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1305.promobot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team1305.promobot.RobotMap;
import org.team1305.promobot.commands.Drive;

/**
 *
 * @author Root 1
 */
public class DriveBase extends Subsystem {
    
    private final RobotDrive chassis = new RobotDrive(RobotMap.PWM_LEFT_FRONT_DRIVE_MOTOR,
                                                      RobotMap.PWM_LEFT_REAR_DRIVE_MOTOR,
                                                      RobotMap.PWM_RIGHT_FRONT_DRIVE_MOTOR,
                                                      RobotMap.PWM_RIGHT_REAR_DRIVE_MOTOR);
                
    public DriveBase() {

    }
    
    public void initDefaultCommand() {
        
        setDefaultCommand(new Drive());
    }
    
    public void tankDrive(double leftValue, double rightValue) {
        
        chassis.tankDrive(leftValue, rightValue);
    }
            
    public void stop(){
        
        chassis.arcadeDrive(0.0, 0.0);
    }
}
