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
public class Frame08 extends JFrame{

    public String gasStr;
    public int gasolina; 
    
    public Avion Frame08(Avion avion){
        JFrame frame08 = new JFrame("Avion");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel pilotoLabel = new JLabel("¿Quien es el piloto?");
        JTextField pilotoRespuesta = new JTextField();
        JLabel copilotoLabel = new JLabel("¿Quien es el copiloto?");
        JTextField copilotoRespuesta = new JTextField();
        
        
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        pilotoLabel.setBounds(150,20, 300, 30);
        pilotoRespuesta.setBounds(200, 50, 120, 30);
        copilotoLabel.setBounds(100, 80, 300, 30);
        copilotoRespuesta.setBounds(200, 110, 120, 30);
        button.setBounds(200, 140, 120, 30);
        
        
        panel.add(pilotoLabel);
        panel.add(pilotoRespuesta);
        panel.add(copilotoLabel);
        panel.add(copilotoRespuesta);
        panel.add(button);
        
        
        
        frame08.add(panel);
        frame08.setSize(500, 400);
        frame08.setLocationRelativeTo(null);
        frame08.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame08.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               System.out.println("El piloto es " + pilotoRespuesta.getText()); 
               avion.setPiloto(pilotoRespuesta.getText());
              
               System.out.println("El copiloto es " + copilotoRespuesta.getText());
               avion.setPiloto(pilotoRespuesta.getText());
              frame08.setVisible(false);
              Frame09 frame09 = new Frame09();
           
            }
        });
        return avion;

    }
    
}
