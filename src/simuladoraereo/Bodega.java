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
public class Bodega {
    protected int carga;
    protected boolean listo = false;

    public Bodega(int carga) {
        this.carga = carga;
    }

    public Bodega() {
        this.carga = 1000;
    }

    public boolean isListo() {
        if (LlenarBodega(carga)){
            System.out.println("...Bodega lista...");
            listo = true;
            return true;
        }
        else{
            System.out.println("Llenar bodega...");
            return false;
        }
    }
   

    public void setListo(boolean listo) {
        this.listo = listo;
    }
    

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
        
    }



    @Override
    public String toString() {
        return "\nBODEGA DE CARGA:" + 
               "\n\tLa carga tiene " + carga + "kg." ;
    }

 public boolean LlenarBodega(int carga){
            if(this.getCarga()<=2000){
                System.out.println("Se esta llenando la bodega...");
                this.setCarga(2000);
            return true;     
    } else {
            System.out.println("La bodega esta muy llena favor de vaciarla...");
            return false; 
            }
    }
      
 public boolean VaciarBodega(int carga)  {
     if (this.getCarga()>=2000){
         System.out.println("Se esta vaciando la bodega...");
         this.setCarga(0);
         return true;
         
     }else{
         System.out.println("La bodega esta casi vacia, favor de llenarla..."); 
         return false;
     }
  }
  public boolean verificarBodega(int carga)  {
if (carga<2000 && carga>0 ){
         System.out.println("Hay carga suficiente en la bodega...");
         return true;
     }else{
         System.out.println("Hay mucha o nada de carga... cambiando... Ya tiene 2000 kg.");
         this.setCarga(2000);
         return false;
     }
    }
 }
 
 

