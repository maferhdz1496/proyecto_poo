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
    
    public Asiento Frame10 (Asiento asiento){
        JFrame frame10 = new JFrame("Bodega");
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
        pasajerosLabel1.setBounds(150,50, 300, 30);
        pasajerosRespuesta.setBounds(200, 80, 120, 30);
        asientosLabel.setBounds (150,110,300,30);
        asientosRespuesta.setBounds (150,140,120,30);
        subirpasajerosLabel.setBounds(150,170, 300, 30);
        subirPasajerosRespuesta.setBounds(200,200,120,30);
        bajarPasajerosLabel.setBounds(150, 230, 300, 30);
        bajarPasajerosRespuesta.setBounds(260, 200, 120, 30);
        button.setBounds(150, 290, 120, 30);
        
        
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
               System.out.println("Son " + pasajerosInt + " pasajeros.");
               asiento.VerificarAsientos(pasajerosInt, asientosInt);
               asiento.setPasajero(pasajerosInt);
             
  
               asientosStr = pasajerosRespuesta.getText();
               asientosInt = Integer.parseInt(asientosStr);   
               System.out.println("Son " + asientosInt + " asientos.");
               asiento.VerificarAsientos(pasajerosInt, asientosInt);
               asiento.setAsientos(asientosInt);
               
               
               System.out.println("Subiendo pasajeros "+ subirPasajerosRespuesta.getText() );
               if (subirPasajerosRespuesta.isSelected()){
                   asiento.SubirPasajero(pasajerosInt);
                   asiento.setPasajero(pasajerosInt);
                   }

               
               System.out.println("Bajando pasajeros " + bajarPasajerosRespuesta.getText());
               if (bajarPasajerosRespuesta.isSelected()){
                   asiento.BajarPasajero(pasajerosInt);
                   asiento.setPasajero(pasajerosInt);         
                  }

               frame10.setVisible(false);
              Frame11 frame11 = new Frame11();
              
                
            }
        });
        return asiento;

    }
}

