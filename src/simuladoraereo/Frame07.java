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
public class Frame07 extends JFrame{
    public Boeing Frame07(Boeing boeing){
        JFrame frame07 = new JFrame("Aspa");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        

        JLabel rotacionAspaLabel = new JLabel("¿Esta rotando el aspa?");
        JCheckBox rotacionAspaRespuesta = new JCheckBox("Si");
        
     
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        rotacionAspaLabel.setBounds(150,20, 200, 30);
        rotacionAspaRespuesta.setBounds(200,50,120,30);
     

        button.setBounds(200, 80, 120, 30);
        
        
        panel.add(rotacionAspaLabel);
        panel.add(rotacionAspaRespuesta);
     
        panel.add(button);
        
        
        
        frame07.add(panel);
        frame07.setSize(500,150);
        frame07.setLocationRelativeTo(null);
        frame07.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame07.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               
               System.out.println("Esta rotando "+ rotacionAspaRespuesta.isSelected());               
               if (rotacionAspaRespuesta.isSelected()){
                  boeing.motor.turbina.aspa.VerificarAspa();
                  boeing.motor.turbina.aspa.setRota(rotacionAspaRespuesta.isSelected());
                  }
              frame07.setVisible(false); 
               
              Frame08 frame08 = new Frame08();
              Boeing boeing = new Boeing();
              boeing = frame08.Frame08(boeing);
            }
        });
        return boeing;

}   
}
