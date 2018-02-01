package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.autocommands.DriveToDistance;
import org.usfirst.frc.team5254.robot.autocommands.LowerArms;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class CrossAutoLine extends CommandGroup {

    public CrossAutoLine() {
        requires(Robot.Drivetrain);
        requires(Robot.CubeMech);
        
        addSequential(new LowerArms());
        addParallel(new DriveToDistance(1.0, 108));
    }
}
