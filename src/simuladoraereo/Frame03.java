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
public class Frame03 {
    
    
    public Boeing Frame03(Boeing boeing){
        JFrame frame03 = new JFrame("Tren de Aterrisaje");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
     
        JLabel descenderTrenLabel = new JLabel("¿Quieres descender el tren?");
        JCheckBox descenderTrenRespuesta = new JCheckBox("Si");
        JLabel acenderTrenLabel = new JLabel("¿Quieres acender el tren");
        JCheckBox ascenderTrenRespuesta = new JCheckBox("Si");

        
        
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
       
        descenderTrenLabel.setBounds(150,20, 490, 30);
        descenderTrenRespuesta.setBounds(200,50,120,30);
        acenderTrenLabel.setBounds(150, 80, 490, 30);
        ascenderTrenRespuesta.setBounds(200, 110, 120, 30);
     
        button.setBounds(150, 150, 120, 30);
        

        panel.add(descenderTrenLabel);
        panel.add(descenderTrenRespuesta);
        panel.add(acenderTrenLabel);
        panel.add(ascenderTrenRespuesta);

        panel.add(button);
        
        
        
        frame03.add(panel);
        frame03.setSize(500, 200);
        frame03.setLocationRelativeTo(null);
        frame03.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame03.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               System.out.println("El tren descendio " + ascenderTrenRespuesta.getText()); 
               
               if (ascenderTrenRespuesta.isSelected()){
                  boeing.tren.acenderTren();
                  boeing.tren.setTrenAbajo(ascenderTrenRespuesta.isSelected());
                  }
               
               System.out.println("El tren ascendio "+ descenderTrenRespuesta.isSelected());
               if (descenderTrenRespuesta.isSelected()){
                  boeing.tren.descenderTren();
                  boeing.tren.setTrenAbajo(descenderTrenRespuesta.isSelected());
                  }
               frame03.setVisible(false);

              Frame04 frame04 = new Frame04();
              Boeing boeing = new Boeing();
              boeing = frame04.Frame04(boeing);
       
                
            }
        });
        return boeing;

    }
}
