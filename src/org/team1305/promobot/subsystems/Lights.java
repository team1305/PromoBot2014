/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.team1305.promobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Relay;
import org.team1305.promobot.RobotMap;

/**
 *
 * @author CF31
 */
public class Lights extends Subsystem {
    
    private double toggleCounter = 0;
    private final Relay lights = new Relay(RobotMap.RELAY_LIGHTS);
    
    protected void initDefaultCommand() {
        
    }
    
    public void toggleLights() {
        
        if (toggleCounter == 0) {
            lightsOn();
            toggleCounter ++;
        } else if (toggleCounter == 1) {
            lightsOff();
            toggleCounter --;
        }
    }
    
    public void lightsOff() {
        
        lights.set(Relay.Value.kOff);
    }
    
    public void lightsOn() {
        
        lights.set(Relay.Value.kReverse);
    }
    
}
