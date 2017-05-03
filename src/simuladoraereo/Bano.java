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
public class Bano{
    protected boolean ocupado =false;

    public Bano(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Bano() {
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "\nBAÑO:" +
                "\n\tEsta ocupado..." + ocupado;
    }
    
   public boolean UsarBaño()  {
      if(this.ocupado){
            this.ocupado = false;
            System.out.println("Puede usar el baño...");
            return true;
            
        } else {
            this.ocupado = true;
            System.out.println("Esta ocupado...");
            return false;
        }
  
  } 
}
