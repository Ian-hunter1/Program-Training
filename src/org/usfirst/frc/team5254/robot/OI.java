
package org.usfirst.frc.team5254.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick driverJoystick = new Joystick(RobotMap.DRIVER_JOYSTICK);
	public Joystick operatorJoystick = new Joystick(RobotMap.OPERATOR_JOYSTICK);
	
	public OI() {
	
}
