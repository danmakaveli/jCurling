/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcurling.beans;

import wiiusej.Wiimote;

/**
 *
 * @author albuquerqud
 */
public class Joueur {
    
    private String nom;
    private int id;
    private Wiimote wm;
    private Robot r;
    private int[] score;

    public Joueur(String nom, int id, String comRobot) {
        this.nom = nom;
        this.id = id;
        this.r = new Robot(comRobot);
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Wiimote getWm() {
        return wm;
    }

    public void setWm(Wiimote wm) {
        this.wm = wm;
    }

    public Robot getR() {
        return r;
    }

    public void setR(Robot r) {
        this.r = r;
    }
    
}
