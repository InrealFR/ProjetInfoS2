/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant;

import fr.insa.pons.projet.complex.Complex;

/**
 *
 * @author lherman01
 */
public class Resistance extends Composant{
    
    //attributs
    private double resistance;
    
    //constructeur
    public Resistance(double r){
        this.resistance=r;
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
        return   this.getNom()+this.getId()
                +" / R= "+this.resistance
                +" / l'équation linéaire correspondante est: "+this.equaLineaire();
    }
}
