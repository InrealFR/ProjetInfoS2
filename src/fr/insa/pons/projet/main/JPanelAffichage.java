/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.main;

import fr.insa.pons.projet.circuit.Circuit;
import fr.insa.pons.projet.noeud.Noeuds;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;

/**
 *
 * @author hugop
 */
public class JPanelAffichage extends javax.swing.JPanel implements MouseListener {

    private Circuit CircuitAff;
    int Compo;

    public Circuit getCircuitAff() {
        return CircuitAff;
    }

    public void setCircuitAff(Circuit CircuitAff) {
        this.CircuitAff = CircuitAff;
    }

    /**
     * Creates new form JPanelAffichage
     */
    public JPanelAffichage() {
        initComponents();
        CircuitAff = new Circuit();
        this.addMouseListener(this);

    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        AffineTransform Rx = new AffineTransform();
        AffineTransform old = g2d.getTransform();
        for (int i = 0; i < CircuitAff.getNoeuds().size(); i++) {
            g.setColor(Color.red);
            g.fillOval((int) CircuitAff.getNoeuds().get(i).getCoordx(), (int) CircuitAff.getNoeuds().get(i).getCoordy(), 10, 10);
            g.drawString(Integer.toString(CircuitAff.getNoeuds().get(i).getId()),(int) CircuitAff.getNoeuds().get(i).getCoordx() + 20,(int) CircuitAff.getNoeuds().get(i).getCoordy() + 20);
        }
        for (int j = 0; j< CircuitAff.getComposants().size();j++){
         char c = CircuitAff.getComposants().get(j).getNom() ;
         switch(c){
         case('R'):{
         g.setColor(Color.cyan) ;
         g.drawLine((int)CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx(),(int)CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy(),(int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx()+CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx())/2),(int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy()+CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy())/2));
         g2d.transform(Rx.getRotateInstance(Math.atan((CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()-CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy())/(CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()-CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx())),(int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx()+CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx())/2)-20,(int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy()+CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy())/2)-10));
         g.fillRect((int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx()+CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx())/2)-20,(int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy()+CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy())/2)-10, 40, 20);
         g2d.setTransform(old);
         g.drawLine((int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx()+CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx())/2),(int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy()+CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy())/2),(int)CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx(),(int)CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) ;
         } break ;
         }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
@Override
    public void mousePressed(MouseEvent e) {
        switch (Compo) {
            case (1): {
                if (CircuitAff.getNoeuds().isEmpty()) {
                    CircuitAff.getNoeuds().add(new Noeuds( e.getX(), e.getY(),0));
                     
                } else {
                    CircuitAff.getNoeuds().add(new Noeuds(e.getX(), e.getY(),CircuitAff.getNoeuds().get(CircuitAff.getNoeuds().size() - 1).getId() + 1));
         
                }
           
                Compo = 666;
            }
            break;
        }
       
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) { //To change body of generated methods, choose Tools | Templates.
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
