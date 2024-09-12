package model.entities;

public class Rhombus implements Shape{

    private double longerDiagonal;
    private double shorterDiagonal;

    public Rhombus(double longerDiagonal, double shorterDiagonal) {
        this.longerDiagonal = longerDiagonal;
        this.shorterDiagonal = shorterDiagonal;
    }

    public double getLongerDiagonal() {
        return longerDiagonal;
    }

    public void setLongerDiagonal(double longerDiagonal) {
        this.longerDiagonal = longerDiagonal;
    }

    public double getShorterDiagonal() {
        return shorterDiagonal;
    }

    public void setShorterDiagonal(double shorterDiagonal) {
        this.shorterDiagonal = shorterDiagonal;
    }

    @Override
    public double area() {
        return (longerDiagonal * shorterDiagonal) / 2;
    }
}
