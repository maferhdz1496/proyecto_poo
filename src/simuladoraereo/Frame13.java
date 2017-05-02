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
public class Frame13 extends JFrame{
    public BanoMujeres Frame13(BanoMujeres banom){
        JFrame frame13 = new JFrame("Aspa");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        

        JLabel banoMujerLabel = new JLabel("¿Es mujer?");
        JCheckBox banoMujerRespuesta = new JCheckBox("Si");
        
     
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        banoMujerLabel.setBounds(150,20, 200, 30);
        banoMujerRespuesta.setBounds(200,50,120,30);
     

        button.setBounds(200, 80, 120, 30);
        
        
        panel.add(banoMujerLabel);
        panel.add(banoMujerRespuesta);
     
        panel.add(button);
        
        
        
        frame13.add(panel);
        frame13.setSize(500,150);
        frame13.setLocationRelativeTo(null);
        frame13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame13.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               
               System.out.println("Es mujer "+ banoMujerRespuesta.isSelected());               
               if (banoMujerRespuesta.isSelected()){
                   banom.UsarBaño();
                   banom.setMujer(banoMujerRespuesta.isSelected());              
                  }
               
               
              Frame14 frame14 = new Frame14();
              
            }
        });
        return banom;

}   
}

