package Transports;

public class Car extends Transport {

    int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
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

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
