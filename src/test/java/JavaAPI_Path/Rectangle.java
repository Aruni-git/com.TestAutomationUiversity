package JavaAPI_Path;

public class Rectangle {
    protected double length; // Other classes with in the same aockage can access.
    private double width;/*we can declare this without access modifier, I added private to demonstrate encapsulation.
    Encapsulations said make your fields private but using public modifier to the methods can be access by outside of the package*/

    public Rectangle() {
        /*This is a default constructor. Default constructor will start with public access modifier and,
         it will contain the same name as class name. This will not contain any methods. Default constructor is typically using to
         assign default values to the variable to the fields.Constructor are used to initialize object*/
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length; //can be set this way or
        setWidth(width);// this way
    }

    //Method 2, using getter and setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return (2 * length + (2 * width));
    }

    public double calculateArea() {
        return length * width;
    }
}
