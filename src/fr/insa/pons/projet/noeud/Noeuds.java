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
import java.awt.Graphics;
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
    Depart = new ArrayList<>() ;
    Arrive = new ArrayList<>();
    }

    public Noeuds(int id) {
        this.id = id;
        Depart = new ArrayList<>() ;
        Arrive = new ArrayList<>();
    }

    public Noeuds(double coordx, double coordy, int id) {
        this.coordx = coordx;
        this.coordy = coordy;
        this.id = id;
        Depart = new ArrayList<>() ;
        Arrive = new ArrayList<>();
    }
    public Noeuds(double coordx, double coordy){
        this.coordx = coordx ;
        this.coordy = coordy ;
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
    public void dessine(Graphics g){
        g.drawOval((int)this.coordx,(int)this.coordy,5,5) ;
    }
    
    public String toString (){
        return "[Noeud "+id+" | coordx : "+coordx+" coordy : "+coordy+"]"+"| Depart :"+getDepart()+" | Arrive :"+getArrive();
    }
    public void RemoveCompoD(int id){
    int pos = 0 ;
    boolean verif = false ;
    while((pos < this.getDepart().size())&&(verif == false)){
    if(this.getDepart().get(pos).getId()==id){
        this.getDepart().remove(pos) ;
        verif = true ;
    } else {
    pos = pos + 1 ;
    }
    }
    }
       public void RemoveCompoA(int id){
    int pos = 0 ;
    boolean verif = false ;
    while((pos < this.getArrive().size())&&(verif == false)){
    if(this.getArrive().get(pos).getId()==id){
        this.getArrive().remove(pos) ;
        verif = true ;
    } else {
    pos = pos + 1 ;
    }
    }
    
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

