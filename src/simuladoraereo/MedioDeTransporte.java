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
public abstract class MedioDeTransporte {
    protected String fabricante;
    protected Tanque tanque;
    protected boolean encendido = true;

    public MedioDeTransporte(String fabricante, Tanque tanque) {
        this.fabricante = fabricante;
        this.tanque = tanque;
    }

    public MedioDeTransporte() {
        this("Aerofabricantes S.A.",new Tanque());
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    @Override
    public String toString() {
        return "\nMEDIO DE TRANSPORTE: " + 
                "\n\tFabricante: " + this.fabricante + "\n" + 
                "\nTANQUE DE COMBUSTIBLE: " + this.tanque.toString();
    }
    
  public abstract boolean encender();
   
  public abstract boolean apagar();
      
  public abstract boolean reparar();
      
}
