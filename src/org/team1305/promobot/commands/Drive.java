/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.team1305.promobot.commands;

/**
 *
 * @author CF31
 */
public class Drive extends CommandBase {

    public Drive() {
        
        requires(driveBase);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        
            driveBase.tankDrive(oi.getDriveStickValue(),
                                oi.getRightStickValue());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        
        driveBase.stop();
    }

    protected void interrupted() {
        end();
    }
    
}
