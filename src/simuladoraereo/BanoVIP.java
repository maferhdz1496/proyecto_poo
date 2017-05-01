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
public class BanoVIP extends BanoMujeres {
       private boolean embarazada= false;
    
    public BanoVIP(boolean ocupado) {
        super (ocupado);
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "\n\tBanoVIP" + 
               "\n\tEsta embarazada= " + embarazada;
    }

  
    @Override
   public boolean UsarBaño()  {
          if(embarazada && this.ocupado){
            this.ocupado = false;
            this.embarazada = true;
            System.out.println("Puede usar el baño");
            return true;
      
        } else if(this.ocupado && embarazada){
            this.ocupado = true;
            this.embarazada = true;
            System.out.println("Esta ocupado");
            return false;
        }else {
            this.ocupado = true;
            System.out.println("No lo puede usar porque no esta embarazada");
            return false;
            
        }
  } 
  
}
