/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author louise
 */
package fr.insa.pons.projet.noeud;
import fr.insa.Lire ;

public class Noeuds {
    
    // Attributs
    private final double coordx;
    private final double coordy;
    private final int id;
    
    //constructeurs
    
    //sans arguments
    Noeuds(){
        this.coordx=0.0;
        this.coordy=0.0;
        this.id=0;
    }
    
    //avec les coordonnées & identifiant
    Noeuds(double x, double y, int i){
        this.coordx = x;
        this.coordy = y;
        this.id = i;
    }
    
    // Créer une instance de la classe Noeud
    
       public static Noeuds CreeNoeud(double x, double y, int i){
        return new Noeuds(x,y,i);
    }
    //gets & sets
    
    //gets
    
    public double getCoordx (){
        return this.coordx;}
     
    public double getCoordy (){
        return this.coordy;}
    
    public int getId (){
        return this.id;}
    
    public double[] getCoord (){
        double [] coord = new double [2];
        coord[0]=this.coordx;
        coord[1]=this.coordy;
        return coord;
    }
    
    //sets
    
 
    
    // je sais pas comment faire un set heeeelp!
    public void setId(int i){
        double x = this.getCoordx();
        double y = this.getCoordy();
        Noeuds N = CreeNoeud(x,y,i) ;
    }
    
    public void setCoordx(int x){
        double y = this.getCoordy();
        int i = this.getId();
        Noeuds N = CreeNoeud(x,y,i);
    }
    
    public void setCoordy(int y){
        double x = this.getCoordx();
        int i = this.getId();
        Noeuds N = CreeNoeud(x,y,i);
    }
    
    // Le toString
    
    @Override
    public String toString (){
        return("Noeud "+this.id+": ("+this.coordx+";"+this.coordy+") ");
    }
    }

