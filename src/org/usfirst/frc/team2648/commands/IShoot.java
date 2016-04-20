package org.usfirst.frc.team2648.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class IShoot extends CommandGroup {

	public static double time;
	
	public IShoot(double time){
		addParallel(new IntakeTime(time));
		addParallel(new ShootTime(time,1));
	}
}
