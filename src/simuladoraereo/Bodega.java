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
    private int carga;
    

    public Bodega(int carga) {
        this.carga = carga;
    }

    public Bodega() {
        this.carga = 1000;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }



    @Override
    public String toString() {
        return "\n\tBodega" + 
               "\n\tLa carga tiene " + carga + "lts." ;
    }

 public boolean LlenarBodega(int carga){
            if(this.getCarga()>=2000){
                System.out.println("Se esta llenando la bodega");
                this.setCarga(2000);
            return true;     
    } else {
            System.out.println("La carga esta llena");
            return false; 
            }
    }
      
 public boolean VaciarBodega(int carga)  {
     if (this.getCarga()>=2000){
         System.out.println("Se esta vaciando la bodega");
         this.setCarga(0);
         return true;
         
     }else{
         System.out.println("Ya estaba vacio"); 
         return false;
     }
  }
 
 public boolean VerificarPeso(int carga){
     if (this.getCarga()>=2000){
         System.out.println("No se puede despegar, cambiar carga");
         return true;
         
     }else{
         System.out.println("Puede despegar...."); 
         return false;
     }
  }
 }
 
 

