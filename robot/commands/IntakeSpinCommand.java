
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

public class IntakeSpinCommand extends Command {
    public static int intakeDirection;
    public IntakeSpinCommand() {
        requires(Robot.intakeSpin);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        intakeDirection = -1;
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        double intakeTrigger = Robot.oi.stick.getRawAxis(2)*0.75;

        Robot.intakeSpin.turn(intakeTrigger * intakeDirection);

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