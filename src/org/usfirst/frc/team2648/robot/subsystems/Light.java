package org.usfirst.frc.team2648.robot.subsystems;

import org.usfirst.frc.team2648.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Light extends Subsystem {
    Relay light = RobotMap.light;
    SpeedController lightM = RobotMap.lightM;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void lightOn(){
    	//light.set(Relay.Value.kOn);
    	lightM.set(1);
    }
    public void lightOff(){
    	//light.set(Relay.Value.kOff);
    	lightM.set(0);
    }
}

