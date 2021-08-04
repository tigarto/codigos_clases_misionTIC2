public class RectangleDemo2 {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(10, 20);
        // box.setLength(10.0);
        // box.setWidth(20.0);
        
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
    }
}
