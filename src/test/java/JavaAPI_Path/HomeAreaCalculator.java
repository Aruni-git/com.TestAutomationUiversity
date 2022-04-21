package JavaAPI_Path;

public class HomeAreaCalculator {
    //we are gonna create instances for rectangle class

    public static void main(String args[]) {
        /*Rectangle 1*/

        //Create instance of Rectangle class using a default constructor
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /*Rectangle 2*/

        //Create instance of Rectangle class using a non default constructor
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms:" + totalArea);
    }
}
