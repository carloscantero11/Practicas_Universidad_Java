package Login;


public class IG3 extends javax.swing.JFrame { 
    public IG3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    //MCD
    public class MCD{
    int calcular(int n,int m){
    if (m==0)
        return n;
    
    else return calcular(m, n % m);
    }
    }
    //FACTORIAL
    public class factorial{
    int factorial(int n){
    if (n<=0)
       return 1;
    
    else return(n*factorial(n-1));
    
    }
    }
    
    //POTENCIA DE n˄m
    public class potencia{
    int potencia(int n, int m){
    if (m==1)
        return n;
    
    else if(m==0)
    return 1;
    
    else
        return n*potencia(n,m-1);
    }
    }
    //MULTIPLICACIÓN nxm
    public class multi{
    int multi(int n,int m){
    if(m==1)
        return n;
    else
       return n+multi(n,m-1);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtn = new javax.swing.JTextField();
        txtm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btncal = new javax.swing.JButton();
        btneli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfinal = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto III");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Valor n");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Valor m");

        btncal.setText("Calcular");
        btncal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalActionPerformed(evt);
            }
        });

        btneli.setText("Eliminar");
        btneli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliActionPerformed(evt);
            }
        });

        txtfinal.setEditable(false);
        txtfinal.setColumns(20);
        txtfinal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtfinal.setRows(5);
        jScrollPane1.setViewportView(txtfinal);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("EVALUACIÓN III");
        jLabel3.setAutoscrolls(true);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boton/flecha-izquierda (2).png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setFocusPainted(false);
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncal)
                    .addComponent(btneli))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(btnAtras))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btncal))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btneli))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalActionPerformed
        int n,m,s,f,g,k;
        n=Integer.parseInt(txtn.getText());
        m=Integer.parseInt(txtm.getText());
        btncal.setEnabled(false);
        btneli.setEnabled(true);
        
       //MCD
       MCD a=new MCD();
       s= a.calcular(n, m);
       txtfinal.append(" El MCD de " + n +  " y "  + m + " es: " +s);
       
       //FACTORIAL DE N 
       factorial b=new factorial();
       f= b.factorial(n);
       txtfinal.append("\n El Factorial de " + n + " es: " +f);
       
       //POTENCIA DE n˄m
       potencia c= new potencia ();
       g=c.potencia(n,m);
       txtfinal.append("\n La potencia  de " + n + " elevado a la " + m + " es: " + g);
                
       //MULTIPLICACIÓN nxm
      multi d= new multi();
      k=d.multi(n,m);
      txtfinal.append("\n La multiplicación  de " + n + " por " + m + " es: " + k);
    }//GEN-LAST:event_btncalActionPerformed

    private void btneliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliActionPerformed
        txtn.setText("");
        txtm.setText("");
        txtfinal.setText("");
        btneli.setEnabled(false);
        btncal.setEnabled(true);
    }//GEN-LAST:event_btneliActionPerformed

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        Menu atras = new Menu();
        atras.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IG3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btncal;
    private javax.swing.JButton btneli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtfinal;
    private javax.swing.JTextField txtm;
    private javax.swing.JTextField txtn;
    // End of variables declaration//GEN-END:variables
}
