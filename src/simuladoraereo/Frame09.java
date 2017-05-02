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
    
    public Bodega Frame09 (Bodega bodega){
        JFrame frame09 = new JFrame("Bodega");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel cargaBodegaLabel = new JLabel("¿Cuanta carga tiene?");
        JLabel cargaBodegaLabel1 = new JLabel("(Elije entre 0 y 2000 y que sea numero)");
        JTextField cargaBodegaRespuesta = new JTextField();
        JLabel llenarBodegaLabel = new JLabel("¿Quieres llenar la bodega?");
        JCheckBox llenarBodegaRespuesta = new JCheckBox("Si");
        JLabel vaciarBodegaLabel = new JLabel("¿Quieres vaciar la bodega?");
        JCheckBox vaciarBodegaRespuesta = new JCheckBox("Si");

        JButton button = new JButton();
        button.setText("Siguiente");
        
        cargaBodegaLabel.setBounds(150,20, 300, 30);
        cargaBodegaLabel1.setBounds(150,50, 300, 30);
        cargaBodegaRespuesta.setBounds(200, 80, 120, 30);
        llenarBodegaLabel.setBounds(150,110, 300, 30);
        llenarBodegaRespuesta.setBounds(200,140,120,30);
        vaciarBodegaLabel.setBounds(150, 170, 300, 30);
        vaciarBodegaRespuesta.setBounds(200, 200, 120, 30);
        button.setBounds(150, 230, 120, 30);
        
        
        panel.add(cargaBodegaLabel);
        panel.add(cargaBodegaLabel1);
        panel.add(cargaBodegaRespuesta);
        panel.add(llenarBodegaLabel);
        panel.add(llenarBodegaRespuesta);
        panel.add(vaciarBodegaLabel);
        panel.add(vaciarBodegaRespuesta);

        panel.add(button);
        
        
        
        frame09.add(panel);
        frame09.setSize(500, 300);
        frame09.setLocationRelativeTo(null);
        frame09.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame09.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                cargaBodegaStr = cargaBodegaRespuesta.getText();
                cargaBodegaInt = Integer.parseInt(cargaBodegaStr);   
               System.out.println("La carga es de " + cargaBodegaInt);
               bodega.VerificarPeso(cargaBodegaInt);
               bodega.setCarga(cargaBodegaInt);
  
               
               System.out.println("La carga es "+ llenarBodegaRespuesta.getText() );
               if (llenarBodegaRespuesta.isSelected()){
                   bodega.LlenarBodega(cargaBodegaInt);
                   bodega.setCarga(cargaBodegaInt);
                   }

               
               System.out.println("La llanta se desinflo " + vaciarBodegaRespuesta.getText());
               if (vaciarBodegaRespuesta.isSelected()){
                  bodega.VaciarBodega(cargaBodegaInt);
                  bodega.setCarga(cargaBodegaInt);
                  }
               
               
               
               
              Frame10 frame10 = new Frame10();
              
                
            }
        });
        return bodega;

    }
}

