/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcurling.wrk;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import jcurling.Constantes;
import jcurling.beans.Score;

/**
 *
 * @author albuquerqud
 */
public class WrkDB {

    private String erreur;
    private EntityManagerFactory emf;
    private EntityManager em;
    private Transaction tr;

    public WrkDB() {

    }

    public boolean connecter(String pu) {
        boolean ok = false;
        erreur = "";
        try {
            emf = Persistence.createEntityManagerFactory(Constantes.JPA_PU);
            em = emf.createEntityManager();
            tr = new Transaction(em);
            ok = em.isOpen();
        } catch (Exception e) {
            erreur = e.getMessage();
        }
        return ok;
    }

    public boolean deconnecter() {
        boolean resultat = false;
        try {
            em.close();
            emf.close();
            resultat = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return resultat;
    }

    public Score ajouter(Score s) {
        try {
            em.persist(s);
            tr.commit();
        } catch (Exception e) {
            tr.rollbackTransaction();
            System.out.println(e.getMessage());
            s = null;
        }
        return s;
    }

    public List<Score> chargerScores() {
        Query query = em.createNamedQuery("Personne.findAll");
        ArrayList listScore = new ArrayList<Score>();
        listScore = (ArrayList) query.getResultList();
        return listScore;
    }

    public String getErreur() {
        return erreur;
    }
    

}
