public class BClass {
    protected char bCh;
    private double bX;
    
    //Constructor predeterminado
    public BClass() {
        bCh = '*';
        bX = 0.0;
    }
    
    //Constructor con parametros
    public BClass(char ch, double u) {
        bCh = ch;
        bX = u;
    }
    
    public void setDatos(double u) {
        bX = u;
    }
    
    public void setDatos(char ch, double u) {
        bCh = ch;
        bX = u;
    }
    
    public String toString() {
        return ("Superclase: bCh = " + bCh + ", bX = "
                + bX + '\n');
    }
}