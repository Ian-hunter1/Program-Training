package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class CubeMechIntake extends Command {

    public CubeMechIntake() {
    	requires(Robot.CubeMech);
    }
    
    protected void initialize() {
    	
    }
    
    protected void execute() {
    	 Robot.CubeMech.Intake();
    }
    
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    	
    }
    
    protected void interrupted() {
    	end();
    }
}
