package application;

import model.entities.*;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Shape rectangle = new Rectangle(3.0, 4.0);
        Shape circle = new Circle(2.0);
        Shape triangle = new Triangle(8.0, 5.0);
        Shape rhombus = new Rhombus(10, 6);
        Shape square = new Square(8);

        System.out.println("Rectangle area: " + String.format("%.2f", rectangle.area()));
        System.out.println("Circle area: " + String.format("%.2f", circle.area()));
        System.out.println("Triangle area: " + String.format("%.2f", triangle.area()));
        System.out.println("Rhombus area: " + String.format("%.2f", rhombus.area()));
        System.out.println("Square area: " + String.format("%.2f", square.area()));
    }
}
