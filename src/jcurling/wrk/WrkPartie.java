/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcurling.wrk;

import jcurling.beans.Joueur;
import jcurling.beans.Partie;

/**
 *
 * @author albuquerqud
 */
public class WrkPartie {
 
    private Partie p;
    private int tourId;
    private int nbrLancer;

    WrkPartie(Partie partie,int nbrLancer) {  
            this.p = partie; 
            this.tourId = 1;
            this.nbrLancer = nbrLancer;
        }
    
    
}
