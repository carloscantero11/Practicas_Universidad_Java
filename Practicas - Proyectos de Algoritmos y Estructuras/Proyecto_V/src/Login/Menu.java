package Login;

import App.JFa;
import Matrices.Matrices;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProyectoI = new javax.swing.JButton();
        btnProyectoii = new javax.swing.JButton();
        btnProyectoiii = new javax.swing.JButton();
        btnProyectoiv = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setPreferredSize(new java.awt.Dimension(800, 480));

        btnProyectoI.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnProyectoI.setText("Proyecto I");
        btnProyectoI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProyectoIMouseClicked(evt);
            }
        });

        btnProyectoii.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnProyectoii.setText("Proyecto II");
        btnProyectoii.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProyectoiiMouseClicked(evt);
            }
        });

        btnProyectoiii.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnProyectoiii.setText("Proyecto III");
        btnProyectoiii.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProyectoiiiMouseClicked(evt);
            }
        });
        btnProyectoiii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyectoiiiActionPerformed(evt);
            }
        });

        btnProyectoiv.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnProyectoiv.setText("Proyecto IV");
        btnProyectoiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProyectoivMouseClicked(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCerrar.setText("Cerrar sesión");
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProyectoI)
                    .addComponent(btnProyectoiii))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProyectoii)
                    .addComponent(btnProyectoiv))
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProyectoI)
                    .addComponent(btnProyectoii))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProyectoiii)
                    .addComponent(btnProyectoiv))
                .addGap(85, 85, 85)
                .addComponent(btnCerrar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProyectoIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProyectoIMouseClicked
        Matrices ma1 = new Matrices();
        ma1.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnProyectoIMouseClicked

    private void btnProyectoiiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProyectoiiMouseClicked
        interfaz Interfaz = new interfaz();
        Interfaz.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_btnProyectoiiMouseClicked

    private void btnProyectoiiiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProyectoiiiMouseClicked
        IG3 sambi = new IG3();
        sambi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProyectoiiiMouseClicked

    private void btnProyectoivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProyectoivMouseClicked
        JFa BaseDatos = new JFa();
        BaseDatos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProyectoivMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        Acceso acceso = new Acceso();
        acceso.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnProyectoiiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectoiiiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProyectoiiiActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnProyectoI;
    private javax.swing.JButton btnProyectoii;
    private javax.swing.JButton btnProyectoiii;
    private javax.swing.JButton btnProyectoiv;
    // End of variables declaration//GEN-END:variables
}
