/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant;

import fr.insa.Lire;
import fr.insa.pons.projet.complex.Complex;
import java.awt.Graphics;

/**
 *
 * @author lherman01
 */
public class Inductance extends Composant {

    //attribut
    private double inductance;

    //constructeur
    public Inductance() {
        super();
        inductance = 0;
    }

    public Inductance(double L, int id) {
        super(id);
        this.inductance = L;
    }

    //selecteurs
    public double getInductance() {
        return this.inductance;
    }

    public void setInductance(double L) {
        this.inductance = L;
    }

    //methodes
    @Override
    public Complex alpha() {
        return Complex.creeRec(1, 0);
    }

    @Override
    public Complex beta() {
        return Complex.creePol(0, -this.getOmega() * this.inductance);
    }

    @Override
    public Complex gamma() {
        return Complex.creeRec(0, 0);
    }

    @Override
    public String toString() {
        return "[I" + this.getId() + " | I = " + this.getInductance()+"]";
    }
    
      public void dessine(Graphics g){
        
    }
      
    public static Inductance entrerInductance(){
    System.out.println("Saisir ID :");
    int id = Lire.i();
    System.out.println("Saisir inductance :");
    double inductance = Lire.d(); 
    return(new Inductance(inductance,id));
    }
}
