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
                    M[i][j]= M[i][j].plus(M1[i][k].mult(M2[k][j]));
                }
            }
        }
    }
 return M; 
}
static Complex[][] triangulation(Complex[][] M1, Complex[][] V){
    int n = M1.length;
    Complex C;
    Complex a = new Complex();
    for(int e=0;e<n-2;e++){
        int Imax = 0;
        
        for(int i=e;i<n-1;i++){           
            if(Math.abs(M1[i][e].arg)>Math.abs(M1[Imax][e].arg)){
            Imax = i;
        }
            if(M1[Imax][e]==a){
                System.out.println("Matrice non inversible");
            }else {
                for(int j=0;j<=n;j++){
                    C = M1[Imax][j];
                    M1[Imax][j]=M1[e][j];
                    M1[e][j]=C;
                }
                C = V[e][0];
                V[e][0]=V[Imax][0];
                V[Imax][0]=C;
            }
            for(int l=e+1;l<=n+1;l++){
                Complex f = M1[l][e].div(M1[e][e]);
                M1[l][e] = new Complex();
                for(int Cal= e+1;Cal<=n+1;Cal++){
                    M1[l][Cal]=M1[l][Cal].moins(f.mult(M1[e][Cal]));
                }
                V[l][0]= V[l][0].moins(f.mult(V[e][0]));
            }
        }
    }
    return M1;
    
    
}
    

}

