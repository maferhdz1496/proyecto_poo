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

    public Boeing(String numeroSerie, int numeroVuelo, String destino, String piloto, String copiloto, Asiento asientos, Bodega bodega, Bano bano, int velocidadMax, int vidaUtil, int añoFabricacion, Motor motor, TrenDeAterrisaje tren, String fabricante, Tanque tanqueComb) {
        super(piloto, copiloto, asientos, bodega, bano, velocidadMax, vidaUtil, añoFabricacion, motor, tren, fabricante, tanqueComb);
        this.numeroSerie = numeroSerie;
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
    }

    public Boeing(){
        this("SR24042017",33,"Australia","Carlos Monroy","Mafer Hernandez",new Asiento(),new Bodega(),new Bano(),900,30,2017,new Motor(),new TrenDeAterrisaje(),"NASA",new Tanque());
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
        return "BOEING 787 300: " +
                "\n\tNumeroSerie: " + numeroSerie +
                "\n\tNumeroVuelo: " + numeroVuelo + 
                "\n\tDestino: " + destino +
                "\n\tEsta volando... " + enVuelo +
                "\n\tPiloto: " + super.piloto + 
                "\n\tCopiloto: " + super.copiloto +
                this.asientos.toString() + super.toString();
    }
    
    public boolean despegar()  {
        if(super.asientos.isListo() && super.motor.isListo() && super.bodega.isListo() && super.tanque.isListo()){
            System.out.println("DESPEGANDO...");
            enVuelo = true;
            return true;
        }
        else{
            System.out.println("VERIFICAR SISTEMAS...");
            return false;
        }
    }
      
    public boolean aterrizar(){
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
    public boolean girar(){
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
    public boolean subir(){
        if(this.enVuelo){
            this.enVuelo = true;
            System.out.println("Subiendo un poco la areonave");
            return false;
            } else {
            this.enVuelo = false;
            System.out.println("Necesitas despegar");
            return false;
        } 
    }
       
    @Override
    public boolean bajar(){
        if(this.enVuelo){
            this.enVuelo = true;
            System.out.println("Bajando un poco la areonave");
            return false;
            } else {
            this.enVuelo = false;
            System.out.println("Necesitas despegar");
            return false;
        } 
    }
        
   @Override  
  public boolean encender(){
      if(this.encendido){
            this.encendido = false;
            System.out.println("Se enciende la areonave");
            return true;
            
        } else {
            this.encendido = true;
            System.out.println("Ya estaba encendido");
            return false;
        }
  }
  
   @Override
  public  boolean apagar(){
       if(this.encendido){
            this.encendido = true;
            System.out.println("Se apaga la areonave");
            return false;
            
        } else {
            this.encendido = true;
            System.out.println("Ya estaba apagado");
            return false;
        }
  }
      

   @Override   
  public  boolean reparar(){
    if(this.vidaUtil>10){
            System.out.println("Reparando Areonave");
            return true;
            
        } else {
            this.encendido = true;
            System.out.println("Todavia funciona");
            return false;
        }
  }
}
