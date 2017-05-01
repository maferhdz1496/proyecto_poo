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
public class BanoHombres extends Bano {
    private boolean hombre= false;

    public BanoHombres(boolean ocupado) {
        super(ocupado);
    }

    public boolean isHombre() {
        return hombre;
    }

    public void setHombre(boolean hombre) {
        this.hombre = hombre;
    }

    @Override
    public String toString() {
        return "\n\tBanoHombres" + 
                "\n\tEs hombre= " + hombre;
    }
    


  @Override  
   public boolean UsarBaño()  {
        if(hombre && this.ocupado){
            this.ocupado = false;
            this.hombre = true;
            System.out.println("Puede usar el baño");
            return true;
            
        } else if(this.ocupado && hombre){
            this.ocupado = true;
            this.hombre = true;
            System.out.println("Esta ocupado");
            return false;
        }else {
            this.ocupado = true;
            this.hombre = false;
            System.out.println("No lo puede usar porque no es hombre");
            return false;
        }
      
  } 


}
