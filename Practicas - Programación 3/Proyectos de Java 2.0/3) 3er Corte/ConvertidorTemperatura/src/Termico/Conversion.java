package Termico;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Conversion extends JFrame implements ActionListener{
    
    private JLabel l1,l2;
    private JTextField t1,t2;
    private JPanel p1,p2,p3;
    private JButton b1;
    
    public Conversion(){
        super("Convertidor Térmico");
        this.setSize(250,100);
        Container c = getContentPane();
        l1 = new JLabel("Centigrados: ");
        l2 = new JLabel("Farenheit: ");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Cerrar");
        p1 = new JPanel(new GridLayout(2,2));
        p2 = new JPanel(new FlowLayout());
        p3 = new JPanel(new GridLayout(2,1));
        p1.add(l1); p1.add(t1); p1.add(l2); p1.add(t2);
        p2.add(b1); p3.add(p1); p3.add(p2);
        c.add(p3);
        t1.addActionListener(this);
        t2.addActionListener(this);
        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        double t;
        if(e.getSource()==t1){
            t = Double.parseDouble(t1.getText());
            t=t*1.8+32;
            t2.setText(""+t);
        }
        else if (e.getSource()==t2){
            t = Double.parseDouble(t2.getText());
            t = (t-32)/1.8;
            t1.setText(""+t);
        }
        else System.exit(0);
    }
}
