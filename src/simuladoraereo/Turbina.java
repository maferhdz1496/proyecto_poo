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
public class Turbina {
    protected Aspa aspa;
    protected boolean rotando = false;

    public Turbina(Aspa aspa) {
        this.aspa = aspa;
    }

    public Turbina() {
        this.aspa = new Aspa();
    }

    
    public Aspa getAspa() {
        return aspa;
    }

    public void setAspa(Aspa aspa) {
        this.aspa = aspa;
    }

    public boolean isRotando() {
        return rotando;
    }

    public void setRotando(boolean rotando) {
        this.rotando = rotando;
    }

    @Override
    public String toString() {
        return "\nTURBINA: " + 
                aspa.toString();
    }
   
    public boolean haceRotacion()  {
        if(aspa.isRota()){
            System.out.println("El aspa rota, no se puede acelerar...");
            return false;
        }
        else{
            System.out.println("Acelerando rotacion...");
            return true;
        }
    }
    
    
    public boolean desRotacion()  {
       if(this.rotando){
            this.rotando = false;
            System.out.println("Deteniendo rotacion...");
            return true;
            
        } else {
            this.rotando = true;
            System.out.println("Ya estaba detenido....");
            return false;
        }
    }
    
    
    
}
