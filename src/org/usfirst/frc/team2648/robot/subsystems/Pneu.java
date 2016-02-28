package org.usfirst.frc.team2648.robot.subsystems;

import org.usfirst.frc.team2648.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneu extends Subsystem {
	DoubleSolenoid intake1 = RobotMap.intake1;
	DoubleSolenoid intake2 = RobotMap.intake2;
	DoubleSolenoid hang1 = RobotMap.hang1;
	DoubleSolenoid hang2 = RobotMap.hang2;
	//DoubleSolenoid wb = RobotMap.wb;
	Compressor comp = RobotMap.comp;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void startComp(){
    	comp.start(); //start compressor
    }

    public void intakeUp(){
    	intake1.set(DoubleSolenoid.Value.kForward);
    	intake2.set(DoubleSolenoid.Value.kForward);
    }
    
    public void intakeDown(){
    	intake1.set(DoubleSolenoid.Value.kReverse);
    	intake2.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void hangerOpen(){
    	hang1.set(DoubleSolenoid.Value.kForward);
    	hang2.set(DoubleSolenoid.Value.kForward);
    }
    
    public void hangerClose(){
    	hang1.set(DoubleSolenoid.Value.kReverse);
    	hang2.set(DoubleSolenoid.Value.kReverse);
    }
    
    /*public void wbUp(){
    	wb.set(DoubleSolenoid.Value.kForward);
    }
    
    public void wbDown(){
    	wb.set(DoubleSolenoid.Value.kReverse);
    }*/
    
}

