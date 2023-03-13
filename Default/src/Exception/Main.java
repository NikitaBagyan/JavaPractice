package Exception;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    static String str;

    public static void main(String[] args) throws IOException {

        String str = "https";
        InputStream inputStream;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("people.json");

            URL url = new URL(str);
            inputStream = url.openStream();

            fileOutputStream.write(inputStream.readAllBytes());

        } catch (MalformedURLException e) {

            try (Writer configWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                 FileInputStream inputStream1 = new FileInputStream("src/exception/config.txt");
                 Reader configReader = new InputStreamReader(inputStream1, StandardCharsets.UTF_8)) {


                int c;
                while ((c = configReader.read()) != -1) {
                    configWriter.write(c);
                }
                }
            catch (IOException ioException){
                    System.out.println("Exception");

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

