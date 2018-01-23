package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	public static Spark driveControllerLeft1 = new Spark(RobotMap.DRIVETRAIN_LEFT);
	public static Spark driveControllerLeft2 = new Spark(RobotMap.DRIVETRAIN_LEFT);
	public static SpeedControllerGroup driveControllersLeft = new SpeedControllerGroup(driveControllerLeft1, driveControllerLeft2);
	 
    public static Victor driveControllerRight1 = new Victor(RobotMap.DRIVETRAIN_RIGHT);
    public static Victor driveControllerRight2 = new Victor(RobotMap.DRIVETRAIN_RIGHT);
    public static SpeedControllerGroup driveControllersRight = new SpeedControllerGroup(driveControllerRight1, driveControllerRight2);
    
    public static DifferentialDrive drivetrain = new
    public void initDefaultCommand() {
        
    }
}

