package model.entities;

public class Rhombus implements Shape{

    private double longerDiagonal;
    private double shorterDiagonal;

    public Rhombus(double longerDiagonal, double shorterDiagonal) {
        this.longerDiagonal = longerDiagonal;
        this.shorterDiagonal = shorterDiagonal;
    }

    @Override
    public double area() {
        return (longerDiagonal * shorterDiagonal) / 2;
    }
}
