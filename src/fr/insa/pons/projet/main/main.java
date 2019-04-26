/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.main;

import fr.insa.pons.projet.composant.GenerateurTension;

/**
 *
 * @author hugop
 */
public class main {
    public static void main(String[] args) {
        double pulsation = 2 ;
        GenerateurTension x = new GenerateurTension(5) ;
        x.setNom("test");
        x.coeffAlpha(pulsation); 
        x.coeffBeta(pulsation);
        x.coeffGamma(pulsation);
        System.out.print(x);
    }
}
