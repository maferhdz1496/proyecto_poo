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
        Frame00 mf = new Frame00("Simulador Aereo", boeing, tanque);
        mf.setSize(500,300);
        mf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        mf.setVisible(true);
        System.out.println(boeing.toString());
    }   
}
