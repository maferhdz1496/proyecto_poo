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
    private Aspa aspa;
    private boolean rotando = false;

    public Turbina(Aspa aspa) {
        this.aspa = aspa;
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
        return "\n\tTurbina" +
                "\n\tEl aspa esta bien..." + aspa +
                "\n\tEsta rotando..." + rotando;
    }
   
    public boolean HaceRotacion()  {
       if(this.rotando){
            this.rotando = false;
            System.out.println("Comenzando a rotar");
            return true;
            
        } else {
            this.rotando = true;
            System.out.println("EYa estaba rotando");
            return false;
        }
     }
    
    public boolean DesRotacion()  {
       if(this.rotando){
            this.rotando = false;
            System.out.println("Deteniendo rotacion");
            return true;
            
        } else {
            this.rotando = true;
            System.out.println("Ya estaba detenido");
            return false;
        }
    }
    
    
    
}
