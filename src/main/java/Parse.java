import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parse {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("zadanie1_5.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }

        int sumOfIntegers = 0;
        for (int number : integers) {
            sumOfIntegers = sumOfIntegers + number;
            System.out.println(sumOfIntegers);
        }
    }
}
