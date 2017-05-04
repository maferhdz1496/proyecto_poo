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
public class Contenedor extends Recipiente {
    protected String color;

    public Contenedor(String color, String tamano) {
        super(tamano);
        this.color = color;
    }

    public Contenedor() {
        super("grande");
        this.color = "rojo";
    }

    


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "El color del contenedor es:" + color + super.toString();
    }
    
    
    
  
}
