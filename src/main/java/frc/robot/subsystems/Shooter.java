// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Shooter extends SubsystemBase {


    private CANSparkMax ShooterMotor1, ShooterMotor2;

  
    public Shooter() {
        this.ShooterMotor1 = new CANSparkMax(Constants.CanID.leftShooter, MotorType.kBrushless);
        this.ShooterMotor2 = new CANSparkMax(Constants.CanID.rightShooter, MotorType.kBrushless);
        ShooterMotor2.follow(ShooterMotor1,true);
        this.ShooterMotor1.setInverted(true);
        this.ShooterMotor1.burnFlash();
        this.ShooterMotor2.burnFlash();
    }

    public void ShooterPower(double power)) {
        this.ShooterMotor1.set(power);
    }
    
    public void ShooterMotor1Stop() {
        this.ShooterMotor1.stopMotor();
    }
}