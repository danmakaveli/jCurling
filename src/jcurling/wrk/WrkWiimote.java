/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcurling.wrk;

import wiiusej.WiiUseApiManager;
import wiiusej.Wiimote;

/**
 *
 * @author albuquerqud
 */
public class WrkWiimote extends Thread {

    private Wiimote[] wiimotes;
    private WiimoteEcouteur wl1;
    private WiimoteEcouteur wl2;
    private boolean boucle;

    public WrkWiimote() {
        wl1 = new WiimoteEcouteur();
        wl2 = new WiimoteEcouteur();
        boucle = true;
    }

    @Override
    public void run() {
        while (boucle) {
            if (wiimotes == null) {
                wiimotes = WiiUseApiManager.getWiimotes(2, true);
                wiimotes[0].addWiiMoteEventListeners(wl1);
                wiimotes[1].addWiiMoteEventListeners(wl2);
            } else {
                boucle = false;
            }
        }
    }

    
    public void activerBalayage(int idJoueur) {

        if (idJoueur == 1) {
            wiimotes[0].activateMotionSensing();
        } else {
            wiimotes[1].activateMotionSensing();
        }

    }

  
    public int stopperBalayage(int idJoueur) {
        int vitesseWiimote = 0;
        int vitesseRobot = 0;
        if (idJoueur == 1) {
            wiimotes[0].deactivateMotionSensing();
            vitesseWiimote = wl1.getVitesseMoyenne();

        } else {
            wiimotes[1].deactivateMotionSensing();
            vitesseWiimote = wl2.getVitesseMoyenne();
        }

        if (vitesseWiimote >= 120) {
            vitesseRobot = 1;
        } else if (vitesseWiimote < 120 && vitesseWiimote >= 115) {
            vitesseRobot = 2;
        } else if (vitesseWiimote < 115 && vitesseWiimote >= 110) {
            vitesseRobot = 3;
        } else if (vitesseWiimote < 110 && vitesseWiimote >= 105) {
            vitesseRobot = 4;
        } else if (vitesseWiimote < 105 && vitesseWiimote >= 100) {
            vitesseRobot = 5;
        } else if (vitesseWiimote < 100 && vitesseWiimote >= 95) {
            vitesseRobot = 6;
        } else if (vitesseWiimote < 95 && vitesseWiimote >= 90) {
            vitesseRobot = 7;
        } else if (vitesseWiimote < 90 && vitesseWiimote >= 85) {
            vitesseRobot = 8;
        } else if (vitesseWiimote < 85 && vitesseWiimote >= 80) {
            vitesseRobot = 9;
        } else if (vitesseWiimote < 80 && vitesseWiimote >= 75) {
            vitesseRobot = 10;
        } else if (vitesseWiimote < 75 && vitesseWiimote >= 70) {
            vitesseRobot = 11;
        } else if (vitesseWiimote < 70 && vitesseWiimote >= 65) {
            vitesseRobot = 12;
        } else if (vitesseWiimote < 65 && vitesseWiimote >= 60) {
            vitesseRobot = 13;
        } else if (vitesseWiimote < 60 && vitesseWiimote >= 55) {
            vitesseRobot = 14;
        } else if (vitesseWiimote < 55 && vitesseWiimote >= 50) {
            vitesseRobot = 15;
        } else if (vitesseWiimote < 50 && vitesseWiimote >= 40) {
            vitesseRobot = 16;
        } else if (vitesseWiimote < 40 && vitesseWiimote >= 35) {
            vitesseRobot = 17;
        } else if (vitesseWiimote < 35 && vitesseWiimote >= 30) {
            vitesseRobot = 18;
        } else if (vitesseWiimote < 30 && vitesseWiimote > 25) {
            vitesseRobot = 19;
        } else if (vitesseWiimote <= 25) {
            vitesseRobot = 20;
        }
        
        return vitesseRobot;
    }

    public Wiimote[] getWiimotes() {
        return wiimotes;
    }

    public void setWiimotes(Wiimote[] wiimotes) {
        this.wiimotes = wiimotes;
    }

    public WiimoteEcouteur getWl1() {
        return wl1;
    }

    public void setWl1(WiimoteEcouteur wl1) {
        this.wl1 = wl1;
    }

    public WiimoteEcouteur getWl2() {
        return wl2;
    }

    public void setWl2(WiimoteEcouteur wl2) {
        this.wl2 = wl2;
    }

    public boolean isBoucle() {
        return boucle;
    }

    public void setBoucle(boolean boucle) {
        this.boucle = boucle;
    }

}
