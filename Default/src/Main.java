public class Main {

    public static void main(String[] args) {


        Car sedan = new Sedan();
        sedan.carStart();
       // rideRideable(new Boat());
    }
    public static void rideRideable(Rideable rideable){

        rideable.ride();
    }
}
