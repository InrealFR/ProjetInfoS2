/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.composant;

import fr.insa.pons.projet.complex.Complex;
import static fr.insa.pons.projet.complex.Complex.creeRec;

/**
 *
 * @author hugop
 */
public class GenerateurTension extends Composant{
double fem ;
public GenerateurTension(){
super();
fem = 0 ;
}
public GenerateurTension(double fem){
super();
this.fem = fem ;
}
public void CoeffAlpha(){
setCoeffAlpha(creeRec(1,0)) ;
}
public void CoeffBeta(){
setCoeffBeta(new Complex());
}
public void CoeffGamma(){
setCoeffGamma(creeRec(fem,0));
}

}
