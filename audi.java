/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

/**
 *
 * @author ADMIN
 */
public class audi extends car {
  
       private String model;

    public audi(int cylinders, String model) {
        super(cylinders, model);
        this.model = model;
    }

  
    @Override
    public String brake() {
        return "audi "+this.model+" started"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String accelarate() {
        return "audi "+this.model+" is accelating   "; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String startEngine() {
        return "audi "+this.model+" stopped"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
