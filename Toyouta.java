/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

/**
 *
 * @author ADMIN
 */
public class Toyouta extends car {
  
       private String model;

    public Toyouta(int cylinders, String name) {
        super(cylinders, name);
        this.model = model;
    }

    @Override
    public String brake() {
        return "Toyouta "+this.model+" started"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String accelarate() {
        return "Toyouta "+this.model+" is accelating   "; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String startEngine() {
        return "Toyouta "+this.model+" stopped"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
