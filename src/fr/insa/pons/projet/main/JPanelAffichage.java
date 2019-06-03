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
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

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

        for (int i = 0; i < CircuitAff.getNoeuds().size(); i++) {
            this.DrawNoeud(g, i);
        }
        for (int j = 0; j < CircuitAff.getComposants().size(); j++) {
            char c = CircuitAff.getComposants().get(j).getNom();
            switch (c) {
                case ('R'): {
                    this.DrawRes(g, j);
                }
                break;
                case ('F'): {
                    this.DrawFil(g, j);
                }
                break;
                case ('G'): {
                    this.DrawGenerateur(g, j);
                }
                break;
                case ('L'): {
                    this.DrawInductance(g, j);
                }
                break;
                case ('C'): {
                    this.DrawCondensateur(g, j);
                }
                break;
            }
        }
    }

    private void DrawRes(Graphics g, int j) {
        g.setColor(Color.blue);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform Rx = new AffineTransform();
        AffineTransform old = g2d.getTransform();
        g.drawLine((int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy(), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2));
        g2d.transform(Rx.getRotateInstance(Math.atan((CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy() - CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy()) / (CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx() - CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx())), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2)));
        g.fillRect((int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2) - 20, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2) - 10, 40, 20);
        g.setColor(Color.black);
        g.drawString(CircuitAff.getComposants().get(j).getNom() + Integer.toString(CircuitAff.getComposants().get(j).getId()), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2) - 20, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2) - 10);
        g.setColor(Color.blue);
        g2d.setTransform(old);
        g.drawLine((int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy());
    }

    private void DrawInductance(Graphics g, int j) {
        g.setColor(Color.magenta);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform Rx = new AffineTransform();
        AffineTransform old = g2d.getTransform();
        URL urlImage = (getClass().getResource("/fr/insa/pons/projet/main/images/inductancedraw.png"));
        try {
            BufferedImage inductance = ImageIO.read(urlImage);
            g.drawLine((int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy(), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2));
            g2d.transform(Rx.getRotateInstance(Math.atan((CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy() - CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy()) / (CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx() - CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx())), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2)));
            g.drawImage(inductance, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2) - 64, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2 - 64), null);
            g.drawString(CircuitAff.getComposants().get(j).getNom()+Integer.toString(CircuitAff.getComposants().get(j).getId()),(int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2) - 20, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2 - 20));
            g2d.setTransform(old);
            g.drawLine((int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy());
        } catch (IOException e) {
            System.out.println("mauvais chemin d'accès sur l'image");
        }
    }

    private void DrawCondensateur(Graphics g, int j) {
        g.setColor(Color.yellow);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform Rx = new AffineTransform();
        AffineTransform old = g2d.getTransform();
        URL urlImage = (getClass().getResource("/fr/insa/pons/projet/main/images/condensateurdraw.png"));
        try {
            BufferedImage condensateur = ImageIO.read(urlImage);
            g.drawLine((int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy(), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2));
            g2d.transform(Rx.getRotateInstance(Math.atan((CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy() - CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy()) / (CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx() - CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx())), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2)));
            g.drawImage(condensateur, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2) - 64, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2 - 64), null);
            g.drawString(CircuitAff.getComposants().get(j).getNom()+Integer.toString(CircuitAff.getComposants().get(j).getId()),(int)((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2) - 20, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2 - 20));

            g2d.setTransform(old);
            g.drawLine((int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy());
        } catch (IOException e) {
            System.out.println("mauvais chemin d'accès sur l'image");
        }
    }

    private void DrawNoeud(Graphics g, int i) {
        g.setColor(Color.red);
        g.fillOval((int) CircuitAff.getNoeuds().get(i).getCoordx() - 5, (int) CircuitAff.getNoeuds().get(i).getCoordy() - 5, 10, 10);
        g.drawString(Integer.toString(CircuitAff.getNoeuds().get(i).getId()), (int) CircuitAff.getNoeuds().get(i).getCoordx() + 20, (int) CircuitAff.getNoeuds().get(i).getCoordy() + 20);
    }

    private void DrawFil(Graphics g, int j) {
        g.setColor(Color.black);
        g.drawLine((int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy(), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy());
        g.drawString(Integer.toString(CircuitAff.getNoeuds().get(j).getId()), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2) + 5, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2) + 5);
    }

    private void DrawGenerateur(Graphics g, int j) {
        g.setColor(Color.green);
        g.drawLine((int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy(), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2));
        g.fillOval((int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2) - 20, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2) - 20, 40, 40);
        g.setColor(Color.black);
        g.drawString(CircuitAff.getComposants().get(j).getNom() + Integer.toString(CircuitAff.getComposants().get(j).getId()), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2) - 20, (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2) - 10);
        g.setColor(Color.green);
        g.drawLine((int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordx() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx()) / 2), (int) ((CircuitAff.getComposants().get(j).getNoeudDepart().getCoordy() + CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy()) / 2), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordx(), (int) CircuitAff.getComposants().get(j).getNoeudArrive().getCoordy());

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
                    CircuitAff.getNoeuds().add(new Noeuds(e.getX(), e.getY(), 0));

                } else {
                    CircuitAff.getNoeuds().add(new Noeuds(e.getX(), e.getY(), CircuitAff.getNoeuds().get(CircuitAff.getNoeuds().size() - 1).getId() + 1));

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
