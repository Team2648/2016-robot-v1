package org.usfirst.frc.team2648.robot.subsystems;

import org.usfirst.frc.team2648.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Shooter extends Subsystem {
    SpeedController shooter = RobotMap.shooterLeft;
    SpeedController shooter2 = RobotMap.shooterRight;
    DigitalInput ball = RobotMap.ball;
    SpeedController lightM = RobotMap.lightM;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    
    public void setShoot(double shoot){
    	shooter.set(shoot);
    	shooter2.set(shoot);
    	if(shoot < 0){
    		lightM.set(1);
    	}
    }
    
    public void stop(){
    	shooter.set(0);
    	shooter2.set(0);
    	lightM.set(0);
    }
}

