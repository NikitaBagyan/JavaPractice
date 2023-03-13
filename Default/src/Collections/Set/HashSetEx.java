package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Nikis");
        set.add("Dosha");
        set.add("Soha");
        set.add("Roki");
        set.remove("Roki");

        for (String s: set) {
            System.out.println(s);
        }

        System.out.println(set.size());
    }
}
