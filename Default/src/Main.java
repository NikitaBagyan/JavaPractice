public class Main {

    public static void main(String[] args) {


        rideRideable(new Car());
        rideRideable(new Boat());
    }
    public static void rideRideable(Rideable rideable){

        rideable.ride();
    }
}
