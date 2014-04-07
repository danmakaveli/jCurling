/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcurling.ctrl;

import java.util.ArrayList;
import jcurling.beans.Joueur;

/**
 *
 * @author albuquerqud
 */
public interface ItfCtrlIhm {

    public void commencePartie(ArrayList<Joueur> joueurs, int nbrLancer);
    
}
