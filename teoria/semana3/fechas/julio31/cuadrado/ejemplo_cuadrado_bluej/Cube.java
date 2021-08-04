/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Cube extends Square{
    /** Atributos */

    
    /** Constructores */
    public Cube() {
        super(); // Clase padre: Square         
    }
    
    public Cube(double side) {
        // this.side = side;  ERROR! No se puede acceder a atributos privados de otra clase
        super(side);
    }
    
    public Cube(Cube c) {
        // super(c.side); ERROR
        super(c.getSide());
    }
     
    @ Override
    public double perimeter() {
        //return 24*side;  ERROR!!!
        //return 6*(4*getSide());
        return 6*super.perimeter();  // 6*(4*side) ---> super.perimeter() = 4*side
    }
    
    @ Override
    public double area() {
        double A;
        //A = 6*Math.pow(getSide(), 2); // 6*l*l
        A = 6*super.area();
        return A;
    }
    
    public double volume() {
        // double V = Math.pow(side, 3); // ERROR !!!
        double V = Math.pow(getSide(), 3); // ERROR !!!
        return V;
    }   
    
}
