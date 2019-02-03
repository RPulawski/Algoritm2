public class Second {
    public static void main(String[] args) {
        //System.out.println("ile liczb podac? ");
        //Scanner num = new Scanner(System.in);

        evenNumbers(4);
        everyHundred(10);
        doUntilnum(10);


    }

    private static void evenNumbers(int num) {
        int result ;
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
               result = i;
                System.out.println(result);
            }
        }



    }

    private static void everyHundred(int num){
        int number = 0;
        int divided ;

        for (int i = 0; i<= num;i++ ){
            number=number + 100;
            divided = number/10;
            System.out.println(number+" "+divided);
        }



    }
    private static void doUntilnum(int num){
        int number =0;
        do {
            number=number+2;
            System.out.println(number);
        }while (number<=num);
    }
}
