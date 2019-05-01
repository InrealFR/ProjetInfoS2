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
public abstract class Composant {
    
    // Les attributs
    
    private String nom;
    private double omega;
    private int id ;
    
    
    // Constructeur
    
    public Composant(){
    nom = "" ;
    omega = 0;
    id=0;
    }

    public Composant(String nom, double omega, int id) {
        this.nom = nom;
        this.omega = omega;
        this.id = id;
    }
  
    
    
    public int getId(){
        return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom){
        this.nom=nom;}
    
    public double getOmega(){
        return this.omega;}
    
    public void setOmega(double omega){
        this.omega=omega;}
    
    //Les méthodes
    
    public abstract Complex alpha();
    public abstract Complex beta();
    public abstract Complex gamma();
    public abstract String toString();
    public String equaLineaire(){
        return this.alpha()+"U+"+this.beta()+"I+"+this.gamma()+"=0";
    }
    
}
    
