package Programa;

import com.mysql.jdbc.PreparedStatement;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Registros extends javax.swing.JPanel {

    
    public Registros() {
        initComponents();
        tablaDatos();
        tablaDatos1();
        tablaDatos2();
        tablaDatos3();
        
        
        
        
    }

    void tablaDatos(){
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID_cliente");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Dirección");
            modelo.addColumn("Correo");
            tabla1.setModel(modelo);
             
            String []cliente = new String[6];
            try{
            java.sql.Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cliente");
            while (rs.next()) {
                cliente[0] = rs.getString(1);
                cliente[1] = rs.getString(2);
                cliente[2] = rs.getString(3);
                cliente[3] = rs.getString(4);
                cliente[4] = rs.getString(5);
                cliente[5] = rs.getString(6);
                modelo.addRow(cliente);
            }
            tabla1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void tablaDatos1(){
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID_materia");
            modelo.addColumn("Ingrediente");
            modelo.addColumn("Unidad");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio Total");
     
            tabla2.setModel(modelo);
            
            String []materia = new String[5];
            try{
            java.sql.Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM materia");
            while (rs.next()) {
                materia[0] = "MP_"+rs.getString(1);
                materia[1] = rs.getString(2);
                materia[2] = rs.getString(3);
                materia[3] = rs.getString(4);
                materia[4] = rs.getString(5)+"$";
                modelo.addRow(materia);
            }
            tabla2.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    void tablaDatos2(){
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID_producto");
            modelo.addColumn("Producto");
            modelo.addColumn("Categoría");
            modelo.addColumn("Peso");
            modelo.addColumn("Precio");
            modelo.addColumn("Existencia");
            tabla3.setModel(modelo);
            
            String []producto = new String[6];
            try{
            java.sql.Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM producto");
            while (rs.next()) {
                producto[0] = "P_"+rs.getString(1);
                producto[1] = rs.getString(2);
                producto[2] = rs.getString(3);
                producto[3] = rs.getString(4)+" Kg";
                producto[4] = rs.getString(5)+"$";
                producto[5] = rs.getString(6);
                modelo.addRow(producto);
            }
            tabla3.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }  
     } 
    void tablaDatos3(){
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID_pedido");
            modelo.addColumn("ID_cliente");
            modelo.addColumn("Dirección");
            modelo.addColumn("Base Imponible");
            modelo.addColumn("Fecha");
            modelo.addColumn("Total de Pedido");
            tabla4.setModel(modelo);
            
            String []pedido = new String[6];
            try{
            java.sql.Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pedido");
            while (rs.next()) {
                pedido[0] = rs.getString(1);
                pedido[1] = rs.getString(2);
                pedido[2] = rs.getString(3);
                pedido[3] = rs.getString(4)+"$";
                pedido[4] = rs.getString(5);
                pedido[5] = rs.getString(6)+"$";
                modelo.addRow(pedido);
            }
            tabla4.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtnombrei = new javax.swing.JTextField();
        txtidmateria = new javax.swing.JTextField();
        txtunidad = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtpreciototal = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        btnmodificar1 = new javax.swing.JButton();
        btneliminar1 = new javax.swing.JButton();
        btnguardar1 = new javax.swing.JButton();
        txtbuscar1 = new javax.swing.JTextField();
        btnbuscar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtnombreproducto = new javax.swing.JTextField();
        txtidproducto = new javax.swing.JTextField();
        txtcategoria = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtexistencia = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        btnmodificar2 = new javax.swing.JButton();
        btneliminar2 = new javax.swing.JButton();
        btnguardar2 = new javax.swing.JButton();
        txtbuscar2 = new javax.swing.JTextField();
        btnbuscar2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        llablele = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        txtidpedido = new javax.swing.JTextField();
        txtdireccionn = new javax.swing.JTextField();
        txtbaseim = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txttotalpedido = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabla4 = new javax.swing.JTable();
        btnmodificar3 = new javax.swing.JButton();
        btneliminar3 = new javax.swing.JButton();
        btnguardar3 = new javax.swing.JButton();
        txtbuscar3 = new javax.swing.JTextField();
        btnbuscar3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnbuscarconsulta = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnbuscarconsulta1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnbuscarconsulta2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnbuscarconsulta3 = new javax.swing.JButton();
        btnbuscarconsulta4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtconsulta = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(911, 557));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(159, 134, 103));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(173, 154, 129));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("ID_Cliente");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Dirección");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Correo");

        txtnombre.setBackground(new java.awt.Color(213, 192, 176));
        txtnombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(51, 0, 0));
        txtnombre.setToolTipText("");
        txtnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtid.setBackground(new java.awt.Color(213, 192, 176));
        txtid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtid.setForeground(new java.awt.Color(51, 0, 0));
        txtid.setToolTipText("");
        txtid.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtapellido.setBackground(new java.awt.Color(213, 192, 176));
        txtapellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtapellido.setForeground(new java.awt.Color(51, 0, 0));
        txtapellido.setToolTipText("");
        txtapellido.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        txttelefono.setBackground(new java.awt.Color(213, 192, 176));
        txttelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txttelefono.setForeground(new java.awt.Color(51, 0, 0));
        txttelefono.setToolTipText("");
        txttelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        txtdireccion.setBackground(new java.awt.Color(213, 192, 176));
        txtdireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtdireccion.setForeground(new java.awt.Color(51, 0, 0));
        txtdireccion.setToolTipText("");
        txtdireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        txtcorreo.setBackground(new java.awt.Color(213, 192, 176));
        txtcorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(51, 0, 0));
        txtcorreo.setToolTipText("");
        txtcorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        tabla1.setBackground(new java.awt.Color(213, 192, 176));
        tabla1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        tabla1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabla1.setForeground(new java.awt.Color(51, 27, 27));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Cliente", "Nombre", "Apellido", "Teléfono", "Dirección", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla1);

        btneliminar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(51, 0, 0));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setToolTipText("");
        btneliminar.setBorderPainted(false);
        btneliminar.setContentAreaFilled(false);
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btneliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar1.png"))); // NOI18N
        btneliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(51, 0, 0));
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Modificar.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setToolTipText("");
        btnmodificar.setBorderPainted(false);
        btnmodificar.setContentAreaFilled(false);
        btnmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnmodificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmodificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Modificar1.png"))); // NOI18N
        btnmodificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(51, 0, 0));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Guardar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setToolTipText("");
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Guardar1.png"))); // NOI18N
        btnguardar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txtbuscar.setBackground(new java.awt.Color(213, 192, 176));
        txtbuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtbuscar.setForeground(new java.awt.Color(51, 0, 0));
        txtbuscar.setToolTipText("");
        txtbuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setText("Buscar por ID");

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa.png"))); // NOI18N
        btnbuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(67, 30, 30)));
        btnbuscar.setBorderPainted(false);
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa1.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))))
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        jPanel2.setBackground(new java.awt.Color(173, 154, 129));

        jPanel13.setBackground(new java.awt.Color(173, 154, 129));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 0, 0));
        jLabel25.setText("ID_Materia Prima");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 0, 0));
        jLabel26.setText("Nombre de Ingrediente");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 0, 0));
        jLabel28.setText("Cantidad");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 0, 0));
        jLabel29.setText("Unidad");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 0, 0));
        jLabel30.setText("Precio Total");

        txtnombrei.setBackground(new java.awt.Color(213, 192, 176));
        txtnombrei.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnombrei.setForeground(new java.awt.Color(51, 0, 0));
        txtnombrei.setToolTipText("");
        txtnombrei.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtnombrei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        txtidmateria.setBackground(new java.awt.Color(213, 192, 176));
        txtidmateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtidmateria.setForeground(new java.awt.Color(51, 0, 0));
        txtidmateria.setToolTipText("");
        txtidmateria.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtidmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        txtunidad.setBackground(new java.awt.Color(213, 192, 176));
        txtunidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtunidad.setForeground(new java.awt.Color(51, 0, 0));
        txtunidad.setToolTipText("");
        txtunidad.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        txtcantidad.setBackground(new java.awt.Color(213, 192, 176));
        txtcantidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(51, 0, 0));
        txtcantidad.setToolTipText("");
        txtcantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        txtpreciototal.setBackground(new java.awt.Color(213, 192, 176));
        txtpreciototal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtpreciototal.setForeground(new java.awt.Color(51, 0, 0));
        txtpreciototal.setToolTipText("");
        txtpreciototal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtpreciototal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        tabla2.setBackground(new java.awt.Color(213, 192, 176));
        tabla2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        tabla2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabla2.setForeground(new java.awt.Color(51, 27, 27));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Materia_Prima", "Ingredientes", "Unidad", "Cantidad", "Precio_Unitario", "Precio_Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tabla2);

        btnmodificar1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnmodificar1.setForeground(new java.awt.Color(51, 0, 0));
        btnmodificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Modificar.png"))); // NOI18N
        btnmodificar1.setText("Modificar");
        btnmodificar1.setToolTipText("");
        btnmodificar1.setBorderPainted(false);
        btnmodificar1.setContentAreaFilled(false);
        btnmodificar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnmodificar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmodificar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Modificar1.png"))); // NOI18N
        btnmodificar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificar1ActionPerformed(evt);
            }
        });

        btneliminar1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btneliminar1.setForeground(new java.awt.Color(51, 0, 0));
        btneliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar.png"))); // NOI18N
        btneliminar1.setText("Eliminar");
        btneliminar1.setToolTipText("");
        btneliminar1.setBorderPainted(false);
        btneliminar1.setContentAreaFilled(false);
        btneliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btneliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar1.png"))); // NOI18N
        btneliminar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar1ActionPerformed(evt);
            }
        });

        btnguardar1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnguardar1.setForeground(new java.awt.Color(51, 0, 0));
        btnguardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Guardar.png"))); // NOI18N
        btnguardar1.setText("Guardar");
        btnguardar1.setToolTipText("");
        btnguardar1.setBorderPainted(false);
        btnguardar1.setContentAreaFilled(false);
        btnguardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnguardar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Guardar1.png"))); // NOI18N
        btnguardar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnguardar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar1ActionPerformed(evt);
            }
        });

        txtbuscar1.setBackground(new java.awt.Color(213, 192, 176));
        txtbuscar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtbuscar1.setForeground(new java.awt.Color(51, 0, 0));
        txtbuscar1.setToolTipText("");
        txtbuscar1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar1ActionPerformed(evt);
            }
        });

        btnbuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa.png"))); // NOI18N
        btnbuscar1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(67, 30, 30)));
        btnbuscar1.setBorderPainted(false);
        btnbuscar1.setContentAreaFilled(false);
        btnbuscar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa1.png"))); // NOI18N
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 0));
        jLabel8.setText("Buscar por ID");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnguardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmodificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btneliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel28)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombrei, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpreciototal, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(txtunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel29))
                .addGap(6, 6, 6)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombrei, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpreciototal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnbuscar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnguardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmodificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Materia Prima", jPanel2);

        jPanel3.setBackground(new java.awt.Color(173, 154, 129));

        jPanel7.setBackground(new java.awt.Color(173, 154, 129));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 0, 0));
        jLabel31.setText("ID_Producto");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 0, 0));
        jLabel32.setText("Nombre");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 0, 0));
        jLabel33.setText("Precio");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 0, 0));
        jLabel34.setText("Peso");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 0, 0));
        jLabel35.setText("Categoría");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 0, 0));
        jLabel36.setText("Existencias");

        txtnombreproducto.setBackground(new java.awt.Color(213, 192, 176));
        txtnombreproducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnombreproducto.setForeground(new java.awt.Color(51, 0, 0));
        txtnombreproducto.setToolTipText("");
        txtnombreproducto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtnombreproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreproductoActionPerformed(evt);
            }
        });

        txtidproducto.setBackground(new java.awt.Color(213, 192, 176));
        txtidproducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtidproducto.setForeground(new java.awt.Color(51, 0, 0));
        txtidproducto.setToolTipText("");
        txtidproducto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });

        txtcategoria.setBackground(new java.awt.Color(213, 192, 176));
        txtcategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtcategoria.setForeground(new java.awt.Color(51, 0, 0));
        txtcategoria.setToolTipText("");
        txtcategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcategoriaActionPerformed(evt);
            }
        });

        txtpeso.setBackground(new java.awt.Color(213, 192, 176));
        txtpeso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtpeso.setForeground(new java.awt.Color(51, 0, 0));
        txtpeso.setToolTipText("");
        txtpeso.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });

        txtprecio.setBackground(new java.awt.Color(213, 192, 176));
        txtprecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(51, 0, 0));
        txtprecio.setToolTipText("");
        txtprecio.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        txtexistencia.setBackground(new java.awt.Color(213, 192, 176));
        txtexistencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtexistencia.setForeground(new java.awt.Color(51, 0, 0));
        txtexistencia.setToolTipText("");
        txtexistencia.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtexistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexistenciaActionPerformed(evt);
            }
        });

        tabla3.setBackground(new java.awt.Color(213, 192, 176));
        tabla3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        tabla3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabla3.setForeground(new java.awt.Color(51, 27, 27));
        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Producto", "Nombre_Producto", "Categoría", "Peso", "Precio", "Existencias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tabla3);

        btnmodificar2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnmodificar2.setForeground(new java.awt.Color(51, 0, 0));
        btnmodificar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Modificar.png"))); // NOI18N
        btnmodificar2.setText("Modificar");
        btnmodificar2.setToolTipText("");
        btnmodificar2.setBorderPainted(false);
        btnmodificar2.setContentAreaFilled(false);
        btnmodificar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnmodificar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmodificar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Modificar1.png"))); // NOI18N
        btnmodificar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmodificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificar2ActionPerformed(evt);
            }
        });

        btneliminar2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btneliminar2.setForeground(new java.awt.Color(51, 0, 0));
        btneliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar.png"))); // NOI18N
        btneliminar2.setText("Eliminar");
        btneliminar2.setToolTipText("");
        btneliminar2.setBorderPainted(false);
        btneliminar2.setContentAreaFilled(false);
        btneliminar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btneliminar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar1.png"))); // NOI18N
        btneliminar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar2ActionPerformed(evt);
            }
        });

        btnguardar2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnguardar2.setForeground(new java.awt.Color(51, 0, 0));
        btnguardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Guardar.png"))); // NOI18N
        btnguardar2.setText("Guardar");
        btnguardar2.setToolTipText("");
        btnguardar2.setBorderPainted(false);
        btnguardar2.setContentAreaFilled(false);
        btnguardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnguardar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Guardar1.png"))); // NOI18N
        btnguardar2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnguardar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar2ActionPerformed(evt);
            }
        });

        txtbuscar2.setBackground(new java.awt.Color(213, 192, 176));
        txtbuscar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtbuscar2.setForeground(new java.awt.Color(51, 0, 0));
        txtbuscar2.setToolTipText("");
        txtbuscar2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtbuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar2ActionPerformed(evt);
            }
        });

        btnbuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa.png"))); // NOI18N
        btnbuscar2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(67, 30, 30)));
        btnbuscar2.setBorderPainted(false);
        btnbuscar2.setContentAreaFilled(false);
        btnbuscar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa1.png"))); // NOI18N
        btnbuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 0));
        jLabel9.setText("Buscar por ID");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnguardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmodificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtbuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel34)
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtexistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35)
                            .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel35))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtexistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnbuscar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnguardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmodificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(173, 154, 129));

        jPanel8.setBackground(new java.awt.Color(173, 154, 129));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 0, 0));
        jLabel37.setText("ID_Pedido");

        label.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        label.setForeground(new java.awt.Color(51, 0, 0));
        label.setText("ID_Cliente");

        jLabel39.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 0, 0));
        jLabel39.setText("Fecha de Entrega");

        l.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        l.setForeground(new java.awt.Color(51, 0, 0));
        l.setText("Base Imponible");

        llablele.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        llablele.setForeground(new java.awt.Color(51, 0, 0));
        llablele.setText("Dirección");

        jLabel42.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 0, 0));
        jLabel42.setText("Total de Pedido");

        txtidcliente.setBackground(new java.awt.Color(213, 192, 176));
        txtidcliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtidcliente.setForeground(new java.awt.Color(51, 0, 0));
        txtidcliente.setToolTipText("");
        txtidcliente.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        txtidpedido.setBackground(new java.awt.Color(213, 192, 176));
        txtidpedido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtidpedido.setForeground(new java.awt.Color(51, 0, 0));
        txtidpedido.setToolTipText("");
        txtidpedido.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtidpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpedidoActionPerformed(evt);
            }
        });

        txtdireccionn.setBackground(new java.awt.Color(213, 192, 176));
        txtdireccionn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtdireccionn.setForeground(new java.awt.Color(51, 0, 0));
        txtdireccionn.setToolTipText("");
        txtdireccionn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtdireccionn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionnActionPerformed(evt);
            }
        });

        txtbaseim.setBackground(new java.awt.Color(213, 192, 176));
        txtbaseim.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtbaseim.setForeground(new java.awt.Color(51, 0, 0));
        txtbaseim.setToolTipText("");
        txtbaseim.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtbaseim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbaseimActionPerformed(evt);
            }
        });

        txtfecha.setBackground(new java.awt.Color(213, 192, 176));
        txtfecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtfecha.setForeground(new java.awt.Color(51, 0, 0));
        txtfecha.setToolTipText("");
        txtfecha.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        txttotalpedido.setBackground(new java.awt.Color(213, 192, 176));
        txttotalpedido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txttotalpedido.setForeground(new java.awt.Color(51, 0, 0));
        txttotalpedido.setToolTipText("");
        txttotalpedido.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txttotalpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalpedidoActionPerformed(evt);
            }
        });

        tabla4.setBackground(new java.awt.Color(213, 192, 176));
        tabla4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        tabla4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabla4.setForeground(new java.awt.Color(51, 27, 27));
        tabla4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro_Pedido", "ID_Cliente", "Direccion", "Base_Imponible", "IVA", "Total_Pedido", "Fecha_Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tabla4);

        btnmodificar3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnmodificar3.setForeground(new java.awt.Color(51, 0, 0));
        btnmodificar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Modificar.png"))); // NOI18N
        btnmodificar3.setText("Modificar");
        btnmodificar3.setToolTipText("");
        btnmodificar3.setBorderPainted(false);
        btnmodificar3.setContentAreaFilled(false);
        btnmodificar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnmodificar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmodificar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Modificar1.png"))); // NOI18N
        btnmodificar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmodificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificar3ActionPerformed(evt);
            }
        });

        btneliminar3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btneliminar3.setForeground(new java.awt.Color(51, 0, 0));
        btneliminar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar.png"))); // NOI18N
        btneliminar3.setText("Eliminar");
        btneliminar3.setToolTipText("");
        btneliminar3.setBorderPainted(false);
        btneliminar3.setContentAreaFilled(false);
        btneliminar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btneliminar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar1.png"))); // NOI18N
        btneliminar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar3ActionPerformed(evt);
            }
        });

        btnguardar3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnguardar3.setForeground(new java.awt.Color(51, 0, 0));
        btnguardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Guardar.png"))); // NOI18N
        btnguardar3.setText("Guardar");
        btnguardar3.setToolTipText("");
        btnguardar3.setBorderPainted(false);
        btnguardar3.setContentAreaFilled(false);
        btnguardar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnguardar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Guardar1.png"))); // NOI18N
        btnguardar3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnguardar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar3ActionPerformed(evt);
            }
        });

        txtbuscar3.setBackground(new java.awt.Color(213, 192, 176));
        txtbuscar3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtbuscar3.setForeground(new java.awt.Color(51, 0, 0));
        txtbuscar3.setToolTipText("");
        txtbuscar3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtbuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar3ActionPerformed(evt);
            }
        });

        btnbuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa.png"))); // NOI18N
        btnbuscar3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(67, 30, 30)));
        btnbuscar3.setBorderPainted(false);
        btnbuscar3.setContentAreaFilled(false);
        btnbuscar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa1.png"))); // NOI18N
        btnbuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 0));
        jLabel10.setText("Buscar por ID_Pedido");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(l)
                            .addComponent(txtbaseim, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label)
                            .addComponent(jLabel39)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotalpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(llablele)
                            .addComponent(txtdireccionn, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnguardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmodificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtbuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(label)
                    .addComponent(llablele))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccionn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l)
                    .addComponent(jLabel39)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbaseim, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnbuscar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmodificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 931, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedidos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(173, 154, 129));

        jLabel13.setFont(new java.awt.Font("Bell MT", 1, 40)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 0));
        jLabel13.setText("Reporte de Consulta");

        txtarea.setBackground(new java.awt.Color(218, 201, 177));
        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtarea.setForeground(new java.awt.Color(51, 0, 0));
        txtarea.setLineWrap(true);
        txtarea.setRows(5);
        txtarea.setWrapStyleWord(true);
        txtarea.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(41, 20, 20)));
        jScrollPane2.setViewportView(txtarea);

        jPanel6.setBackground(new java.awt.Color(173, 154, 129));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 0), 4, true));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 0));
        jLabel17.setText("Nombre de todos los clientes registrados");

        btnbuscarconsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa.png"))); // NOI18N
        btnbuscarconsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(67, 30, 30)));
        btnbuscarconsulta.setBorderPainted(false);
        btnbuscarconsulta.setContentAreaFilled(false);
        btnbuscarconsulta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa1.png"))); // NOI18N
        btnbuscarconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarconsultaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 0, 0));
        jLabel18.setText("Listado de productos con un precio ");

        btnbuscarconsulta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa.png"))); // NOI18N
        btnbuscarconsulta1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(67, 30, 30)));
        btnbuscarconsulta1.setBorderPainted(false);
        btnbuscarconsulta1.setContentAreaFilled(false);
        btnbuscarconsulta1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa1.png"))); // NOI18N
        btnbuscarconsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarconsulta1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 0, 0));
        jLabel22.setText("menor o igual a $20.");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 0, 0));
        jLabel21.setText("Listado de clientes ordenados alfabéticamente");

        btnbuscarconsulta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa.png"))); // NOI18N
        btnbuscarconsulta2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(67, 30, 30)));
        btnbuscarconsulta2.setBorderPainted(false);
        btnbuscarconsulta2.setContentAreaFilled(false);
        btnbuscarconsulta2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa1.png"))); // NOI18N
        btnbuscarconsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarconsulta2ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 0, 0));
        jLabel23.setText("que poseen Movistar como línea telefónica. ");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 0, 0));
        jLabel20.setText("Promedio de ventas por encargos ");

        btnbuscarconsulta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa.png"))); // NOI18N
        btnbuscarconsulta3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(67, 30, 30)));
        btnbuscarconsulta3.setBorderPainted(false);
        btnbuscarconsulta3.setContentAreaFilled(false);
        btnbuscarconsulta3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa1.png"))); // NOI18N
        btnbuscarconsulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarconsulta3ActionPerformed(evt);
            }
        });

        btnbuscarconsulta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa.png"))); // NOI18N
        btnbuscarconsulta4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(67, 30, 30)));
        btnbuscarconsulta4.setBorderPainted(false);
        btnbuscarconsulta4.setContentAreaFilled(false);
        btnbuscarconsulta4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/lupa1.png"))); // NOI18N
        btnbuscarconsulta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarconsulta4ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 0, 0));
        jLabel19.setText("Listado de n° de pedidos de un cliente.");

        jLabel11.setBackground(new java.awt.Color(173, 154, 129));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 0));
        jLabel11.setText("_______________________________________________________");
        jLabel11.setToolTipText("");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setBackground(new java.awt.Color(173, 154, 129));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 0));
        jLabel12.setText("_______________________________________________________");
        jLabel12.setToolTipText("");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setBackground(new java.awt.Color(173, 154, 129));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 0));
        jLabel14.setText("_______________________________________________________");
        jLabel14.setToolTipText("");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setBackground(new java.awt.Color(173, 154, 129));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 0, 0));
        jLabel15.setText("_______________________________________________________");
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 0, 0));
        jLabel24.setText("y ordenados alfabeticamente.");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 0, 0));
        jLabel27.setText("realizados en Valencia y San Diego.");

        txtconsulta.setBackground(new java.awt.Color(213, 192, 176));
        txtconsulta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtconsulta.setForeground(new java.awt.Color(51, 0, 0));
        txtconsulta.setToolTipText("");
        txtconsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 27, 27)));
        txtconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel19))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(txtconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbuscarconsulta4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscarconsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbuscarconsulta3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(17, 17, 17)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscarconsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscarconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addGap(6, 6, 6))
                    .addComponent(btnbuscarconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel11)
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbuscarconsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbuscarconsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscarconsulta3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnbuscarconsulta4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultas", jPanel5);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void txtnombreproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreproductoActionPerformed

    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void txtcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcategoriaActionPerformed

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesoActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtexistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexistenciaActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtidpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpedidoActionPerformed

    private void txtdireccionnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionnActionPerformed

    private void txtbaseimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbaseimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbaseimActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txttotalpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalpedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalpedidoActionPerformed

    private void btnmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificar1ActionPerformed
        Connection conectar = null;
             try {
                 Class.forName("com.mysql.jdbc.Driver");
                 conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
             } catch (SQLException ex) {
                 Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
             }
             try{
              String sql = "UPDATE materia SET id_materia=?,"+"nombreing=?,"
                      +"unidad=?,"
                      +"cantidad=?,"
                      +"preciototal=?"
                      +"WHERE id_materia='"+txtidmateria.getText()+"'";
              
                
              java.sql.PreparedStatement pst = conectar.prepareStatement(sql);
              pst.setString(1, txtidmateria.getText());
              pst.setString(2, txtnombrei.getText());
              pst.setString(3, txtunidad.getText());
              pst.setString(4, txtcantidad.getText());
              pst.setString(5, txtpreciototal.getText());
              int n = pst.executeUpdate();
              if(n>0){
                  JOptionPane.showMessageDialog(null, "El cliente ha sido modficado con éxito");
                  tablaDatos1();
                
              }
              else{
                  JOptionPane.showMessageDialog(null, "Error al modificar los datos");
              }
              
              } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtidmateria.setText("");
        txtnombrei.setText("");
        txtunidad.setText("");
        txtcantidad.setText("");
        txtpreciototal.setText("");
    }//GEN-LAST:event_btnmodificar1ActionPerformed

    private void btnmodificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificar2ActionPerformed
        Connection conectar = null;
             try {
                 Class.forName("com.mysql.jdbc.Driver");
                 conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
             } catch (SQLException ex) {
                 Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
             }
             try{
              String sql = "UPDATE producto SET id_producto=?,"+"nombreproducto=?,"
                      +"categoria=?,"
                      +"peso=?,"
                      +"precio=?,"
                      +"existencia=?"
                      +"WHERE id_producto='"+txtidproducto.getText()+"'";
              
                
              java.sql.PreparedStatement pst = conectar.prepareStatement(sql);
              pst.setString(1, txtidproducto.getText());
              pst.setString(2, txtnombreproducto.getText());
              pst.setString(3, txtcategoria.getText());
              pst.setString(4, txtpeso.getText());
              pst.setString(5, txtprecio.getText());
              pst.setString(6, txtexistencia.getText());
              int n = pst.executeUpdate();
              if(n>0){
                  JOptionPane.showMessageDialog(null, "El cliente ha sido modficado con éxito");
                  tablaDatos2();
                
              }
              else{
                  JOptionPane.showMessageDialog(null, "Error al modificar los datos");
              }
              
              } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtidproducto.setText("");
        txtnombreproducto.setText("");
        txtcategoria.setText("");
        txtpeso.setText("");
        txtprecio.setText("");
        txtexistencia.setText("");
    }//GEN-LAST:event_btnmodificar2ActionPerformed

    private void btnmodificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificar3ActionPerformed
        Connection conectar = null;
             try {
                 Class.forName("com.mysql.jdbc.Driver");
                 conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
             } catch (SQLException ex) {
                 Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
             }
             try{
              String sql = "UPDATE pedido SET id_pedido=?,"+"id_clientee=?,"
                      +"direccionn=?,"
                      +"base=?,"
                      +"fecha=?,"
                      +"totalpedido=?"
                      +"WHERE id_pedido='"+txtidpedido.getText()+"'";
              
                
              java.sql.PreparedStatement pst = conectar.prepareStatement(sql);
              pst.setString(1, txtidpedido.getText());
              pst.setString(2, txtidcliente.getText());
              pst.setString(3, txtdireccionn.getText());
              pst.setString(4, txtbaseim.getText());
              pst.setString(5, txtfecha.getText());
              pst.setString(6, txttotalpedido.getText());
             
              int n = pst.executeUpdate();
              if(n>0){
                  JOptionPane.showMessageDialog(null, "El cliente ha sido modficado con éxito");
                  tablaDatos3();
                
              }
              else{
                  JOptionPane.showMessageDialog(null, "Error al modificar los datos");
              }
              
              } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtidpedido.setText("");
        txtidcliente.setText("");
        txtdireccionn.setText("");
        txtbaseim.setText("");
        txtfecha.setText("");
        txttotalpedido.setText("");
    }//GEN-LAST:event_btnmodificar3ActionPerformed

    private void txtbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar1ActionPerformed

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            String id = this.txtbuscar1.getText();
            try{
                java.sql.Statement s = conectar.createStatement();
                ResultSet rs = s.executeQuery("SELECT id_materia, nombreing, unidad, cantidad, preciototal FROM materia WHERE id_materia='"+id+"'");
                if(rs.next()){
                    txtidmateria.setText(rs.getString(1));
                    txtnombrei.setText(rs.getString(2));
                    txtunidad.setText(rs.getString(3));
                    txtcantidad.setText(rs.getString(4));
                    txtpreciototal.setText(rs.getString(5));
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "El registro "+id+"no existe");
                }
            } catch (SQLException ex) {    
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtbuscar1.setText("");
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void txtbuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar2ActionPerformed

    private void btnbuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar2ActionPerformed
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            String id = this.txtbuscar2.getText();
            try{
                java.sql.Statement s = conectar.createStatement();
                ResultSet rs = s.executeQuery("SELECT id_producto, nombreproducto, categoria, peso, precio, existencia FROM producto WHERE id_producto='"+id+"'");
                if(rs.next()){
                    txtidproducto.setText(rs.getString(1));
                    txtnombreproducto.setText(rs.getString(2));
                    txtcategoria.setText(rs.getString(3));
                    txtpeso.setText(rs.getString(4));
                    txtprecio.setText(rs.getString(5));
                    txtexistencia.setText(rs.getString(6));
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "El registro"+id+"no existe");
                }
            } catch (SQLException ex) {    
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtbuscar2.setText("");
    }//GEN-LAST:event_btnbuscar2ActionPerformed

    private void txtbuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar3ActionPerformed

    private void btnbuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar3ActionPerformed
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            String id = this.txtbuscar3.getText();
            try{
                java.sql.Statement s = conectar.createStatement();
                ResultSet rs = s.executeQuery("SELECT id_pedido, id_clientee, direccionn, base, fecha, totalpedido FROM pedido WHERE id_pedido='"+id+"'");
                if(rs.next()){
                    txtidpedido.setText(rs.getString(1));
                    txtidcliente.setText(rs.getString(2));
                    txtdireccionn.setText(rs.getString(3));
                    txtbaseim.setText(rs.getString(4));
                    txtfecha.setText(rs.getString(5));
                    txttotalpedido.setText(rs.getString(6));
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "El registro "+id+"no existe");
                }
            } catch (SQLException ex) {    
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtbuscar3.setText("");
    }//GEN-LAST:event_btnbuscar3ActionPerformed

    private void btnguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar1ActionPerformed
        try {                                           
            Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            String guardar = "INSERT INTO materia(id_materia, nombreing, unidad, cantidad, preciototal) VALUES(?,?,?,?,?)";
            java.sql.PreparedStatement pst = conectar.prepareStatement(guardar);
            pst.setString(1, txtidmateria.getText());
            pst.setString(2, txtnombrei.getText());
            pst.setString(3, txtunidad.getText());
            pst.setString(4, txtcantidad.getText());
            pst.setString(5, txtpreciototal.getText());
             
            int i = pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "La materia prima ha sido guardado correctamente");
                tablaDatos1();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
            }
             
        } catch (SQLException ex) {
           Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } 
        txtidmateria.setText("");
        txtnombrei.setText("");
        txtunidad.setText("");
        txtcantidad.setText("");
        txtpreciototal.setText("");
    }//GEN-LAST:event_btnguardar1ActionPerformed

    private void btneliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar1ActionPerformed
        int ax = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea eliminar los datos?"+txtid.getText()+"?");
        if(ax==JOptionPane.YES_OPTION){
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try{
            java.sql.Statement s = conectar.createStatement();
            int i = s.executeUpdate("DELETE FROM materia WHERE id_materia='"+txtidmateria.getText()+"'");
            if(i==1){
                txtidmateria.setText("");
                txtnombrei.setText("");
                txtunidad.setText("");
                txtcantidad.setText("");
                txtpreciototal.setText("");
            }
            
            if(i>0){
                JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado con éxito");
                tablaDatos1();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar los datos");
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btneliminar1ActionPerformed

    private void btnguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar2ActionPerformed
        try {                                           
            Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String guardar = "INSERT INTO producto(id_producto, nombreproducto, categoria, peso, precio, existencia) VALUES(?,?,?,?,?,?)";
            java.sql.PreparedStatement pst = conectar.prepareStatement(guardar);
            pst.setString(1, txtidproducto.getText());
            pst.setString(2, txtnombreproducto.getText());
            pst.setString(3, txtcategoria.getText());
            pst.setString(4, txtpeso.getText());
            pst.setString(5, txtprecio.getText());
            pst.setString(6, txtexistencia.getText());
            
            int i = pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "El producto ha sido guardado correctamente");
                tablaDatos2();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
            }
             
        } catch (SQLException ex) {
           Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } 
        txtidproducto.setText("");
        txtnombreproducto.setText("");
        txtcategoria.setText("");
        txtpeso.setText("");
        txtprecio.setText("");
        txtexistencia.setText("");
    }//GEN-LAST:event_btnguardar2ActionPerformed

    private void btnguardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar3ActionPerformed
       try {                                           
            Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            String guardar = "INSERT INTO pedido(id_pedido, id_clientee, direccionn, base, fecha, totalpedido) VALUES(?,?,?,?,?,?)";
            java.sql.PreparedStatement pst = conectar.prepareStatement(guardar);
            pst.setString(1, txtidpedido.getText());
            pst.setString(2, txtidcliente.getText());
            pst.setString(3, txtdireccionn.getText());
            pst.setString(4, txtbaseim.getText());
            pst.setString(5, txtfecha.getText());
            pst.setString(6, txttotalpedido.getText());
             
            int i = pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "El pedido ha sido guardado correctamente");
                tablaDatos3();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
            }
             
        } catch (SQLException ex) {
           Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } 
        txtidpedido.setText("");
        txtidcliente.setText("");
        txtdireccionn.setText("");
        txtbaseim.setText("");
        txtfecha.setText("");
        txttotalpedido.setText("");
    }//GEN-LAST:event_btnguardar3ActionPerformed

    private void btneliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar2ActionPerformed
        int ax = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea eliminar los datos?"+txtid.getText()+"?");
        if(ax==JOptionPane.YES_OPTION){
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try{
            java.sql.Statement s = conectar.createStatement();
            int i = s.executeUpdate("DELETE FROM producto WHERE id_producto='"+txtidproducto.getText()+"'");
            if(i==1){
                txtidproducto.setText("");
                txtnombreproducto.setText("");
                txtcategoria.setText("");
                txtpeso.setText("");
                txtprecio.setText("");
                txtexistencia.setText("");
            }
            
            if(i>0){
                JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado con éxito");
                tablaDatos2();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar los datos");
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btneliminar2ActionPerformed

    private void btneliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar3ActionPerformed
        int ax = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea eliminar los datos?"+txtid.getText()+"?");
        if(ax==JOptionPane.YES_OPTION){
        Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try{
            java.sql.Statement s = conectar.createStatement();
            int i = s.executeUpdate("DELETE FROM pedido WHERE id_pedido='"+txtidpedido.getText()+"'");
            if(i==1){
                txtidpedido.setText("");
                txtidcliente.setText("");
                txtdireccionn.setText("");
                txtbaseim.setText("");
                txtfecha.setText("");
                txttotalpedido.setText("");
            }
            
            if(i>0){
                JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado con éxito");
                tablaDatos3();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar los datos");
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btneliminar3ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        Connection conectar = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        String id = this.txtbuscar.getText();
        try{
            java.sql.Statement s = conectar.createStatement();
            ResultSet rs = s.executeQuery("SELECT id_cliente, nombre, apellido, telefono, direccion, correo FROM cliente WHERE id_cliente='"+id+"'");
            if(rs.next()){
                txtid.setText(rs.getString(1));
                txtnombre.setText(rs.getString(2));
                txtapellido.setText(rs.getString(3));
                txttelefono.setText(rs.getString(4));
                txtdireccion.setText(rs.getString(5));
                txtcorreo.setText(rs.getString(6));

            }
            else{
                JOptionPane.showMessageDialog(null, "El registro "+id+"no existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtbuscar.setText("");

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        try {
            Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
            String guardar = "INSERT INTO cliente(id_cliente, nombre, apellido, telefono, direccion, correo) VALUES(?,?,?,?,?,?)";
            java.sql.PreparedStatement pst = conectar.prepareStatement(guardar);
            pst.setString(1, txtid.getText());
            pst.setString(2, txtnombre.getText());
            pst.setString(3, txtapellido.getText());
            pst.setString(4, txttelefono.getText());
            pst.setString(5, txtdireccion.getText());
            pst.setString(6, txtcorreo.getText());

            int i = pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "El cliente ha sido guardado correctamente");
                tablaDatos();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtid.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txttelefono.setText("");
        txtdireccion.setText("");
        txtcorreo.setText("");

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        Connection conectar = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            String sql = "UPDATE cliente SET id_cliente=?,"+"nombre=?,"
            +"apellido=?,"
            +"telefono=?,"
            +"direccion=?,"
            +"correo=?"
            +"WHERE id_cliente='"+txtid.getText()+"'";

            java.sql.PreparedStatement pst = conectar.prepareStatement(sql);
            pst.setString(1, txtid.getText());
            pst.setString(2, txtnombre.getText());
            pst.setString(3, txtapellido.getText());
            pst.setString(4, txttelefono.getText());
            pst.setString(5, txtdireccion.getText());
            pst.setString(6, txtcorreo.getText());

            int n = pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "El cliente ha sido modficado con éxito");
                tablaDatos();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al modificar los datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtid.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txttelefono.setText("");
        txtdireccion.setText("");
        txtcorreo.setText("");
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int ax = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea eliminar los datos?"+txtid.getText()+"?");
        if(ax==JOptionPane.YES_OPTION){
            Connection conectar = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }

            try{
                java.sql.Statement s = conectar.createStatement();
                int i = s.executeUpdate("DELETE FROM cliente WHERE id_cliente='"+txtid.getText()+"'");
                if(i==1){
                    txtid.setText("");
                    txtnombre.setText("");
                    txtapellido.setText("");
                    txttelefono.setText("");
                    txtdireccion.setText("");
                    txtcorreo.setText("");
                }

                if(i>0){
                    JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado con éxito");
                    tablaDatos();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al eliminar los datos");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btneliminarActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked

    }//GEN-LAST:event_tabla1MouseClicked

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnbuscarconsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarconsulta2ActionPerformed
        txtarea.setText("");                                                          //Numeros movistar
        txtarea.append("Clientes con línea Movistar: \n\n");
        Connection conectar = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{
            java.sql.Statement s = conectar.createStatement();
            ResultSet rs = s.executeQuery("SELECT nombre, telefono FROM cliente WHERE telefono LIKE '0414%' OR telefono LIKE '0424%' ORDER BY nombre");
            while (rs.next()) {
                String n = rs.getString("nombre");
                String t = rs.getString("telefono");
                txtarea.append("-> "+n+":  "+t+"\n");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btnbuscarconsulta2ActionPerformed

    private void btnbuscarconsulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarconsulta3ActionPerformed
        txtarea.setText("");                                                          //Promedio de ventas San Diego y Valencia
        txtarea.append("Promedio de Ventas: \n\n");
        Connection conectar = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{
            java.sql.Statement s = conectar.createStatement();
            ResultSet rs = s.executeQuery("SELECT AVG(totalpedido) AS encargos_promedio FROM pedido WHERE direccionn = 'San Diego' OR direccionn = 'Valencia'");
            while (rs.next()) {
                String ep = rs.getString("encargos_promedio");
                
                txtarea.append("-> Promedio:  "+ep+"$\n");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarconsulta3ActionPerformed

    private void btnbuscarconsulta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarconsulta4ActionPerformed
        txtarea.setText("");                                                          //Listados de pedidos realizados por un cliente
        txtarea.append("Listados de pedidos realizados por el cliente:\n\n");
        Connection conectar = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String id = this.txtconsulta.getText();
        
        try{
            java.sql.Statement s = conectar.createStatement();
            ResultSet rs = s.executeQuery("SELECT id_pedido, id_clientee FROM pedido WHERE id_clientee='"+id+"'");
            
            while (rs.next()) {
                String idp = rs.getString("id_pedido");
                txtarea.append("-> N° de pedido:  "+idp+"°\n");
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarconsulta4ActionPerformed

    private void btnbuscarconsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarconsulta1ActionPerformed
        txtarea.setText("");                                                          //Precios menores a20$
        txtarea.append("Precio de productos menores 20$:\n\n");
        Connection conectar = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{
            java.sql.Statement s = conectar.createStatement();
            ResultSet rs = s.executeQuery("SELECT nombreproducto, precio FROM producto WHERE precio <= '20'");
            while (rs.next()) {
                String p = rs.getString("nombreproducto");
                String pr = rs.getString("precio");
                txtarea.append("-> "+p+":  "+pr+"$\n");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarconsulta1ActionPerformed

    private void btnbuscarconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarconsultaActionPerformed
        txtarea.setText("");                                                      //Consulta de todos los clientes registrados
        txtarea.append("Nombre de todos los clientes:\n\n");
        Connection conectar = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{
            java.sql.Statement s = conectar.createStatement();
            ResultSet rs = s.executeQuery("SELECT nombre FROM cliente ORDER BY nombre");
            while (rs.next()) {
                String n = rs.getString(1);
                txtarea.append("-> "+n+"\n");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarconsultaActionPerformed

    private void txtconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JButton btnbuscar2;
    private javax.swing.JButton btnbuscar3;
    private javax.swing.JButton btnbuscarconsulta;
    private javax.swing.JButton btnbuscarconsulta1;
    private javax.swing.JButton btnbuscarconsulta2;
    private javax.swing.JButton btnbuscarconsulta3;
    private javax.swing.JButton btnbuscarconsulta4;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminar1;
    private javax.swing.JButton btneliminar2;
    private javax.swing.JButton btneliminar3;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardar1;
    private javax.swing.JButton btnguardar2;
    private javax.swing.JButton btnguardar3;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnmodificar1;
    private javax.swing.JButton btnmodificar2;
    private javax.swing.JButton btnmodificar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel l;
    private javax.swing.JLabel label;
    private javax.swing.JLabel llablele;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    private javax.swing.JTable tabla4;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtbaseim;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtbuscar1;
    private javax.swing.JTextField txtbuscar2;
    private javax.swing.JTextField txtbuscar3;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtconsulta;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdireccionn;
    private javax.swing.JTextField txtexistencia;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidmateria;
    private javax.swing.JTextField txtidpedido;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombrei;
    private javax.swing.JTextField txtnombreproducto;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtpreciototal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttotalpedido;
    private javax.swing.JTextField txtunidad;
    // End of variables declaration//GEN-END:variables
}
