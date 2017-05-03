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
public class Asiento {
    protected int asientos;
    protected int pasajero;
    protected boolean listo = false;


    public Asiento(int asientos, int pasajero) {
        this.asientos = asientos;
        this.pasajero = pasajero;

    }

    public Asiento() {
        this.asientos = 200;
        this.pasajero =200;

    }

     public boolean isListo(){
        if (VerificarAsientos(pasajero, asientos)){
            System.out.println("...Pasajeros listos...");
            listo = true;
            return true;
        }
        else{
            System.out.println("Verificar pasajeros...");
            return false;
        }
    }
    

    public void setListo(boolean listo) {
        this.listo = listo;
    }

    
    public int getPasajero() {
        return pasajero;
    }

    public void setPasajero(int pasajero) {
        this.pasajero = pasajero;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }


    @Override
    public String toString() {
        return 
                "\n\tAsientos: " + asientos +
                "\n\tPasajeros: " + pasajero;
    }
    
    public boolean VerificarAsientos(int pasajero, int asientos)  {
        if (this.asientos>=this.pasajero){
         System.out.println("Podemos despegar");
         return true;
         
     }else{
         System.out.println("Hay mas pasajeros que asientos, por favor bajar pasajeros y pasarlos a otro vuelo"); 
         return false;
     }
    }
    
    public boolean BajarPasajero(int pasajero)  {
        if (200<=pasajero){
         System.out.println("Bajando los pasajeros necesarios");
         return true;
         
     }else{
         System.out.println("Podemos volar"); 
         this.setPasajero(getAsientos());
         return false;
     }
    }
       
    public boolean SubirPasajero(int pasajero)  {
        if (0>=pasajero){
         System.out.println("Subiendo pasajeros necesarios");
         return true;
         
     }else{
         System.out.println("Podemos despegar"); 
         this.setPasajero(getAsientos());
         return false;
     }
    }
}
