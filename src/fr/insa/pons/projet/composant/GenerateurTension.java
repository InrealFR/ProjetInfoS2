/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant ;

import fr.insa.pons.projet.complex.Complex;
import fr.insa.pons.projet.noeud.Noeuds;

/**
 *
 * @author lherman01
 */
public class GenerateurTension extends Composant {
    
    //attributs
    private double fem;
    
    
    //constructeur
    

    public GenerateurTension() {
     super();
     fem = 0 ;
    }

    public GenerateurTension(double fem, char initiale, int id) {
        super(initiale, id);
        this.fem = fem;
    }

  
    
    // selecteurs
    public double getFem(){
        return this.fem;
    }
    
    public void setFem(double f){
        this.fem=f;
    }
    
    //methodes
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
        return Complex.creeRec(this.fem,0);
    }
    
    
    @Override
    public String toString(){
        return ("G"+this.getInitiale()+this.getId()+"| fem ="+this.fem); 
    }
}
