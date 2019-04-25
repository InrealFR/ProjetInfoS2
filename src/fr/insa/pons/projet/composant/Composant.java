/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant;

import fr.insa.pons.projet.complex.Complex;

/**
 *
 * @author hugop
 */
public abstract class Composant {
private String nom ;
private Complex coeffAlpha ;
private Complex coeffBeta ; 
private Complex coeffGamma ;
public Composant(){
nom = null ;
coeffAlpha = coeffBeta = coeffGamma = new Complex();
}
public Composant(String nom,Complex coeffAlpha,Complex coeffBeta,Complex coeffGamma){
this.nom = nom ;
this.coeffAlpha = coeffAlpha ;
this.coeffBeta = coeffBeta ;
this.coeffGamma = coeffGamma ;
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Complex getCoeffAlpha() {
        return coeffAlpha;
    }

    public void setCoeffAlpha(Complex coeffAlpha) {
        this.coeffAlpha = coeffAlpha;
    }

    public Complex getCoeffBeta() {
        return coeffBeta;
    }

    public void setCoeffBeta(Complex coeffBeta) {
        this.coeffBeta = coeffBeta;
    }

    public Complex getCoeffGamma() {
        return coeffGamma;
    }

    public void setCoeffGamma(Complex coeffGamma) {
        this.coeffGamma = coeffGamma;
    }

public abstract String toString() ;
public abstract void coeffAlpha(double pulsation) ;
public abstract void coeffBeta(double pulsation);
public abstract void coeffGamma(double pulsation);
}
