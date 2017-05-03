/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladoraereo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maferhernandezdiaz
 */
public class Frame02 extends JFrame{
   
    public String velMaxStr;
    public int velMaxInt;
    
    public String vidaUtilStr;
    public int vidaUtilInt;
    
    public String anoFabricacionStr;
    public int anoFabricacionInt;
    
    public Areonave Frame02(Areonave areonave){
        JFrame frame02 = new JFrame("Areonave");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel fabricanteLabel = new JLabel("¿Quien es el fabricante de tu areonave?");
        JTextField fabricanteRespuesta = new JTextField();
        JLabel VelocidadLabel = new JLabel("¿Cual es la velocidad maxima de tu arenave?");
        JTextField velocidadRespuesta = new JTextField();
        JLabel vidaUtilLabel = new JLabel("¿Cual es su vida util?");
        JTextField vidaUtilRespuesta = new JTextField();
        JLabel anoFabricacionLabel = new JLabel("¿Cuando se fabrico?");
        JTextField anoFabicacionRespuesta = new JTextField();
        
        
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        fabricanteLabel.setBounds(100,20, 490, 30);
        fabricanteRespuesta.setBounds(100, 50, 120, 30);
        VelocidadLabel.setBounds(100,80, 490, 30);
        velocidadRespuesta.setBounds(100,110,120,30);
        vidaUtilLabel.setBounds(100, 130, 490, 30);
        vidaUtilRespuesta.setBounds(100, 150, 120, 30);
        anoFabricacionLabel.setBounds(100, 170, 490, 30);
        anoFabicacionRespuesta.setBounds(100, 200, 120, 30);
        button.setBounds(100, 230, 120, 30);
        
        
        panel.add(fabricanteLabel);
        panel.add(fabricanteRespuesta);
        panel.add(VelocidadLabel);
        panel.add(velocidadRespuesta);
        panel.add(vidaUtilLabel);
        panel.add(vidaUtilRespuesta);
        panel.add(anoFabricacionLabel);
        panel.add(anoFabicacionRespuesta);
       
        panel.add(button);
        
        
        
        frame02.add(panel);
        frame02.setSize(400,300);
        frame02.setLocationRelativeTo(null);
        frame02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame02.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               System.out.println("El fabricante es " + fabricanteRespuesta.getText()); 
               areonave.setFabricante(fabricanteRespuesta.getText());          
             
                velMaxStr = velocidadRespuesta.getText();
                velMaxInt = Integer.parseInt(velMaxStr);         
                System.out.println("La velocidad maxima es " + velMaxInt);
                areonave.setVelocidadMaxima(velMaxInt);
                
                vidaUtilStr = vidaUtilRespuesta.getText();
                vidaUtilInt = Integer.parseInt(vidaUtilStr);        
                areonave.setVidaUtil(vidaUtilInt);
                System.out.println("Su vida util es" + vidaUtilInt);
                areonave.reparar();
                
                anoFabricacionStr= anoFabicacionRespuesta.getText();
                anoFabricacionInt = Integer.parseInt(anoFabricacionStr); 
                areonave.setAnoFabricacion(anoFabricacionInt);
                System.out.println("El ano de fabricacion es" + anoFabricacionInt);
               
              Frame03 frame03 = new Frame03();
             
                
            }
        });
        return areonave;

    }
}
