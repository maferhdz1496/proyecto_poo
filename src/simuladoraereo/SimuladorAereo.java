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
        Boeing avion = new Boeing ();
        JFrame mf = new MainFrame("Simulador de Areonave", avion);
        mf.setSize(500,300);
        mf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        mf.setVisible(true);
        Boeing boeing = new Boeing();
        System.out.println(boeing.toString());
    }   
}
