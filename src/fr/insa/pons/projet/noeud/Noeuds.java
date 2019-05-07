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

import fr.insa.Lire;
import fr.insa.pons.projet.composant.Composant;
import java.util.ArrayList;

public class Noeuds {
    
    // Attributs
    private double coordx;
    private double coordy;
    private int id;
    private ArrayList<Composant>Depart ;
    private ArrayList<Composant>Arrive ;
    
    
    public Noeuds(){
    coordx = coordy = 0 ;
    id = 0 ;
    Depart = Arrive = null ;
    }

    public Noeuds(int id) {
        this.id = id;
    }

    public Noeuds(double coordx, double coordy, int id) {
        this.coordx = coordx;
        this.coordy = coordy;
        this.id = id;
    }
    
    public Noeuds(double coordx, double coordy, int id, ArrayList<Composant> Depart, ArrayList<Composant> Arrive) {
        this.coordx = coordx;
        this.coordy = coordy;
        this.id = id;
        this.Depart = Depart;
        this.Arrive = Arrive;
    }
    
    public double getCoordx() {
        return coordx;
    }

    public void setCoordx(double coordx) {
        this.coordx = coordx;
    }

    public double getCoordy() {
        return coordy;
    }

    public void setCoordy(double coordy) {
        this.coordy = coordy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Composant> getDepart() {
        return Depart;
    }

    public void setDepart(ArrayList<Composant> Depart) {
        this.Depart = Depart;
    }

    public ArrayList<Composant> getArrive() {
        return Arrive;
    }

    public void setArrive(ArrayList<Composant> Arrive) {
        this.Arrive = Arrive;
    }

    public String toString (){
        return "Noeud "+id+" coordx :"+coordx+" coordy :"+coordy ;
    }
    public static Noeuds entrerNoeud(){
    System.out.println("Saisir un id :") ;
    int id = Lire.i();
    System.out.println("Coordx ?") ;
    double coordx = Lire.d() ;
    System.out.println("Coordy ?") ;
    double coordy = Lire.d();
    return(new Noeuds(coordx,coordy,id));
    }
    
    }

