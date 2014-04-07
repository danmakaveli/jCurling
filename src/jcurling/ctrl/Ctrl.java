/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcurling.ctrl;

import java.util.ArrayList;
import jcurling.beans.Joueur;
import jcurling.ihm.ItfIhmCtrl;
import jcurling.wrk.ItfWrkCtrl;

/**
 *
 * @author albuquerqud
 */
public class Ctrl implements ItfCtrlIhm, ItfCtrlWrk{

    private ItfWrkCtrl refWrk;
    private ItfIhmCtrl refIhm;
    
    public Ctrl() {
    }

    @Override
    public void commencePartie(ArrayList<Joueur> joueurs, int nbrLancer) {
        boolean ok = refWrk.commencePartie(joueurs, nbrLancer);
    }

    public ItfWrkCtrl getRefWrk() {
        return refWrk;
    }

    public void setRefWrk(ItfWrkCtrl refWrk) {
        this.refWrk = refWrk;
    }

    public ItfIhmCtrl getRefIhm() {
        return refIhm;
    }

    public void setRefIhm(ItfIhmCtrl refIhm) {
        this.refIhm = refIhm;
    }
    
    
    
}
