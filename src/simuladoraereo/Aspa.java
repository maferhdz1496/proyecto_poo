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
    private boolean rota = false;

    public Aspa(boolean rota) {
        this.rota = rota;
    }

    public boolean isRota() {
        return rota;
    }

    public void setRota(boolean rota) {
        this.rota = rota;
    }

    @Override
    public String toString() {
        return "\n\tAspa" + "\n\tEsta rotando=" + rota;
    }
    public boolean VerificarAspa()  {
      if(this.rota){
            this.rota = true;
            System.out.println("El aspa esta rotando correctamente");
            return false;
            
        } else {
            this.rota = true;
            System.out.println("El aspa no esta rotando");
            return false;
        }
  }
    
}
