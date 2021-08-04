/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        Square cuadrado1 = new Square(10);
        System.out.println("Lado del cuadrado1: " + cuadrado1.getSide());
        System.out.println("Perimetro del cuadrado1: " + cuadrado1.perimeter());
        System.out.println("Area del cuadrado1: " + cuadrado1.area());
        
        Cube cubo1 = new Cube(100);
        System.out.println("Lado del cubo1: " + cubo1.getSide());
        
        Cube cubo2 = new Cube(cubo1);
        System.out.println("Perimetro del cubo2: " + cubo2.perimeter());
        System.out.println("Area del cubo2: " + cubo2.area());
        System.out.println("Volumen del cubo2: " + cubo2.volume());
    }
}
