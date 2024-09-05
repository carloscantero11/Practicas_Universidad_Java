import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class interfaz extends javax.swing.JFrame {
    int filas;
    int columnas;
    double[][] n;
    int m[][], mb[][];
    double random;
    interfaz it;
    int a, b, c, d;

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public double[][] getN() {
        return n;
    }

    public void setN(double[][] n) {
        this.n = n;
    }

    public double getRandom() {
        return random;
    }

    public void setRandom(Long random) {
        this.random = random;
    }
    public interfaz() {
        initComponents();
    }
     public interfaz(boolean init){
        // Dead function
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VN = new javax.swing.JTextField();
        VM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MT = new javax.swing.JTextArea();
        VO = new javax.swing.JTextField();
        VP = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        MB = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btncrear = new javax.swing.JButton();
        btnB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        MA.setEditable(false);
        MA.setColumns(20);
        MA.setRows(5);
        jScrollPane1.setViewportView(MA);

        jLabel1.setText("Matriz A");

        jLabel2.setText("Filas N");

        jLabel3.setText("Columnas M");

        MT.setEditable(false);
        MT.setColumns(20);
        MT.setRows(5);
        jScrollPane2.setViewportView(MT);

        MB.setEditable(false);
        MB.setColumns(20);
        MB.setRows(5);
        jScrollPane3.setViewportView(MB);

        jLabel4.setText("Matriz B");

        jLabel5.setText("Filas O");

        jLabel6.setText("Columnas P");

        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        btnB.setText("Borrar");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(VM, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(VN))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(VO, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addComponent(VP))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(btnB))))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(VM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(VP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncrear)
                .addGap(28, 28, 28)
                .addComponent(btnB)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
         // Creating Variables
        it = new interfaz(true);
        double random = Math.floor((Math.random() * 722995098 - 1) + 1);
        
        if(!"".equals(VN.getText()) && !"".equals(VM.getText())) {
            a = Integer.parseInt(VN.getText());
            b = Integer.parseInt(VM.getText());
            m = new int [a][b];
            this.creatMatrizA(m, a, b);
        }
        
        if(!"".equals(VP.getText()) && !"".equals(VO.getText())) {
            c = Integer.parseInt(VO.getText());
            d = Integer.parseInt(VP.getText());
            mb = new int [c][d];
            this.creatMatrizB(mb, c, d);        
        }
        
        if(!"".equals(VN.getText()) && !"".equals(VM.getText()) && !"".equals(VP.getText()) && !"".equals(VO.getText())){
            MT.append("Multiplicacion de las matrices: \n");
            this.multiply(m, mb);
        }
        

    }                                        

    public void creatMatrizA(int m[][], int a, int b){
        for(int x = 0; x < m.length; x++){
            for(int y = 0; y < m[x].length; y++){
                try{
                    m[x][y] = 99 +(int) (Math.random()*((10 - (90)) + 1));  

                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(rootPane, "Solo se admiten numeros \n");
                    y--;
                }
            }
        }
        for(int[] row : m) {
            printRowA(row);
        }
    }
    private void printRowA(int[] row) {
        
        for (int i : row) {
            MA.append("["+i+"]" + "\t");
        }
        MA.append("\n");
    }
    
    public void creatMatrizB(int m[][], int a, int b){
        for(int x = 0; x < m.length; x++){
            for(int y = 0; y < m[x].length; y++){
                try{
                   m[x][y] = 99 +(int) (Math.random()*((10 - (90)) + 1)); 

                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(rootPane, "Solo se admiten numeros \n");
                    y--;
                }
            }
        }
        for(int[] row : m) {
            printRowB(row);
        }
    }
    private void printRowB(int[] row) {
        for (int i : row) {
            MB.append("["+i+"]" + "\t");
        }
        MB.append("\n");
    }
    public void multiply(int[][] a, int[][] b) {
        int acumulador = 0;
        int[][] c = new int[a.length][b[0].length];
        // se comprueba si las matrices se pueden multiplicar
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        // aquí se multiplica la matriz
                        c[i][j] += a[i][k] * b[k][j];
                        acumulador += a[i][k] * b[k][j];
                    }
                }
            }
        }
        /**
         * si no se cumple la condición se retorna una matriz vacía
         */
        if(acumulador > 0){
            for(int[] row : c) {
                printRow(row);
            }
             MT.append("Determinante: " + determinante(c));
        }else{
            MT.append("El número de columnas de la primera matriz \ndebe coincidir con el número de filas de la segunda matriz.");
                                                                                                                                                            
        }
        
    }
    
    private void printRow(int[] row) {
        for (int i : row) {
            MT.append("["+i+"]" + "\t");
        }
        MT.append("\n");
    }//GEN-LAST:event_btncrearActionPerformed
 private static int determinante(int matriz[][]) {
 
        int det = 0;
 
        if (matriz.length == 1) {
            return matriz[0][0];
 
        } else {
            for (int j = 0; j < matriz.length; j++) {
                det = det + matriz[0][j] * cofactor(matriz, 0, j);
            }
        }
 
        return det;
    }
 
     public static int cofactor(int matriz[][], int fila, int columna) {
 
        int submatriz[][];
        int n = matriz.length - 1;
 
        submatriz = new int[n][n];
        int x = 0;
        int y = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i != fila && j != columna) {
                    submatriz[x][y] = matriz[i][j];
                    y++;
                    if (y >= n) {
                        x++;
                        y = 0;
                    }
                }
            }
        }
 
        return (int)Math.pow(-1.0, fila + columna) * determinante(submatriz);
    }
    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        VP.setText("");
        VO.setText("");
        VN.setText("");
        VM.setText("");
        MA.setText("");
        MB.setText("");
        MT.setText("");
        
    }//GEN-LAST:event_btnBActionPerformed

     
  
    
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea MA;
    private javax.swing.JTextArea MB;
    private javax.swing.JTextArea MT;
    private javax.swing.JTextField VM;
    private javax.swing.JTextField VN;
    private javax.swing.JTextField VO;
    private javax.swing.JTextField VP;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btncrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
