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
private ArrayList<Composant>Composants ;
public Circuit(){
}

    public Circuit( ArrayList<Composant> Composants) {
        this.Composants = Composants;
    }

    public ArrayList<Composant> getComposants() {
        return Composants;
    }

    public void setComposants(ArrayList<Composant> Composants) {
        this.Composants = Composants;
    }


}

