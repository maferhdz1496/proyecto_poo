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
public class Frame05 extends JFrame {
    public String potenciaMotorStr;
    public int potenciaMotorInt;
    
    public Motor Frame05(Motor motor){
        JFrame frame05 = new JFrame("Motor");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel marcaMotorLabel = new JLabel("¿Cual es la marca del motor?");
        JTextField marcaMotorRespuesta = new JTextField();
        JLabel encenderMotorLabel = new JLabel("¿Quieres encender el motor");
        JCheckBox encenderMotorRespuesta = new JCheckBox("Si");
        JLabel apagarMotorLabel = new JLabel("¿Quieres apagar el motor?");
        JCheckBox apagarMotorRespuesta = new JCheckBox("Si");
        JLabel potenciaMotorLabel = new JLabel("¿Cuanta potencia tiene el motor?");
        JLabel potenciaMotorLabel1 = new JLabel("(Pon solo numeros entre 0 y 100)");
        JTextField potenciaMotorRespuesta = new JTextField();
        JLabel subirPotenciaMLabel = new JLabel("¿Quieres subir la potencia?");
        JCheckBox subirPotenciaMRespuesta = new JCheckBox("Si");
        JLabel bajarPotenciaMLabel = new JLabel("¿Quieres bajar la potencia?");
        JCheckBox bajarPotenciaMRespuesta = new JCheckBox("Si");
        
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        marcaMotorLabel.setBounds(150,20, 300, 30);
        marcaMotorRespuesta.setBounds(200, 50, 120, 30);
        apagarMotorLabel.setBounds(150,80, 200, 30);
        apagarMotorRespuesta.setBounds(200,110,120,30);
        encenderMotorLabel.setBounds(150, 130, 200, 30);
        encenderMotorRespuesta.setBounds(200, 150, 120, 30);
        potenciaMotorLabel.setBounds(100, 170, 490, 30);
        potenciaMotorLabel1.setBounds(150,200,300,30);
        potenciaMotorRespuesta.setBounds(200, 230, 120, 30);
        subirPotenciaMLabel.setBounds(200, 260, 300, 30);
        subirPotenciaMRespuesta.setBounds(200, 290, 120, 30);
        bajarPotenciaMLabel.setBounds(200, 310, 300, 30);
        bajarPotenciaMRespuesta.setBounds(200, 340, 120, 30);
       
        button.setBounds(200, 370, 120, 30);
        
        
        panel.add(marcaMotorLabel);
        panel.add(marcaMotorRespuesta);
        panel.add(apagarMotorLabel);
        panel.add(apagarMotorRespuesta);
        panel.add(encenderMotorLabel);
        panel.add(encenderMotorRespuesta);
        panel.add(potenciaMotorLabel);
        panel.add(potenciaMotorLabel1);
        panel.add(potenciaMotorRespuesta);
        panel.add(subirPotenciaMLabel);
        panel.add(subirPotenciaMRespuesta);
        panel.add(bajarPotenciaMLabel);
        panel.add(bajarPotenciaMRespuesta);
        panel.add(button);
        
        
        
        
        frame05.add(panel);
        frame05.setSize(500, 400);
        frame05.setLocationRelativeTo(null);
        frame05.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame05.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               System.out.println("La marca del motor es " + marcaMotorRespuesta.getText()); 
               motor.setMarca(marcaMotorRespuesta.getText());
                       
               System.out.println("El motor esta apagado "+ apagarMotorRespuesta.isSelected());               
               if (apagarMotorRespuesta.isSelected()){
                  motor.setEncendidoM(apagarMotorRespuesta.isSelected());
                  }
               
               System.out.println("El motor esta encendido "+ encenderMotorRespuesta.isSelected());               
               if (encenderMotorRespuesta.isSelected()){
                  motor.setEncendidoM(apagarMotorRespuesta.isSelected());
                  }
               
                potenciaMotorStr = potenciaMotorRespuesta.getText();
                potenciaMotorInt = Integer.parseInt(potenciaMotorStr);   
                System.out.println("La potencia  de llanta es " + potenciaMotorInt);
                motor.setPotencia(potenciaMotorInt);
               
                
               System.out.println("Se subio la potencia del motor "+ subirPotenciaMRespuesta.getText());
               motor.SubirPotencia(potenciaMotorInt);
               motor.setPotencia(potenciaMotorInt);
                
               
               
               
               System.out.println("Se bajo la potencia del motor " + bajarPotenciaMRespuesta.getText());              
               motor.BajarPotencia(potenciaMotorInt);
               motor.setPotencia(potenciaMotorInt);
                  
               
               
              Frame06 frame06 = new Frame06();
       
            }
        });
        return motor;
    }
}
