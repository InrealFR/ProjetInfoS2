/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.main;

import static fr.insa.Lire.c;
import fr.insa.pons.projet.circuit.Circuit;
import fr.insa.pons.projet.composant.Condensateur;
import fr.insa.pons.projet.composant.Inductance;
import fr.insa.pons.projet.composant.Resistance;
import fr.insa.pons.projet.noeud.Noeuds;
import javax.swing.JOptionPane;

/**
 *
 * @author hugop
 */
public class Interface extends javax.swing.JFrame {

    Circuit CircuitAffiche;
    double pulse;

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        CircuitAffiche = new Circuit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Grand = new javax.swing.JPanel();
        jPanel_AffichageCircuit = new javax.swing.JPanel();
        jPanel_Composants = new javax.swing.JPanel();
        jPanelComposants = new javax.swing.JPanel();
        jButtonNoeud = new javax.swing.JButton();
        jButtonResistance = new javax.swing.JButton();
        jButtonCondensateur = new javax.swing.JButton();
        jButtonInductance = new javax.swing.JButton();
        jLabelIconNoeud = new javax.swing.JLabel();
        jLabelIconResistance = new javax.swing.JLabel();
        jLabelIconCondensateur = new javax.swing.JLabel();
        jLabelIconInductance = new javax.swing.JLabel();
        jPanel_AffichageCalculs = new javax.swing.JPanel();
        jButtonCalculs = new javax.swing.JButton();
        jScrollPaneAffichageCalculs = new javax.swing.JScrollPane();
        jTextAreaAffichageCalculs = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CircuitRLC");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("framePrincipale"); // NOI18N

        jPanel_AffichageCircuit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel_AffichageCircuitLayout = new javax.swing.GroupLayout(jPanel_AffichageCircuit);
        jPanel_AffichageCircuit.setLayout(jPanel_AffichageCircuitLayout);
        jPanel_AffichageCircuitLayout.setHorizontalGroup(
            jPanel_AffichageCircuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_AffichageCircuitLayout.setVerticalGroup(
            jPanel_AffichageCircuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel_Composants.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel_Composants.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonNoeud.setText("Noeud");
        jButtonNoeud.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonNoeud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoeudActionPerformed(evt);
            }
        });

        jButtonResistance.setText("Resistance");
        jButtonResistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResistanceActionPerformed(evt);
            }
        });

        jButtonCondensateur.setText("Condensateur");
        jButtonCondensateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCondensateurActionPerformed(evt);
            }
        });

        jButtonInductance.setText("Inductance");
        jButtonInductance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInductanceActionPerformed(evt);
            }
        });

        jLabelIconNoeud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconNoeud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/insa/pons/projet/main/images/noeud.png"))); // NOI18N

        jLabelIconResistance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconResistance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/insa/pons/projet/main/images/resistance.png"))); // NOI18N

        jLabelIconCondensateur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconCondensateur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/insa/pons/projet/main/images/condensateur.png"))); // NOI18N

        jLabelIconInductance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconInductance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/insa/pons/projet/main/images/inductance.png"))); // NOI18N

        javax.swing.GroupLayout jPanelComposantsLayout = new javax.swing.GroupLayout(jPanelComposants);
        jPanelComposants.setLayout(jPanelComposantsLayout);
        jPanelComposantsLayout.setHorizontalGroup(
            jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComposantsLayout.createSequentialGroup()
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonInductance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNoeud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonResistance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelComposantsLayout.createSequentialGroup()
                        .addComponent(jButtonCondensateur)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIconResistance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIconNoeud, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconCondensateur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIconInductance, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelComposantsLayout.setVerticalGroup(
            jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComposantsLayout.createSequentialGroup()
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNoeud, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconNoeud, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonResistance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconResistance, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconCondensateur)
                    .addGroup(jPanelComposantsLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButtonCondensateur, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconInductance)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComposantsLayout.createSequentialGroup()
                        .addComponent(jButtonInductance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout jPanel_ComposantsLayout = new javax.swing.GroupLayout(jPanel_Composants);
        jPanel_Composants.setLayout(jPanel_ComposantsLayout);
        jPanel_ComposantsLayout.setHorizontalGroup(
            jPanel_ComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ComposantsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelComposants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ComposantsLayout.setVerticalGroup(
            jPanel_ComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ComposantsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelComposants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jPanel_AffichageCalculs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButtonCalculs.setText("Calculer");
        jButtonCalculs.setToolTipText("Met à jour les calculs ");
        jButtonCalculs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculsActionPerformed(evt);
            }
        });

        jTextAreaAffichageCalculs.setEditable(false);
        jTextAreaAffichageCalculs.setColumns(20);
        jTextAreaAffichageCalculs.setRows(5);
        jScrollPaneAffichageCalculs.setViewportView(jTextAreaAffichageCalculs);

        javax.swing.GroupLayout jPanel_AffichageCalculsLayout = new javax.swing.GroupLayout(jPanel_AffichageCalculs);
        jPanel_AffichageCalculs.setLayout(jPanel_AffichageCalculsLayout);
        jPanel_AffichageCalculsLayout.setHorizontalGroup(
            jPanel_AffichageCalculsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AffichageCalculsLayout.createSequentialGroup()
                .addComponent(jScrollPaneAffichageCalculs, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel_AffichageCalculsLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jButtonCalculs, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_AffichageCalculsLayout.setVerticalGroup(
            jPanel_AffichageCalculsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AffichageCalculsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCalculs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneAffichageCalculs)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_GrandLayout = new javax.swing.GroupLayout(jPanel_Grand);
        jPanel_Grand.setLayout(jPanel_GrandLayout);
        jPanel_GrandLayout.setHorizontalGroup(
            jPanel_GrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GrandLayout.createSequentialGroup()
                .addGroup(jPanel_GrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_AffichageCalculs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_AffichageCircuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Composants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_GrandLayout.setVerticalGroup(
            jPanel_GrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GrandLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel_GrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Composants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_GrandLayout.createSequentialGroup()
                        .addComponent(jPanel_AffichageCircuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_AffichageCalculs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jMenu1.setText("Fichier");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Grand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Grand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalculsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculsActionPerformed
        jPanelEntrerPulse jp = new jPanelEntrerPulse();
        int rep = JOptionPane.showConfirmDialog(this, jp, "Pulsation", JOptionPane.OK_CANCEL_OPTION);
        try {
            if (rep == JOptionPane.OK_OPTION) {
                pulse = Double.parseDouble(jp.getjPulsation().getText());
                jTextAreaAffichageCalculs.setText("pulsation =" + pulse);
            } else {
                JOptionPane.showMessageDialog(this, "Vous avez annulé !");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La pulsation est un REEL !");
        }

    }//GEN-LAST:event_jButtonCalculsActionPerformed

    private void jButtonNoeudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoeudActionPerformed
        jPanelEntrerNoeud EntrerNoeud = new jPanelEntrerNoeud(); //initiation du jPanel
        int rep = JOptionPane.showConfirmDialog(this, EntrerNoeud, "Saisie du Noeud", JOptionPane.OK_CANCEL_OPTION);
        if (rep == JOptionPane.OK_OPTION) {
            try { //On créer le noeud dans le try pour éviter les problemes avec les textFields
                Noeuds n = new Noeuds(Double.parseDouble(EntrerNoeud.getjX().getText()), Double.parseDouble(EntrerNoeud.getjY().getText()), Integer.parseInt(EntrerNoeud.getjID().getText()));
                CircuitAffiche.ajouteNoeud(n);
                System.out.println(CircuitAffiche);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ERREUR : VEUILLEZ ENTRER DES NOMBRES !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vous avez annulé la saisie du Noeud.");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNoeudActionPerformed

    private void jButtonResistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResistanceActionPerformed
        jPanelEntrerResistance entrerRes = new jPanelEntrerResistance();
        for (int i = 0; i < CircuitAffiche.getNoeuds().size(); i++) {
            entrerRes.getjComboBoxDepart().addItem("" + CircuitAffiche.getNoeuds().get(i).getId());
            entrerRes.getjComboBoxArrive().addItem("" + CircuitAffiche.getNoeuds().get(i).getId());
        }
        int rep = JOptionPane.showConfirmDialog(this, entrerRes, "Saisie de Résistance", JOptionPane.OK_CANCEL_OPTION);
        if (rep == JOptionPane.OK_OPTION) {
            if ((Integer.parseInt(entrerRes.getjComboBoxDepart().getSelectedItem().toString().trim())) == (Integer.parseInt(entrerRes.getjComboBoxArrive().getSelectedItem().toString().trim()))) {
                JOptionPane.showMessageDialog(this, "Erreur : Même noeud de départ et d'arrivée !");
                throw new Error();
            } else {
                try {
                    Resistance res = new Resistance(Double.parseDouble(entrerRes.getjTextFieldResistance().getText()), Integer.parseInt(entrerRes.getjTextFieldId().getText()));
                    CircuitAffiche.ajouteComposant(res, CircuitAffiche.chercheNoeud(Integer.parseInt(entrerRes.getjComboBoxDepart().getSelectedItem().toString().trim())), CircuitAffiche.chercheNoeud(Integer.parseInt(entrerRes.getjComboBoxArrive().getSelectedItem().toString().trim())));
                    System.out.println(CircuitAffiche);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "VEUILLEZ ENTRER DES NOMBRES !");
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Saisie annulée");
        }
    }//GEN-LAST:event_jButtonResistanceActionPerformed

    private void jButtonCondensateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCondensateurActionPerformed
        jPanelEntrerCondensateur entrerC = new jPanelEntrerCondensateur();
        for (int i = 0; i < CircuitAffiche.getNoeuds().size(); i++) {
            entrerC.getjComboBoxDepart().addItem("" + CircuitAffiche.getNoeuds().get(i).getId());
            entrerC.getjComboBoxArrivee().addItem("" + CircuitAffiche.getNoeuds().get(i).getId());
        }
        int rep = JOptionPane.showConfirmDialog(this, entrerC, "Saisie de Condensateur", JOptionPane.OK_CANCEL_OPTION);
        if (rep == JOptionPane.OK_OPTION) {
            if ((Integer.parseInt(entrerC.getjComboBoxDepart().getSelectedItem().toString().trim())) == (Integer.parseInt(entrerC.getjComboBoxArrivee().getSelectedItem().toString().trim()))) {
                JOptionPane.showMessageDialog(this, "Erreur : Même noeud de départ et d'arrivée !");
                throw new Error();
            } else {
                try {
                    Condensateur c = new Condensateur(Double.parseDouble(entrerC.getjTextFieldCapacite().getText()), Integer.parseInt(entrerC.getjTextFieldID().getText()));
                    CircuitAffiche.ajouteComposant(c, CircuitAffiche.chercheNoeud(Integer.parseInt(entrerC.getjComboBoxDepart().getSelectedItem().toString().trim())), CircuitAffiche.chercheNoeud(Integer.parseInt(entrerC.getjComboBoxArrivee().getSelectedItem().toString().trim())));
                    System.out.println(CircuitAffiche);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "VEUILLEZ ENTRER DES NOMBRES !");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Saisie annulée");
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCondensateurActionPerformed

    private void jButtonInductanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInductanceActionPerformed

        jPanelEntrerInductance entrerI = new jPanelEntrerInductance();
        for (int i = 0; i < CircuitAffiche.getNoeuds().size(); i++) {
            entrerI.getjComboBoxDepart().addItem("" + CircuitAffiche.getNoeuds().get(i).getId());
            entrerI.getjComboBoxArrivee().addItem("" + CircuitAffiche.getNoeuds().get(i).getId());
        }
        int rep = JOptionPane.showConfirmDialog(this, entrerI, "Saisie de l'Inductance", JOptionPane.OK_CANCEL_OPTION);
        if (rep == JOptionPane.OK_OPTION) {
            if ((Integer.parseInt(entrerI.getjComboBoxDepart().getSelectedItem().toString().trim())) == (Integer.parseInt(entrerI.getjComboBoxArrivee().getSelectedItem().toString().trim()))) {
                JOptionPane.showMessageDialog(this, "Erreur : Même noeud de départ et d'arrivée !");
                throw new Error();
            } else {
                try {
                    Inductance I = new Inductance(Double.parseDouble(entrerI.getjTextFieldCapacite().getText()), Integer.parseInt(entrerI.getjTextFieldID().getText()));
                    CircuitAffiche.ajouteComposant(I, CircuitAffiche.chercheNoeud(Integer.parseInt(entrerI.getjComboBoxDepart().getSelectedItem().toString().trim())), CircuitAffiche.chercheNoeud(Integer.parseInt(entrerI.getjComboBoxArrivee().getSelectedItem().toString().trim())));
                    System.out.println(CircuitAffiche);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "VEUILLEZ ENTRER DES NOMBRES !");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Saisie annulée");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInductanceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalculs;
    private javax.swing.JButton jButtonCondensateur;
    private javax.swing.JButton jButtonInductance;
    private javax.swing.JButton jButtonNoeud;
    private javax.swing.JButton jButtonResistance;
    private javax.swing.JLabel jLabelIconCondensateur;
    private javax.swing.JLabel jLabelIconInductance;
    private javax.swing.JLabel jLabelIconNoeud;
    private javax.swing.JLabel jLabelIconResistance;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelComposants;
    private javax.swing.JPanel jPanel_AffichageCalculs;
    private javax.swing.JPanel jPanel_AffichageCircuit;
    private javax.swing.JPanel jPanel_Composants;
    private javax.swing.JPanel jPanel_Grand;
    private javax.swing.JScrollPane jScrollPaneAffichageCalculs;
    private javax.swing.JTextArea jTextAreaAffichageCalculs;
    // End of variables declaration//GEN-END:variables
}
