/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

/**
 *
 * @author ADMIN
 */
public class kia extends car {
  
       private String model;

    public kia(int cylinders, String model) {
        super(cylinders, model);
        this.model = model;
    }

    @Override
    public String brake() {
        return "kia "+this.model+" started"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String accelarate() {
        return "kia "+this.model+" is accelating   "; //To change body of generated methods, choose Tools | Templates.
    } 

    @Override
    public String startEngine() {
        return "kia "+this.model+" stopped"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
