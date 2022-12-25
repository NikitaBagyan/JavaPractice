import java.util.Locale;
import java.util.Scanner;

public class Forgotten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        int value = scanner.nextInt();

        String str = String.format(Locale.US, "%,d", value);

        System.out.println(str);
    }
}