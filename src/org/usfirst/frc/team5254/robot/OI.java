
package org.usfirst.frc.team5254.robot;

import org.usfirst.frc.team5254.robot.commands.DrivetrainDriveWithJoystick;
import org.usfirst.frc.team5254.robot.commands.DrivetrainShiftDown;
import org.usfirst.frc.team5254.robot.commands.DrivetrainShiftUp;
import org.usfirst.frc.team5254.robot.commands.DrivetrainSlowTurn;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public Joystick driverJoystick = new Joystick(RobotMap.DRIVER_JOYSTICK);
	public Joystick operatorJoystick = new Joystick(RobotMap.OPERATOR_JOYSTICK);
	
	public OI() {
		//defining buttons
		Button DriverButtonA = new JoystickButton(operatorJoystick, 1);
		Button DriverButtonX = new JoystickButton(operatorJoystick, 3);
		Button DriverButtonB = new JoystickButton(operatorJoystick, 2);
		Button DriverButtonRB = new JoystickButton(driverJoystick, 6);
		Button DriverButtonRJC = new JoystickButton(driverJoystick, 10);
		//subcommands
		DriverButtonRB.whenPressed(new DrivetrainShiftUp());
		DriverButtonRB.whenInactive(new DrivetrainShiftDown());
		DriverButtonRJC.whenPressed(new DrivetrainSlowTurn());
		DriverButtonRJC.whenInactive(new DrivetrainDriveWithJoystick());
	}
	
}