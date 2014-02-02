
package org.team1305.promobot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.team1305.promobot.commands.CameraIndicatorLightOn;
import org.team1305.promobot.commands.DriveArcadeMode;
import org.team1305.promobot.commands.DriveArcadeWithSmoothing;
import org.team1305.promobot.commands.CameraActive;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    boolean invertDriveJoystickSignal = true;
    boolean invertTurnJoystickSignal = true;
    private Joystick driveStick = new Joystick(RobotMap.JOY_ARCADE_DRIVE_MOVE_AXIS);
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    Button  btnXEnableSmoothing         = new JoystickButton(driveStick, 3),
            btnADisableSmoothing        = new JoystickButton(driveStick, 1),
            btnBStartRedLight      = new JoystickButton(driveStick, 2),
            btnYAnalyzeImage      = new JoystickButton(driveStick, 4),
            btnLB     = new JoystickButton(driveStick, 5),
            btnRB     = new JoystickButton(driveStick, 6),
            btnLT     = new JoystickButton(driveStick, 7),
            btnRT     = new JoystickButton(driveStick, 8),
            btnBack   = new JoystickButton(driveStick, 9),
            btnStart  = new JoystickButton(driveStick, 10),
            btnLStick = new JoystickButton(driveStick, 11),
            btnRStick = new JoystickButton(driveStick, 12);
    
    public OI()
    {
        btnXEnableSmoothing.whenPressed(new DriveArcadeWithSmoothing());
        btnADisableSmoothing.whenPressed(new DriveArcadeMode());
        btnBStartRedLight.whenPressed(new CameraIndicatorLightOn());
        btnYAnalyzeImage.whenPressed(new CameraActive());
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

    public double getTurnStickValue() {
        if (invertTurnJoystickSignal)
        {
            return driveStick.getZ() * -1;
        }
        else
        {
            return driveStick.getZ();
        }
    }
}

