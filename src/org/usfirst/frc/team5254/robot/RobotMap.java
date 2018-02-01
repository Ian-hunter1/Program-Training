package org.usfirst.frc.team5254.robot;

public class RobotMap {
	
	//Motor Controllers
	public static final int DRIVETRAIN_LEFT = 0;
	public static final int DRIVETRAIN_LEFT2 = 1;
	public static final int	DRIVETRAIN_RIGHT = 2;
	public static final int DRIVETRAIN_RIGHT2 = 3;
	public static final int CUBE_MECH_LEFT = 4;
	public static final int CUBE_MECH_RIGHT = 5;
	public static final int ELEVATOR = 6;
	
	//Joysticks
	public static final int DRIVER_JOYSTICK = 0;
	public static final int OPERATOR_JOYSTICK = 1;
	
	//axis
	public static final int DRIVER_THROTTLE_AXIS = 1;
	public static final int DRIVER_TURN_AXIS = 4;
	public static final int OPERATOR_THROTTLE_AXIS = 5;
	
	
	//pistons
	public static final int SHIFTING_PISTON = 0;
	public static final int CUBE_MECH_ARMS = 1;
	public static final int CUBE_MECH_HINGE_UP = 2;
	public static final int CUBE_MECH_HINGE_DOWN = 3;
	
	//Misc
	public static final double DRIVETRAIN_GEAR_RATIO = ((25.0 / 6.0) * (100.0 / 91.0));
	public static final int DRIVETRAIN_WHEEL_DIAMETER = 6;
	
	public static final int ELEVATOR_GEAR_RATIO = 1;
	public static final int ELEVATOR_AXIS_DIAMETER = 1;
	public static final int ENCODER_TICKS = 256;
	
	public static final double Kp = 0.3;
	public static final double TURN_P = 0.02;
	public static final double TURN_I = 0.002;
	public static final double TURN_D = 0.2;
}
