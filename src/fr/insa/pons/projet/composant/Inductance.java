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
public class Inductance extends Composant {
    
    //attribut
    private double inductance;
    
    //constructeur
    public Inductance(){
        super();
        inductance = 0 ;
    }
    public Inductance(double L){
        this.inductance=L;
    }
    
    //selecteurs
    public double getInductance(){
        return this.inductance;
    }
    
    public void setInductance(double L){
        this.inductance=L;
    }
    
    //methodes
    @Override
    public Complex alpha(){
        return Complex.creeRec(1,0);
    }
    
    @Override
    public Complex beta(){
        return Complex.creePol(0,-this.getOmega()*this.inductance);
    }
    
    @Override
    public Complex gamma(){
        return Complex.creeRec(0,0);
    }
    @Override
    public String toString(){
        return  " Inductance "+this.getInitiale()+this.getId()+" | I = "+this.getInductance();
    }
}
