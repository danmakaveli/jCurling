/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcurling.beans;

import jcurling.wrk.Connexion;

/**
 *
 * @author albuquerqud
 */
public class Robot {

    private String serialPortName;
    private boolean running;
    private int xInt;
    private int yInt;

    public Robot(String serialPortName) {
        this.serialPortName = serialPortName;
        xInt = 0;
        yInt = 0;
        running = false;
    }

    public String getSerialPortName() {
        return serialPortName;
    }

    public void setSerialPortName(String serialPortName) {
        this.serialPortName = serialPortName;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getxInt() {
        return xInt;
    }

    public void setxInt(int xInt) {
        this.xInt = xInt;
    }

    public int getyInt() {
        return yInt;
    }

    public void setyInt(int yInt) {
        this.yInt = yInt;
    }

    
    
}
