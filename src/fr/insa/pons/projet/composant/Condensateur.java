/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant ;

import fr.insa.Lire;
import fr.insa.pons.projet.complex.Complex;
import java.awt.Graphics;

/**
 *
 * @author lherman01
 */
public class Condensateur extends Composant {
    
    //attributs
    public double capacite;
    
    //Constructeurs
    public Condensateur(){
       super();
       capacite = 0 ;
       setNom('C') ;
    }

    public Condensateur(double capacite, int id) {
        super(id);
        this.capacite = capacite;
        this.setOmega(1);

        setNom('C') ;

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
        return Complex.creePol(1/(this.capacite*this.getOmega()),Math.PI/2);
    }
    
    @Override
    public Complex gamma(){
        return Complex.creeRec(0,0);
    }
    @Override
    public String toString(){
        return "[C"+this.getId()+" | C ="+capacite+"]" ;
    }
    public void dessine(Graphics g){
        
    }
    public static Condensateur entrerCondensateur(){
    System.out.println("Entrer capacite :");
    double c = Lire.d();
    System.out.println("Entrer id :") ;
    int id = Lire.i();
    Condensateur co = new Condensateur(c,id);
    return(co) ;
    }
}
