
/**
 * Write a description of class Clock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clock
{
    // Variables de instancia
    private int hr;  // horas
    private int min; // minutos
    private int sec; // segundos

    /**
     * Constructor for objects of class Clock
     */
    public Clock()
    {
        // initialise instance variables
        hr = 0; 
        min = 0; 
        sec = 0;
    }
    
    /**
     * Constructor for objects of class Clock
     */
    public Clock(int hours, int minutes, int seconds)
    {
        // initialise instance variables
        hr = hours; 
        min = minutes; 
        sec = seconds;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setTime(int hours, int minutes, int seconds) {
        if (0 <= hours && hours < 24) {
            hr = hours;
        }
        else {
            hr = 0;
        }
        if (0 <= minutes && minutes < 60) {
            min = minutes;
        }
        else {
            min = 0;
        }
        if (0 <= seconds && seconds < 60) {
            sec = seconds;
        }
        else {
            sec = 0;
        }
    }
    
    public int getHours() {
        return hr;
    }
    
    public int getMinutes() {
        return min;
    }
    
    public int getSeconds() {
        return sec;
    }
    
    public void printTime() {
        if (hr < 10)
            System.out.print("0");
        System.out.print(hr + ":");
        if (min < 10)
            System.out.print("0");
        System.out.print(min + ":");
        if (sec < 10)
            System.out.print("0");
        System.out.print(sec);
    }
    
    public void incrementSeconds() {
    sec++;
    if (sec > 59) {
      sec = 0;
      incrementMinutes(); //incrementa los minutos
    }
  }
  
  public void incrementMinutes() {
    min++;
    if (min > 59) {
      min = 0;
      incrementHours(); //incrementa las horas
    }
  }
  
  public void incrementHours() {
    hr++;
    if (hr > 23)
      hr = 0;
  }
    
  public boolean equals(Clock otherClock) {
    return (hr == otherClock.hr
            && min == otherClock.min
            && sec == otherClock.sec);
  }
  
  public void makeCopy(Clock otherClock) {
    hr = otherClock.hr;
    min = otherClock.min;
    sec = otherClock.sec;
  }
  
  public Clock getCopy() {
    Clock temp = new Clock();
    temp.hr = hr;
    temp.min = min;
    temp.sec = sec;
    return temp;
  }
}
