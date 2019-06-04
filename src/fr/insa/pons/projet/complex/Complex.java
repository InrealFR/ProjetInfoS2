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

    private final double mod;
    public final double arg;

    DecimalFormat df = new DecimalFormat("#.###");

    public Complex(double mod, double arg) {
        this.mod = mod;
        this.arg = arg;
    }

    public Complex() {
        this.mod = 0;
        this.arg = 0;
    }

    public double getMod() {
        return mod;
    }

    public double getArg() {
        return arg;
    }

    public static Complex creeRec(double re, double im) {
        return (new Complex(Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2)), Math.atan2(im, re)));
    }

    public double partReelle() {
        return this.mod * Math.cos(this.arg);
    }

    public double partImag() {
        return this.mod * Math.sin(this.arg);
    }

    public static Complex creePol(double mod, double arg) {
        return (new Complex(mod, arg));
    }

    @Override
    public String toString() {
        return (df.format(this.partReelle()) + "+ i*" + df.format(this.partImag()) + " = " + df.format(this.mod) + "*e^" + df.format(this.arg));
    }

    public static Complex entrerRec() {
        System.out.println("Partie reelle ?");
        double re = Lire.d();
        System.out.println("Partie imaginaire ?");
        double im = Lire.d();
        return (creeRec(re, im));
    }

    public static Complex entrerPol() {
        System.out.println("Module?");
        double mod = Lire.d();
        System.out.println("Argument?");
        double arg = Lire.d();
        return (creePol(mod, arg));
    }

    public static Complex entrerChoix() {
        System.out.println("Forme rectangulaire (1) ou Polaire (2) ?");
        boolean test;
        Complex z = new Complex();
        do {
            int n = Lire.i();
            switch (n) {
                case 1:
                    z = entrerRec();
                    test = true;
                    break;
                case 2:
                    z = entrerPol();
                    test = true;
                    break;
                default:
                    test = false;

            }
            if (test == false) {
                System.out.println("Erreur : saisir 1 pour la forme rect ou 2 pour la forme polaire");
            }
        } while (test == false);
        return (z);
    }

    public Complex plus(Complex a) {
        return (creeRec(a.partReelle() + this.partReelle(), a.partImag() + this.partImag()));
    }

    public static void testPlus() {
        Complex x = entrerChoix();
        Complex y = entrerChoix();

        System.out.println(y.plus(x));
    }

    public Complex opp() {
        return (creePol(-1 * mod, arg));
    }

    public Complex moins(Complex a) {
        return (creeRec(this.partReelle() - a.partReelle(), this.partImag() - a.partImag()));
    }

    public Complex mult(Complex a) {
        return (creePol((this.mod * a.mod), (this.arg + a.arg)));
    }

    public static Complex mult(Complex a, double b) {
        return (creePol(a.mod * b, a.arg));
    }

    public Complex inv() {
        return (creePol((1 / this.mod), -1 * this.arg));
    }

    public Complex div(Complex a) {
        return (this.mult(a.inv()));
    }

    public Complex puiss(double p) {
        return (creePol((Math.pow(mod, p)), p * arg));
    }

    public static Complex ValAbs(Complex a) {
        return (creePol((Math.abs(a.mod)), a.arg));
    }

    public static Complex[] eq2(Complex a, Complex b, Complex c) {
        Complex delta = b.mult(b).moins(creeRec(4, 0).mult(a).mult(c));
        Complex racDelta = delta.puiss(0.5);
        Complex[] res = new Complex[2];
        res[0] = b.opp().moins(racDelta).div(creeRec(2, 0).mult(a));
        res[1] = b.opp().plus(racDelta).div(creeRec(2, 0).mult(a));
        return (res);
    }

    public static void affeq2() {
        Complex a = entrerChoix();
        Complex b = entrerChoix();
        Complex c = entrerChoix();
        Complex[] sol;
        sol = eq2(a, b, c);
        System.out.println("Solution 1 = " + sol[0] + " Solution 2 = " + sol[1]);
    }

}
