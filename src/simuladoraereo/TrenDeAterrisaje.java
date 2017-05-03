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
public class TrenDeAterrisaje {
    protected Llanta llanta;
    protected boolean trenAbajo=false;

    public TrenDeAterrisaje(Llanta llanta) {
        this.llanta = llanta;
    }

    public TrenDeAterrisaje() {
        this.llanta = new Llanta(100);
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    public boolean isTrenAbajo() {
        return trenAbajo;
    }

    public void setTrenAbajo(boolean trenAbajo) {
        this.trenAbajo = trenAbajo;
    }

    @Override
    public String toString() {
        return "\nTREN DE ATERRISAJE:" +
                 llanta.toString() +
                "\n\tEl tren esta abajo..." + trenAbajo + "\n";
    }
    
   public boolean acenderTren(){
       if(this.trenAbajo){
            this.trenAbajo = true;
            System.out.println("Acendiendo el tren....");
            return false;
            
        } else {
            this.trenAbajo = false;
            System.out.println("Ya estaba arriba....");
            return true;
        }

   }
    public boolean descenderTren (){
        if(this.trenAbajo){
            this.trenAbajo = true;
            System.out.println("Ya estaba abajo....");
            return false;
            
        } else {
            this.trenAbajo = false;
            System.out.println("Descendiendo tren.....");
            return true;
        }
    }     
}
