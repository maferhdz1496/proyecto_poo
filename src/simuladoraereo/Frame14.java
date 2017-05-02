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
public class Frame14 extends JFrame{
    public BanoVIP Frame14(BanoVIP banoe){
        JFrame frame14 = new JFrame("Aspa");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        

        JLabel banoEmbarazadaLabel = new JLabel("¿Esta embarazada?");
        JCheckBox banoEmbarazadaRespuesta = new JCheckBox("Si");
        
     
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        banoEmbarazadaLabel.setBounds(150,20, 200, 30);
        banoEmbarazadaRespuesta.setBounds(200,50,120,30);
     

        button.setBounds(200, 80, 120, 30);
        
        
        panel.add(banoEmbarazadaLabel);
        panel.add(banoEmbarazadaRespuesta);
     
        panel.add(button);
        
        
        
        frame14.add(panel);
        frame14.setSize(500,150);
        frame14.setLocationRelativeTo(null);
        frame14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame14.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               
               System.out.println("Esta embarazada "+ banoEmbarazadaRespuesta.isSelected());               
               if (banoEmbarazadaRespuesta.isSelected()){
                   banoe.UsarBaño();
                   banoe.setEmbarazada(banoEmbarazadaRespuesta.isSelected());
                  }

              Frame15 frame15 = new Frame15();
              
            }
        });
        return banoe;
    }   
}

