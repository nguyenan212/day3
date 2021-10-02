/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;



/**
 *
 * @author ADMIN
 */

public class day3 {
    public static  car getcar(){
        System.out.println("Randomly pick a car");
        int i = (int) (Math.random()*4+1);
        switch (i) {
            case 1:
                return new Toyouta(6,"crown");
            case 2:
                return new Mitsubishi(4," lander");
            case 3:
                return new kia(6,"sorento");
            default:
                return new audi(6,"A4");
        }
    }
    public static void main(String[] args){
        car acar = new car(4,"Honda");
        System.out.println(acar.startEngine());
        System.out.println(acar.accelarate());
        System.out.println(acar.brake());
        
        Mitsubishi mycar = new Mitsubishi(4,"Out lander");
        System.out.println(mycar.startEngine());
        System.out.println(mycar.accelarate());
        System.out.println(mycar.brake());
        
        car newcar;
        newcar = getcar();
        System.out.println(newcar.startEngine());
        System.out.println(newcar.accelarate());
        System.out.println(newcar.brake());
    }
}
