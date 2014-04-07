/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcurling.wrk;

import java.util.ArrayList;
import jcurling.beans.Joueur;
import jcurling.beans.Partie;
import jcurling.ctrl.ItfCtrlWrk;
import wiiusej.Wiimote;

/**
 *
 * @author albuquerqud
 */
public class Wrk implements ItfWrkCtrl {

    private WrkWiimote wrkWiimote;
    private WrkJunior wrkJunior1;
     private WrkJunior wrkJunior2;
    private WrkDB wrkDB;
    private WrkPartie wrkPartie;
    private ItfCtrlWrk refCtrl;

    public Wrk() {
        wrkWiimote = new WrkWiimote();
        wrkJunior1 = new WrkJunior();
        wrkJunior2 = new WrkJunior();
    }

    @Override
    public boolean commencePartie(ArrayList<Joueur> joueurs,int nbrLancer) {
        boolean ok;
        Joueur j1 = null;
        Joueur j2 = null;
        try{
        wrkWiimote.start();
        
        while(wrkWiimote.getWiimotes() == null){
            Thread.sleep(1);
        }
        Wiimote[] wiimotes = wrkWiimote.getWiimotes();
        
        for (Joueur j : joueurs) {
            if (j.getId() == wiimotes[0].getId()) {
                wrkJunior1.connexionRobot(j.getR().getSerialPortName());
                j.setWm(wiimotes[0]);
              
                j1 = j;
                System.out.println("J1 Ready !");
            }else{
                wrkJunior2.connexionRobot(j.getR().getSerialPortName()); 
                j.setWm(wiimotes[1]);
                j2 = j;
                System.out.println("J2 Ready !");
            }
        }
         Partie partie = new Partie(j1,j2);
         wrkPartie = new WrkPartie(partie, nbrLancer);
         ok = true;
         }catch(Exception e){
            System.out.println("ERROR PARTIE: "+e.getMessage());
            ok = false;
        }
        return ok;
    }

    public ItfCtrlWrk getRefCtrl() {
        return refCtrl;
    }

    public void setRefCtrl(ItfCtrlWrk refCtrl) {
        this.refCtrl = refCtrl;
    }
    
    
}
