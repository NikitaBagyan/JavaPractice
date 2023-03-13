package Calendar;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Encryptor {

    public void encrypt(String word) {
        char[] simbol = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i)) && Character.isUpperCase(word.charAt(i)))
                simbol[i] = (char) ((int) word.charAt(i) + 1);

            else if (Character.isLetter(word.charAt(i)) && Character.isLowerCase(word.charAt(i)))
                simbol[i] = (char) ((int) word.charAt(i) + 1);

            else
                simbol[i] = word.charAt(i);
        }
        String date = "";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        date = dateFormat.format(calendar.getTime());
        System.out.println(word + " " + date);
    }

    public void decode(String word) {
        char[] simbol = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i)) && Character.isUpperCase(word.charAt(i)))
                simbol[i] = (char) ((int) word.charAt(i) - 1);

            else if (Character.isLetter(word.charAt(i)) && Character.isLowerCase(word.charAt(i)))
                simbol[i] = (char) ((int) word.charAt(i) - 1);

            else
                simbol[i] = word.charAt(i);

        }
        String date = "";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        date = dateFormat.format(calendar.getTime());
        System.out.println(word + " " + date);

    }
}