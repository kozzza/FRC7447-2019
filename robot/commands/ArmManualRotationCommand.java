
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
//import java.util.Timer;
//import java.util.TimerTask;

public class ArmManualRotationCommand extends Command {
    
    public ArmManualRotationCommand() {
        requires(Robot.armRotation);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() { 
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        double armJoy = Robot.oi.stick.getRawAxis(5);
        Robot.armRotation.turn(armJoy * 0.4);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        end();
    }
}