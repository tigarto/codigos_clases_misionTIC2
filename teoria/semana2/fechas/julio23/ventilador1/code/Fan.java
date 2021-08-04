
/**
 * Write a description of class Fan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fan
{
    // instance variables - replace the example below with your own
    private int speed;   // SLOW = 1, MEDIUM = 2, FAST = 3
    private boolean on;
    private double radius;
    private String color; 

    /**
     * Constructor for objects of class Fan
     */
    public Fan()
    {
        // initialise instance variables
        speed = 1; // SLOW = 1
        radius = 5;
        color = "Blue";
        on = false;
    }
    
    public Fan(int vel, double r, String c, boolean on_off)
    {
        // initialise instance variables
        speed = vel; 
        radius = r;
        color = c;
        on = on_off;
    }

    /**
     * Metodos
     */
    public int getSpeed()
    {
        return speed;
    }
    
    public void setSpeed(int vel)
    {
        speed = vel;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double r)
    {
        radius = r;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String c)
    {
        color = c;
    }
    
    public void turnON() {
        on = true;
    }
    
    public void turnOFF() {
        on = false;
    }
    
    public boolean isON() {
        return on;    
    }
}
