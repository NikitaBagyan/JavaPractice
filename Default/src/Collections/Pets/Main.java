package Collections.Pets;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Pets pet1 = new Pets("doberman","zhora",15);
        Pets pet2 = new Pets("Pudel","igor",12);
        Pets pet3 = new Pets("Shpic","vasya",5);
        Pets pet4 = new Pets("York","sharik",65);
        Pets pet5 = new Pets("Tacsa","bobik",25);

        Set <Pets> petsSet = new TreeSet<>();
        petsSet.add(pet1);
        petsSet.add(pet2);
        petsSet.add(pet3);
        petsSet.add(pet4);
        petsSet.add(pet5);

        System.out.println(petsSet);

        Set <Pets> petsSet1 = new TreeSet<>(new CompareToNickname());
        petsSet1.addAll(petsSet);
        System.out.println(petsSet1);
        }
    }

