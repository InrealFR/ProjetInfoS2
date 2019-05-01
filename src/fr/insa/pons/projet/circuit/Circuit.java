/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.circuit;

import fr.insa.pons.projet.composant.Composant;
import java.util.ArrayList;

/**
 *
 * @author hugop
 */
public class Circuit {
private double pulsation ;
private ArrayList<Composant>Composants ;
public Circuit(){
pulsation = 0 ;
}

    public Circuit(double pulsation, ArrayList<Composant> Composants) {
        this.pulsation = pulsation;
        this.Composants = Composants;
    }

    public double getPulsation() {
        return pulsation;
    }

    public void setPulsation(double pulsation) {
        this.pulsation = pulsation;
    }

    public ArrayList<Composant> getComposants() {
        return Composants;
    }

    public void setComposants(ArrayList<Composant> Composants) {
        this.Composants = Composants;
    }


}

