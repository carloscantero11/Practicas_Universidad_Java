
import com.formdev.flatlaf.FlatIntelliJLaf;
import compilerTools.CodeBlock;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import compilerTools.Directory;
import compilerTools.ErrorLSSL;
import compilerTools.Functions;
import compilerTools.Grammar;
import compilerTools.Production;
import compilerTools.TextColor;
import compilerTools.Token;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Compilador extends javax.swing.JFrame {

    private String title;
    private Directory directorio;
    private ArrayList<Token> tokens;   //Aqui guardaremos nuestros tokens
    private ArrayList<ErrorLSSL> errors;  //Aqui guardaremos los errores  (lexico, sintactico, semantico, logico)
    private ArrayList<TextColor> textsColor;   //Aqui guardaremos los colores de las palabras reservadas
    private Timer timerKeyReleased;     //Sirve para ejecutar una una funcion que servira para colorear las palabras de nuestro codigo
    private ArrayList<Production> identProd;      //Extrae los identificadores del análisis sintactico
    private HashMap<String, String> identificadores;    //Aqui guardaremos nuestros identificadores
    private boolean codeHasBeenCompiled = false;     //Variable Aqui nos indica si nuestro compilador a sido compilado

  
    public Compilador() {
        initComponents();
        init();
    }

    private void init() {
        title = "RoboMind";
        setLocationRelativeTo(null);
        setTitle(title);
        directorio = new Directory(this, jtpCode, title, ".robo");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                directorio.Exit();
                System.exit(0);
            }
        });
        Functions.setLineNumberOnJTextComponent(jtpCode);
        timerKeyReleased = new Timer((int) (1000 * 0.3), (ActionEvent e) -> {
            timerKeyReleased.stop();
            colorAnalysis();
        });
        Functions.insertAsteriskInName(this, jtpCode, () -> {
            timerKeyReleased.restart();
        });
        tokens = new ArrayList<>();
        errors = new ArrayList<>();
        textsColor = new ArrayList<>();
        identProd = new ArrayList<>();
        identificadores = new HashMap<>();
        Functions.setAutocompleterJTextComponent(new String[]{"número", "color", "adelante", "atrás",
            "izquierda", "derecha", "norte", "sur", "este", "oeste", "pintar", "detenerPintar",
            "tomar", "poner", "lanzarMoneda"}, jtpCode, () -> {
            timerKeyReleased.restart();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        buttonsFilePanel = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        panelButtonCompilerExecute = new javax.swing.JPanel();
        btnCompilar = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOutputConsole = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTokens = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        rootPanel.setBackground(new java.awt.Color(141, 141, 170));

        buttonsFilePanel.setBackground(new java.awt.Color(141, 141, 170));

        btnAbrir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/abrir-caja.png"))); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.setBorderPainted(false);
        btnAbrir.setContentAreaFilled(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/abrir-caja1.png"))); // NOI18N
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agregar-archivo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setDefaultCapable(false);
        btnNuevo.setFocusPainted(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agregar-archivo1.png"))); // NOI18N
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/salvar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/salvar1.png"))); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/disquete.png"))); // NOI18N
        btnGuardarC.setText("Guardar como");
        btnGuardarC.setBorderPainted(false);
        btnGuardarC.setContentAreaFilled(false);
        btnGuardarC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/disquete1.png"))); // NOI18N
        btnGuardarC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsFilePanelLayout = new javax.swing.GroupLayout(buttonsFilePanel);
        buttonsFilePanel.setLayout(buttonsFilePanelLayout);
        buttonsFilePanelLayout.setHorizontalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsFilePanelLayout.setVerticalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnGuardarC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpCode.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jtpCode);

        panelButtonCompilerExecute.setBackground(new java.awt.Color(141, 141, 170));

        btnCompilar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCompilar.setText("Compilar");
        btnCompilar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(3, 3, 44)));
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        btnEjecutar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(3, 3, 44)));
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonCompilerExecuteLayout = new javax.swing.GroupLayout(panelButtonCompilerExecute);
        panelButtonCompilerExecute.setLayout(panelButtonCompilerExecuteLayout);
        panelButtonCompilerExecuteLayout.setHorizontalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addComponent(btnCompilar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelButtonCompilerExecuteLayout.setVerticalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCompilar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jtaOutputConsole.setEditable(false);
        jtaOutputConsole.setBackground(new java.awt.Color(204, 204, 255));
        jtaOutputConsole.setColumns(20);
        jtaOutputConsole.setRows(5);
        jScrollPane2.setViewportView(jtaOutputConsole);

        tblTokens.setBackground(new java.awt.Color(204, 204, 255));
        tblTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Componente léxico", "Lexema", "[Línea, Columna]"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblTokens);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cerrado.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cerrado (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Traductores e Interpretadores");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rootPanelLayout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(rootPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonsFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(buttonsFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(rootPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        directorio.New();
        clearFields();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (directorio.Open()) {
            colorAnalysis();
            clearFields();
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (directorio.Save()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        if (directorio.SaveAs()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        if (getTitle().contains("*") || getTitle().equals(title)) {
            if (directorio.Save()) {
                compile();
            }
        } else {
            compile();
        }
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        btnCompilar.doClick();
        if (codeHasBeenCompiled) {
            if (errors.size() > 0) {
                JOptionPane.showMessageDialog(null, "No se puede ejecutar el código ya que se encontró uno o más errores",
                        "Error en la compilación", JOptionPane.ERROR_MESSAGE);
            } else {
                CodeBlock codeBlock = Functions.splitCodeInCodeBlocks(tokens, "{", "}", ";");
                System.out.println(codeBlock);
                ArrayList<String> blocksOfCode = codeBlock.getBlocksOfCodeInOrderOfExec();
                System.out.println(blocksOfCode);
                executeCode(blocksOfCode, 1);

            }
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void executeCode(ArrayList<String> blocksOfCode, int repeats) {
        for (int j = 1; j <= repeats; j++) {
            int repeatCode = -1;
            for (int i = 0; i < blocksOfCode.size(); i++) {
                String blockOfCode = blocksOfCode.get(i);
                if (repeatCode != -1) {
                    int[] posicionMarcador = CodeBlock.getPositionOfBothMarkers(blocksOfCode, blockOfCode);
                    executeCode(new ArrayList<>(blocksOfCode.subList(posicionMarcador[0], posicionMarcador[1])), repeatCode);
                    repeatCode = -1;
                    i = posicionMarcador[1];
                } else {
                    String[] sentences = blockOfCode.split(";");
                    for (String sentence : sentences) {
                        sentence = sentence.trim();
                        // Llamar código de ejecución (arduino, gráfico, etc)
                        if (sentence.startsWith("pintar")) {
                            String parametro;
                            if (sentence.contains("$")) {
                                parametro = identificadores.get(sentence.substring(9, sentence.length() - 2));
                            } else {
                                parametro = sentence.substring(9, sentence.length() - 2);
                            }
                            System.out.println("Pintando de color " + parametro + "...");
                        } else if (sentence.startsWith("izquierda")) {
                            System.out.println("Moviéndose a la izquierda...");
                        } else if (sentence.startsWith("derecha")) {
                            System.out.println("Moviéndose a la derecha...");
                        } else if (sentence.startsWith("adelante")) {
                            System.out.println("Moviéndose hacia adelante");
                        } else if (sentence.contains("-->")) {
                            String[] identComp = sentence.split(" ");
                            System.out.println("Declarando identificador " + identComp[1] + " igual a " + identComp[3]);
                        } else if (sentence.startsWith("atrás")) {
                            System.out.println("Moviéndose hacia atrás");
                        } else if (sentence.startsWith("repetir")) {
                            String parametro;
                            if (sentence.contains("$")) {
                                parametro = identificadores.get(sentence.substring(10, sentence.length() - 2));
                            } else {
                                parametro = sentence.substring(10, sentence.length() - 2);
                            }
                            repeatCode = Integer.parseInt(parametro);
                        }
                    }
                }
            }
        }
    }

    private void compile() {
        clearFields();
        lexicalAnalysis();
        fillTableTokens();
        syntacticAnalysis();
        semanticAnalysis();
        printConsole();
        codeHasBeenCompiled = true;
    }

    private void lexicalAnalysis() {
        // Aqui extraeremos los TOKENS...
        Lexer lexer;
        try {
            File codigo = new File("code.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jtpCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexer = new Lexer(entrada);
            while (true) {
                Token token = lexer.yylex();
                if (token == null) {
                    break;
                }
                tokens.add(token);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
    }

    private void syntacticAnalysis() {
        Grammar gramatica = new Grammar(tokens, errors);

        // Aqui se van a deshabilitar mensajes y validaciones 
        gramatica.disableMessages();
        gramatica.disableValidations();

        //Aqui la eliminación de errores
        gramatica.delete(new String[]{"ERROR", "ERROR_1", "ERROR_2"}, 14);

        // Agrupación de valores 
        gramatica.group("VALOR", "(NUMERO | COLOR)", true);

        // Declaración de variables 
        gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR OP_ASIG VALOR", true, identProd);
        gramatica.group("VARIABLE", "TIPO_DATO OP_ASIG VALOR", true,
                1, " × Error sintáctico {}: falta el identificador en la declaración de variable [#, %]");

        gramatica.finalLineColumn();

        gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR OP_ASIG", true,
                2, " × Error sintáctico {}: falta el valor en la declaración de variable [#, %]");

        gramatica.initialLineColumn();

        gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR VALOR", true,
                3, " × Error sintáctico {}: falta el operador de asignación en la declaración de variable [#, %]", 2);
        gramatica.group("VARIABLE", "IDENTIFICADOR OP_ASIG VALOR", true,
                4, " × Error sintáctico {}: falta el tipo de dato en la declaración de variable [#, %]");

        // Aqui se eliminaran los tipos de datos y operadores de asignación 
        gramatica.delete("TIPO_DATO",
                5, " × Error sintáctico {}: el tipo de dato no está en la declaración de una variable [#, %]");
        gramatica.delete("OP_ASIG",
                6, " × Error sintáctico {}: el operador de asignación no está en la declaración de una variable [#, %]");

        // Aqui la agrupación de identificadores como valor y definición de parámetros 
        gramatica.group("VALOR", "IDENTIFICADOR", true);
        gramatica.group("PARAMETROS", "VALOR (COMA VALOR)+");

        // Agrupación de funciones
        gramatica.group("FUNCION", "(MOVIMIENTO | PINTAR | DETENER_PINTAR |"
                + " TOMAR | LANZAR_MONEDA | VER | DETENER_REPETIR )", true);
        gramatica.group("FUNCION_COMP", "FUNCION PARENTESIS_A (VALOR | PARAMETROS)? PARENTESIS_C", true);
        gramatica.group("FUNCION_COMP", "FUNCION (VALOR | PARAMETROS)? PARENTESIS_C", true,
                7, " × Error sintáctico {}: falta el paréntesis que abre en la función [#, %]");
        gramatica.finalLineColumn();
        gramatica.group("FUNCION_COMP", "FUNCION PARENTESIS_A (VALOR | PARAMETROS)", true,
                8, " × Error sintáctico {}: falta el paréntesis que cierra en la función [#, %]");

        gramatica.initialLineColumn();

        // Aqui la eliminación de funciones mal declaradas 
        gramatica.delete("FUNCION",
                9, " × Error sintáctico {}: La función no está declarada correctamente [#, %]");

        // Expresiones lógicas 
        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
            gramatica.group("EXP_LOGICA", "(EXP_LOGICA | FUNCION_COMP) (OP_LOGICO (EXP_LOGICA | FUNCION_COMP))+");
            gramatica.group("EXP_LOGICA", "PARENTESIS_A (EXP_LOGICA | FUNCION_COMP) PARENTESIS_C", true);
        });

        // Eliminación de operadores lógicos 
        gramatica.delete("OP_LOGICO",
                10, " × Error sintáctico {}: El operador lógico no está contenido en una expresión [#, %]");

        // Agrupación de expresiones lógicas como valores y parámetros
        gramatica.group("VALOR", "EXP_LOGICA", true);
        gramatica.group("PARAMETROS", "VALOR (COMA VALOR)+");

        /* Agrupación de estructuras de control */
        gramatica.group("EST_CONTROL", "(REPETIR | ESTRUCTURA_SI)", true);
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL (VALOR | PARAMETROS)", true);
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A PARENTESIS_C", true);
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A (VALOR | PARAMETROS) PARENTESIS_C", true);
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL (VALOR | PARAMETROS) PARENTESIS_C", true,
                11, " × Error sintáctico {}: falta el paréntesis que abre en la estructura [#, %]");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_C", true,
                12, " × Error sintáctico {}: falta el paréntesis que abre en la estructura [#, %]");
        gramatica.finalLineColumn();
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A (VALOR | PARAMETROS)", true,
                13, " × Error sintáctico {}: falta el paréntesis que cierra en la estructura [#, %]");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A", true,
                14, " × Error sintáctico {}: falta el paréntesis que cierra en la estructura [#, %]");

        gramatica.initialLineColumn();

        /* Eliminación de estructuras de control mal declaradas */
        gramatica.delete("EST_CONTROL",
                15, " × Error sintáctico {}: La estructura de control no está declarada correctamente [#, %]");

        /* Eliminación de paréntesis */
        gramatica.delete(new String[]{"PARENTESIS_A", "PARENTESIS_C"},
                16, " × Error sintáctico {}: El paréntesis [] no está contenido en una agrupación [#, %]");

        /* Eliminación de valores */
        gramatica.delete("VALOR",
                17, " × Error sintáctico {}: El valor no está contenido en una función o estructura de control [#, %]");

        gramatica.finalLineColumn();

        /* Verificación de punto y coma al final de la sentencia */
        // Identificadores
        gramatica.group("VARIABLE_PC", "VARIABLE PUNTO_COMA", true);
        gramatica.group("VARIABLE_PC", "VARIABLE", true,
                18, " × Error sintáctico {}: falta el punto y coma al final de la declaración de variable [#, %]");
        // Funciones
        gramatica.group("FUNCION_COMP_PC", "FUNCION_COMP PUNTO_COMA", true);
        gramatica.group("FUNCION_COMP_PC", "FUNCION_COMP", true,
                19, " × Error sintáctico {}: falta el punto y coma al final de la declaración de función [#, %]");

        gramatica.initialLineColumn();

        /* Eliminación de punto y coma */
        gramatica.delete("PUNTO_COMA",
                20, " × Error sintáctico {}: el punto y coma no está al final de una sentencia [#, %]");

        /* Agrupación de sentencias */
        gramatica.group("SENTENCIAS", "(VARIABLE_PC | FUNCION_COMP_PC)+");
        /* Estructuras de control completas */
        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP LLAVE_A (SENTENCIAS)? LLAVE_C", true);
            gramatica.group("SENTENCIAS", "(SENTENCIAS | EST_CONTROL_COMP_LASLC)+");
        });

        /* Estructuras de control incompletas */
        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
            gramatica.initialLineColumn();

            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP (SENTENCIAS)? LLAVE_C", true,
                    21, " × Error sintáctico {}: falta la llave que abre en la estructura de control [#, %]");

            gramatica.finalLineColumn();

            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP LLAVE_A SENTENCIAS",
                    22, " × Error sintáctico {}: falta la llave que cierra en la estructura de control [#, %]");
            gramatica.group("SENTENCIAS", "(SENTENCIAS | EST_CONTROL_COMP_LASLC)+");
        });

        /* Eliminación de llaves */
        gramatica.delete(new String[]{"LLAVE_A", "LLAVE_C"},
                23, " × Error sintáctico {}: la llave no está contenida en una agrupación [#, %]");

        /* Aqui se mostraran las gramáticas */
        
    }

    private void semanticAnalysis() {   
        HashMap<String, String> identDataType = new HashMap<>();    //Analisis semantico
        identDataType.put("color", "COLOR");
        identDataType.put("número", "NUMERO");
        for (Production id : identProd) {
            if (!identDataType.get(id.lexemeRank(0)).equals(id.lexicalCompRank(-1))) {
                errors.add(new ErrorLSSL(1, " × Error semántico {}: valor no compatible con el tipo de dato [#, %]", id, true));
            }
            if (id.lexicalCompRank(-1).equals("COLOR") && !id.lexemeRank(-1).matches("#[0-9a-fA-F]+")) {
                errors.add(new ErrorLSSL(2, " × Error lógico {}: el color no es un número hexadecimal [#, %]", id, false));
            }
            identificadores.put(id.lexemeRank(1), id.lexemeRank(-1));
        }
    }

    private void colorAnalysis() {
        /* Limpiar el arreglo de colores */
        textsColor.clear();
        /* Extraer rangos de colores */
        LexerColor lexer;
        try {
            File codigo = new File("color.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jtpCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexer = new LexerColor(entrada);
            while (true) {
                TextColor textColor = lexer.yylex();
                if (textColor == null) {
                    break;
                }
                textsColor.add(textColor);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
        Functions.colorTextPane(textsColor, jtpCode, new Color(40, 40, 40));
    }

    private void fillTableTokens() {
        tokens.forEach(token -> {
            Object[] data = new Object[]{token.getLexicalComp(), token.getLexeme(), "[" + token.getLine() + ", " + token.getColumn() + "]"};
            Functions.addRowDataInTable(tblTokens, data);
        });
    }

    private void printConsole() {
        int sizeErrors = errors.size();
        if (sizeErrors > 0) {
            Functions.sortErrorsByLineAndColumn(errors);
            String strErrors = "\n";
            for (ErrorLSSL error : errors) {
                String strError = String.valueOf(error);
                strErrors += strError + "\n";
            }
            jtaOutputConsole.setText("Compilación terminada...\n" + strErrors + "\nLa compilación terminó con errores...");
        } else {
            jtaOutputConsole.setText("Compilación terminada...");
        }
        jtaOutputConsole.setCaretPosition(0);
    }

    private void clearFields() {
        Functions.clearDataInTable(tblTokens);
        jtaOutputConsole.setText("");
        tokens.clear();
        errors.clear();
        identProd.clear();
        identificadores.clear();
        codeHasBeenCompiled = false;
    }

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
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatIntelliJLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("LookAndFeel no soportado: " + ex);
            }
            new Compilador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel buttonsFilePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jtaOutputConsole;
    private javax.swing.JTextPane jtpCode;
    private javax.swing.JPanel panelButtonCompilerExecute;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTable tblTokens;
    // End of variables declaration//GEN-END:variables
}
