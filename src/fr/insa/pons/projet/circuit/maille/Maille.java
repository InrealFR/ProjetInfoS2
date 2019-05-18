/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.circuit.maille;

import fr.insa.pons.projet.composant.Composant;
import java.util.ArrayList;

/**
 *
 * @author lherman01
 */
public class Maille {
    
    //Attributs
    private int id;
    private ArrayList<Composant> composants;
    
    //Constructeurs
    public Maille (){
        
    }
    
    public Maille(int i , ArrayList<Composant> composantsMaille){
        this.composants = composantsMaille;
        this.id = i;
    }
    
    //gets
    
    public int getId(){
        return this.id;
    }
    
    public ArrayList<Composant> getComposants(){
        return this.composants;
    }
    
    //sets
    
    public void setId(int i){
        this.id=i;
    }
    
    public void setComposants(ArrayList<Composant> composants){
        this.composants = composants;
    }
}
