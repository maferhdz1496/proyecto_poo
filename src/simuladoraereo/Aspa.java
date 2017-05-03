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
public class Aspa {
    protected boolean rota = false;

    public Aspa(boolean rota) {
        this.rota = rota;
    }
    
    public Aspa() {
        this.rota = false;
    }
    
    public boolean isRota() {
        return rota;
    }

    public void setRota(boolean rota) {
        this.rota = rota;
    }

    @Override
    public String toString() {
        return "\n\tAspa" + "\n\tEsta rotando... " + rota;
    }
    public boolean VerificarAspa()  {
      if(this.rota){
            this.rota = false;
            System.out.println("El aspa esta rotando correctamente...");
            return true;
            
        } else {
            this.rota = true;
            System.out.println("El aspa no esta rotando correctamente no puede rotar...");
            return false;
        }
  }
    
}
