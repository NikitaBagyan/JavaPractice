package Collections.Set;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(8);

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(7);
        hashSet1.add(3);
        hashSet1.add(8);
        hashSet1.add(4);

        HashSet<Integer>subtruct = new HashSet<>(hashSet);
        subtruct.removeAll(hashSet1);
        System.out.println(subtruct);
    }
}
