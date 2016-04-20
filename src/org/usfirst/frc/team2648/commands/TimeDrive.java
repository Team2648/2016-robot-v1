package org.usfirst.frc.team2648.commands;

import org.usfirst.frc.team2648.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimeDrive extends Command {

	private double time;
	private double left;
	private double right;
    public TimeDrive(double t, double l, double r) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	time = t;
    	left = l;
    	right = r;
    	setTimeout(time);
    	System.out.println("TimeDrive constructor");
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("TimeDriver Execute");
    	Robot.driveTrain.drive(left, right);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("TimeDrive End");
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
