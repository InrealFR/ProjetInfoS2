/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.matrice;
import fr.insa.pons.projet.complex.Complex ;
/**
 *
 * @author hugop
 */
public class MatriceRectangulaire {
public int nbLigne ;
public int nbColonne ;
public Complex[][] matrice ;

    public MatriceRectangulaire(int nbLigne, int nbColonne) {
        this.nbLigne = nbLigne;
        this.nbColonne = nbColonne;
        matrice = new Complex[nbLigne][nbColonne] ;
    }    
}
