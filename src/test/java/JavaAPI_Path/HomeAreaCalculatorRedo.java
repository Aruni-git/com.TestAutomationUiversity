package JavaAPI_Path;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*If we use like this  Rectangle kitchen = getRoom(); it will say non-static getRoom method cannot be reference from the static methods.
         * So let's create a new object*/
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is:" + area);

        calculator.scanner.close();
    }

    public Rectangle getRoom() {

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

      /* Rectangle room = new Rectangle(length,width); we can create an object like this and return the room but this is not using except for return
        so it is kind of waste. Instead of this we can return this new Rectangle(length,width) */

        return new Rectangle(length, width);
    }

    private static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {

        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
