/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.team1305.promobot;

import edu.wpi.first.wpilibj.camera.AxisCamera;
import org.team1305.promobot.subsystems.Camera;

/**
 *
 * @author Root 1
 */
public class ThreadedCamera implements Runnable {

    private Camera camera;
    public ThreadedCamera(Camera cam){
        camera = cam;
    }
    
    public void run() {
        camera.analyzeImage();
    }

    
    
    
    
    
    
    
    
}
