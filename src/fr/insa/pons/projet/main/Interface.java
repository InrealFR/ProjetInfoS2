/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.projet.main;

/**
 *
 * @author hugop
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
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
        jButtonFil = new javax.swing.JButton();
        jButtonResistance = new javax.swing.JButton();
        jButtonCondensateur = new javax.swing.JButton();
        jButtonInductance = new javax.swing.JButton();
        jLabelIconNoeud = new javax.swing.JLabel();
        jLabelIconFil = new javax.swing.JLabel();
        jLabelIconResistance = new javax.swing.JLabel();
        jLabelIconCondensateur = new javax.swing.JLabel();
        jLabelIconInductance = new javax.swing.JLabel();
        jPanel_AffichageCalculs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelPulsation = new javax.swing.JLabel();
        jTextFieldPulsation = new javax.swing.JTextField();
        jButtonCalculs = new javax.swing.JButton();
        jScrollPaneAffichageCalculs = new javax.swing.JScrollPane();
        jTextAreaAffichageCalculs = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CircuitRLC");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel_AffichageCircuit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel_AffichageCircuitLayout = new javax.swing.GroupLayout(jPanel_AffichageCircuit);
        jPanel_AffichageCircuit.setLayout(jPanel_AffichageCircuitLayout);
        jPanel_AffichageCircuitLayout.setHorizontalGroup(
            jPanel_AffichageCircuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_AffichageCircuitLayout.setVerticalGroup(
            jPanel_AffichageCircuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        jPanel_Composants.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel_Composants.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonNoeud.setText("Noeud");
        jButtonNoeud.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonFil.setText("Fil");

        jButtonResistance.setText("Resistance");

        jButtonCondensateur.setText("Condensateur");

        jButtonInductance.setText("Inductance");

        jLabelIconNoeud.setText("jLabel2");

        jLabelIconFil.setText("jLabel3");

        jLabelIconResistance.setText("jLabel4");

        jLabelIconCondensateur.setText("jLabel5");

        jLabelIconInductance.setText("jLabel6");

        javax.swing.GroupLayout jPanelComposantsLayout = new javax.swing.GroupLayout(jPanelComposants);
        jPanelComposants.setLayout(jPanelComposantsLayout);
        jPanelComposantsLayout.setHorizontalGroup(
            jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComposantsLayout.createSequentialGroup()
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonInductance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCondensateur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jButtonNoeud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonResistance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconNoeud, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelIconResistance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(jLabelIconFil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelIconCondensateur)
                    .addComponent(jLabelIconInductance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelComposantsLayout.setVerticalGroup(
            jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComposantsLayout.createSequentialGroup()
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNoeud, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconNoeud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconFil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonResistance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconResistance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCondensateur, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconCondensateur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComposantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInductance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconInductance)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_AffichageCalculs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setText("Calculs :");

        jLabelPulsation.setText("Pulsation :");

        jTextFieldPulsation.setText("Entrer pulsation");
        jTextFieldPulsation.setToolTipText("entrer la pulsation ici");
        jTextFieldPulsation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPulsationMouseClicked(evt);
            }
        });
        jTextFieldPulsation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPulsationKeyTyped(evt);
            }
        });

        jButtonCalculs.setText("Calculer");
        jButtonCalculs.setToolTipText("Met à jour les calculs ");

        jTextAreaAffichageCalculs.setEditable(false);
        jTextAreaAffichageCalculs.setColumns(20);
        jTextAreaAffichageCalculs.setRows(5);
        jScrollPaneAffichageCalculs.setViewportView(jTextAreaAffichageCalculs);

        javax.swing.GroupLayout jPanel_AffichageCalculsLayout = new javax.swing.GroupLayout(jPanel_AffichageCalculs);
        jPanel_AffichageCalculs.setLayout(jPanel_AffichageCalculsLayout);
        jPanel_AffichageCalculsLayout.setHorizontalGroup(
            jPanel_AffichageCalculsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AffichageCalculsLayout.createSequentialGroup()
                .addComponent(jScrollPaneAffichageCalculs)
                .addContainerGap())
            .addGroup(jPanel_AffichageCalculsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AffichageCalculsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AffichageCalculsLayout.createSequentialGroup()
                        .addComponent(jLabelPulsation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPulsation, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCalculs, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(jPanel_AffichageCalculsLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(110, 110, 110))))
        );
        jPanel_AffichageCalculsLayout.setVerticalGroup(
            jPanel_AffichageCalculsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AffichageCalculsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AffichageCalculsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPulsation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldPulsation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalculs))
                .addGap(1, 1, 1)
                .addComponent(jScrollPaneAffichageCalculs, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_GrandLayout = new javax.swing.GroupLayout(jPanel_Grand);
        jPanel_Grand.setLayout(jPanel_GrandLayout);
        jPanel_GrandLayout.setHorizontalGroup(
            jPanel_GrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GrandLayout.createSequentialGroup()
                .addGroup(jPanel_GrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_AffichageCalculs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_AffichageCircuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Composants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_GrandLayout.setVerticalGroup(
            jPanel_GrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GrandLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel_GrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Composants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_GrandLayout.createSequentialGroup()
                        .addComponent(jPanel_AffichageCircuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_AffichageCalculs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void jTextFieldPulsationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPulsationKeyTyped

    }//GEN-LAST:event_jTextFieldPulsationKeyTyped

    private void jTextFieldPulsationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPulsationMouseClicked
        jTextFieldPulsation.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPulsationMouseClicked

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
    private javax.swing.JButton jButtonFil;
    private javax.swing.JButton jButtonInductance;
    private javax.swing.JButton jButtonNoeud;
    private javax.swing.JButton jButtonResistance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIconCondensateur;
    private javax.swing.JLabel jLabelIconFil;
    private javax.swing.JLabel jLabelIconInductance;
    private javax.swing.JLabel jLabelIconNoeud;
    private javax.swing.JLabel jLabelIconResistance;
    private javax.swing.JLabel jLabelPulsation;
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
    private javax.swing.JTextField jTextFieldPulsation;
    // End of variables declaration//GEN-END:variables
}
