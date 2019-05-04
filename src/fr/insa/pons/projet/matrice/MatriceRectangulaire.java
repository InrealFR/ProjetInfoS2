/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.matrice;
import fr.insa.pons.projet.complex.Complex ;
import static fr.insa.pons.projet.complex.Complex.mult;
import static fr.insa.pons.projet.complex.Complex.plus;

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

static Complex[][] multiplier(Complex[][] M1, Complex[][] M2) throws Exception {
    int n = M1.length ;
    Complex[][] M = new Complex[n][n];
    if(M1==null||M2==null){
        throw new Exception("L'une des matrices n'est pas definie");
    }
    if(M1[0].length != M2.length){
        throw new Exception("La produit matricielle n'est pas possible");
    }else {
        for(int i = 0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                M[i][j]=new Complex();
                for(int k=0;k<n;k++)
                {
                    M[i][j]=plus(M[i][j],mult(M1[i][k],M2[k][j]));
                }
            }
        }
    }
 return M; 
}
static Complex[][] triangulation(Complex[][] M1, Complex[] V){
    
}
    
}
