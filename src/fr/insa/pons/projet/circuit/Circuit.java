/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.circuit;

import fr.insa.Lire;
import fr.insa.pons.projet.complex.Complex;
import fr.insa.pons.projet.composant.*;
import fr.insa.pons.projet.matrice.SystemeComplex;
import fr.insa.pons.projet.noeud.Noeuds;
import static fr.insa.pons.projet.noeud.Noeuds.entrerNoeud;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hugop
 */
public class Circuit {

    private ArrayList<Composant> Composants;
    private ArrayList<Noeuds> Noeuds;
    
    public Circuit() {
        Composants = new ArrayList<>();
        Noeuds = new ArrayList<>();
    }

    public Circuit(ArrayList<Composant> Composants, ArrayList<Noeuds> Noeuds) {
        this.Composants = Composants;
        this.Noeuds = Noeuds;
    }

    public ArrayList<Composant> getComposants() {
        return Composants;
    }

    public void setComposants(ArrayList<Composant> Composants) {
        this.Composants = Composants;
    }

    public ArrayList<Noeuds> getNoeuds() {
        return Noeuds;
    }

    public void setNoeuds(ArrayList<Noeuds> Noeuds) {
        this.Noeuds = Noeuds;
    }
    public String toString() {
        return ("Liste Composants : " + Composants
                + "\n Liste Noeuds : " + Noeuds);
    }

    public void gestion() {
        int rep = -1;
        ArrayList< ArrayList<Composant>> test = new ArrayList();
        ArrayList< ArrayList <Composant> > test2 = new ArrayList();
        
        while (rep != 0) {
            System.out.println("(1) Afficher le circuit");
            System.out.println("(2) Ajouter un noeud");
            System.out.println("(3) Ajouter un composant");
            System.out.println("(4) Detection Branches");
            System.out.println("(5) Detection Mailles");
            System.out.println("(6) circuit test");
            System.out.println("(7) Matrice");
            System.out.println("(8) Solution");
            System.out.println("(0) Quitter");
            
            rep = Lire.i();
            switch (rep) {
                case 1: {
                    System.out.println(this);
                    break;
                }
                case 2: {
                    Noeuds n = entrerNoeud();
                    if (this.testId(n.getId())) { //id unique
                        System.out.println("Mauvais ID et/ou coordonnées déjà existantes ! Noeud non créer.");
                    } else {
                        this.ajouteNoeud(n);
                    }
                    break;
                }
                case 3: {
                    Composant c = Composant.entrerComposant();
                    if (this.testIdC(c.getId())) { //id unique 
                        System.out.println("MAUVAIS ID ! COMPO NON CREE");
                    } else {
                        this.entrerComposant(c);
                    }
                    break;
                }
                case 4: {
                    test = detectionBranches();
                    System.out.println(test);
                }
                break;
                case 5: {
                   test=detectionBranches();
                    
                test2 = detectionMaille(test);  
                System.out.println(test2);
                }
                break;
                case 6: {
                    Noeuds uno = new Noeuds(1.2, 14, 1);
                    Noeuds dos = new Noeuds(178, 152, 2);
                    Noeuds tres = new Noeuds(1, 1, 3);
                    GenerateurTension G = new GenerateurTension(1, 0);
                    G.setNoeudDepart(uno);
                    uno.getDepart().add(G);
                    G.setNoeudArrive(dos);
                    dos.getArrive().add(G);

                    Resistance R1 = new Resistance(1, 1);
                    System.out.println("coef béta de r1"+R1.beta());
                    R1.setNoeudDepart(dos);
                    dos.getDepart().add(R1);
                    R1.setNoeudArrive(uno);
                    uno.getArrive().add(R1);

                    Resistance R2 = new Resistance(1, 2);
                    System.out.println("coef béta de r2"+R2.beta());
                    R2.setNoeudDepart(dos);
                    dos.getDepart().add(R2);
                    R2.setNoeudArrive(tres);
                    tres.getArrive().add(R2);

                    Condensateur C3 = new Condensateur(1, 3);
                    System.out.println("coef béta de c"+C3.beta());
                    C3.setNoeudDepart(tres);
                    tres.getDepart().add(C3);
                    C3.setNoeudArrive(uno);
                    uno.getArrive().add(C3);

                   
                    this.getComposants().add(G);
                    this.getComposants().add(R1);
                    this.getComposants().add(R2);
                    this.getComposants().add(C3);
                    this.getNoeuds().add(uno);
                    this.getNoeuds().add(dos);
                    this.getNoeuds().add(tres);
                }
                break;
                case 7: {
                Complex[][] mat = this.MatriceCoefficients();
                int n = mat.length;
                for  ( int i = 0;i<n;i++){
                    for (int j=0;j<n;j++){
                        System.out.print(mat[i][j]+"             ");
                    }
                    System.out.println("  ");
                }
                Complex[] vect = this.vecteurEquation();
                int l = vect.length;
                for (int i=0;i<l;i++){
                    System.out.println(vect[i]);
                }
                Complex[] sol = resolutionSystemeMatriciel(this.MatriceCoefficients(),this.vecteurEquation());
                for (int i=0;i<l;i++){
                    System.out.println(sol[i]);
                }
                }
                break;
                case 8: {
                    this.solutionFinale();
                }
                case 0: {
                    rep = 0;
                    break;
                }
                default: {
                    System.out.println("Entrez une valeur existante.");
                    rep = Lire.i();
                }
            }
        }
    }

    public static void main(String args[]) {
       Circuit test = new Circuit();
       test.gestion();
    }
   

    // public static void main(String args[]) {
    //     Circuit test = new Circuit();
    //     test.gestion();
    //  }

    public boolean testIdC(int id) { //test id composants
        ArrayList<Composant> compo = this.getComposants();
        boolean verif = false;
        int i = 0;
        while ((verif == false) && (i < compo.size())) {
            if (compo.get(i).getId() == id) {
                verif = true;
            } else {
                i = i + 1;
            }
        }
        return (verif);
    }
    public void entrerComposant(Composant c){
        System.out.println("Choix Noeud Depart ?");
        Noeuds Depart = choisiNoeud();
        System.out.println("ID Noeud Arrive ?");
        Noeuds Arrive = choisiNoeud();
        this.ajouteComposant(c,Depart,Arrive) ;
    }
    public void ajouteComposant(Composant c, Noeuds Depart, Noeuds Arrive) {
        if (this.testIdC(c.getId())) { //on test d'abord l'id 
         JOptionPane.showMessageDialog(null, "ID EN DOUBLE : COMPOSANT NON CREE");
            throw new Error("ID en double !!");
        }
        //def des noeuds depart et arrive
        if (Arrive.getId() == Depart.getId()) {
            throw new Error("Un Composant a un noeud de depart different de l'arrivee !");
        }
        c.setNoeudDepart(Depart);
        c.setNoeudArrive(Arrive);
        Depart.getDepart().add(c);
        Arrive.getArrive().add(c);
        this.getComposants().add(c);
    }

    public boolean testId(int id) {
//test id des noeuds
        ArrayList<Noeuds> noeuds = this.getNoeuds();
        boolean verif = false;
        int i = 0;

        while ((verif == false) && (i < noeuds.size())) {
            if (noeuds.get(i).getId() == id) {
                verif = true;
            } else {
                i = i + 1;
            }
        }
        return (verif);
    }

    public boolean testCoords(double px, double py) {
        ArrayList<Noeuds> noeuds = this.getNoeuds();
        boolean verif = false;
        int i = 0;
        while ((verif == false) && (i < noeuds.size())) {
            if ((noeuds.get(i).getCoordx() == px) && (noeuds.get(i).getCoordy() == py)) {
                verif = true;
            } else {
                i = i + 1;
            }
        }
        return (verif);
    }

    public void ajouteNoeud(Noeuds n) {
        //id ?
        if (this.testId(n.getId())) {
             JOptionPane.showMessageDialog(null, "ID EN DOUBLE : NOEUD NON CREE");
            throw new Error("ID en double !!");
        }
        //ajout du noeud dans notre circuit en cours
        this.getNoeuds().add(n);
    }

    public Noeuds choisiNoeud() { //methode pr choisir un noeud a partir de son id 
        System.out.println(this.getNoeuds());
        System.out.println("Quel noeud ? (ID)");
        int i = Lire.i();
        if (this.testId(i) == false) { //on verifie que l'ID du noeud existe bien
            throw new Error("ID non existant !");
        }
        return (chercheNoeud(i));
    }
    
    public Noeuds chercheNoeud(int id){
        int pos = 0;
        boolean verif = false;
        while ((pos < this.getNoeuds().size()) && (verif == false)) { //on identifie la position du noeud qui nous interesse
            if (this.getNoeuds().get(pos).getId() == id) {
                verif = true;
            } else {
                pos = pos + 1;
            }
        }
    return(this.getNoeuds().get(pos)) ;
    }
    
    public ArrayList< ArrayList <Composant> > detectionBranches(){
        
        ArrayList<ArrayList<Composant>> listeBranches = new ArrayList();
        int ln = this.Noeuds.size();
        int i =0;
        
        
        while( (i!= ln) && ((this.Noeuds.get(i).getDepart().size()+this.Noeuds.get(i).getArrive().size())<2)){
            i=i+1;
        }
        
        /*
        On cherche à savoir si il existe un noeud qui soit l'intersection de 3 branches
        */
        
        if(i==ln){
            System.out.println("Votre circuit est en série, il comporte une unique maille correspondante aux composants du circuit");
            listeBranches.add(this.Composants);
        }
        
        /* 
        Si il n'en existe pas, alors on en conclut que le circuit ne comporte qu'une branche qui constitue une unique maille.
        Alors la listeBranches ne compte qu'une unique ArrayListe de composants, la listeComposants du circuit this.
        */
        
        else
        
        /*
        Si on a un noeud au départ de plusieurs branches, alors comme il compte au moins une branche entrante,
        on en conclut qu'il est une intersection  de mailles. On commence alors la recherche de branches.
        */
            
        {
            System.out.println("Votre circuit possède plusieurs mailles, début de la détection des branches du circuit");
            ArrayList NDV = new ArrayList();
            
            while (i!=ln){
                
                /*
                Tant que on a pas traité tous les noeuds du circuit ayant au moins deux composants sortant
                */
                
                int lc=this.Noeuds.get(i).getDepart().size();
                // Ce noeud est au départ d'autants de branches que il existe de composants sortant de ce noeud.
                
                Noeuds Depart = this.Noeuds.get(i);
                NDV.add(i);
                System.out.println("Noeuds deja vus :"+NDV);
                // On initialise le noeud de départ de la branche et on le répertorie comme déjà vu
                
                System.out.println(Depart+" est au départ de "+lc+" branches");
                
                Noeuds Nlect = Depart ;
                /*
                Nlect est un noeud de lecture qui détectera de noeud en noeud les composants de chaque branche.
                On l'initialise à Depart.
                */
                
                int j ;
                
                for  (j = 0 ; j < lc ; j++) {
                    
                    System.out.println("détection de la "+j+"ème branche au depart  de "+Depart);
                    
                    ArrayList <Composant> composantsBranche = new ArrayList();
                    //La liste composantsBranche contiendra les composants de la jème branche au départ de départ
                    
                    composantsBranche.add(Depart.getDepart().get(j));
                    Nlect = Depart.getDepart().get(j).getNoeudArrive();
                    //ajout du premier composant de la branche en détection et déplacement de Nlect au noeud de sortie de celui-ci
                
                    while( (Nlect.getDepart().size()==1) && (Nlect.getArrive().size()==1)){
                        composantsBranche.add(Nlect.getDepart().get(0));
                        Nlect = Nlect.getDepart().get(0).getNoeudArrive();
                        //ajout de tous les composants en série du premier
                    }
                    
                    listeBranches.add(composantsBranche);
                    //Il faudrait réinitialiser composantsBranche si nécessaire mais je ne connais pas la commande
                System.out.println(composantsBranche);
                }
                                /* 
                Il a fini de détecter les branches au départ de Depart.
                Il faut alors chercher un nouveau noeud de départ pour poursuivre la recherche de branches
                */
                
            while ( ((i!=ln)&&((this.Noeuds.get(i).getDepart().size()+this.Noeuds.get(i).getArrive().size())==2)) || (NDV.contains(i))){
                i=i+1;
            }
            
            /*
            On recherche un nouveau noeud de départ si il n'y en a plus, alors i==ln et on sort de la boucle while
            */
            
           
            }
            
            /*
            Fin de la détection de toutes les branches du circuit.
            */
            
        }
        System.out.println(listeBranches);
        return listeBranches;
       
    }    
    
    public static Noeuds getFinBranche (int i , ArrayList < ArrayList <Composant> >  listeBranches ){
        
        int l;
        
        l=listeBranches.get(i).size();
        
        return listeBranches.get(i).get(l).getNoeudArrive();
        
    }
    
    public static Noeuds getDebutBranche (int i , ArrayList < ArrayList <Composant> >  listeBranches ){
        
        return listeBranches.get(i).get(0).getNoeudDepart();
    }
    
    public static void ajouterBranche(int i, ArrayList<Composant> M, ArrayList < ArrayList <Composant> > listeBranches ){
        
        int l;
        int k;
        
        l= listeBranches.get(i).size();
        for (k=0;k<l;k++){
            M.add(listeBranches.get(i).get(k));
        }
        
    }
     
    public ArrayList< ArrayList <Composant> > detectionMaille(ArrayList< ArrayList <Composant> > listeBranches){
        
        ArrayList < ArrayList <Composant> > mailles = new ArrayList();
        // On crée une liste qui contiendra les composant d'une maille dans chaque colonne
        System.out.println("coucou");
        int lb=listeBranches.size();
        int j;
        for (j=1;j<lb;j++){
       
            ArrayList <Composant> M = new ArrayList();
            ajouterBranche(0,M,listeBranches);
            ajouterBranche(j,M,listeBranches);
            mailles.add(M);
            }
        System.out.println("il existe "+ mailles.size()+ " mailles dans le circuit"); 
        System.out.println(mailles.toString());
        return mailles;
    }
    
    public ArrayList< ArrayList <Composant> > calculMailles(){
        return (this.detectionMaille(this.detectionBranches()));
    }
    
    
    
public void ajoutCaracteristique (Complex [][] mat, int l){
    
    int n = this.Composants.size();
    int i;
    for (i=0;i<n;i++){
        mat[l+i][l+i] = this.getComposants().get(i).alpha();
        //le coefficient de la colonne associée à la tension aux bornes du composant i prend la valeur du alpha de celui-ci
        mat[l+i][n+i] = this.getComposants().get(i).beta();
        //le coefficient de la colonne associée à l'intensité du courant du composant i prend la valeur du beta de celui-ci
    }
    // il le fait pour chaque composant du circuit
    }


/*
à la fin, les n premières lignes de la matrice sont remplies
avec les équations caractéristiques de chaque composant
*/


public void ajoutLoiDesNoeuds (Complex [][] mat, int l){
    
    int n = this.getNoeuds().size();
    int i;
    int j;
    for (i=0;i<n-1;i++){
        //On va jusqu'à n-1 car aller jusqu'à n remplirait une ligne qui serait composition linéaire des précédentes
       
        int imoins = this.getNoeuds().get(i).getDepart().size();
        //On attribut aux intensité des composants aux départ du noeud un sens négatif
        for (j=0;j<imoins;j++){
            //pour tous les composants j sortant du noeud i,
            //on attribut un coefficient -1 à la colonne correspondante à son intensité
            int id = this.getNoeuds().get(i).getDepart().get(j).getId();
            mat[l+i][l+id]=Complex.creeRec(-1,0);
            
        }
        
        int iplus = this.getNoeuds().get(i).getArrive().size();
        //On attribut aux intensité des composants aux départ du noeud un sens positif
        for (j=0;j<iplus;j++){
            //Pour tous les composants j arrivant au noeud i
            //on attribut un coefficient 1 à la colonne correspondante à son intensité
            int id = this.getNoeuds().get(i).getArrive().get(j).getId();
            mat[l+i][l+id]= Complex.creeRec(1,0);
        }
    }
}

public void ajoutLoiDesMailles(ArrayList <ArrayList<Composant>> mailles  ,  Complex[][] mat  ,  int l){
    int n = mailles.size();
    int i,j;
    for(i=0;i<n;i++){
        int nbcompos = mailles.get(i).size();
        Noeuds noeudLecture = mailles.get(i).get(0).getNoeudDepart();
        for (j=0;j<nbcompos;j++){
            if (noeudLecture == mailles.get(i).get(j).getNoeudDepart()){
                // si le noeud de lecture est identique au noeud de départ du composant j de la liste
                // on associe à la colonne correspondante à la tension du composant j le coef 1
                mat [l+i][mailles.get(i).get(j).getId()]= Complex.creeRec(1,0);
            } else {
                // sinon on associe à la colonne correspondante à la tension du composant j le coef -1
                mat [l+i][mailles.get(i).get(j).getId()]=Complex.creeRec(1, 0).opp();
            }
            noeudLecture=mailles.get(i).get(j).getNoeudArrive();
            // on déplace le noeud de lecture au noeud d'arrivée du composant de la maille traité
        }
        
    }
}

public Complex[][] MatriceCoefficients(){
    
    int n=this.getComposants().size();
    Complex [][] MatriceCoefficients = new Complex [2*n][2*n];
    // on crée une matrice carrée de taille 2n
    
    for  ( int i = 0;i<2*n;i++){
                    for (int j=0;j<n*2;j++){
                        MatriceCoefficients[i][j]=Complex.creeRec(0, 0);
                    }
                }
    // on initialise tout à 0
    
    int l = 0;
    // la variable l sert à idiquer la ligne de remplissage de la matrice de coefficients
    
    System.out.println("debut de remplissage matrice");
    this.ajoutCaracteristique(MatriceCoefficients, l);
    // on remplit les n premières lignes avec les équations caractéristiques des n composants
    l=n;
    System.out.println("fin caractéristiques matrice");
    this.ajoutLoiDesNoeuds(MatriceCoefficients, l);
    // on ajoute aux (nb de noeuds - 1) lignes suivantes les équations des lois des noeuds
    System.out.println("fin des noeuds");
    l=l+this.getNoeuds().size()-1;
    ArrayList< ArrayList<Composant>> mailles=this.calculMailles();
    // on détecte les mailles
    this.ajoutLoiDesMailles(mailles, MatriceCoefficients, l);
    // on ajoute aux lignes restantes de la matrice les coefficients des équations de la loi des mailles
    return MatriceCoefficients;
}
public Complex[] vecteurEquation(){
    int n = this.getComposants().size();
    Complex[] vect = new Complex [2*n];
    for (int i=0;i<2*n;i++){
        vect[i]=Complex.creeRec(0, 0);
    }
    for (int i=0;i<n;i++){
        vect[i]=this.getComposants().get(i).gamma().opp();
    }
    return vect;
}

public static Complex[] resolutionSystemeMatriciel(Complex[][] mat, Complex[]vect){
    
    SystemeComplex S = new SystemeComplex(mat , vect);
    Complex[] sol = new Complex [vect.length];
    return sol = S.resoudSysteme();
}

public void solutionFinale(){
    Complex[][] mat = this.MatriceCoefficients();
    Complex[] vect = this.vecteurEquation();
    int l = vect.length;
    Complex[] sol = resolutionSystemeMatriciel(this.MatriceCoefficients(),this.vecteurEquation());
        for (int i=0;i<l;i++){
        System.out.println(sol[i]);
        }
        for (int i=0;i<l/2;i++){
            System.out.println("la tension aux bornes de "+this.Composants.get(i)+" vaut "+sol[i].getMod()+"V");
        }
        for (int i=((l/2)-1);i<l;i++){
            System.out.println("l'intensité qui traverse "+this.Composants.get(i-(l/2)+1)+" vaut "+sol[i].getMod()+"A");
        }
            
            
        }
}
