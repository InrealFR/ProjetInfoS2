/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant;

import fr.insa.pons.projet.complex.Complex;
import fr.insa.pons.projet.noeud.Noeuds;

/**
 *
 * @author lherman01
 */
public class Resistance extends Composant{
    
    //attributs
    private double resistance;
    
    //constructeur
    public Resistance(){
        super();
        resistance = 0;
    }

    public Resistance(double resistance, char initiale, int id) {
        super(initiale, id);
        this.resistance = resistance;
    }
 
    
    //selecteurs
    public double getResistance(){
        return this.resistance;
    }
    
    public void setResistance (double r){
        this.resistance=r;
    }
    
    //Méthodes
    @Override
    public Complex alpha(){
        return Complex.creeRec(1,0);
    }
    
    @Override
    public Complex beta(){
        return Complex.creePol(-this.resistance,0);
    }
    
    @Override
    public Complex gamma(){
        return Complex.creeRec(0,0);
    }
    @Override
    public String toString(){
        return "R :"+this.getInitiale()+this.getId()+" | R = "+resistance ;
                
    }

}
