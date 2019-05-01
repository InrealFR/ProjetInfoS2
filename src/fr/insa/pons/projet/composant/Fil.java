/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant ;

import fr.insa.pons.projet.complex.Complex;

/**
 *
 * @author lherman01
 */
public class Fil extends Composant {
    
    public Fil(){
    }
    
    @Override
    public Complex alpha(){
        return Complex.creeRec(1,0);
    }
    
    @Override
    public Complex beta(){
        return Complex.creePol(0,0);
    }
    
    @Override
    public Complex gamma(){
        return Complex.creeRec(0,0);
    }
    
    @Override 
    public String toString(){
        return this.getNom()+this.getId()
                + "equation linéaire: "+ this.equaLineaire();
    }
    
}
