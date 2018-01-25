package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.RobotMap;
import org.usfirst.frc.team5254.robot.commands.DrivetrainDriveWithJoystick;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	//spark encoders
	public static Spark driveControllerLeft1 = new Spark(RobotMap.DRIVETRAIN_LEFT);
	public static Spark driveControllerLeft2 = new Spark(RobotMap.DRIVETRAIN_LEFT2);
	public static SpeedControllerGroup driveControllersLeft = new SpeedControllerGroup(driveControllerLeft1, driveControllerLeft2);
	 
	//victor encoders
    public static Victor driveControllerRight1 = new Victor(RobotMap.DRIVETRAIN_RIGHT);
    public static Victor driveControllerRight2 = new Victor(RobotMap.DRIVETRAIN_RIGHT2);
    public static SpeedControllerGroup driveControllersRight = new SpeedControllerGroup(driveControllerRight1, driveControllerRight2);
    
    //differential drive
    public static DifferentialDrive drivetrain = new DifferentialDrive(driveControllersLeft, driveControllersRight);
    
    //pistons
    public static Solenoid shiftingPiston = new Solenoid(RobotMap.SHIFTING_PISTON);
    
    //calling commands
    public Drivetrain() {     
    }
    public void stop() {
		drivetrain.arcadeDrive(0.0,0.0);
	}
	public void shiftDown() {
		shiftingPiston.set(true);
	}
	public void shiftUp() {
		shiftingPiston.set(false);
	}
	public void slowTurn(double Throttle, double Turn) {
		drivetrain.arcadeDrive(Throttle, 0.5 * Turn);
	}
	
	public void drive(double Throttle,double Turn) {
		drivetrain.arcadeDrive(Throttle, -Turn);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DrivetrainDriveWithJoystick());
	}
}

