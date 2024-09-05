package Matrices;
import Login.Menu;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Matrices extends javax.swing.JFrame {

    public Matrices() {
        initComponents();
        try_again.setVisible(false);
        this.setLocationRelativeTo(null);
    }
    int a;
    int m[][];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        n_value = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        create_array = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        try_again = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proyecto I");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Parcial I Algoritmos y Estructuras I");

        n_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_valueActionPerformed(evt);
            }
        });
        n_value.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                n_valueKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setText("Valor N");

        create_array.setText("Calcular");
        create_array.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_arrayActionPerformed(evt);
            }
        });

        text_area.setEditable(false);
        text_area.setColumns(20);
        text_area.setRows(5);
        jScrollPane1.setViewportView(text_area);

        try_again.setText("¿Quiere crear otra matriz?");
        try_again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try_againActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(try_again, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(n_value, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(create_array, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAtras)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_array)
                    .addComponent(n_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(try_again)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void create_arrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_arrayActionPerformed
        this.getMatriz();
    }//GEN-LAST:event_create_arrayActionPerformed
    
    public void getMatriz(){
            a = Integer.parseInt(n_value.getText());
            m = new int [a][a];
            text_area.append("Se creo una matriz: "+ a + "x" + a + "\n");
            text_area.append("Matriz: \n");
            this.creatMatriz(m, a);
            text_area.append("\n");
            this.deMatrizAVector(m);
            text_area.append("\n");
            this.diagonalPrincipal(m);
            text_area.append("\n");
            this.gerMaxAndMin(m);
            n_value.setEnabled(false);
            create_array.setEnabled(false);
            try_again.setVisible(true);
	
    }
    public void creatMatriz(int m[][], int a){
        Double val;
        for(int x = 0; x < m.length; x++){
            for(int y = 0; y < m[x].length; y++){
                m[x][y] =  -9999 + (int) (Math.random() * ((9999 - (-9999)) + 1));  
            }
        }
        for(int[] row : m) {
            printRow(row);
        }
    }
    
    private void deMatrizAVector(int m[][]){
        
        int[] vector = new int[m.length * m[0].length];
        int cont = 0;
        for (int[] m1 : m) {
            for (int y = 0; y < m1.length; y++) {
                vector[cont] = m1[y];  
                cont++;
            }
        }
        text_area.append("De matriz a Vector: \n");
        for(int i = 0; i < vector.length; i++){
            text_area.append("["+ vector[i] +"]");
        }
        text_area.append("\n\n");;
        
        text_area.append("Vector de Mayor a Menor: \n");
        int ordenar[] = vector;
        // Método de la Burbuja 
        for (int x = 0; x < ordenar.length; x++) {
            for (int i = 0; i < ordenar.length-x-1; i++) {
                if(vector[i] < vector[i+1]){
                    int tmp = ordenar[i+1];
                    ordenar[i+1] = vector[i];
                    ordenar[i] = tmp;
                }
            }
        }
        for(int i = 0; i < ordenar.length; i++){
            text_area.append("["+ ordenar[i] +"]");
        }
        text_area.append("\n\n");
        
        text_area.append("Vector de Menor a Mayor: \n");
        int ordenar2[] = vector;
        // Método de la Burbuja 
        for (int x = 0; x < ordenar2.length; x++) {
            for (int i = 0; i < ordenar2.length-x-1; i++) {
                if(vector[i] > vector[i+1]){
                    int tmp = ordenar2[i+1];
                    ordenar2[i+1] = vector[i];
                    ordenar2[i] = tmp;
                }
            }
        }
        for(int i = 0; i < ordenar2.length; i++){
            text_area.append("["+ ordenar2[i] +"]");
        }
        text_area.append("\n");
        
    }
    
    
    public void diagonalPrincipal(int m[][]){
        int aux = 0;
        for( int i=0; i< m.length; i++){
           for( int j=0; j<m[0].length; j++){
               if(i == j){
                    aux+= m[i][j];
               }
           }
        }
        
        text_area.append("Suma de la diagonal principal: " + aux +" \n");
        
    }
    
    private void gerMaxAndMin(int m[][]){
        int getMayor = m[0][0], getMenor = m[0][0];
        int resultado = 0;
        int aux;
        for (int[] m1 : m) {
            for (int y = 0; y < m1.length; y++) {
                int numeroActual = m1[y];
                if (numeroActual > getMayor){
                    getMayor = numeroActual;
                }
                if (numeroActual < getMenor){
                    getMenor = numeroActual;
                }
            }
        }
        
        aux = getMayor;
        while(aux > 0) {

            resultado += aux % 10;

            aux = aux / 10;

        }
        
        text_area.append("El valor mayor es: " + getMayor +" \n");
        text_area.append("La suma de los digitos del valor mayor es: " + resultado +" \n");
        text_area.append("El valor menor es: " + getMenor +" \n");
    }
    
    private void printRow(int[] row) {
        for (int i : row) {
            text_area.append("[" + i + "]\t");
        }
        text_area.append("\n");
    }
     
    private void n_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_valueActionPerformed

    private void n_valueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_valueKeyPressed
       
    }//GEN-LAST:event_n_valueKeyPressed

    private void try_againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_try_againActionPerformed
        // TODO add your handling code here:
        n_value.setEnabled(true);
        n_value.setText("");
        n_value.requestFocus();
        text_area.setText("");
        create_array.setEnabled(true);
        try_again.setVisible(false);
    }//GEN-LAST:event_try_againActionPerformed

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
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton create_array;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n_value;
    private javax.swing.JTextArea text_area;
    private javax.swing.JButton try_again;
    // End of variables declaration//GEN-END:variables
}
