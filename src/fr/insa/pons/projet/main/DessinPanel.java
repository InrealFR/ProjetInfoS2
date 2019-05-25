/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.main;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author hugop
 */
public class DessinPanel extends JPanel {
    private AffichageCircuitPanel aff ;
    
    public DessinPanel(AffichageCircuitPanel Affp){
     aff = Affp ;
    }
    
    public void drawCircuit(Graphics g){
      super.paintComponents(g) ;
      aff.getCircuit().dessin(g) ;
    }
}
