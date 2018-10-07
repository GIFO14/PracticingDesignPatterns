package main;

import javax.swing.*;
import java.awt.event.*;
import libraries.Control;

/**
 *
 * @author mblan
 */
public class main extends JFrame implements ActionListener{

    public static void main(String[] args) {
        
        main m = new main();
        m.setBounds(0,0,1100,730);
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        
        c.Saver();
        
    }
    
    private JButton button1, button2;
    public JTextArea jta;
    private JScrollPane jsp;
    
    private static Control c = new Control();
    
    public main(){
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Text Editor");
        
        jta = new JTextArea("Write here some text...");
        jta.setVisible(true);
        jta.setEditable(true);
        jsp = new JScrollPane(jta);
        jsp.setBounds(25, 25, 1043, 575);
        add(jsp);
        
        button1 = new JButton("<--");
        button1.setBounds(425, 630, 100, 25);
        button1.addActionListener(this);
        add(button1);
        
        button2 = new JButton("-->");
        button2.setBounds(575, 630, 100, 25);
        button2.addActionListener(this);
        add(button2);
        
        
        
    }
    
    public void actionPerformed (ActionEvent e){
        
        if(e.getSource() == button1){
            
            c.ControlZ();
            
        } else {
            
            c.ControlY();
            
        }
        
    }

}
