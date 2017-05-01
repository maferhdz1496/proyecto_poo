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
    private String fabricante;
    private Tanque tanque;
    protected boolean encendido = true;

    public MedioDeTransporte(String fabricante, Tanque tanque) {
        this.fabricante = fabricante;
        this.tanque = tanque;
    }

    public MedioDeTransporte() {
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
        return "\n\tMedioDeTransporte" +
               "\n\tFabricante= " +fabricante + tanque;
    }
    
  public abstract boolean Encender();
   
  public abstract boolean Apagar();
      
  public abstract boolean Reparar();
      
}
