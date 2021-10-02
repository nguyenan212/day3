/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

/**
 *
 * @author ADMIN
 */
public class car {
    private boolean engine ;
    private int cylinders;
    private String name;
    private int wheel ;
    
    public String startEngine(){
        return "Car's engine started";
    } 
    public String accelarate(){
        return "Car is accelarating";
    }
    public String brake(){
        return "Car stopped";
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheel() {
        return wheel;
    }

    public car (int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheel = 4;
        this.engine = true;
    }
    
}
