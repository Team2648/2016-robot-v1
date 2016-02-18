package org.usfirst.frc.team2648.robot;

import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	
	public static Compressor comp; 
	
	//Drive Train
	public static SpeedController left;
	public static SpeedController right;
	public static RobotDrive rd; 
	public static Encoder driveEnc;
	public static AnalogGyro driveGy;
	public static BuiltInAccelerometer driveAccel;
	public static double k0;
	
	//Intake
	public static SpeedController intake;
	public static DoubleSolenoid intake1;
	public static DoubleSolenoid intake2;
	
	//Shooter
	public static SpeedController shooter;
	public static SpeedController shooter2;
	public static DigitalInput ball;
	
	//Hanger
	public static DoubleSolenoid hang1;
	public static DoubleSolenoid hang2;
	public static SpeedController winch1;
	public static SpeedController winch2;
	
	//PID Default Contants
	public static final double defaultP = .7;
	public static final double defaultI = 0;
	public static final double defaultD = 0;
	public static final double defaultTolerance = .125;
	
	//DIO and Encoder variables
	public static final double encoderDistPerPulse = .1256;
	public static final PIDSourceType encoderSourceType = PIDSourceType.kDisplacement;
	
	
	public static void init(){
		comp = new Compressor();
		
		//Drive Train
		left = new Victor(0);
		right = new Victor(1);
		rd = new RobotDrive(left, right);
		driveEnc = new Encoder(1,2);
		driveGy = new AnalogGyro(0);
		k0 = .007;
		
		//Intake
		intake = new Talon(2);
		intake1 = new DoubleSolenoid(0,1);
		intake2 = new DoubleSolenoid(2,3);
		
		//Shooter
		shooter = new Talon(3);
		shooter2 = new Talon(4);
		ball = new DigitalInput(0);
		
		//Hanger
		hang1 = new DoubleSolenoid(4,5);
		hang2 = new DoubleSolenoid(6,7);
		winch1 = new Victor(5);
		winch2 = new Victor(6);
	}
}
