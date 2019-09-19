
package org.team1305.promobot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.team1305.promobot.commands.ToggleLights;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    boolean invertDriveJoystickSignal = true;
    boolean invertTurnJoystickSignal = false;
    boolean isArcade = true;
    
    private final Joystick driveStick = new Joystick(1);
    private final Joystick turnStick = new Joystick(2);
 
    private final Button btnToggleLights = new JoystickButton(driveStick, 1);
    
    public OI(){

        btnToggleLights.whenPressed(new ToggleLights());
    }
    
    public double getDriveStickValue() {
        
        if (invertDriveJoystickSignal)
        {
            return driveStick.getY() * -1;
        }
        else
        {
            return driveStick.getY();
        }
        //.getRawAxis(RobotMap.JOY_ARCADE_DRIVE_MOVE_AXIS)
    }
    
    public double getRightStickValue() {
        
        if (invertDriveJoystickSignal) {
            return turnStick.getY() * -1;
        } else {
            return turnStick.getY();
        }
    }
}

