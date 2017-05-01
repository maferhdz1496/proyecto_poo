/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladoraereo;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;


/**
 *
 * @author maferhernandezdiaz
 */
public class Frame1 extends JFrame{
    
    public Frame1(Boeing avion){ 
    setSize(500,700);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setVisible(true);
    
    setLayout(new BorderLayout());
   
    //Swing components
    JTextArea text = new JTextArea();
    text.setText("Tu avion seria asi....."+ avion.toString());
    text.setEditable(false);
    
     //Swing components to content pane
    Container c= getContentPane();
    c.add (text, BorderLayout.CENTER);
}
}
