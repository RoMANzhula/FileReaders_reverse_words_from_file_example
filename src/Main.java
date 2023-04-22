import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please input file path: "); //просим пользователя ввести путь к файлу, с которого будем считывать слова
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //создаем буферизированный
        // поток для ввода данных с клавиатуры
        String nameFile = bufferedReader.readLine(); //создаем строковую переменную, в которую будем считывать введенный пользователем
        // путь к файлу
        FileReader fileReader = new FileReader(nameFile); //открываем поток для чтения символьных данных из файла
        BufferedReader reader = new BufferedReader(fileReader); //открываем буферизированный поток, чтобы оптимизировать
        //работу потока FileReader

        while (reader.ready()) { //цикл будет работать, пока в потоке для чтения будут символьные данные
            String stringContainer = reader.readLine(); //создаем контейнер для символов, в который будем читать сразу целую
            //целую строку (строка - набор символов до ввода переноса строки Enter)

            System.out.println(new StringBuilder(stringContainer).reverse().toString()); //выводим в консоль все считанные
            //символы в зеркальном отображении (для этого используем класс StringBuilder и метод reverse())
        }
        bufferedReader.close(); //очищаем ресурсы, закрываем поток
        fileReader.close(); //очищаем ресурсы, закрываем поток
        reader.close(); //очищаем ресурсы, закрываем поток
    }
}