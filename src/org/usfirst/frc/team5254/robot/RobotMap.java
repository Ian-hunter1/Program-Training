

package org.usfirst.frc.team5254.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
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
}
