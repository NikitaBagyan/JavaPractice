import java.util.Locale;
public class Forgotten {
    public static void main(String[] args) {


        int value = 3434436;
        String str = String.format(Locale.US, "%,d", value);
        System.out.println(str);
    }
}