import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please input file path: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String nameFile = bufferedReader.readLine();
        
        FileReader fileReader = new FileReader(nameFile);
        BufferedReader reader = new BufferedReader(fileReader);

        while (reader.ready()) {
            String stringContainer = reader.readLine();

            System.out.println(new StringBuilder(stringContainer).reverse().toString());
        }
        bufferedReader.close();
        fileReader.close();
        reader.close();
    }
}
