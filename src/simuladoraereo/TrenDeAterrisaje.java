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
        this.llanta = new Llanta();
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
        return "\n\tTrenDeAterrisaje" + llanta + 
                "\n\tEl tren esta abajo..." + trenAbajo;
    }
    
   public boolean AcenderTren(){
       if(this.trenAbajo){
            this.trenAbajo = false;
            System.out.println("Acendiendo el tren");
            return true;
            
        } else {
            this.trenAbajo = true;
            System.out.println("Ya estaba arriba");
            return false;
        }

   }
    public boolean DescenderTren (){
        if(this.trenAbajo){
            this.trenAbajo = false;
            System.out.println("Decendiendo areonave");
            return true;
            
        } else {
            this.trenAbajo = true;
            System.out.println("Ya estaba abajo");
            return false;
        }
    }     
}
