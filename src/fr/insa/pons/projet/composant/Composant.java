/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant;

import fr.insa.Lire;
import fr.insa.pons.projet.complex.Complex;
import static fr.insa.pons.projet.composant.Condensateur.entrerCondensateur;
import static fr.insa.pons.projet.composant.Fil.entrerFil;
import static fr.insa.pons.projet.composant.GenerateurTension.entrerGenerateur;
import static fr.insa.pons.projet.composant.Inductance.entrerInductance;
import static fr.insa.pons.projet.composant.Resistance.entrerResistance;
import fr.insa.pons.projet.noeud.Noeuds;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author lherman01
 */
public abstract class Composant {

    // Les attributs
    private double omega;
    private int id;
    private Noeuds NoeudDepart;
    private Noeuds NoeudArrive;
    private double px ;
    private double py ;
    private char Nom ;
    // Constructeur
    public Composant() {
        omega = 0;
        id = 0;
        NoeudDepart = NoeudArrive = new Noeuds();
    }

    public Composant(int id) {
        this.id = id;
    }
    
    public Composant(double omega, int id, Noeuds NoeudDepart, Noeuds NoeudArrive) {
        this.omega = omega;
        this.id = id;
        this.NoeudDepart = NoeudDepart;
        this.NoeudArrive = NoeudArrive;
    }
    public Composant(double px, double py){
        this.px = px ;
        this.py = py ;
    }

    public char getNom() {
        return Nom;
    }

    public void setNom(char Nom) {
        this.Nom = Nom;
    }
    
    public double getPx() {
        return px;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double getPy() {
        return py;
    }

    //getters and setters
    public void setPy(double py) {    
        this.py = py;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOmega() {
        return this.omega;
    }

    public void setOmega(double omega) {
        this.omega = omega;
    }

    public Noeuds getNoeudDepart() {
        return NoeudDepart;
    }

    public void setNoeudDepart(Noeuds NoeudDepart) {
        this.NoeudDepart = NoeudDepart;
    }

    public Noeuds getNoeudArrive() {
        return NoeudArrive;
    }

    public void setNoeudArrive(Noeuds NoeudArrive) {
        this.NoeudArrive = NoeudArrive;
    }

    //Les méthodes
    public abstract Complex alpha();

    public abstract Complex beta();

    public abstract Complex gamma();

    public abstract String toString();
    
    
      public static Composant entrerComposant() {
        ArrayList<Composant>c = new ArrayList<>();
        System.out.println("Quel composant ?"
                + "\n (1) Fil"
                + "\n (2) Generateur de Tension"
                + "\n (3) Resistance"
                + "\n (4) Inductance"
                + "\n (5) Condensateur");
        int choix = Lire.i();
        while((choix != 1)&&(choix !=2)&&(choix !=3)&&(choix!=4)&&(choix !=5)){
              System.out.println("inexistant");
                choix = Lire.i();
        }
        switch (choix) {
            case 1:
                c.add(entrerFil());
                break ;
            case 2:
                c.add(entrerGenerateur());
                break ;
            case 3:
                c.add(entrerResistance());
                break ;
            case 4:
                c.add(entrerInductance());
                break ;
            case 5:
                c.add(entrerCondensateur());
                break ;
        }
         return(c.get(0));
    }

}
