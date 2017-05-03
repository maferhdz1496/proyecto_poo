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
public abstract class Areonave extends MedioDeTransporte {
    protected int velocidadMaxima;
    protected int vidaUtil;
    protected int anoFabricacion;
    protected Motor motor;
    protected TrenDeAterrisaje tren;

    public Areonave(int velocidadMaxima, int vidaUtil, int anoFabricacion, Motor motor, TrenDeAterrisaje tren, String fabricante, Tanque tanque) {
        super(fabricante, tanque);
        this.velocidadMaxima = velocidadMaxima;
        this.vidaUtil = vidaUtil;
        this.anoFabricacion = anoFabricacion;
        this.motor = motor;
        this.tren = tren;
    }

    public Areonave() {
        super("AreoMex", new Tanque());
        this.velocidadMaxima = 10000;
        this.vidaUtil = 10;
        this.anoFabricacion = 2017;
        this.motor = new Motor();
        this.tren = new TrenDeAterrisaje();
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public TrenDeAterrisaje getTren() {
        return tren;
    }

    public void setTren(TrenDeAterrisaje tren) {
        this.tren = tren;
    }

    @Override
    public String toString() {
        return  "\nAREONAVE:" + 
                "\n\tVelocidad Maxima: " + velocidadMaxima + " km/h" + 
                "\n\tVida Util: " + vidaUtil + " años" +
                "\n\tAno de Fabricacion: " + anoFabricacion + motor +  tren + 
                 super.toString();
    }
    
    @Override
    public abstract boolean apagar();
    
     @Override
    public  boolean reparar(){
         if( 10 <this.vidaUtil){
            System.out.println("Reparando Areonave");
            return true;
            
        } else {
            this.encendido = true;
            System.out.println("Todavia funciona");
            return false;
        }
    }
    
    @Override
    public abstract boolean encender();
     
}
