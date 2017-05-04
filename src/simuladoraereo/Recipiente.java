/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladoraereo;

/**
 *
 * @author maferhernandezdiaz
 */
public abstract class Recipiente{
    protected String tamano;

    public Recipiente(String tamano) {
        this.tamano = tamano;
    }

    public Recipiente() {
        this.tamano = "Grande";
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "El tamano del recipiente es:" + tamano;
    }

    
    
}
