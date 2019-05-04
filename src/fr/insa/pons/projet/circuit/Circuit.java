/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.circuit;
import fr.insa.Lire;
import fr.insa.pons.projet.composant.*;
import java.util.ArrayList;

/**
 *
 * @author hugop
 */
public class Circuit {
private GenerateurTension gen ;
private ArrayList<Composant>Composants ;


public Circuit(){
gen = new GenerateurTension();
        }

    public Circuit( ArrayList<Composant> Composants, GenerateurTension gen) {
        this.Composants = Composants;
        this.gen = gen ;
    }

    public ArrayList<Composant> getComposants() {
        return Composants;
    }

    public void setComposants(ArrayList<Composant> Composants) {
        this.Composants = Composants;
    }

    public GenerateurTension getGen() {
        return gen;
    }

    public void setGen(GenerateurTension gen) {
        this.gen = gen;
    }

   
}

