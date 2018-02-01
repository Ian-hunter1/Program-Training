package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.commands.CubeMechArmsDown;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Nothing extends CommandGroup {

    public Nothing() {
        requires(Robot.CubeMech);
        
        addSequential(new CubeMechArmsDown());
    }
}
