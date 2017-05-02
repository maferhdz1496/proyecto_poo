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
public class Frame11 extends JFrame{
    public Bano Frame11(Bano bano){
        JFrame frame11 = new JFrame("Aspa");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        

        JLabel usarbanoLabel = new JLabel("¿Quieres usar el bano?");
        JCheckBox usarBanoRespuesta = new JCheckBox("Si");
        
     
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        usarbanoLabel.setBounds(150,20, 200, 30);
        usarBanoRespuesta.setBounds(200,50,120,30);
     

        button.setBounds(200, 80, 120, 30);
        
        
        panel.add(usarbanoLabel);
        panel.add(usarBanoRespuesta);
     
        panel.add(button);
        
        
        
        frame11.add(panel);
        frame11.setSize(500,150);
        frame11.setLocationRelativeTo(null);
        frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame11.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               
               System.out.println("Quiere usar el bano "+ usarBanoRespuesta.isSelected());               
               if (usarBanoRespuesta.isSelected()){
                   bano.UsarBaño();
                   bano.setOcupado(usarBanoRespuesta.isSelected());
                  }
               
               
              Frame12 frame12 = new Frame12();
              
            }
        });
        return bano;

}   
}

