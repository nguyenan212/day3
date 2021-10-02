/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

/**
 *
 * @author ADMIN
 */
public class Mitsubishi extends car {
  
       private String model;

    public Mitsubishi(int cylinders, String model) {
        super(cylinders, model);
        this.model = model;
    }

    @Override
    public String brake() {
        return "Mitsubishi "+this.model+" started"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String accelarate() {
        return "Mitsubishi "+this.model+"is accelating   "; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String startEngine() {
        return "Mitsubishi "+this.model+"stopped"; //To change body of generated methods, choose Tools | Templates.
    }
   
}
