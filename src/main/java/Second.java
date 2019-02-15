public class Second {
    public static void main(String[] args) {

        evenNumbers(5);
        System.out.println();
        everyHundred(10);
        System.out.println();
        plusTwo(6);
        System.out.println();
        squareRoot(7);
        System.out.println();
        fibonacci(8);


    }

    private static void evenNumbers(int num) {
        int result;
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                result = i;
                System.out.print(result + " ");
            }
        }


    }

    private static void everyHundred(int num) {
        int number = 0;
        int divided;

        for (int i = 0; i <= num; i++) {
            number = number + 100;
            divided = number / 10;
            System.out.print(number + " " + divided + " ");
        }

    }


    private static void plusTwo(int num) {
        int result = 0;
        for (int i = 0; i < num; i++) {
            if (i < num / 2) {
                result += 2;
            } else {
                result -= 2;
            }
            System.out.print(result + " ");
        }
    }

    private static void squareRoot(int num) {
        int result;
        for (int i = 1; i < num; i++) {
            result = i * i;
            System.out.print(result + " ");
        }

    }

    private static void fibonacci(int num) {
        int result;
        int previous = 0;
        int next = 1;
        for (int i = 0; i < num; i++){
            result = previous+next;
            previous = next;
            next= result;
            System.out.print(result+ " ");
        }
    }
}
