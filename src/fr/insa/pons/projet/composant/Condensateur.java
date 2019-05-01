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
public class Condensateur extends Composant {
    
    //attributs
    public double capacite;
    
    //Constructeurs
    public Condensateur(double c){
        this.capacite=c;
    }
    
    //selecteurs
    public double getCapacite(){
        return this.capacite;
    }
    
    public void setCapacite(double c){
        this.capacite=c;
    }
    
    //methodes
    @Override
    public Complex alpha(){
        return Complex.creeRec(1,0);
    }
    
    @Override
    public Complex beta(){
        return Complex.creePol(0,1/(this.capacite*this.getOmega()));
    }
    
    @Override
    public Complex gamma(){
        return Complex.creeRec(0,0);
    }
    @Override
    public String toString(){
        return this.getNom()+this.getId() 
                +" / C= "+this.capacite
                +" / l'équation linéaire correspondante est: "+this.equaLineaire();
    }
}
