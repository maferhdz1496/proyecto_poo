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
 public class Frame09 extends JFrame{

    public String cargaBodegaStr;
    public int cargaBodegaInt; 
    
    public Boeing Frame09 (Boeing boeing){
        JFrame frame09 = new JFrame("Bodega");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel cargaBodegaLabel = new JLabel("¿Cuanta carga tiene?");
        JLabel cargaBodegaLabel1 = new JLabel("(Elije entre 0 y 2000)");
        JTextField cargaBodegaRespuesta = new JTextField();
        JLabel llenarBodegaLabel = new JLabel("¿Quieres llenar la bodega?");
        JCheckBox llenarBodegaRespuesta = new JCheckBox("Si");
        JLabel vaciarBodegaLabel = new JLabel("¿Quieres vaciar la bodega?");
        JCheckBox vaciarBodegaRespuesta = new JCheckBox("Si");

        JButton button = new JButton();
        button.setText("Siguiente");
        
        cargaBodegaLabel.setBounds(100,20, 300, 30);
        cargaBodegaLabel1.setBounds(100,50, 300, 30);
        cargaBodegaRespuesta.setBounds(150, 80, 120, 30);
        llenarBodegaLabel.setBounds(100,110, 300, 30);
        llenarBodegaRespuesta.setBounds(150,140,120,30);
        vaciarBodegaLabel.setBounds(100, 170, 300, 30);
        vaciarBodegaRespuesta.setBounds(150, 200, 120, 30);
        button.setBounds(120, 230, 120, 30);
        
        
        panel.add(cargaBodegaLabel);
        panel.add(cargaBodegaLabel1);
        panel.add(cargaBodegaRespuesta);
        panel.add(llenarBodegaLabel);
        panel.add(llenarBodegaRespuesta);
        panel.add(vaciarBodegaLabel);
        panel.add(vaciarBodegaRespuesta);

        panel.add(button);
        
        
        
        frame09.add(panel);
        frame09.setSize(400, 300);
        frame09.setLocationRelativeTo(null);
        frame09.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame09.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                cargaBodegaStr = cargaBodegaRespuesta.getText();
                cargaBodegaInt = Integer.parseInt(cargaBodegaStr);   
               System.out.println("\nLa carga es de " + cargaBodegaInt);
               boeing.bodega.verificarBodega(cargaBodegaInt);
                boeing.bodega.setCarga(cargaBodegaInt);
  
               
               System.out.println("La carga esta llena "+ llenarBodegaRespuesta.getText() );
               if (llenarBodegaRespuesta.isSelected()){
                   boeing.bodega.llenarBodega(cargaBodegaInt);
                   boeing.bodega.setCarga(cargaBodegaInt);
                   }

               if (llenarBodegaRespuesta.isSelected()==false){
                   boeing.bodega.setCarga(cargaBodegaInt);
                   }
               
               System.out.println("La carga esta vacia " + vaciarBodegaRespuesta.getText());
               if (vaciarBodegaRespuesta.isSelected()){
                  boeing.bodega.vaciarBodega(cargaBodegaInt);
                  boeing.bodega.setCarga(cargaBodegaInt);
                  }
                if (vaciarBodegaRespuesta.isSelected()== false){
                  boeing.bodega.setCarga(cargaBodegaInt);
                  }
               
               
               frame09.setVisible(false);
               
              Frame10 frame10 = new Frame10();
              Boeing boeing = new Boeing();
              boeing = frame10.Frame10(boeing);
                
            }
        });
        return boeing;

    }
}

