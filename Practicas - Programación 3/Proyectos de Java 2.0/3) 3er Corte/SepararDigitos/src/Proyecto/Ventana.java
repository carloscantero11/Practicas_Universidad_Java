package Proyecto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame{
    
    private JLabel l1, l2, l3;
    private JTextField t1,t2,t3;
    private JButton b1,b2,b3;
    private JPanel p1,p2,p3;
    Container c;
    
    
    public Ventana(){
        this.setTitle("Separado de números");
        setSize(200,140);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        c = getContentPane();
        
        l1 = new JLabel("Número:");
        l2 = new JLabel("Digito 1:");
        l3 = new JLabel("Digito 2:");
        t1 = new JTextField(4);
        t2 = new JTextField(4);
        t3 = new JTextField(4);
        b1 = new JButton("Separar");
        b2 = new JButton("Borrar"); 
        p1 = new JPanel(new GridLayout(3,2));
        p2 = new JPanel(new GridLayout(1,2));
        p3 = new JPanel(new FlowLayout());
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p2.add(b1);
        p2.add(b2);
        p3.add(p1);
        p3.add(p2);
        c.add(p3);
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int valor, d1,d2;
                
                valor = Integer.parseInt(t1.getText());
                d1 = valor/10;
                d2 = valor%10;
                t2.setText(""+d1);
                t3.setText(""+d2);
            }
        });
        
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t1.requestFocus();
            }
        });
    }
    
}
