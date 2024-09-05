package PVentana;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener{
    
    private JTextField tf;
    private JButton b;
    private JPanel p;
    private int cont=0;
    
    public Ventana(){
        super("Demo Ventana");
        setSize(300,130);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container c = getContentPane();
        
        tf = new JTextField("0",10);
        tf.setEditable(false);
        b = new JButton("Pulsa para incrementar");
        p = new JPanel(new GridLayout(2,1,10,10));
        p.add(tf);
        p.add(b);
        
        c.setLayout(new FlowLayout());
        c.add(p);
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        cont ++;
        tf.setText(""+cont);
    }
    
}
