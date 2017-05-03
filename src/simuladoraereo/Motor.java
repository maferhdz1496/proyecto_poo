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
public class Motor {
    
   protected String marca;
   protected int potencia;
   protected boolean encendidoM = false;
   protected Turbina turbina;
   protected boolean listo = false;

    public Motor(String marca, int potencia, Turbina Turbina) {
        this.marca = marca;
        this.potencia = potencia;
        this.turbina = turbina;
    }

    public Motor() {
        this.marca = "Falcon 9000";
        this.potencia = 100;
        this.turbina = new Turbina();
        
    }

    public boolean isListo() {
        if (encenderMotor()){
            System.out.println("...Motor listo...");
            listo = true;
            return true;
        }
        else{
            System.out.println("Encender motor...");
            return false;
        }
    }
   

    public void setListo(boolean listo) {
        this.listo = listo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
            this.potencia = potencia;
    }
    

    public boolean isEncendidoM() {
        return encendidoM;
    }

    public void setEncendidoM(boolean encendidoM) {
        this.encendidoM = encendidoM;
    }

    public Turbina getTurbina() {
        return turbina;
    }

    public void setTurbina(Turbina Turbina) {
        this.turbina = Turbina;
    }

    @Override
    public String toString() {
        return "\nMOTOR: " + 
                "\n\tMarca: " + marca +
                "\n\tEsta encendido... " + isEncendidoM() +
                "\n\tPotencia: " + potencia  +
                turbina.toString() + "\n";
    }
   
   
   
   
   public boolean encenderMotor(){
        if(encendidoM){
            System.out.println("Motor ya encendido...");
            return false;
        }
        else{
            if(turbina.haceRotacion()){
            System.out.println("Encendiendo motor...");
            this.encendidoM = true;
            return true;
            }
            else{
            System.out.println("Problema con motor...");
            return false;
            }
        }
    }
  
   public boolean apagarMotor()  {
       if(this.encendidoM){
            this.encendidoM = true;
            turbina.desRotacion();
            System.out.println("Apagando motor...");
            return false;
            
        } else {
            this.encendidoM = false;
            System.out.println("Ya estaba apagado...");
            return true;
        } 
    }
   
   public boolean subirPotencia()  {
       if(potencia <= 0 && potencia>100){
           System.out.println("Subiendo potencia...");
            return true;
        } else {
                System.out.println("Sobrepasa niveles ...");
            return false;
        }
    }
   
   public boolean bajarPotencia()  {
       if(potencia >= 100){
           System.out.println("Bajando potencia...");
           return true;
        } else {
            System.out.println("La potencia ya no se puede bajar si no el avion cae...");
            return false;
        }
    }
      
 
           
}
