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
public abstract class Avion extends Areonave {
    protected String piloto;
    protected String copiloto;
    protected Asiento asientos;
    protected Bodega bodega;
    protected Bano bano;

    public Avion(String piloto, String copiloto, Asiento asientos, Bodega bodegaCarga, Bano banos, int velocidadMaxima, int vidaUtil, int anoFabricacion, Motor motor, TrenDeAterrisaje tren, String fabricante, Tanque tanque) {
        super(velocidadMaxima, vidaUtil, anoFabricacion, motor, tren, fabricante, tanque);
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.asientos = asientos;
        this.bodega = bodegaCarga;
        this.bano = banos;
    }

    public Avion() {
       super(10000, 10, 2017, new Motor(), new TrenDeAterrisaje(), "F340", new Tanque());
        this.piloto = "Sanchez";
        this.copiloto = "Hernandez";
        this.asientos = new Asiento();
        this.bodega = new Bodega();
        this.bano = new Bano();
        this.tren = new TrenDeAterrisaje();
        
    
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
        return bodega;
    }

    public void setBodegaCarga(Bodega bodegaCarga) {
        this.bodega = bodegaCarga;
    }

    public Bano getBanos() {
        return bano;
    }

    public void setBanos(Bano banos) {
        this.bano = banos;
    }

    @Override
    public String toString() {
        return 
                "\n\tPiloto: " + piloto +
                "\n\tCopiloto: " + copiloto + 
                 bodega + bano + "\n"+ super.toString();
    }
    
 @Override
  public abstract boolean apagar();

  @Override
  public  abstract boolean reparar();
  
  @Override
  public abstract boolean encender();
}
