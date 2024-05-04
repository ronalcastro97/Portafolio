/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package muestraprotected;

import vehiculos.*;



public class Herenciaa {

    public static void main(String[] args) {
        Auto a= new Auto();
        Moto m= new Moto();
        Vehiculo v= new Vehiculo();
        m.encender();
        m.getMarca();
        System.out.println(v.marca);
    }
}
