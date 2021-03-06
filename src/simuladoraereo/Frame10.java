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
 public class Frame10 extends JFrame{

    public String pasajerosStr;
    public int pasajerosInt; 
    public String asientosStr;
    public int asientosInt; 
    
    public Boeing Frame10 (Boeing boeing){
        JFrame frame10 = new JFrame("Asientos");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel pasajerosLabel = new JLabel("¿Cuantos pasajeros hay?");
        JLabel pasajerosLabel1 = new JLabel("(Elije un numero de acuerdo a los asientos que pondras o menos)");
        JTextField pasajerosRespuesta = new JTextField();
        JLabel asientosLabel = new JLabel("¿Cuantos asientos hay?");
        JTextField asientosRespuesta = new JTextField();
        JLabel subirpasajerosLabel = new JLabel("¿Quieres subir a pasajeros si son menos de los necesarios?");
        JCheckBox subirPasajerosRespuesta = new JCheckBox("Si");
        JLabel bajarPasajerosLabel = new JLabel("¿Quieres bajar a pasajeros si son mas de los necesarios?");
        JCheckBox bajarPasajerosRespuesta = new JCheckBox("Si");

        JButton button = new JButton();
        button.setText("Siguiente");
        
        pasajerosLabel.setBounds(150,20, 300, 30);
        pasajerosLabel1.setBounds(20,50, 600, 30);
        pasajerosRespuesta.setBounds(200, 80, 120, 30);
        asientosLabel.setBounds (150,110,300,30);
        asientosRespuesta.setBounds (200,140,120,30);
        subirpasajerosLabel.setBounds(20,170, 600, 30);
        subirPasajerosRespuesta.setBounds(200,200,120,30);
        bajarPasajerosLabel.setBounds(20, 230, 600, 30);
        bajarPasajerosRespuesta.setBounds(200, 260, 120, 30);
        button.setBounds(170, 290, 120, 30);
        
        
        panel.add(pasajerosLabel);
        panel.add(pasajerosLabel1);
        panel.add(pasajerosRespuesta);
        panel.add(asientosLabel);
        panel.add(asientosRespuesta);
        panel.add(subirpasajerosLabel);
        panel.add(subirPasajerosRespuesta);
        panel.add(bajarPasajerosLabel);
        panel.add(bajarPasajerosRespuesta);
        panel.add(button);
        
        
        
        frame10.add(panel);
        frame10.setSize(500, 350);
        frame10.setLocationRelativeTo(null);
        frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame10.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                pasajerosStr = pasajerosRespuesta.getText();
                pasajerosInt = Integer.parseInt(pasajerosStr);   
               System.out.println("\nSon " + pasajerosInt + " pasajeros.");
               boeing.asientos.VerificarAsientos(pasajerosInt, asientosInt);
               boeing.asientos.setPasajero(pasajerosInt);
             
  
               asientosStr = pasajerosRespuesta.getText();
               asientosInt = Integer.parseInt(asientosStr);   
               System.out.println("Son " + asientosInt + " asientos.");
               boeing.asientos.VerificarAsientos(pasajerosInt, asientosInt);
               boeing.asientos.setAsientos(asientosInt);
               
               
               System.out.println("Subiendo pasajeros "+ subirPasajerosRespuesta.isSelected() );
               if (subirPasajerosRespuesta.isSelected()){
                   boeing.asientos.SubirPasajero(pasajerosInt);
                   boeing.asientos.setPasajero(pasajerosInt);
                   }
               if (subirPasajerosRespuesta.isSelected()== false){
                   boeing.asientos.setPasajero(pasajerosInt);
                   }

               
               System.out.println("Bajando pasajeros " + bajarPasajerosRespuesta.isSelected());
               if (bajarPasajerosRespuesta.isSelected()){
                   boeing.asientos.BajarPasajero(pasajerosInt);
                   boeing.asientos.setPasajero(pasajerosInt);         
                  }
               if (bajarPasajerosRespuesta.isSelected()==false){
                   boeing.asientos.setPasajero(pasajerosInt);         
                  }

               
               frame10.setVisible(false);
              Frame11 frame11 = new Frame11();
              Boeing boeing = new Boeing();
              boeing = frame11.Frame11(boeing);
              
                
            }
        });
        return boeing;

    }
}

