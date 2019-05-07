/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.circuit;

import fr.insa.Lire;
import fr.insa.pons.projet.composant.*;
import fr.insa.pons.projet.noeud.Noeuds;
import static fr.insa.pons.projet.noeud.Noeuds.entrerNoeud;
import java.util.ArrayList;

/**
 *
 * @author hugop
 */
public class Circuit {

    private ArrayList<Composant> Composants;
    private ArrayList<Noeuds> Noeuds;

    public Circuit() {
        Composants = new ArrayList<>();
        Noeuds = new ArrayList<>();
    }

    public Circuit(ArrayList<Composant> Composants, ArrayList<Noeuds> Noeuds, double omega) {
        this.Composants = Composants;
        this.Noeuds = Noeuds;
    }

    public ArrayList<Composant> getComposants() {
        return Composants;
    }

    public void setComposants(ArrayList<Composant> Composants) {
        this.Composants = Composants;
    }

    public ArrayList<Noeuds> getNoeuds() {
        return Noeuds;
    }

    public void setNoeuds(ArrayList<Noeuds> Noeuds) {
        this.Noeuds = Noeuds;
    }

    public String toString() {
        return ("\n Liste Composants :" + Composants
                + "\n Liste Noeuds: " + Noeuds);
    }

    public void gestion() {
        int rep = -1;
        while (rep != 0) {
            System.out.println("(1) Afficher le circuit");
            System.out.println("(2) Ajouter un noeud");
            System.out.println("(3) Ajouter un composant");
            System.out.println("(0) Quitter");
            rep = Lire.i();
            switch (rep) {
                case 1: {
                    this.toString();
                    break;
                }
                case 2: {
                    Noeuds n = entrerNoeud();
                    if (this.testId(n.getId())) {
                        System.out.println("Mauvais ID ! Noeud non créer.");
                    } else {
                        this.ajouteNoeud(n);
                    }
                    break;
                }
                case 3: {

                }
            }
        }
    }

    public boolean testId(int id) {

        ArrayList<Noeuds> noeuds = this.getNoeuds();
        boolean verif = false;
        int i = 0;

        while ((verif == false) && (i < noeuds.size())) {
            if (noeuds.get(i).getId() == id) {
                verif = true;
            } else {
                i = i++;
            }
        }
        return (verif);
    }

    public void ajouteNoeud(Noeuds n) {
        //id ?
        if (this.testId(n.getId())) {
            throw new Error("ID en double !!");
        }
        this.getNoeuds().add(n);
    }

    public Noeuds choisiNoeud() {
        System.out.println(this.getNoeuds());
        System.out.println("Quel noeud ?");
        int i = Lire.i();
        return (this.getNoeuds().get(i));
    }
}
