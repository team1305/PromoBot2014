package org.team1305.promobot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    
    //non-port-related constants
    public static double LOW_GEAR_SCALING_FACTOR = 0.6;
    public static final String CAMERA_IP = "10.13.5.11";
    public static  final String cameraXAxisOffsetShareName = "X offset";
    public static  final String cameraYAxisOffsetShareName = "Y offset";
    public static final String cameraParticleCountShareName = "Camera Particle Count";
    
//PWM channels
     public static final int PWM_LEFT_FRONT_DRIVE_MOTOR = 1;
    public static final int PWM_LEFT_REAR_DRIVE_MOTOR = 2;
    public static final int PWM_RIGHT_FRONT_DRIVE_MOTOR = 3;
    public static final int PWM_RIGHT_REAR_DRIVE_MOTOR = 4;

    public static final int RELAY_LIGHTS = 2;
}
