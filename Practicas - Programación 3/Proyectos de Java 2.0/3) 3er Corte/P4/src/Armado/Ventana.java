package Armado;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener,KeyListener{
    private JLabel l1,l2,l3,l4;
    private JTextField t1,t2,t3;
    private JButton b1,b2;
    private JTextArea a1;
    private JScrollPane sp;
    private GridBagConstraints gbc;
    private Insets inse;
    Container c;
    
    public Ventana(){
        super("Armado de Enteros");
        this.setSize(350, 290);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        c = this.getContentPane();
        c.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        inse = new Insets(1,1,2,2);
        gbc.insets = inse;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        
        l1= new JLabel("Digitos de A:");
        t1 = new JTextField(5);
        gbc.gridy = 0;
        gbc.gridx = 0;
        c.add(l1,gbc);
        gbc.gridy = 0;
        gbc.gridx = 1;
        c.add(t1,gbc);
        
        l2= new JLabel("Digitos de B:");
        t2 = new JTextField(5);
        gbc.gridy = 1;
        gbc.gridx = 0;
        c.add(l2,gbc);
        gbc.gridy = 1;
        gbc.gridx = 1;
        c.add(t2,gbc);
        
        l3= new JLabel("Número:");
        t3 = new JTextField(9);
        gbc.gridy = 2;
        gbc.gridx = 0;
        c.add(l3,gbc);
        gbc.gridy = 2;
        gbc.gridx = 1;
        c.add(t3,gbc);
        
        b1 = new JButton("Procesar");
        b2 = new JButton("Borrar");
        gbc.gridy = 3;
        gbc.gridx = 0;
        c.add(b1,gbc);
        gbc.gridy = 3;
        gbc.gridx = 1;
        c.add(b2,gbc);
        
        l4= new JLabel("Salida resultados:");
        a1 = new JTextArea(5,9);
        a1.setEnabled(false);
        sp = new JScrollPane(a1);
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        gbc.gridwidth = 4;
        gbc.gridy = 4;
        gbc.gridx = 0;
        c.add(l4,gbc);
        gbc.gridheight = 4;
        gbc.gridwidth = 7;
        gbc.gridy = 5;
        gbc.gridx = 0;
        c.add(sp,gbc);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        
        t1.addKeyListener(this);
        t2.addKeyListener(this);
        t3.addKeyListener(this);
        
        
        t1.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e){
                t1.selectAll();
            }
        });
        t2.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e){
                t2.selectAll();
            }
        });
        t3.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e){
                t3.selectAll();
            }
        });
        
        public void actionPerformed(ActionEvent e){
            long mayor, menor, cantMa=0, cantMe=0,poMa,poMe;
            long diMa,diMe,inte=0,temp,numero;
            
            if(e.getSource()==b1){
                if((t1.getText().length()!=0)&&(t2.getText().length()!=0)){
                    mayor = Integer.parseInt(t1.getText());
                    menor = Integer.parseInt(t2.getText());
                    temp = mayor;
                    do{
                        temp/=10;
                        cantMa+=1;
                    }while (temp!=0);
                    temp = menor;
                    do{
                        temp/=10;
                        cantMe +=1;
                    }while(temp!=0);
                    if(cantMa<cantMe){
                        temp = mayor;
                        mayor = menor;
                        menor = temp;
                        poMa = (int)Math.pow(10, cantMa-1);
                        poMe = (int)Math.pow(10, cantMe-1);
                    }
                    else{
                        poMa = (int)Math.pow(10, cantMa-1);
                        poMe = (int)Math.pow(10, cantMe-1);
                    }
                    do{
                        diMa = mayor/poMa;
                        if(poMe!=0){
                            diMe = menor/poMe;
                            diMa = diMa*10+diMe;
                            inte = inte*100+diMa;
                            menor%=poMe;
                            poMe/=10;
                        }
                        else{
                            inte=inte*10+diMa;
                        }
                        mayor&=poMa;
                        poMa/=10;
                    }while(poMa!=0);
                    a1.append(t1.getText()+"y"+t2.getText());
                }
                else{
                    JOptionPane.showMessageDialog(null,"Faltan datos de entrada");
                }
            }else if(e.getSource()==b2){
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t1.requestFocus();
            }else if(e.getSource()==b2){
                t2.requestFocus();
            }
                    
                    
                    
                    
                    
        }
        
        public void keyPresser(KeyEvent e){}
        public void keyReleased(KeyEvent e){}
        
        public void KeyTyped(KeyEvent e){
            if(e.getSource()==t1){
                char c = e.getKeyChar();
                if((c<'0')||(c>'9')) e.consume();
            }else if(e.getSource()==t2){
                char c = e.getKeyChar();
                if((c<'0')||(c>'9')) e.consume();
            }
        }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
    }
    
    
    
}
