/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant;

import fr.insa.Lire;
import fr.insa.pons.projet.complex.Complex;
import fr.insa.pons.projet.noeud.Noeuds;

/**
 *
 * @author lherman01
 */
public abstract class Composant {
    
    // Les attributs
    
    private char initiale;
    private double omega;
    private int id ;
    private Noeuds NoeudDepart ;
    private Noeuds NoeudArrive ;
    
    // Constructeur
    
    public Composant(){
    initiale = Character.MIN_VALUE ;
    omega = 0;
    id=0;
    NoeudDepart = NoeudArrive = new Noeuds();
    }

    public Composant(char initiale , int id) {
        this.initiale = initiale;
        this.id = id;
    }

    public Composant(char initiale, double omega, int id, Noeuds NoeudDepart, Noeuds NoeudArrive) {
        this.initiale = initiale ;
        this.omega = omega;
        this.id = id;
        this.NoeudDepart = NoeudDepart;
        this.NoeudArrive = NoeudArrive;
    }
  
    //getters and setters 
    
    public int getId(){
        return id;}

    public void setId(int id) {
        this.id = id;
    }

    public char getInitiale() {
        return initiale;
    }

    public void setInitiale(char initiale) {
        this.initiale = initiale;
    }
    
    public double getOmega(){
        return this.omega;}
    
    public void setOmega(double omega){
        this.omega=omega;}

    public Noeuds getNoeudDepart() {
        return NoeudDepart;
    }

    public void setNoeudDepart(Noeuds NoeudDepart) {
        this.NoeudDepart = NoeudDepart;
    }

    public Noeuds getNoeudArrive() {
        return NoeudArrive;
    }

    public void setNoeudArrive(Noeuds NoeudArrive) {
        this.NoeudArrive = NoeudArrive;
    }
    
    //Les méthodes
    
    public abstract Complex alpha();
    public abstract Complex beta();
    public abstract Complex gamma();
    public abstract String toString();
    
    public static Composant entrerComposant(){
    System.out.println("Quel Composant souhaitez vous entrer ?"+
                       "\n (1) GenerateurTension"+  
                       "\n (2) Fil"+
                       "\n (3) Resistance"+
                       "\n (4) Condensateur"+
                       "\n (5) Inductance") ;
    int choix = Lire.i() ; 
    switch(choix){
        case(1):{
         
        }
    }
    }
    
    /*public String equaLineaire(){
        return this.alpha()+"U+"+this.beta()+"I+"+this.gamma()+"=0";
    }
    */
}
    
