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
public class Frame15 extends JFrame{

    public String numVueloStr;
    public int numVueloInt; 
    
    public Boeing Frame15 (Boeing boeing){
        JFrame frame15 = new JFrame("Boeing");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel numSerieLabel = new JLabel("¿Cual es el numero de serie del avion?");
        JTextField numSerieRespuesta = new JTextField();
        JLabel numVueloLabel = new JLabel("¿Cual es el numero de vuelo? (Solo numeros)");
        JTextField numVueloRespuesta = new JTextField();
        JLabel destinoLabel = new JLabel("¿Cual es el destino?");
        JTextField destinoRespuesta = new JTextField();
        JLabel aterrizarLabel = new JLabel("¿Quieres aterrizar?");
        JCheckBox aterrizarRespuesta = new JCheckBox("Si");
        JLabel despegarLabel = new JLabel("¿Quieres despegar?");
        JCheckBox despegarRespuesta = new JCheckBox("Si");

        JButton button = new JButton();
        button.setText("Siguiente");
        
        numSerieLabel.setBounds(150,20, 300, 30);
        numSerieRespuesta.setBounds(200, 50, 120, 30);
        numVueloLabel.setBounds (150,80,300,30);
        numVueloRespuesta.setBounds (150,110,120,30);
        destinoLabel.setBounds (150,140,300,30);
        destinoRespuesta.setBounds (150,170,120,30);
        aterrizarLabel.setBounds(150,200, 300, 30);
        aterrizarRespuesta.setBounds(200,230,120,30);
        despegarLabel.setBounds(150, 260, 300, 30);
        despegarRespuesta.setBounds(290, 200, 120, 30);
        button.setBounds(150, 320, 120, 30);
        
        
        panel.add(numSerieLabel);
        panel.add(numSerieRespuesta);
        panel.add(numVueloLabel);
        panel.add(numVueloRespuesta);
        panel.add(destinoLabel);
        panel.add(destinoRespuesta);
        panel.add(aterrizarLabel);
        panel.add(aterrizarRespuesta);
        panel.add(despegarLabel);
        panel.add(despegarRespuesta);
        panel.add(button);
        
        
        
        frame15.add(panel);
        frame15.setSize(500, 350);
        frame15.setLocationRelativeTo(null);
        frame15.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame15.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                  
               System.out.println("El numero de serie es " + numSerieRespuesta.getText());
               boeing.setNumeroSerie(numSerieRespuesta.getText());
             
  
               numVueloStr = numSerieRespuesta.getText();
               numVueloInt = Integer.parseInt(numVueloStr);   
               System.out.println("El numero de vuelo es" + numVueloInt);
               boeing.setNumeroVuelo(numVueloInt);
               
               System.out.println("El destino es " + destinoRespuesta.getText());
               boeing.setDestino(destinoRespuesta.getText());
               
               System.out.println("Aterrizando "+ aterrizarRespuesta.getText());
               if (aterrizarRespuesta.isSelected()){
                   boeing.Aterrizar();
                   boeing.setEnVuelo(aterrizarRespuesta.isSelected());
                   }

               
               System.out.println("Despegado " + despegarRespuesta.getText());
               if (despegarRespuesta.isSelected()){
                   boeing.Despegar();
                   boeing.setEnVuelo(despegarRespuesta.isSelected());       
                  }

               
              FinalFrame finalframe = new FinalFrame();
              
                
            }
        });
        return boeing;

    }
}
