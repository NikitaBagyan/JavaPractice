package Quadrangle;

public class Rhombus extends Quadrangle implements Figure{

    double alpha;
    double beta;

    public Rhombus(int a, int b, String color, double alpha, double beta) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return b * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getLargeDiagonal() {
        double d1 = a * Math.sqrt(2-2*Math.cos(Math.toRadians(beta)));
        double d2 = a * Math.sqrt(2-2*Math.cos(Math.toRadians(alpha)));
        return Math.max(d1,d2) ;
    }

    @Override
    public double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    public String getColor() {
        return color;
    }
}
