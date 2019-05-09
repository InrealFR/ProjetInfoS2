/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.circuit;

import fr.insa.Lire;
import fr.insa.pons.projet.composant.*;
import static fr.insa.pons.projet.composant.Composant.entrerComposant;
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
        return ("Liste Composants : " + Composants
                + "\n Liste Noeuds : " + Noeuds);
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
                    System.out.println(this);
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
                Composant c = entrerComposant();
                if(this.testIdC(c.getId())){
                System.out.println("MAUVAIS ID ! COMPO NON CREE");
                } else {
                this.ajouteComposant(c);
                }
                    break;
                }
                case 0: {
                    rep = 0;
                    break;
                }
                default: {
                    System.out.println("Entrez une valeur existante.");
                    rep = Lire.i();
                }
            }
        }
    }

    public static void main(String args[]) {
        Circuit test = new Circuit();
        test.gestion();
    }

    public boolean testIdC(int id) {
        ArrayList<Composant> compo = this.getComposants();
        boolean verif = false;
        int i = 0;
        while ((verif == false) && (i < compo.size())) {
            if (compo.get(i).getId() == id) {
                verif = true;
            } else {
                i = i+1;
            }
        }
        return (verif);
    }

    public void ajouteComposant(Composant c) {
        if (this.testIdC(c.getId())) {
            throw new Error("ID en double !!");
        }
        this.getComposants().add(c);
    }

    public boolean testId(int id) {

        ArrayList<Noeuds> noeuds = this.getNoeuds();
        boolean verif = false;
        int i = 0;

        while ((verif == false) && (i < noeuds.size())) {
            if (noeuds.get(i).getId() == id) {
                verif = true;
            } else {
                i = i + 1;
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
