package org.team1305.promobot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    
    //non-port-related constants
    public static double LOW_GEAR_SCALING_FACTOR = 0.6;
    public static final String CAMERA_IP = "10.13.5.11";
    public static final double JOYSTICK_DEAD_BAND = 0.05;
    public static  final String cameraXAxisOffsetShareName = "X offset";
    public static  final String cameraYAxisOffsetShareName = "Y offset";
    public static final String cameraParticleCountShareName = "Camera Particle Count";
    
//PWM channels
     public static final int PWM_LEFT_FRONT_DRIVE_MOTOR = 1;
    public static final int PWM_LEFT_REAR_DRIVE_MOTOR = 2;
    public static final int PWM_RIGHT_FRONT_DRIVE_MOTOR = 3;
    public static final int PWM_RIGHT_REAR_DRIVE_MOTOR = 4;
   // public static final int PWM_RIGHT_FRONT_DRIVE_MOTOR = 3;
 //   public static final int PWM_RIGHT_REAR_DRIVE_MOTOR = 4;
    
    
    //Joystick Button Mappings
    public static final int JOY_ARCADE_DRIVE_TURN_AXIS = 3;
    public static final int JOY_ARCADE_DRIVE_MOVE_AXIS = 1;
    
    //Solenoid Ports (note Solenoid breakout plugs into slot 3 on CRio)
    public static final int SOL_CAMERA_LIGHT_RING = 4;
    public static final int SOL_INDICATOR_LIGHT_RED = 1;
    public static final int SOL_INDICATOR_LIGHT_WHITE = 2;
    public static final int SOL_INDICATOR_LIGHT_BLUE = 3;
    
}
