/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant;

import fr.insa.Lire;
import fr.insa.pons.projet.complex.Complex;

/**
 *
 * @author lherman01
 */
public class GenerateurTension extends Composant {

    //attributs
    private double fem;

    //constructeur
    public GenerateurTension() {
        super();
        fem = 0;
        setNom('G');
    }

    public GenerateurTension(double fem, int id) {
        super(id);
        this.fem = fem;
        setNom('G');
    }

    // selecteurs
    public double getFem() {
        return this.fem;
    }

    public void setFem(double f) {
        this.fem = f;
    }

    //methodes
    @Override
    public Complex alpha() {
        return Complex.creeRec(1, 0);
    }

    @Override
    public Complex beta() {
        return Complex.creePol(0, 0);
    }

    @Override
    public Complex gamma() {
        return Complex.creeRec(this.fem, 0);
    }

    @Override
    public String toString() {
        return ("[G" + this.getId() + "| fem =" + this.fem + "]");
    }

    public static GenerateurTension entrerGenerateur() {
        System.out.println("Saisir fem :");
        double fem = Lire.d();
        System.out.println("Saisir ID :");
        int id = Lire.i();
        return (new GenerateurTension(fem, id));
    }
}
