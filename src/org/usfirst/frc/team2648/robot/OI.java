package org.usfirst.frc.team2648.robot;

import org.usfirst.frc.team2648.robot.commands.Hang;
import org.usfirst.frc.team2648.robot.commands.HangerDeploy;
import org.usfirst.frc.team2648.robot.commands.HangerLift;
import org.usfirst.frc.team2648.robot.commands.InShoot;
import org.usfirst.frc.team2648.robot.commands.IntakeDown;
import org.usfirst.frc.team2648.robot.commands.IntakeDownUp;
import org.usfirst.frc.team2648.robot.commands.IntakeRun;
import org.usfirst.frc.team2648.robot.commands.IntakeToBall;
import org.usfirst.frc.team2648.robot.commands.IntakeUp;
import org.usfirst.frc.team2648.robot.commands.LightOff;
import org.usfirst.frc.team2648.robot.commands.LightOn;
import org.usfirst.frc.team2648.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	public Joystick j1;
	public Joystick j2;
	
	//public JoystickButton intakeUpDown;
	public JoystickButton intakeIn;
	public JoystickButton intakeOut;
	public JoystickButton intakeUp;
	public JoystickButton intakeDown;
	public JoystickButton intakeBall;
	public JoystickButton outBall;
	
	public JoystickButton shooterOut;
	public JoystickButton shooterIn;
	//public JoystickButton inShoot;
	
	public JoystickButton lightOn;
	public JoystickButton lightOff;
	
	//public JoystickButton wbUp;
	//public JoystickButton wbDown;
	
	/*public JoystickButton hangDeploy;
	public JoystickButton hangUp;
	public JoystickButton hang;*/
	
	public OI(){
		j1 = new Joystick(0);
		j2 = new Joystick(1);
		
		//intakeUpDown = new JoystickButton(j2,9);
		intakeIn = new JoystickButton(j2,5);
		intakeOut = new JoystickButton(j2,6);
		intakeUp = new JoystickButton(j2,3);
		intakeDown = new JoystickButton(j2,2);
		intakeBall = new JoystickButton(j1,6);
		outBall = new JoystickButton(j1,5);
		
		//intakeUp = new JoystickButton(j2,j2.getPOV(0));
		//intakeDown = new JoystickButton(j2, j2.getPOV(180));
		
		
		shooterOut = new JoystickButton(j2,4);
		shooterIn = new JoystickButton(j2,1);
		//inShoot = new JoystickButton(j2,1);
		
		lightOn = new JoystickButton(j1,1);
		lightOff = new JoystickButton(j1,4);
		
		//wbUp = new JoystickButton(j1, 6);
		//wbDown = new JoystickButton(j1,5);
		/*hangDeploy = new JoystickButton(j2,6);
		hangUp = new JoystickButton(j2,7);
		hang = new JoystickButton(j2,8);*/
		
		
		//intakeUpDown.whenPressed(new IntakeDownUp());
		intakeIn.whileHeld(new IntakeRun(-1));
		intakeOut.whileHeld(new IntakeRun(1));
		intakeUp.whenPressed(new IntakeUp());
		intakeDown.whenPressed(new IntakeDown());
		intakeBall.whenPressed(new IntakeToBall());
		
		shooterOut.whileHeld(new Shoot(1));
		shooterIn.whileHeld(new Shoot(-1));
		//inShoot.whenPressed(new InShoot(.75,1));
		
		lightOn.whenPressed(new LightOn());
		lightOff.whenPressed(new LightOff());
		
		/*hangDeploy.whenPressed(new HangerDeploy());
		hangUp.whenPressed(new HangerLift(1));
		hang.whenPressed(new Hang());*/
		
	}
	
	public Joystick getj1(){
		return j1;
	}
	
	public Joystick getj2(){
		return j2;
	}

	/*public static void main(String[] args) {
		Robot.oi.j1.getRawAxis(3)
	}*/
	
}

