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
    
   private String marca;
   private int potencia;
   private boolean encendidoM = false;
   private Turbina Turbina;

    public Motor(String marca, int potencia, Turbina Turbina) {
        this.marca = marca;
        this.potencia = potencia;
        this.Turbina = Turbina;
    }

    public Motor() {
         this.marca = "Falcon 9000";
        this.potencia = 100;
        
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
        if(potencia >= 0 && potencia <= 100){
            this.potencia = potencia;
        } else {
            System.out.println("La potencia debe de estar entre 0 y 100");
        }
    }
    

    public boolean isEncendidoM() {
        return encendidoM;
    }

    public void setEncendidoM(boolean encendidoM) {
        this.encendidoM = encendidoM;
    }

    public Turbina getTurbina() {
        return Turbina;
    }

    public void setTurbina(Turbina Turbina) {
        this.Turbina = Turbina;
    }

    @Override
    public String toString() {
        return "\n\tMotor" +
                "\n\tMarca= " + marca +
                "\n\tPotencia= " + potencia +
                "\n\tEncendido= " + encendidoM +
                "\n\tTurbina= " + Turbina;
    }
   
   
   
   
   public boolean EncenderMotor()  {
       if(this.encendidoM){
            this.encendidoM = false;
            System.out.println("Prendiendo motor");
            return true;
            
        } else {
            this.encendidoM = true;
            System.out.println("Ya estaba prendido");
            return false;
        } 
  }
  
   public boolean ApagarMotor()  {
       if(this.encendidoM){
            this.encendidoM = true;
            System.out.println("Apagando motor");
            return false;
            
        } else {
            this.encendidoM = false;
            System.out.println("Ya estaba apagado");
            return true;
        } 
  }
   
   public boolean SubirPotencia(int potencia)  {
       if(potencia >= 0 && potencia <= 50){
           System.out.println("Subiendo potencia");
            return true;
            
        } else {
            System.out.println("La potencia ya esta en niveles optimos");
            return false;
        }
    }
   
   public boolean BajarPotencia(int potencia)  {
       if(potencia >= 100 && potencia <= 50){
           System.out.println("Bajando potencia");
           return true;
        } else {
            System.out.println("La potencia ya no se puede bajar si no el avion cae");
            return false;
        }
    }
      
 
           
}
