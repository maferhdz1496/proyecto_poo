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
public class Boeing extends Avion implements InterfazDeVuelo {
    
    private String numeroSerie;
    private int numeroVuelo;
    private String destino;
    private boolean enVuelo = false;

    public Boeing(String numeroSerie, int numeroVuelo, String destino, String piloto, String copiloto, Asiento asientos, Bodega bodegaCarga, Bano banos, int velocidadMaxima, int vidaUtil, int anoFabricacion, Motor motor, TrenDeAterrisaje tren, String fabricante, Tanque tanque) {
        super(piloto, copiloto, asientos, bodegaCarga, banos, velocidadMaxima, vidaUtil, anoFabricacion, motor, tren, fabricante, tanque);
        this.numeroSerie = numeroSerie;
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
  
    }

    public Boeing() {
        super();
        this.numeroSerie = "34567";
        this.numeroVuelo = 345;
        this.destino = "Hawai";
 
    }

   

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


    public boolean isEnVuelo() {
        return enVuelo;
    }

    public void setEnVuelo(boolean enVuelo) {
        this.enVuelo = enVuelo;
    }

    @Override
    public String toString() {
        return "\n\tBoeing787300" +
                "\n\t Numero de Serie= " + numeroSerie +
                "\n\t Numero de Vuelo= " + numeroVuelo +
                "\n\t Destino= " + destino +
                "\n\t Ya esta en vuelo= " + enVuelo + super.toString();
    }
    
    public boolean Despegar()  {
              if(this.enVuelo){
            this.enVuelo = false;
            System.out.println("Comeinza a despegar la areonave");
            return false;
            
        } else {
            this.enVuelo = true;
            System.out.println("Ya estaba despegando");
            return false;
        }
  }
      
    public boolean Aterrizar(){
               if(this.enVuelo){
            this.enVuelo = true;
            System.out.println("Aterrizando la areonave");
            return false;
            
        } else {
            this.enVuelo = false;
            System.out.println("Ya estaba en el suelo");
            return false;
        } 
  }
    @Override
    public boolean Girar(){
      if(this.enVuelo){
            this.enVuelo = true;
            System.out.println("Girando la areonave en vuelo");
            return false;
            } else {
            this.enVuelo = false;
            System.out.println("No esta volando la areonave");
            return false;
        } 
    }
    
     @Override 
    public boolean Subir(){
        if(this.enVuelo){
            this.enVuelo = true;
            System.out.println("Subiendo un poco la areonave");
            return false;
            } else {
            this.enVuelo = false;
            System.out.println("No esta volando la areonave");
            return false;
        } 
    }
       
    
     @Override 
    public boolean Bajar(){
if(this.enVuelo){
            this.enVuelo = true;
            System.out.println("Bajando un poco la areonave");
            return false;
            } else {
            this.enVuelo = false;
            System.out.println("No esta volando la areonave");
            return false;
        } 
    }
          
}
