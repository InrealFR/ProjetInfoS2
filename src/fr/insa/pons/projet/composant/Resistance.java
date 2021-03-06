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
public class Resistance extends Composant{
    
    //attributs
    private double resistance;
    
    //constructeur
    public Resistance(){
        super();
        resistance = 0;
        setNom('R') ;
    }

    public Resistance(double resistance, int id) {
        super(id);
        this.resistance = resistance;
        setNom('R') ;
    }

    public Resistance(double resistance, int id, Noeuds NoeudDepart, Noeuds NoeudArrive) {
        super(id, NoeudDepart, NoeudArrive);
        this.resistance = resistance;
        setNom('R') ;
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
        return Complex.creeRec(this.resistance,0).opp();
    }
    
    
    @Override
    public Complex gamma(){
        return Complex.creeRec(0,0);
    }
    @Override
    public String toString(){
        return "[R"+this.getId()+" | R = "+resistance+"]" ;
                
    }
    
public static Resistance entrerResistance(){
System.out.println("Entrer ID");
int id = Lire.i();
System.out.println("Entrer resistance");
double resistance = Lire.d();
return(new Resistance(resistance,id));
}

}
