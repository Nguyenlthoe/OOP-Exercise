package hust.soict.globalict.garbage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "";
        FileInputStream file = new FileInputStream("C:\\Users\\APC\\eclipse-workspace\\OtherProject\\src\\input.txt");
        Scanner scanner = new Scanner(file);
        long start = System.currentTimeMillis();
        try {
            while (scanner.hasNext()) {
                str = str + scanner.next();
            }
        } finally {
            try {
                scanner.close();
                file.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
