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
public class Tanque extends Contenedor {
    protected String tipoGasolina;
    protected int litrosGasolina;
    protected boolean listo = false;

    public Tanque(String tipoGasolina, int litrosGasolina, String color, String tamano) {
        super(color, tamano);
        this.tipoGasolina = tipoGasolina;
        this.litrosGasolina = litrosGasolina;
    }

    public Tanque() {
        super("rojo", "grande");
        this.tipoGasolina = "Turbigas";
        this.litrosGasolina = 1000;
    }
   
    public boolean isListo() {
        if (llenarTanque()){
            System.out.println("...Tanque listo...");
            listo = true;
            return true;
        }
        else{
            System.out.println("Llenar tanque...");
            return false;
        }
    
    }

    public void setListo(boolean listo) {
        this.listo = listo;
    }

    
    
    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public int getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(int litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    @Override
    public String toString() {
        return 
                "\n\tTipoGasolina: " + tipoGasolina +
                "\n\tLitrosGasolina: " + litrosGasolina + super.toString();
    }
    
    public boolean liberarTanque(){
        if(litrosGasolina<3000 && litrosGasolina>500) {
         System.out.println("Hay suficiente gasolina...");
         return true;
     }else{
         System.out.println("Vaciando..."); 
         this.setLitrosGasolina(0);
         return false;
     }
    }
      
    public boolean verificarTanque(int litrosGasolina)  {
if (litrosGasolina<3000 && litrosGasolina>0 ){
         System.out.println("Hay gasolina suficiente en el tanque...");
         return true;
     }else{
         System.out.println("Hay mucha o nada de gasolina... cambiando... Ya tiene 3000 lts.");
         this.setLitrosGasolina(3000);
         return false;
     }
    }
         
 
    public boolean llenarTanque()  {
 if(litrosGasolina>0 && litrosGasolina>500) {
         System.out.println("Hay suficiente gasolina...");
         return true;
     }else{
         System.out.println("Llenando tanque..."); 
         this.setLitrosGasolina(3000);
         return false;
     }
    }
}


