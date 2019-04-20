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
public int taille ;
public Complex[][] matrice ;

/*public MatriceRectangulaire(){
 *taille = 0 ;
 *matrice = new Complex[0] ;
 *}
 */

public MatriceRectangulaire(int n){
taille = n ;
matrice = new Complex[n][n] ;
}

public static MatriceRectangulaire mult(MatriceRectangulaire mat1,MatriceRectangulaire mat2){
MatriceRectangulaire result = new MatriceRectangulaire(mat1.taille) ;
int index = mat1.taille ;
for(int i = 0; i< index; i++){
    for(int j=0; j< index; j++){
     for(int k=0;k<index;k++){
       result.matrice[i][j] = plus(result.matrice[i][j],mult(mat1.matrice[i][k],mat2.matrice[k][j])) ;
     }
    }

 }

}
}
