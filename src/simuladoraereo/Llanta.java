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
public class Llanta {
    private int presion;

    public Llanta(int presion) {
        this.presion = presion;
    }

    public Llanta() {
        this.presion = 200;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    @Override
    public String toString() {
        return "\n\tLlanta" + 
               "\n\tSu presion es de: " + presion;
    }
    
   
   public boolean InflarLlanta(int presion)  {
     if (presion<0 ){
         System.out.println("Inflando llanta");
         this.setPresion(200);
         return true;
         
     }else{
         System.out.println("Ya estaba inflada"); 
         return false;
     }
  }
  
   
    
   public boolean DesinflarLlanta(int presion)  {
     if (presion>=200 ){
         System.out.println("Desinflando llanta");
         this.setPresion(200);
         return true;
         
     }else{
         System.out.println("Ya estaba desinflada"); 
         return false;
     } 
  } 
   
  
   public boolean VerificarPresion(int presion)  {
    if (presion<200 && presion<150 ){
         System.out.println("La llanta esta en niveles optimos");
         return true;
     }else{
         System.out.println("Iflando a nivel optimo"); 
         this.setPresion(175);
         return false;
     }
     }
   }
