/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladoraereo;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimuladorAereo{

    public static void main(String[] args) {
        // TODO code application logic here
        Boeing boeing = new Boeing ();
        Tanque tanque = new Tanque();
        Frame00 mf = new Frame00("Simulador Aereo");
        mf.setSize(500,300);
        mf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        mf.setVisible(true);
        
        System.out.println("_____________");
        boeing.despegar();
        boeing.girar();
        System.out.println("_____________");
        System.out.println("INFORMACION DEL AVION");
        System.out.println(boeing.toString());
        
        System.out.println("\n SIMULACION USANDO SWING..."+
                " \nIMPRESION DE ATRIBUTOS Y METODOS A ELECION DEL USUARIO EN RUN");
        System.out.println("\n(Nota: Escriba en todos los recuadros vacios disponibles ya sea numeros o letras "
                + "\n lo que se pide. Si en los checkbox no selecciona una opcion,"
                + "\n el programa sabra que no quiere hacer cierta accion y actuará acode "
                + "\n poniendo false en el Run. Si selecciona true, el metodo funcionara acorde"
                + "\n a lo que usted pida).");
    }   
}
