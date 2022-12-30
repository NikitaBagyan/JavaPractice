public abstract class Car extends Transport implements Rideable{
    String brand;
    int speedHorse;
    boolean isAwd;
    float acceleration;

    public Car(){

        this("mazda",198,false,25);

    }
    public Car(String brand, int speedHorse, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.speedHorse = speedHorse;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        type = "car";
    }

    public float getAcceleration() {
        return acceleration;
    }
    abstract void carStart();

    public void ride(){
        System.out.println("Ridding car");

    }
}
