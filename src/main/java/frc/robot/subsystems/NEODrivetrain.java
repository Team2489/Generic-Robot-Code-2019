/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;


import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;



/**
 * Add your docs here.
 * 
 */
public class NEODrivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public CANSparkMax rightFrontSpark = new CANSparkMax(RobotMap.RIGHT_FRONT_SPARK, MotorType.kBrushless);
         CANSparkMax rightBackSpark = new CANSparkMax(RobotMap.RIGHT_BACK_SPARK, MotorType.kBrushless);
  public CANSparkMax leftFrontSpark = new CANSparkMax(RobotMap.LEFT_FRONT_SPARK,MotorType.kBrushless);
         CANSparkMax leftBackSpark = new CANSparkMax(RobotMap.LEFT_BACK_SPARK, MotorType.kBrushless);
  CANEncoder rightFrontCanEncoder = new CANEncoder(rightFrontSpark);
  CANEncoder rightBackCanEncoder = new CANEncoder(rightBackSpark);
  CANEncoder leftFrontCanEncoder = new CANEncoder(leftFrontSpark);
  CANEncoder leftBackCanEncoder = new CANEncoder(leftBackSpark);
  public NEODrivetrain(){
    rightBackSpark.follow(rightFrontSpark, true);
    leftBackSpark.follow(leftFrontSpark, true);

    rightFrontSpark.enableVoltageCompensation(12);
    leftFrontSpark.enableVoltageCompensation(12);
    rightFrontCanEncoder.getVelocity();
    leftFrontCanEncoder.getVelocity();
    rightBackCanEncoder.getVelocity();
    leftBackCanEncoder.getVelocity();
    
  }
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
