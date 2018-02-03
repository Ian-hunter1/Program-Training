package org.usfirst.frc.team5254.robot.autocommands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveToDistance extends Command {
	
	double Throttle;
	double Distance;
	
    public DriveToDistance(double Throttle, double Distance) {
        this.Throttle = Throttle;
        this.Distance = Distance;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.Drivetrain.autoDriveToDistanceInIt(Throttle, Distance);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Drivetrain.autoDriveToDistance();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
