/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.team1305.promobot;

import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;

/**
 *
 * @author Paul Belanger
 */
public class ManualPIDLink implements PIDSource, PIDOutput {
    private double value = 0.0;
    public void pidWrite(double output) {
        this.value = output;
    }

    public double pidGet() {
        return this.value;
    }
    
}
