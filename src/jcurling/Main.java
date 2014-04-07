/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcurling;

import jcurling.ctrl.Ctrl;
import jcurling.ihm.Ihm;
import jcurling.wrk.Wrk;

/**
 *
 * @author albuquerqud
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ihm ihm = new Ihm();
       Ctrl ctrl = new Ctrl();
       Wrk wrk  = new Wrk();
       ihm.setRefCtrl(ctrl);
       ctrl.setRefWrk(wrk);
       ctrl.setRefIhm(ihm);
       wrk.setRefCtrl(ctrl);
    }
    
}
