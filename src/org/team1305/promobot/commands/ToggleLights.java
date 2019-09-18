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
public class ToggleLights extends CommandBase {

    private boolean bIsFinished = false;
    
    public ToggleLights() {
        
        requires(light);
    }
    protected void initialize() {
  
    }

    protected void execute() {
        
        bIsFinished = false;
        light.toggleLights();
        bIsFinished = true;
    }

    protected boolean isFinished() {
        
        return bIsFinished;
    }

    protected void end() {
        
    }

    protected void interrupted() {
        
       end();
    }
}
