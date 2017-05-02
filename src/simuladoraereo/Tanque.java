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
public class Tanque {
    private String tipoGasolina;
    private int litrosGasolina;

    public Tanque(String tipoGasolina, int litrosGasolina) {
        this.tipoGasolina = tipoGasolina;
        this.litrosGasolina = litrosGasolina;
    }

    public Tanque() {
        this.tipoGasolina = "MAGNA";
        this.litrosGasolina = 3000;
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
        return "\n\tTanque" +
                "\n\tTipoGasolina= " + tipoGasolina +
                "\n\tLitrosGasolina= " + litrosGasolina;
    }
    
    public boolean LiberarTanque(){
        if(litrosGasolina<3000 && litrosGasolina>500) {
         System.out.println("Hay sificiente gasolina");
         return true;
     }else{
         System.out.println("Vaciando a nivel optimo"); 
         this.setLitrosGasolina(3000);
         return false;
     }
    }
      
    public boolean VerificarTanque(int litrosGasolina)  {
if (litrosGasolina<3000 && litrosGasolina>0 ){
         System.out.println("Hay gasolina en el tanque");
         return true;
     }else{
         System.out.println("No hay gasolina.Favor de llenar el tanque"); 
         this.setLitrosGasolina(3000);
         return false;
     }
    }
         
 
    public boolean LlenarTanque()  {
 if(litrosGasolina<0 && litrosGasolina<500) {
         System.out.println("Hay suficiente gasolina");
         return true;
     }else{
         System.out.println("Llenando tanque"); 
         this.setLitrosGasolina(3000);
         return false;
     }
    }
}

