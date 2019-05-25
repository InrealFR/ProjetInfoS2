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
public class Fil extends Composant {

    public Fil() {
        super();
    }

    public Fil(int id) {
        super(id);
    }
    

    @Override
    public Complex alpha() {
        return Complex.creeRec(1, 0);
    }

    @Override
    public Complex beta() {
        return Complex.creePol(0, 0);
    }

    @Override
    public Complex gamma() {
        return Complex.creeRec(0, 0);
    }

    @Override
    public String toString() {
        return ("[F" + this.getId()+"]");
    }
    public void dessine(Graphics g){
        
    }
public static Fil entrerFil(){
System.out.println("Saisir l'ID :");
int id = Lire.i();
return(new Fil(id));
}
}
