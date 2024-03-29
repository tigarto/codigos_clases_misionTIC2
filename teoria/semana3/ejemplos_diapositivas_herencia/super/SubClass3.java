public class SubClass3 extends SuperClass3 {
    /**
     * This method overrides one of the superclass methods.
     * @param arg An int.
     */
   @Override
   public void showValue(int arg) {
       System.out.println("SUBCLASS: " +
                          "El argumento int era " + arg);
   }
   
   /**
    * This method overloads the superclass methods.
    * @param arg A double.
    */
   public void showValue(double arg) {
       System.out.println("SUBCLASS: " +
                          "El argumento double era " + arg);
   }

}