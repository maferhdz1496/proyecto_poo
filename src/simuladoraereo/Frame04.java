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

   public class Frame04 extends JFrame{

    public String presionLlantaStr;
    public int presionLlantaInt; 
    
    public Llanta Frame04(Llanta llanta){
        JFrame frame04 = new JFrame("Llanta");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel presionLlantaLabel = new JLabel("¿Cual es la presion de llanta que requieres?");
        JLabel presionLlantaLabel1 = new JLabel("(Elije entre 0 y 200)");
        JTextField presionLlantaRespuesta = new JTextField();
        JLabel inflarLlantaLabel = new JLabel("¿Quieres inflar la llanta?");
        JCheckBox inflarLlantaRespuesta = new JCheckBox("Si");
        JLabel desinflarLlantaLabel = new JLabel("¿Quieres desinflar la llanta?");
        JCheckBox desinflarLlantaRespuesta = new JCheckBox("Si");

        JButton button = new JButton();
        button.setText("Siguiente");
        
        presionLlantaLabel.setBounds(150,20, 300, 30);
        presionLlantaLabel1.setBounds(150,50, 300, 30);
        presionLlantaRespuesta.setBounds(200, 80, 120, 30);
        inflarLlantaLabel.setBounds(150,110, 300, 30);
        inflarLlantaRespuesta.setBounds(200,140,120,30);
        desinflarLlantaLabel.setBounds(150, 170, 300, 30);
        desinflarLlantaRespuesta.setBounds(200, 200, 120, 30);

        button.setBounds(150, 260, 120, 30);
        
        
        panel.add(presionLlantaLabel);
        panel.add(presionLlantaLabel1);
        panel.add(presionLlantaRespuesta);
        panel.add(inflarLlantaLabel);
        panel.add(inflarLlantaRespuesta);
        panel.add(desinflarLlantaLabel);
        panel.add(desinflarLlantaRespuesta);

        panel.add(button);
        
        
        
        frame04.add(panel);
        frame04.setSize(500, 300);
        frame04.setLocationRelativeTo(null);
        frame04.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame04.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                presionLlantaStr = presionLlantaRespuesta.getText();
                presionLlantaInt = Integer.parseInt(presionLlantaStr);   
               System.out.println("La presion de llanta es " + presionLlantaInt);
               llanta.VerificarPresion(presionLlantaInt);
               llanta.setPresion(presionLlantaInt);
               
               System.out.println("La llanta se inflo "+ inflarLlantaRespuesta.isSelected());
               if (inflarLlantaRespuesta.isSelected()){
                  llanta.InflarLlanta(presionLlantaInt);
                  llanta.setPresion(presionLlantaInt);
                  }
               
               
               
               System.out.println("La llanta se desinflo " + desinflarLlantaRespuesta.isSelected());
               if (desinflarLlantaRespuesta.isSelected()){
                  llanta.DesinflarLlanta(presionLlantaInt);
                  llanta.setPresion(presionLlantaInt);
                  }
               
               
               
               
              Frame06 frame06 = new Frame06();
              
                
            }
        });
        return llanta;

    }
}
