package Collections.Pets;

import java.util.Comparator;

public class CompareToNickname implements Comparator<Pets>{

    @Override
    public int compare(Pets o1, Pets o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
