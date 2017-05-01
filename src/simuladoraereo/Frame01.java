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

    /**
     *
     */
    
    public Boeing Frame01(Boeing boeing){
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel label = new JLabel("¿Que tipo de tanque necesitas?");
        JTextField tanque = new JTextField();
        JLabel encendidoLabel = new JLabel("¿Esta encendido?");
        JCheckBox encendidoCheckbox = new JCheckBox("Encendido");
        
        JButton button = new JButton();
        button.setText("Siguiente");
        
        label.setBounds(100,20, 120, 30);
        tanque.setBounds(100, 55, 120, 30);
        encendidoLabel.setBounds(100,90, 120, 30);
        encendidoCheckbox.setBounds(100,110,120,30);
        button.setBounds(100, 200, 120, 30);
        
   
        
        panel.add(label);
        panel.add(button);
        panel.add(tanque);
        panel.add(encendidoLabel);
        panel.add(encendidoCheckbox);
        frame.add(panel);
        frame.setSize(300, 300);
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("El texto dice " + tanque.getText()); 
               boeing.motor.setMarca(tanque.getText());
                System.out.println("El valor del boton es "+ encendidoCheckbox.isSelected());
                
            }
        });
        return boeing;

    }
//    public  Frame01(){
//    setSize(500,700);
//    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//    setVisible(true);
//    
//    //LAYOUT MANAGER
//    setLayout(new BorderLayout());
//   
//    //Swing components
//    
//    JTextField field1 = new JTextField();
//    field1.setText("¿Qué tipo de tanque necesita?");
//    field1.setLocation(0, 0);
//    
//    field1.setEditable(false);
//    JTextField field2 = new JTextField();
//    field2.setText("Escribe aquí tu respuesta");
//    field2.setEditable(false);
//    JTextField fieldr = new JTextField();
//    fieldr.setEditable(true);
//    
//    JButton button1 = new JButton ("Siguiente");
//    
//    //comand shift flechta seleciona todo 
//    //Swing components to content pane
//   
//// Container c= getContentPane();
//     JPanel panel= new JPanel(new GridBagLayout());
//     panel.add(field1);
//     field1.setSize(20,20);
//     field1.setLocation(0,0);
//   
//    
//    /*
//    c.add (field1, BorderLayout.CENTER);
//    c.add (field2, BorderLayout.CENTER);
//    c.add (fieldr, BorderLayout.CENTER);
//    c.add (button1, BorderLayout.SOUTH);
//    */
//    
//    button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               Frame1 frame1 = new Frame1();
//               Avion avion = new Avion();
//               
//                
//            }
//        });
//        
//    
//
//  }  
    
}
