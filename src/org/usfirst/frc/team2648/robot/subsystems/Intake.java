package org.usfirst.frc.team2648.robot.subsystems;

import org.usfirst.frc.team2648.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Intake extends Subsystem {
    SpeedController intake = RobotMap.intake;
    public DigitalInput ball = RobotMap.ball;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void runIntake(double in){
    	intake.set(in); //set intake to value
    }
    
    public void intakeStop(double in){
    	if(!ball.get()){
    		intake.set(in);
    	}
    	else{
    		intake.set(0);
    	}
    }
    
    
}

