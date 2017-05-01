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


    public Asiento(int asientos, int pasajero) {
        this.asientos = asientos;
        this.pasajero = pasajero;

    }

    public Asiento() {
        this.asientos = 200;
        this.pasajero =200;

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
        return "\n\tAsiento" + 
                "\n\tAsientos= " + asientos +
                "\n\tPasajeros= " + pasajero;
    }
    
    public boolean VerificarAsientos()  {
        if (this.getAsientos()>=this.getPasajero()){
         System.out.println("Podemos despegar");
         return true;
         
     }else{
         System.out.println("Hay mas pasajeros que asientos, por favor bajar pasajeros y pasarlos a otro vuelo"); 
         return false;
     }
    }
    
    public boolean BajarPasajero()  {
        if (200>=this.getPasajero()){
         System.out.println("Podemos despegar");
         return true;
         
     }else{
         System.out.println("Bajando los pasajeros necesarios"); 
         this.setPasajero(200);
         return false;
     }
    }
       
    public boolean SubirPasajero()  {
        if (0<=this.getPasajero()){
         System.out.println("Podemos despegar");
         return true;
         
     }else{
         System.out.println("Subiendo 200 pasajeros"); 
         this.setPasajero(200);
         return false;
     }
    }
}
