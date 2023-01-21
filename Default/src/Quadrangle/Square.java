package Quadrangle;

public class Square extends Quadrangle implements Figure{
    public Square(int a,String color) {
        super(a,a,color);
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return a * 2 + b * 2;
    }

    @Override
    public double getLargeDiagonal() {
        return (a * Math.sqrt(2));
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public String getColor() {
        return color;
    }
}
