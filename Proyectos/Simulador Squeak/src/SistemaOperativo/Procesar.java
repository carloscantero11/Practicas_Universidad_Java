package SistemaOperativo;


import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Procesar extends javax.swing.JFrame {

    
    int Contador;//Contador del total de procesos que se van ingresando
    int NProceso;//Carga el número de procesos ejecutándose
    int Rafaga=0;//Carga la ráfaga en ejecución
    int Quantum=0;//Carga el quantum en ejecución
    int ResiduoRafaga=0;//Carga el residuo en ejecución
    int TiempoProceso=0;//Carga el tiempo que se dura procesando
    int ValorBarra;//Carga el progreso de la Barra
    int CantidadProcesos;//Número de procesos terminados
    
    /**
     * Creates new form Procesar
     */
    
    public Procesar() {
        initComponents();
        jTIngreso.setBackground(Color.CYAN);
        jTIngreso.setForeground(Color.blue);
        jTFinal.setBackground(Color.GREEN);
        //jTFinal.setBackground(Color.red);
        jTFCapturaQuantum.grabFocus();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/SqueakLogo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bateria = new javax.swing.JRadioButton();
        wi = new javax.swing.JRadioButton();
        seg = new javax.swing.JRadioButton();
        sim = new javax.swing.JRadioButton();
        sd = new javax.swing.JRadioButton();
        mic = new javax.swing.JRadioButton();
        au = new javax.swing.JRadioButton();
        imp = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTFCapturaQuantum = new javax.swing.JTextField();
        jLCantidadProcesos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLCantidadTiempo = new javax.swing.JTextField();
        jTFCapturaRafaga = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTFinal = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPBEstado = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jBIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLNumeroProceso = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jLPorcentajeProceso = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTIngreso = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        report = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(99, 143, 165));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cerrar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cerrar 1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Squeak.gif"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(300, 299));

        jLabel9.setFont(new java.awt.Font("Tunga", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Squeak");

        bateria.setBorder(null);
        bateria.setContentAreaFilled(false);
        bateria.setFocusPainted(false);
        bateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BateriaAlta.png"))); // NOI18N
        bateria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BateriaAlta.png"))); // NOI18N
        bateria.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cargando.png"))); // NOI18N
        bateria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cargando.png"))); // NOI18N
        bateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bateriaMouseClicked(evt);
            }
        });

        wi.setBorder(null);
        wi.setContentAreaFilled(false);
        wi.setFocusPainted(false);
        wi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/wifi.png"))); // NOI18N
        wi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/no-wifi.png"))); // NOI18N
        wi.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/wifi.png"))); // NOI18N
        wi.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/wifi.png"))); // NOI18N
        wi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wiMouseClicked(evt);
            }
        });

        seg.setBorder(null);
        seg.setContentAreaFilled(false);
        seg.setFocusPainted(false);
        seg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Seguro.png"))); // NOI18N
        seg.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Seguro.png"))); // NOI18N
        seg.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/advertencia.png"))); // NOI18N
        seg.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/advertencia.png"))); // NOI18N
        seg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segMouseClicked(evt);
            }
        });

        sim.setBorder(null);
        sim.setContentAreaFilled(false);
        sim.setFocusPainted(false);
        sim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tarjeta-sim.png"))); // NOI18N
        sim.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tarjeta-sim.png"))); // NOI18N
        sim.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nosim.png"))); // NOI18N
        sim.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nosim.png"))); // NOI18N
        sim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simMouseClicked(evt);
            }
        });

        sd.setBorder(null);
        sd.setContentAreaFilled(false);
        sd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sd-card.png"))); // NOI18N
        sd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sd-card.png"))); // NOI18N
        sd.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sd-card No.png"))); // NOI18N
        sd.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sd-card No.png"))); // NOI18N
        sd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdMouseClicked(evt);
            }
        });

        mic.setBorder(null);
        mic.setContentAreaFilled(false);
        mic.setFocusPainted(false);
        mic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nomicrofono.png"))); // NOI18N
        mic.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nomicrofono.png"))); // NOI18N
        mic.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Microfono.png"))); // NOI18N
        mic.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Microfono.png"))); // NOI18N
        mic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                micMouseClicked(evt);
            }
        });

        au.setBorder(null);
        au.setContentAreaFilled(false);
        au.setFocusPainted(false);
        au.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/NoAudifonos.png"))); // NOI18N
        au.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/NoAudifonos.png"))); // NOI18N
        au.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/audifonos.png"))); // NOI18N
        au.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/audifonos.png"))); // NOI18N
        au.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                auMouseClicked(evt);
            }
        });

        imp.setBorder(null);
        imp.setContentAreaFilled(false);
        imp.setFocusPainted(false);
        imp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/NoDispositivo.png"))); // NOI18N
        imp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/NoDispositivo.png"))); // NOI18N
        imp.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Impresora.png"))); // NOI18N
        imp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Impresora.png"))); // NOI18N
        imp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                impMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(au)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wi)
                .addGap(13, 13, 13)
                .addComponent(seg)
                .addGap(9, 9, 9)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wi)
                    .addComponent(mic)
                    .addComponent(sd)
                    .addComponent(au)
                    .addComponent(seg)
                    .addComponent(bateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sim)
                    .addComponent(imp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(28, 81, 88));
        jPanel2.setForeground(new java.awt.Color(153, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("TIEMPO PROCESO");

        jTFCapturaQuantum.setBackground(new java.awt.Color(0, 0, 51));
        jTFCapturaQuantum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaQuantum.setForeground(new java.awt.Color(255, 255, 255));
        jTFCapturaQuantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaQuantumActionPerformed(evt);
            }
        });

        jLCantidadProcesos.setBackground(new java.awt.Color(0, 0, 51));
        jLCantidadProcesos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadProcesos.setForeground(new java.awt.Color(255, 255, 255));
        jLCantidadProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadProcesosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Rafaga");

        jLCantidadTiempo.setBackground(new java.awt.Color(0, 0, 51));
        jLCantidadTiempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadTiempo.setForeground(new java.awt.Color(255, 255, 255));
        jLCantidadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadTiempoActionPerformed(evt);
            }
        });

        jTFCapturaRafaga.setBackground(new java.awt.Color(0, 0, 51));
        jTFCapturaRafaga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaRafaga.setForeground(new java.awt.Color(255, 255, 255));
        jTFCapturaRafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaRafagaActionPerformed(evt);
            }
        });

        jTFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Rafaga", "Quantum", "Tiempo Final"
            }
        ));
        jScrollPane4.setViewportView(jTFinal);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("        LISTA DE PROCESOS");

        jPBEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPBEstado.setForeground(new java.awt.Color(0, 51, 255));
        jPBEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Procesos:");

        jBIniciar.setBackground(new java.awt.Color(0, 204, 204));
        jBIniciar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jBIniciar.setForeground(new java.awt.Color(0, 0, 0));
        jBIniciar.setText("Iniciar");
        jBIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Historico de Procesos");

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Quantum");

        jLNumeroProceso.setBackground(new java.awt.Color(0, 0, 51));
        jLNumeroProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNumeroProceso.setForeground(new java.awt.Color(102, 255, 0));
        jLNumeroProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLNumeroProcesoActionPerformed(evt);
            }
        });

        jBAgregar.setBackground(new java.awt.Color(0, 204, 204));
        jBAgregar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jLPorcentajeProceso.setBackground(new java.awt.Color(0, 0, 51));
        jLPorcentajeProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLPorcentajeProceso.setForeground(new java.awt.Color(255, 255, 0));
        jLPorcentajeProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLPorcentajeProcesoActionPerformed(evt);
            }
        });

        jTIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Rafaga", "Quantum", "ResiduoRafaga", "Estado"
            }
        ));
        jScrollPane3.setViewportView(jTIngreso);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("CANTIDAD PROCESO");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Reporte");

        report.setBackground(new java.awt.Color(0, 0, 51));
        report.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        report.setForeground(new java.awt.Color(51, 255, 51));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/SqueakHot.gif"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/SqueakNice.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCapturaQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFCapturaRafaga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLCantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(report))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(334, 334, 334))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPBEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(6, 6, 6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBIniciar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCapturaQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCapturaRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // TODO add your handling code here:
        if((Integer.parseInt(jTFCapturaRafaga.getText()))<=100){
            Ingresar();
        }else{
            JOptionPane.showMessageDialog(null, "Las Rafagas no pueden ser mayores de 100");
            jTFCapturaRafaga.setText(null);
            jTFCapturaRafaga.grabFocus();  
        }
        
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jTFCapturaRafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaRafagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCapturaRafagaActionPerformed

    private void jBIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarActionPerformed
        // TODO add your handling code here:
        new Thread(new Hilo()).start(); //Crea un nuevo hilo
        Iniciar();
    }//GEN-LAST:event_jBIniciarActionPerformed

    private void jTFCapturaQuantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaQuantumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCapturaQuantumActionPerformed

    private void jLCantidadProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadProcesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadProcesosActionPerformed

    private void jLCantidadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadTiempoActionPerformed

    private void jLNumeroProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLNumeroProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLNumeroProcesoActionPerformed

    private void jLPorcentajeProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLPorcentajeProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPorcentajeProcesoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);   //Aqui se cierra el programa
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_jPanel1MousePressed
 
    //Comandos para mover la ventana
  
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void bateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bateriaMouseClicked
        String info1 = "Cargador Conectado";
        String info2 = "Cargador Desconectado";
        
        if(bateria.isSelected()){
            report.setText(info1);
        }
        else{
            report.setText(info2);
        }
       
    }//GEN-LAST:event_bateriaMouseClicked

    private void simMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simMouseClicked
        String info1 = "Tarjeta SIM Conectada";
        String info2 = "No Hay Tarjeta SIM";
        
        if(sim.isSelected()){
            report.setText(info2);
        }
        else{
            report.setText(info1);
        }
    }//GEN-LAST:event_simMouseClicked

    private void sdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdMouseClicked
        String info1 = "Tarjeta SD Conectada";
        String info2 = "Conecte Una Tarjeta SD";
        
        if(sd.isSelected()){
            report.setText(info2);
        }
        else{
            report.setText(info1);
        }
    }//GEN-LAST:event_sdMouseClicked

    private void impMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_impMouseClicked
        String info1 = "Impresora Conectada";
        String info2 = "Conecte un Dispositivo";
        
        if(imp.isSelected()){
            report.setText(info1);
        }
        else{
            report.setText(info2);
        }
    }//GEN-LAST:event_impMouseClicked

    private void auMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auMouseClicked
        String info1 = "Audífonos Conectados";
        String info2 = "Audífonos Desconectados";
        
        if(au.isSelected()){
            report.setText(info1);
        }
        else{
            report.setText(info2);
        }
    }//GEN-LAST:event_auMouseClicked

    private void micMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_micMouseClicked
        String info1 = "Micrófono Conectado";
        String info2 = "Microfono Desconectado";
        
        if(mic.isSelected()){
            report.setText(info1);
        }
        else{
            report.setText(info2);
        }
    }//GEN-LAST:event_micMouseClicked

    private void wiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wiMouseClicked
        String info1 = "WiFi Conectado";
        String info2 = "WiFi Desconectado";
        
        if(wi.isSelected()){
            report.setText(info1);
        }
        else{
            report.setText(info2);
        }
    }//GEN-LAST:event_wiMouseClicked

    private void segMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segMouseClicked
        String info1 = "Alerta del Dispositivo";
        String info2 = "Dispositivo Seguro";
        
        if(seg.isSelected()){
            report.setText(info1);
        }
        else{
            report.setText(info2);
        }
    }//GEN-LAST:event_segMouseClicked

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
            java.util.logging.Logger.getLogger(Procesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procesar().setVisible(true);
            }
        });
    }
    
    
    
    private class Hilo implements Runnable{ //Objeto de tipo Hilo con extension ejectubale
    @Override
    public void run(){
        int estado=1; //Estado de while que indica si se puede seguir o no
        int i=0; // contador de while
        
        while(estado!=0){
            while(i<Contador){ //Recorrer las filas
                Cargar(i);
                if(ResiduoRafaga!=0 && ResiduoRafaga>Quantum){ //Ejecutando Procesos
                    for(int c=1; c<=Quantum; c++){
                        jTIngreso.setValueAt("Procesando",i,4);
                        ResiduoRafaga--;
                        Barra(Rafaga,ResiduoRafaga);
                        Pintar();
                        jTIngreso.setValueAt(String.valueOf(ResiduoRafaga),i,3);
                        TiempoProceso++;
                        Dormir();
                    }
                    jTIngreso.setValueAt("Espera",i,4);
                    if(ResiduoRafaga==0){
                        jTIngreso.setValueAt("Terminado",i,4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        jPBEstado.setValue(0);
                    }
            }else{
                if(ResiduoRafaga>0 && Quantum!=0){
                    while(ResiduoRafaga>0){
                        jTIngreso.setValueAt("Procesando",i,4);
                        ResiduoRafaga--;
                        Barra(Rafaga,ResiduoRafaga);
                        Pintar();
                        jTIngreso.setValueAt(String.valueOf(ResiduoRafaga),i,3);
                        TiempoProceso++;
                        Dormir();
                    }
                    jTIngreso.setValueAt("Espera",i,4);
                    if(ResiduoRafaga==0 && Quantum!=0){
                        jTIngreso.setValueAt("Terminado",i,4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        jPBEstado.setValue(0);
                     }
                    }else{
                        if(ResiduoRafaga==0 && Quantum!=0){
                            jTIngreso.setValueAt("Terminado",i,4);
                            Pintar();
                            Informe(i);
                            Borrar(i);
                            jPBEstado.setValue(0);
                        }
                    }
                }
                jLNumeroProceso.setText(String.valueOf("")); //Borrar contenido
                jLPorcentajeProceso.setText(String.valueOf(""));
                i++;
            }
            i=0;
            jLNumeroProceso.setText(String.valueOf("")); //Borrar contenido
            jLPorcentajeProceso.setText(String.valueOf(""));
            
        }
            
    }
}

public void Dormir(){
    try{
        Thread.sleep(700); //Dormir sistema
    }catch(InterruptedException ex){
        Logger.getLogger(Procesar.class.getName()).log(Level.SEVERE,null,ex);
    }

}

public void Cargar(int i){ //Carga los valores de la Tabla
    NProceso=(int)jTIngreso.getValueAt(i,0);
    Rafaga=parseInt((String)(jTIngreso.getValueAt(i,1)));
    Quantum=parseInt((String)(jTIngreso.getValueAt(i,2)));
    ResiduoRafaga=parseInt((String)(jTIngreso.getValueAt(i,3)));
    if(NProceso>0){
        jLNumeroProceso.setText(String.valueOf(NProceso));
    }
}

public void Ingresar(){ //Ingresar proceso a la tabla
    DefaultTableModel modelo=(DefaultTableModel) jTIngreso.getModel();

    Contador ++;
    Object[] miTabla = new Object[5];
    miTabla[0]= Contador;
    miTabla[1]= jTFCapturaRafaga.getText();
    miTabla[2]= jTFCapturaQuantum.getText();
    miTabla[3]= jTFCapturaRafaga.getText();
    miTabla[4]= "Listo";
    modelo.addRow(miTabla);
    jTIngreso.setModel(modelo);
    jTFCapturaRafaga.setText(null);
    jTFCapturaRafaga.grabFocus();
}

public void Informe(int c){
    DefaultTableModel modelo2 = (DefaultTableModel) jTFinal.getModel();

    Object[] miTabla= new Object[5];
    miTabla[0]= c+1;
    miTabla[1]= Rafaga;
    miTabla[2]= Quantum;
    miTabla[3]= TiempoProceso+" Segundos";
    miTabla[4]= "Terminado";
    modelo2.addRow(miTabla);
    jTFinal.setModel(modelo2);

    CantidadProcesos++;
    jLCantidadProcesos.setText(String.valueOf(CantidadProcesos+" Terminados"));
    jLCantidadTiempo.setText(String.valueOf(TiempoProceso+" Segundos"));
}

public void Borrar(int c){ //Elimina los registros de la tabla procesos
    jTIngreso.setValueAt(0,c,0);
    jTIngreso.setValueAt("0",c,1);
    jTIngreso.setValueAt("0",c,2);
    jTIngreso.setValueAt("0",c,3);
    jTIngreso.setValueAt("******",c,4);
}

   public void Barra(int rafaga, int residuo){ //Calcula porcentaje de la barra y su progreso
        int Rafaga=rafaga;
        int valor=100/rafaga;
        int porcentaje=100-(valor*residuo);
        ValorBarra=porcentaje;
        jLPorcentajeProceso.setText(String.valueOf(ValorBarra+"%"));
}

    public void Pintar(){
        jPBEstado.setValue(ValorBarra);
        jPBEstado.repaint();
    }

    public void Iniciar(){ //Inicia la secuencia de procesos
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jTFCapturaRafaga.setVisible(false);
        jTFCapturaQuantum.setVisible(false);
        jBAgregar.setVisible(false);
        jBIniciar.setVisible(false);
        
}
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton au;
    private javax.swing.JRadioButton bateria;
    private javax.swing.JRadioButton imp;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBIniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jLCantidadProcesos;
    private javax.swing.JTextField jLCantidadTiempo;
    private javax.swing.JTextField jLNumeroProceso;
    private javax.swing.JTextField jLPorcentajeProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jPBEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTFCapturaQuantum;
    private javax.swing.JTextField jTFCapturaRafaga;
    private javax.swing.JTable jTFinal;
    private javax.swing.JTable jTIngreso;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton mic;
    private javax.swing.JTextField report;
    private javax.swing.JRadioButton sd;
    private javax.swing.JRadioButton seg;
    private javax.swing.JRadioButton sim;
    private javax.swing.JRadioButton wi;
    // End of variables declaration//GEN-END:variables
}
