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
import javax.swing.JTextField;
import javax.swing.JFrame;


/**
 *
 * @author maferhernandezdiaz
 */
public class MainFrame extends JFrame {
    public MainFrame(String title, Boeing avion){
        super (title);
    
    
    //LAYOUT MANAGER
    setLayout(new BorderLayout());
   
    //Swing components
    
    JTextField field1 = new JTextField();
    field1.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n¿Desea comenzar la simulacion?");
    field1.setEditable(false);
    
    JButton button1 = new JButton ("Comenzar");
    
    
    //Swing components to content pane
    Container c= getContentPane();
    
    c.add (field1, BorderLayout.CENTER);
    
    c.add (button1, BorderLayout.SOUTH);

    
    button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Frame01 frame01 = new Frame01();
               Boeing avionFinal = new Boeing();
               avionFinal = frame01.Frame01(avion);
              
                
            }
        });
        
    

  }  
}
