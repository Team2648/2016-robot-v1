package org.usfirst.frc.team2648.commands;

import org.usfirst.frc.team2648.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShootTime extends Command{
private double time,speed;
	
    public ShootTime(double i,double s) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shooter);
    	time=i;
    	speed = s;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(time);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.setShoot(-speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.setShoot(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.intake.runIntake(0);
    }
}
