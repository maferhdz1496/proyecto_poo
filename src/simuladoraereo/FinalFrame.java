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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/**
 *
 * @author maferhernandezdiaz
 */
public class FinalFrame extends JFrame{
    public Boeing Frame1(Boeing boeing){
        JFrame frame1 = new JFrame("Resultados");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        

        JTextArea text = new JTextArea();
        text.setText("Tu avion seria asi....."+ boeing.toString());
        text.setEditable(false);
        
     
        
        JButton button = new JButton();
        button.setText("Terminar");
        
        text.setBounds(150,20, 200, 30);
        button.setBounds(200, 950, 120, 30);
        
        
        panel.add(text);

     
        panel.add(button);
        
        
        
        frame1.add(panel);
        frame1.setSize(500,1000);
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
            //button.dispose();
               
               
              Frame08 frame08 = new Frame08();
              
            }
        });
  
return boeing;
}   
}
