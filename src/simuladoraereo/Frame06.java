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
import javax.swing.JTextField;

/**
 *
 * @author maferhernandezdiaz
 */
public class Frame06 extends JFrame{
    public Boeing Frame06(Boeing boeing){
        JFrame frame06 = new JFrame("Turbina");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        

        JLabel acelerandoTurbinaLabel = new JLabel("¿Quieres llenar el tanque?");
        JCheckBox acelerandoTurbinaRespuesta = new JCheckBox("Si");
        JLabel desacelerandoTurbinaLabel = new JLabel("¿Quieres vaciar el tanque?");
        JCheckBox desacelerandoTurbinaRespuesta = new JCheckBox("Si");
     
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        acelerandoTurbinaLabel.setBounds(150,20, 200, 30);
        acelerandoTurbinaRespuesta.setBounds(200,50,120,30);
        desacelerandoTurbinaLabel.setBounds(150, 80, 200, 30);
        desacelerandoTurbinaRespuesta.setBounds(200, 110, 120, 30);

        button.setBounds(200, 140, 120, 30);
        
        
        panel.add(acelerandoTurbinaLabel);
        panel.add(acelerandoTurbinaRespuesta);
        panel.add(desacelerandoTurbinaLabel);
        panel.add(desacelerandoTurbinaRespuesta);
     
        panel.add(button);
        
        
        
        frame06.add(panel);
        frame06.setSize(500,200);
        frame06.setLocationRelativeTo(null);
        frame06.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame06.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               
               System.out.println("Acelarando turbina "+ acelerandoTurbinaRespuesta.isSelected());               
               if (acelerandoTurbinaRespuesta.isSelected()){
                  boeing.motor.turbina.haceRotacion();
                  boeing.motor.turbina.setRotando(acelerandoTurbinaRespuesta.isSelected());
                  }
               
               System.out.println("Desacelerando turbina" + desacelerandoTurbinaRespuesta.isSelected());
       
               if (desacelerandoTurbinaRespuesta.isSelected()){
                  boeing.motor.turbina.desRotacion();
                  boeing.motor.turbina.setRotando(acelerandoTurbinaRespuesta.isSelected());
                  }
               
              frame06.setVisible(false); 
              Frame07 frame07 = new Frame07();
              Boeing boeing = new Boeing();
              boeing = frame07.Frame07(boeing);
            }
        });
        return boeing;

}   
}
