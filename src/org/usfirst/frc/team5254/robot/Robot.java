

package org.usfirst.frc.team5254.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team5254.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {
	
	static Timer timer = new Timer();
	
	Command autonomousCommands;
	
	public static OI oi;
	public static Drivetrain Drivetrain = new Drivetrain();
	
	
	@Override
	public void robotInit() {
		
	}

	

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	
	@Override
	public void autonomousInit() {
		
		}
	
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		
		}
	
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
