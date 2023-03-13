package Collections.Car;

import java.util.*;

public class Main {

    private static final String TOYOTA = "Toyota";
    private static final String KIA = "KIA";
    private static final String BMW = "BMW";

    public static void main(String[] args) {

        Car car1 = new Car(TOYOTA, "camri", false);
        Car car2 = new Car(KIA, "rio", false);
        Car car3 = new Car(BMW, "X5", false);
        Car car4 = new Car(BMW, "X3", false);
        Car car5 = new Car(BMW, "X6", false);
        Car car6 = new Car(TOYOTA, "RAW 4", true);
        Car car7 = new Car(KIA, "ceed", false);
        Car car8 = new Car(TOYOTA, "yaris", false);
        Car car9 = new Car(BMW, "320i", false);
        Car car10 = new Car(TOYOTA, "corolla", false);
        Car car11 = new Car(TOYOTA, "camri", false);
        Car car12 = new Car(KIA, "rio", false);
        Car car13 = new Car(BMW, "X5", false);
        Car car14 = new Car(BMW, "X3", false);
        Car car15 = new Car(BMW, "X6", false);
        Car car16 = new Car(TOYOTA, "RAW 4", true);
        Car car17 = new Car(KIA, "ceed", false);
        Car car18 = new Car(TOYOTA, "yaris", false);
        Car car19 = new Car(BMW, "320i", false);
        Car car20 = new Car(TOYOTA, "corolla", false);
        Car car21 = new Car(TOYOTA, "camri", false);
        Car car22 = new Car(KIA, "rio", false);
        Car car23 = new Car(BMW, "X5", false);
        Car car24 = new Car(BMW, "X3", false);
        Car car25 = new Car(BMW, "X6", false);
        Car car26 = new Car(TOYOTA, "RAW 4", true);
        Car car27 = new Car(KIA, "ceed", false);
        Car car28 = new Car(TOYOTA, "yaris", false);
        Car car29 = new Car(BMW, "320i", false);
        Car car30 = new Car(TOYOTA, "corolla", false);

        List<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);
        carList.add(car17);
        carList.add(car18);
        carList.add(car19);
        carList.add(car20);
        carList.add(car21);
        carList.add(car22);
        carList.add(car23);
        carList.add(car24);
        carList.add(car25);
        carList.add(car26);
        carList.add(car27);
        carList.add(car28);
        carList.add(car29);
        carList.add(car30);

//        Map<Car,Integer> carMap = new HashMap<>();
//
//        for (Car car : carList){
//            if(carMap.containsKey(car)) {
//                int value = carMap.get(car);
//                carMap.put(car, ++value);
//            }else {
//                carMap.put(car,1);
//            }
//        }
//        for(Map.Entry<Car,Integer> carEntry : carMap.entrySet()){
//            System.out.println(carEntry.getKey()+ " = " + carEntry.getValue());
//        }

        Set<Car> carSet = new TreeSet<>(new CarComparator());
        carSet.addAll(carList);
        for(Car car : carSet){
            System.out.println(car.getName());
        }


//        for (Car car :carList){
//            if(car.getBrand().equals("KIA")){
//                carList.remove(car);
//            } else if (car.getBrand().equals("TOYOTA")) {
//                car.setOnSale(true);
//            }
//
//        }

//        Iterator<Car> iterator = carList.iterator();
//
//        while (iterator.hasNext()){
//            Car car = iterator.next();
//            if(car.getBrand().equals(KIA)){
//                iterator.remove();
//            } else if (car.getBrand().equals(TOYOTA)) {
//                car.setOnSale(true);
//            }
//        }
//
//        for (Car car: carList) {
//            System.out.println(car);
//        }
   }
}
