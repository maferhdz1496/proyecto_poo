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
public class Frame01 extends JFrame{
    public Frame02 frame02;
    public String gasStr;
    public int gasolina; 
    
    public Boeing Frame01(Boeing boeing){
        JFrame frame01 = new JFrame("Tanque");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel tanqueLabel = new JLabel("¿Que tipo de gasolina necesitas?");
        JTextField tanqueRespuesta = new JTextField();
        JLabel llenoLabel = new JLabel("¿Quieres llenar el tanque?");
        JCheckBox llenoCheckbox = new JCheckBox("Si");
        JLabel vaciarLabel = new JLabel("¿Quieres vaciar el tanque?");
        JCheckBox vaciarCheckbox = new JCheckBox("Si");
        JLabel verifcarLabel = new JLabel("¿Cuantos litros de gasolina quieres que tenga el tanque?");
        JLabel verifcarLabel1 = new JLabel("(Pon solo numero entre 0 y 300)");
        JTextField verificarRespuesta = new JTextField();
        
        
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        tanqueLabel.setBounds(150,20, 300, 30);
        tanqueRespuesta.setBounds(200, 55, 120, 30);
        llenoLabel.setBounds(150,90, 200, 30);
        llenoCheckbox.setBounds(200,110,120,30);
        vaciarLabel.setBounds(150, 130, 200, 30);
        vaciarCheckbox.setBounds(200, 150, 120, 30);
        verifcarLabel.setBounds(100, 170, 490, 30);
        verifcarLabel1.setBounds(150,200,300,30);
        verificarRespuesta.setBounds(200, 230, 120, 30);
        button.setBounds(200, 260, 120, 30);
        
        
        panel.add(tanqueLabel);
        panel.add(tanqueRespuesta);
        panel.add(llenoLabel);
        panel.add(llenoCheckbox);
        panel.add(vaciarLabel);
        panel.add(vaciarCheckbox);
        panel.add(verifcarLabel);
        panel.add(verifcarLabel1);
        panel.add(verificarRespuesta);
        panel.add(button);
        
        
        
        frame01.add(panel);
        frame01.setSize(500, 330);
        frame01.setLocationRelativeTo(null);
        frame01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame01.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               
               System.out.println("\nEl tipo de gasolina es: " + tanqueRespuesta.getText()); 
               boeing.tanque.setTipoGasolina(tanqueRespuesta.getText());

               
               
               System.out.println("El tanque lo lleno "+ llenoCheckbox.isSelected());               
               if (llenoCheckbox.isSelected()){
                  boeing.tanque.llenarTanque();
                  boeing.tanque.setLitrosGasolina(gasolina);

                  }
                if (llenoCheckbox.isSelected()==false){
                  boeing.tanque.setLitrosGasolina(gasolina);
                  }
               
               
               System.out.println("El tanque lo vacio " + vaciarCheckbox.isSelected());
               if (vaciarCheckbox.isSelected()){
                  boeing.tanque.liberarTanque();
                  boeing.tanque.setLitrosGasolina(gasolina);
                  }
               if (vaciarCheckbox.isSelected()==false){
                  boeing.tanque.setLitrosGasolina(gasolina);
                  }
               
               gasStr = verificarRespuesta.getText();
               gasolina = Integer.parseInt(gasStr);
               boeing.tanque.setLitrosGasolina(gasolina);
               System.out.println("El tanque tiene: " + gasolina + "lts.");
               boeing.tanque.verificarTanque(gasolina);
               boeing.tanque.setLitrosGasolina(gasolina);
               
              frame01.setVisible(false);
              Frame02 frame02 = new Frame02();
              Boeing boeing = new Boeing();
              boeing = frame02.Frame02(boeing);
           
            
                
            }
        });
        return boeing;

    }
    
}
