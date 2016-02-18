package org.usfirst.frc.team2648.robot.subsystems;

import org.usfirst.frc.team2648.robot.Robot;
import org.usfirst.frc.team2648.robot.RobotMap;
import org.usfirst.frc.team2648.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends PIDSubsystem {
	SpeedController right = RobotMap.right;
	SpeedController left = RobotMap.left;
	RobotDrive rd = RobotMap.rd;
	Encoder driveEnc = RobotMap.driveEnc;
	AnalogGyro driveGy = RobotMap.driveGy;
	

    public DriveTrain(){
    	super("Drivetrain", RobotMap.defaultP, RobotMap.defaultI, RobotMap.defaultD);
        //Set the tolerance of the PIDController and disable the PIDController
        setAbsoluteTolerance(RobotMap.defaultTolerance);
        disable();
        
        driveEnc.setDistancePerPulse(RobotMap.encoderDistPerPulse);
        driveEnc.setPIDSourceType(RobotMap.encoderSourceType);
        driveEnc.reset();
        
        driveGy.setSensitivity(RobotMap.k0);
        driveGy.initGyro();
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new ArcadeDrive());
    }
    
    protected double returnPIDInput() {
    	return driveEnc.getDistance();
    }

    protected void usePIDOutput(double output) {
        rd.setLeftRightMotorOutputs(output, output);
    }
    
    public void arcadeDrive(){
    	if(!this.getPIDController().isEnabled()){
    		//rd.arcadeDrive(-Robot.oi.j1.getRawAxis(1),Robot.oi.j1.getRawAxis(0));
    		rd.tankDrive(Robot.oi.j1.getRawAxis(3), Robot.oi.j1.getRawAxis(1));
    	}
    } 
    
    public void stop(){
    	rd.stopMotor();
    }
    
    
    public void resetEncoder()
    {
    	driveEnc.reset();
    }
    
  
    
}
