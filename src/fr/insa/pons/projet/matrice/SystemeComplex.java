/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.matrice;

import fr.insa.Lire;
import fr.insa.pons.projet.complex.Complex;
import static fr.insa.pons.projet.complex.Complex.creeRec;

/**
 *
 * @author Thomas
 */
public class SystemeComplex {

    private final Complex[][] mat;
    private final Complex[] vect;

    public SystemeComplex(Complex[][] mat, Complex[] vect) {
        this.mat = mat;
        this.vect = vect;
    }

    @Override
    public String toString() {
        int n = mat.length;
        int i, j;
        String res = "";
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                res = res + mat[i][j];
            }
            res = res + "   " + vect[i] + "\n";
        }
        return res;
    }

    public SystemeComplex diagonaliseMatrice() {
        int i, j, imax, ligne, col;
        int n = mat.length;
        Complex max, tamp, fact;
        for (j = 0; j < n - 1; j++) {
            imax = j;
            max = mat[j][j];
            for (i = j + 1; i < n; i++) {
                if (mat[i][j].partReelle() > max.partReelle() && mat[i][j].partImag() > max.partImag()) {
                    imax = i;
                    max = mat[i][j];
                }
            }
            if (mat[imax][j] == creeRec(0, 0)) {
                throw new Error("Matrice non inversible !");
            } else {
                if (imax != j) {
                    for (i = 0; i < n; i++) {
                        tamp = mat[imax][i];
                        mat[imax][i] = mat[j][i];
                        mat[j][i] = tamp;
                    }
                    tamp = vect[imax];
                    vect[imax] = vect[j];
                    vect[j] = tamp;
                }
                for (ligne = j + 1; ligne < n; ligne++) {
                    fact = mat[ligne][j].div(mat[j][j]);
                    mat[ligne][j] = creeRec(0, 0);
                    for (col = j + 1; col < n; col++) {
                        mat[ligne][col] = mat[ligne][col].moins(fact.mult(mat[j][col]));
                    }
                    vect[ligne] = vect[ligne].moins(fact.mult(vect[j]));
                }
            }
        }
        return this;
    }

    public Complex[] resoudSysteme() {
        this.diagonaliseMatrice();
        int n = mat.length;
        int i, j;
        Complex a = creeRec(0, 0);
        Complex[] res = new Complex[n];
        for (i = n - 1; i >= 0; i--) {
            if (i != n - 1) {
                for (j = i + 1; j < n; j++) {
                    a = a.plus(mat[i][j].mult(res[j]));
                }
            }
            res[i] = vect[i].moins(a).div(mat[i][i]);
            a = creeRec(0, 0);
        }
        return res;
    }

    public void testResoudSysteme() {
        int i, n;
        Complex[] res = resoudSysteme();
        n = res.length;
        for (i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + res[i].toString());
        }
    }

    public static void main(String[] args) {
        System.out.print("Taille de la matrice : ");
        int n = Lire.i();
        Complex[][] mat = new Complex[n][n];
        Complex[] vect = new Complex[n];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                mat[i][j] = creeRec(i, i).mult(creeRec(n, 0)).plus(creeRec(j, j).plus(creeRec(1, 1)));
            }
            vect[i] = creeRec(i, i).plus(creeRec(1, 1));
        }
        SystemeComplex m = new SystemeComplex(mat, vect);
        System.out.println("\n" + m.toString());
        m.diagonaliseMatrice();
        System.out.println(m.toString());
        m.testResoudSysteme();

    }
}
