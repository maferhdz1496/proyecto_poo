/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladoraereo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author maferhernandezdiaz
 */
public class Frame00 extends JFrame {
    public Frame00(String title, Boeing avion, Tanque tanque){
        super (title);
    
    setLayout(new BorderLayout());
   

        JLabel comenzarLabel = new JLabel("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n¿Desea comenzar la simulacion?");
        JButton buttonBegin = new JButton ("Comenzar");

    //Swing components to content pane
    Container c= getContentPane();
    
    c.add (comenzarLabel, BorderLayout.CENTER);
    
    c.add (buttonBegin, BorderLayout.SOUTH);

    
    buttonBegin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
               Frame01 frame01 = new Frame01();
               Boeing avionFinal = new Boeing();
               Tanque tanqueFinal = new Tanque();
               tanqueFinal = frame01.Frame01(tanque);
               
            }
        });
        
    

  }  
}
