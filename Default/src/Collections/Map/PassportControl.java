package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class PassportControl {
    public static void main(String[] args) {

        Map<Integer,String> passportMap = new HashMap<>();

        passportMap.put(312654,"Boris Ivanov");
        passportMap.put(312659,"Kirill Ivanov");
        passportMap.put(312213,"Zhora Ivanov");
        passportMap.put(312789,"Kolya Ivanov");
        passportMap.put(312456,"Vasya Ivanov");
        passportMap.put(312258,"Andrey Ivanov");
        passportMap.put(312369,"Robert Ivanov");

        System.out.println(passportMap);
    }
}
