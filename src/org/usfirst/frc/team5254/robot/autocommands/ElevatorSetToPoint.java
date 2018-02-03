package org.usfirst.frc.team5254.robot.autocommands;

import org.usfirst.frc.team5254.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ElevatorSetToPoint extends Command {
	
	double Speed;
	double Distance;

    public ElevatorSetToPoint(double Speed, double Distance) {
    	this.Distance = Distance; 
    	this.Speed = Speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.Elevator.autoTimedRaiseInit(Speed, Distance);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Elevator.autoRaiseDistance(Speed, Distance);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.Elevator.raiseAutoIsFinished();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Elevator.ElevatorStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
