/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladoraereo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author maferhernandezdiaz
 */
    public class Frame12 extends JFrame{
    public BanoHombres Frame12(BanoHombres banoh){
        JFrame frame07 = new JFrame("Aspa");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        

        JLabel banoHombreLabel = new JLabel("¿Es hombre?");
        JCheckBox banoHombreRespuesta = new JCheckBox("Si");
        
     
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        banoHombreLabel.setBounds(150,20, 200, 30);
        banoHombreRespuesta.setBounds(200,50,120,30);
     

        button.setBounds(200, 80, 120, 30);
        
        
        panel.add(banoHombreLabel);
        panel.add(banoHombreRespuesta);
     
        panel.add(button);
        
        
        
        frame07.add(panel);
        frame07.setSize(500,150);
        frame07.setLocationRelativeTo(null);
        frame07.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame07.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               
               System.out.println("Es hombre "+ banoHombreRespuesta.isSelected());               
               if (banoHombreRespuesta.isSelected()){
                  banoh.UsarBaño();
                  banoh.setHombre(banoHombreRespuesta.isSelected());
                  }
               
               
              Frame13 frame13 = new Frame13();
              
            }
        });
        return banoh;
    }   
}


