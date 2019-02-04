import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe z przedzialu 1 do 100000: ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println(checkIfNumberIsFirst(liczba));
    }

    private static boolean checkIfNumberIsFirst(int liczba) {
        int counter = 0;
      for( int i =2; i<=liczba/2; i++){
         if(liczba%i == 0){
             counter++;
         }
      }
      return counter == 0;


    }
}
