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
public class Avion extends Areonave {
    protected String piloto;
    protected String copiloto;
    protected Asiento asientos;
    protected Bodega bodegaCarga;
    protected Bano banos;

    public Avion(String piloto, String copiloto, Asiento asientos, Bodega bodegaCarga, Bano banos, int velocidadMaxima, int vidaUtil, int anoFabricacion, Motor motor, TrenDeAterrisaje tren, String fabricante, Tanque tanque) {
        super(velocidadMaxima, vidaUtil, anoFabricacion, motor, tren, fabricante, tanque);
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.asientos = asientos;
        this.bodegaCarga = bodegaCarga;
        this.banos = banos;
    }

    public Avion() {
       super(10000, 10, 2017, new Motor(), new TrenDeAterrisaje(), "F340", new Tanque());
        this.piloto = "Sanchez";
        this.copiloto = "Heranndez";
        this.asientos = new Asiento();
        this.bodegaCarga = new Bodega();
        
    
    }

    

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public Asiento getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento asientos) {
        this.asientos = asientos;
    }

    public Bodega getBodegaCarga() {
        return bodegaCarga;
    }

    public void setBodegaCarga(Bodega bodegaCarga) {
        this.bodegaCarga = bodegaCarga;
    }

    public Bano getBanos() {
        return banos;
    }

    public void setBanos(Bano banos) {
        this.banos = banos;
    }

    @Override
    public String toString() {
        return "\n\tAvion" +
                "\n\tPiloto= " + piloto +
                "\n\tCopiloto= " + copiloto + 
                 asientos + bodegaCarga +
                "\n\tBanos= " + banos + super.toString();
    }
    
    
}
