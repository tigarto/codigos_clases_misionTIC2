class DClass extends BClass {
    private int dA;
    public DClass() {
        super();
        dA = 0;
    }
    
    public DClass(char ch, double v, int a) {
        super(ch, v);
        dA = a;
    }
    
    public void setDatos(char ch, double v, int a) {
        super.setDatos(v);
        bCh = ch; // inicializa bCh utilizando la instruccion
                  // de asignacion
        dA = a;
    }
    
    public String toString() {
        return (super.toString() + "SubClase dA = " + dA + '\n');        
    }
}
