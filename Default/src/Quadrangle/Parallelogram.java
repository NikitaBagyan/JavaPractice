package Quadrangle;

public class Parallelogram extends Quadrangle implements Figure {

    double alpha, beta;

    public Parallelogram(int a, int b, String color, double alpha, double beta) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return Math.max(a,b) * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getLargeDiagonal() {
        double d1 = (a * a + b * b - 2 * b * a * Math.cos(Math.toRadians(beta)));
        double d2 = (a * a + b * b + 2 * b * a * Math.cos(Math.toRadians(alpha)));
        return Math.max(d1,d2);
    }

    @Override
    public double getHeight() {
        return a * Math.min(a * Math.sin(Math.toRadians(alpha)), b * Math.sin(Math.toRadians(beta)));
    }

    @Override
    public String getColor() {
        return color;
    }
}
