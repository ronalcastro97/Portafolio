/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;


public class Vehiculo {
  private String marca;
  private String modelo;
  private String patente;
    
    public void acelerar(){
        System.out.println("Acelerando...");
         
    }
     public void frenar(){
        System.out.println("Frenando...");
         
    }
     private void chequearMotor(){
         System.out.println("Chequeando motor...");
     }

    public String getMarca() {
        return marca;
    }
     
      public void encender(){
        chequearMotor();
        System.out.println("Encendiendo...");
         
    }
}
