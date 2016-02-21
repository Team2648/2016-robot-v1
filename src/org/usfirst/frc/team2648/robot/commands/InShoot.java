package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class InShoot extends CommandGroup {

	public InShoot(double i, double f){
		addSequential(new ShootTime(i+f,1));
		addSequential(new IShoot(f)); 
	}
}
