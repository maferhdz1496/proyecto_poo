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
public class BanoMujeres extends Bano {
    private boolean mujer = false;

    public BanoMujeres(boolean ocupado) {
        super(ocupado);
    }

    public boolean isMujer() {
        return mujer;
    }

    public void setMujer(boolean mujer) {
        this.mujer = mujer;
    }

    @Override
    public String toString() {
        return "\n\tBanoMujeres" +
                "\n\tEs mujer= " + mujer;
    }
    
 
   @Override
   public boolean UsarBaño(){
       if(mujer && this.ocupado){
            this.ocupado = false;
            this.mujer =true;
            System.out.println("Puede usar el baño");
            return true;
            
        } else if (mujer && this.ocupado){
            this.ocupado = true;
            this.mujer = true;
            System.out.println("Esta ocupado");
            return false;
        }else{
            this.ocupado = true;
            this.mujer =false;
            System.out.println("No lo puede usar porque no es mujer");
            return false;
        }
      
  } 
}
