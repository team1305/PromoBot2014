///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package org.team1305.promobot.commands;
//
//import edu.wpi.first.wpilibj.Timer;
//
///**
// *
// * @author Matt
// */
//public class FastBlink extends CommandBase {
//
//private Timer lightTimer =new Timer();
//
//    public FastBlink() {
//        // Use requires() here to declare subsystem dependencies
//        requires(underglow);
//    }
//
//    // Called just before this Command runs the first time
//    protected void initialize() {
//    }
//
//    // Called repeatedly when this Command is scheduled to run
//    protected void execute() {
//        protected void execute() {
//        switch (currentState){
//            case 0:
//                delayTimer.start();
//                catapult.setTransmissionEngaged(true);
//                currentState++;
//                break;
//            case 1:
//                if (delayTimer.get()>=DELAY_BEFORE_TIMER)
//                {
//                    currentState++;
//                }
//                break;
//            case 2:
//                if (!catapult.winch()){
//                currentState++;
//                }
//                break;
//            case 3:
//                isDone = true;
//                break;
//        }
//    }
//
//    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() {
//        return false;
//    }
//
//    // Called once after isFinished returns true
//    protected void end() {
//    }
//
//    // Called when another command which requires one or more of the same
//    // subsystems is scheduled to run
//    protected void interrupted() {
//    }
//}
