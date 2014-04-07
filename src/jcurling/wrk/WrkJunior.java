/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcurling.wrk;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jcurling.beans.Robot;

/**
 *
 * @author albuquerqud
 */
public class WrkJunior {

    private boolean isRunning;
    private boolean ledState;
    private Connexion connexion;

    public WrkJunior() {

    }

    public boolean connexionRobot(String serialPort) {
        boolean ok = false;
        try {
            connexion = new Connexion(serialPort);
            ok = true;
        } catch (Exception e) {
            ok = false;
        }
        return ok;
    }

    public void moveLeft(Robot r, int xNewInt) {
        int xInt = r.getxInt();
        int yInt = r.getyInt();

        if (xNewInt != 0) {
            if (xInt == 0) {
                r.setyInt(xNewInt);
            } else {
                r.setxInt(xNewInt);
            }
            sendMessageVitesse(r);
        } else {
            sendMessageVitesse(r);
            r.setRunning(false);
        }
    }

    public void moveRight(Robot r, int yNewInt) {
        int xInt = r.getxInt();
        int yInt = r.getyInt();
        if (yNewInt != 0) {
            if (yInt == 0) {
                r.setxInt(yNewInt);
            } else {
                r.setyInt(yNewInt);
            }
            sendMessageVitesse(r);
        } else {
            sendMessageVitesse(r);
            r.setRunning(false);
        }
    }

    public void moveAcceleration(Robot r, int acceleration, int maxV) {
        int xInt = r.getxInt();
        int yInt = r.getyInt();
        while ((xInt <= maxV) && (yInt <= maxV)) {
            try {
                r.setyInt(yInt + acceleration);
                r.setxInt(xInt + acceleration);
                sendMessageVitesse(r);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WrkJunior.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void move(Robot r, int newV) {
        int xInt = r.getxInt();
        int yInt = r.getyInt();
        if ((newV != 0)) {
            r.setRunning(true);
            r.setxInt(newV);
            r.setyInt(newV);
            sendMessageVitesse(r);
        } else {
            r.setRunning(false);
            r.setxInt(newV);
            r.setyInt(newV);
            sendMessageVitesse(r);
        }

    }

    private void sendMessageVitesse(Robot r) {
        int xInt = r.getxInt();
        int yInt = r.getyInt();
        Connexion c = new Connexion(r.getSerialPortName());
        c.sendMessage("D," + xInt + "," + yInt);
    }

    public void stopKJunior(Robot r) {
        move(r, 0);
    }

    public void getString(String msg) {
        System.out.println(msg);
    }

    public void start(Robot r) {
        Connexion c = new Connexion(r.getSerialPortName());
        c.start();
    }

    public void stopConnexion(Robot r) {
        try {
            Connexion c = new Connexion(r.getSerialPortName());
            stopKJunior(r);
            c.stopConnexion();
            c.join();

            System.gc();
        } catch (InterruptedException ex) {
            System.out.println("Une erreur est survenue lors de la déconnexion");
        }

    }

}
