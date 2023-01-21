package Transports;

public class Plane extends Transport {
    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }

    @Override
    boolean canMove(int n) {
        if (fuel >= n) {
            fuel -= n;
            return true;
        } else return false;
    }

    @Override
    int getFuelLevel() {
        return fuel;
    }

    public void fillFuel(int n) {
        fuel += n;
    }
}