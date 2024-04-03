package frc.robot.commands.autos.simples;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;


public class setShooter extends Command {


    private double power;
    private final Shooter ShooterMotor1;


    public setShooter(Shooter ShooterMotor1,double power) {
        this.ShooterMotor1 = ShooterMotor1;
        this.power = power;
        addRequirements(ShooterMotor1);

    }


    // called just before this Command runs the first time
    // calculates when to end Command
    public void initialize() {
    }


    // called repeatedly when this Command is scheduled to run
    public void execute() {
        this.ShooterMotor1.setShooter(this.power);
    }


    // make this return true when this Command no longer needs to run execute()
    // checks if the time has passed the set duration
    public boolean isFinished() {
    
    }


    // called once after isFinished returns true
    // drive train is stopped
    protected void end() {
        this.ShooterMotor1.ShooterMotor1Stop();
    }


    protected void interrupted() {
        this.end();
    }

    
}