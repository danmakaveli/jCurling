/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcurling.wrk;

import java.util.ArrayList;
import wiiusej.wiiusejevents.physicalevents.ExpansionEvent;
import wiiusej.wiiusejevents.physicalevents.IREvent;
import wiiusej.wiiusejevents.physicalevents.MotionSensingEvent;
import wiiusej.wiiusejevents.physicalevents.WiimoteButtonsEvent;
import wiiusej.wiiusejevents.utils.WiimoteListener;
import wiiusej.wiiusejevents.wiiuseapievents.ClassicControllerInsertedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.ClassicControllerRemovedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.DisconnectionEvent;
import wiiusej.wiiusejevents.wiiuseapievents.GuitarHeroInsertedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.GuitarHeroRemovedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.NunchukInsertedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.NunchukRemovedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.StatusEvent;

/**
 *
 * @author albuquerqud
 */
public class WiimoteEcouteur implements WiimoteListener {

    private int vitesseMoyenne;
    private ArrayList<Integer> listRawY;
    private int MAXRAWY = 255;
    private boolean eventLancer;
    private boolean eventAngle;

    public WiimoteEcouteur() {
        eventLancer = false;
        eventAngle = false;
    }
    
 

    @Override
    public void onButtonsEvent(WiimoteButtonsEvent e) {
        if(eventLancer){
           if(e.isButtonAJustPressed()){
               
           } 
        }
        
    }

    @Override
    public void onIrEvent(IREvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onMotionSensingEvent(MotionSensingEvent e) {

        int accY = e.getRawAcceleration().getY();
        if (accY > 120) {
            int rawY = MAXRAWY - accY;
            listRawY.add(rawY);
            if (!listRawY.isEmpty()) {
                int compt = 0;
                int total = 0;
                for (Integer i : listRawY) {
                    compt++;
                    total = total + i;
                }
                vitesseMoyenne = total / compt;
            }
        }
    }

    @Override
    public void onExpansionEvent(ExpansionEvent ee) {
 System.out.println(ee.toString());
    }

    @Override
    public void onStatusEvent(StatusEvent se) {
        System.out.println(se.toString());
    }

    @Override
    public void onDisconnectionEvent(DisconnectionEvent de) {
        System.out.println(de.toString());
    }

    @Override
    public void onNunchukInsertedEvent(NunchukInsertedEvent nie) {
         System.out.println(nie.toString());
    }

    @Override
    public void onNunchukRemovedEvent(NunchukRemovedEvent nre) {
        System.out.println(nre.toString());
    }

    @Override
    public void onGuitarHeroInsertedEvent(GuitarHeroInsertedEvent ghie) {
        System.out.println(ghie.toString());
    }

    @Override
    public void onGuitarHeroRemovedEvent(GuitarHeroRemovedEvent ghre) {
         System.out.println(ghre.toString());
    }

    @Override
    public void onClassicControllerInsertedEvent(ClassicControllerInsertedEvent ccie) {
        System.out.println(ccie.toString());
    }

    @Override
    public void onClassicControllerRemovedEvent(ClassicControllerRemovedEvent ccre) {
         System.out.println(ccre.toString());
    }

    public int getVitesseMoyenne() {
        return vitesseMoyenne;
    }

    public void setVitesseMoyenne(int vitesseMoyenne) {
        this.vitesseMoyenne = vitesseMoyenne;
    }
    
    

}
