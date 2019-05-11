/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.complex;

import fr.insa.Lire;
import java.text.DecimalFormat;

/**
 *
 * @author hugop
 */
public class Complex {
private final double mod ;
public final double arg ;

DecimalFormat df = new DecimalFormat("#.###");
public Complex(double mod, double arg) {
    this.mod= mod ;
    this.arg = arg ;
}
public Complex() {
    this.mod = 0 ;
    this.arg = 0 ;
}

    public double getMod() {
        return mod;
    }

    public double getArg() {
        return arg;
    }
    
public static Complex creeRec(double re, double im){
return(new Complex(Math.sqrt(Math.pow(re,2)+Math.pow(im,2)),Math.atan2(re, im))) ;
}

public static Complex creePol(double mod, double arg){
return(new Complex(mod,arg)) ;
}
@Override
public String toString(){
return(df.format(this.mod*Math.cos(arg))+ "+ i*"+ df.format(this.mod*Math.sin(arg)) + " = "+df.format(this.mod)+"*e^"+df.format(this.arg)) ;
}
public static Complex entrerRec() {
System.out.println("Partie reelle ?") ;
double re = Lire.d() ;
System.out.println("Partie imaginaire ?") ;
double im = Lire.d() ;
return(creeRec(re, im)) ;
}

public static Complex entrerPol(){
    System.out.println("Module?");
    double mod = Lire.d() ;
    System.out.println("Argument?");
    double arg = Lire.d() ;
    return(creePol(mod, arg)) ;
}

public static Complex entrerChoix(){
System.out.println("Forme rectangulaire (1) ou Polaire (2) ?") ;
boolean test ;
Complex z = new Complex() ;
do{
int n = Lire.i() ;
switch(n){
    case 1 : z = entrerRec() ;
    test = true ;
  break ;
    case 2 : z = entrerPol() ;
    test = true ;
  break ;
    default : test = false ;
   
}
if(test==false){
    System.out.println("Erreur : saisir 1 pour la forme rect ou 2 pour la forme polaire") ;
}
} while(test == false) ;
return(z); 
}

public static Complex plus(Complex a, Complex b){
return(creeRec(a.mod*Math.cos(a.arg)+b.mod*Math.cos(b.arg),a.mod*Math.sin(a.arg)+b.mod*Math.sin(b.arg))) ;
}

public static void testPlus(){
Complex x = entrerChoix();
Complex y = entrerChoix() ;

System.out.println(plus(y,x)) ;
}

public Complex opp(){
return(creePol(1/mod,-1*arg)) ;
}

public static Complex moins(Complex a, Complex b){
return(creeRec(a.mod*Math.cos(a.arg)-b.mod*Math.cos(b.arg),a.mod*Math.sin(a.arg)-b.mod*Math.sin(b.arg))) ;
}

public static Complex mult(Complex a, Complex b){
return(creePol((b.mod*a.mod),(b.arg+a.arg))) ;
}

public static Complex mult(Complex a, double b){
return(creePol(a.mod*b,a.arg)) ;
}

public Complex inv(){
return(creePol((1/mod),-1*arg)) ;
}

public static Complex div(Complex a, Complex b){
return(mult(a,b.inv())) ;
}

public Complex puiss(double p){
return(creePol((Math.pow(mod, p)),p*arg)) ;
}
public static Complex ValAbs(Complex a){
    return(creePol((Math.abs(a.mod)),a.arg));
}

public static Complex[] eq2(Complex a, Complex b, Complex c){
Complex delta = moins(b.puiss(2),mult(a,c)) ;
Complex sol[] = new Complex[1] ;
sol[0] = div(moins(mult(b,-1),delta.puiss(0.5)),mult(a,2));
sol[1] = div(plus(mult(b,-1),delta.puiss(0.5)),mult(a,2));
return(sol);
}

public static void affeq2(){
Complex a = entrerChoix() ;
Complex b = entrerChoix();
Complex c = entrerChoix();
Complex[] sol ;
sol = eq2(a,b,c);
System.out.println("Solution 1 = "+sol[0]+" Solution 2 = "+sol[1]);
}

}

