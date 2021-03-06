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
         if (cerrarPuerta()){
             this.enVuelo = true;
            System.out.println("...Puerta lista...");
            enVuelo = true;
            return true;
        }
        else{
             this.enVuelo = false;
            System.out.println("Cerrar puertas...");
            return false;
        }
   
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
        if(super.asientos.isListo() && super.motor.isListo() && super.bodega.isListo() && super.tanque.isListo() && isEnVuelo()){
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
            System.out.println("Subiendo un poco la areonave...");
            return false;
            } else {
            this.enVuelo = false;
            System.out.println("Necesitas despegar...");
            return false;
        } 
    }
       
    @Override
    public boolean bajar(){
        if(this.enVuelo){
            this.enVuelo = true;
            System.out.println("Bajando un poco la areonave...");
            return false;
            } else {
            this.enVuelo = false;
            System.out.println("Necesitas despegar...");
            return false;
        } 
    }
        
   @Override  
  public boolean encender(){
      if(this.encender){
            this.encender = true;
            System.out.println("Se enciende la areonave...");
            return false;
            
        } else {
            this.encender = false;
            System.out.println("Ya estaba encendido...");
            return true;
        }
  }
  
   @Override
  public  boolean apagar(){
       if(this.encender){
            this.encender = true;
            System.out.println("Se apaga la areonave...");
            return false;
            
        } else {
            this.encender = false;
            System.out.println("Ya estaba apagado...");
            return true;
        }
  }
      

   @Override   
  public  boolean reparar(int vidaUtil){
    if( 10 <this.vidaUtil){
             int vidaNueva;
            vidaNueva = 10;
            System.out.println("Reparando areonave..." + "La nueva vida util de tu areonave es de..." + vidaNueva);
            this.setVidaUtil(0);
            return true;
            
        } else {
            this.encender = true;
            System.out.println("La vida util del avion es optima...");
            return false;
        }
    }
  
    @Override
    public  boolean abrirPuerta(){
        if(this.enVuelo){
            this.enVuelo = false;
            System.out.println("Abriendo puertas...");
            return true;
            
        } else {
            this.enVuelo = true;
            System.out.println("El avion esta volando no se pueden abrir....");
            return false;
        } 
    }
    
    @Override
    public  boolean cerrarPuerta(){
        if(this.enVuelo){
            this.enVuelo = true;
            System.out.println("Ya estaban cerradas");
            return false;
            
        } else {
            this.enVuelo = false;
            System.out.println("Cerrando puertas para el despegue....");
            return true;
        } 
    
    }
    
    @Override
    public boolean verificarPuerta(){
        if(this.enVuelo){
            this.enVuelo = true;
            System.out.println("Las puertas estan cerradas");
            return false;
            
        } else {
            this.enVuelo = false;
            System.out.println("Las puertas se pueden abrir si desea....");
            return true;
        } 
    }
    
}
