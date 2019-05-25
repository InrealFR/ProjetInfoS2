/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.main;

import fr.insa.pons.projet.circuit.Circuit;
import javax.swing.JPanel;

/**
 *
 * @author hugop
 */
public class AffichageCircuitPanel extends JPanel {
    private Circuit circuit ;
    private DessinPanel dessin ;
public AffichageCircuitPanel(Circuit c){
circuit = c ;
dessin = new DessinPanel(this);
}

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public DessinPanel getDessin() {
        return dessin;
    }

    public void setDessin(DessinPanel dessin) {
        this.dessin = dessin;
    }


}
