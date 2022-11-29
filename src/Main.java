import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose your selections:1.File reader,2.File writer");
        switch (scanner.nextByte()) {
            case 1 -> getFileReader();
            case 2 -> getFileWriter();
        }
    }
    public static void getFileWriter() {
        try (FileWriter fileWriter = new FileWriter("symbols.txt")) {
            for (char i = 'a', j = 'A'; i <= 'z'; i++, j++) {
                fileWriter.write(j + " " + i + "\n");
            }
            for (int i = 0; i < 10; i++) {
                fileWriter.write(i + "\n");
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public static void getFileReader(){
        try (FileReader fileReader = new FileReader("symbols.txt")){

            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}

