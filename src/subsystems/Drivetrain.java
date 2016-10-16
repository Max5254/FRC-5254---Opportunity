package subsystems;

import org.usfirst.frc.team1.robot.Constants;
import org.usfirst.frc.team1.robot.Opportunity;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Drivetrain extends Opportunity {
	
	private DoubleSolenoid shiftingPiston = new DoubleSolenoid(Constants.SHIFTING_PISTON_EXTEND,Constants.SHIFTING_PISTON_RETRACT);
	private RobotDrive myRobot = new RobotDrive(0,1,2,3);
	
	public Drivetrain() {
	}
	
	public void drive(double speed, double heading) {
		myRobot.arcadeDrive(speed,heading);
	}
	
	public void shiftHigh() {
		shiftingPiston.set(DoubleSolenoid.Value.kForward);
	}
	
	public void shiftLow() {
		shiftingPiston.set(DoubleSolenoid.Value.kReverse);
	}

	
}