public class MoneyMaker {
    public static void main(String[] args) {
//TODO nie dziala jak powinno
        calculateCash(6729.98);
    }

    private static void calculateCash(double amount) {
        int grosz = (int) (amount*100);

        int jedenZL = grosz/100;
        grosz = grosz%100;

        int dwaZL = jedenZL/2;
        jedenZL = jedenZL%2;

        int piecZL = jedenZL/5;
        jedenZL = jedenZL%5;

        int dziesiecZL = piecZL/2;
        piecZL = piecZL%2;

        int dwadziesciaZL = dziesiecZL/2;
        dziesiecZL = dziesiecZL%2;

        int piecdziesiatZL = dziesiecZL/5;
        dziesiecZL = dziesiecZL%5;

        int stoZL = piecdziesiatZL/2;
        piecdziesiatZL = piecdziesiatZL%2;

        int dwiescieZL = stoZL/2;
        stoZL = stoZL%2;

        int piecdziesiatGR = grosz/50;
        grosz = grosz%50;

        int dwadziesciaGR = grosz/20;
        grosz = grosz%20;

        int dziesiecGR = grosz/10;
        grosz = grosz%10;

        int piecGR = grosz/5;
        grosz = grosz%5;

        int dwaGR = grosz/2;
        grosz = grosz%2;

        System.out.println("uzyto "+ dwiescieZL+ " banknotow 200zl");
        System.out.println("uzyto "+ stoZL+ " banknotow 100zl");
        System.out.println("uzyto "+ piecdziesiatZL+ " banknotow 50zl");
        System.out.println("uzyto "+ dwadziesciaZL+ " banknotow 20zl");
        System.out.println("uzyto "+ dziesiecZL+ " banknotow 10zl");
        System.out.println("uzyto "+ piecZL+ " monet 5zl");
        System.out.println("uzyto "+ dwaZL+ " monet 2zl");
        System.out.println("uzyto "+ jedenZL+ " monet 1zl");
        System.out.println("uzyto "+ piecdziesiatGR+ " monet 50gr");
        System.out.println("uzyto "+ dwadziesciaGR+ " monet 20gr");
        System.out.println("uzyto "+ dziesiecGR+ " monet 10gr");
        System.out.println("uzyto "+ piecGR+ " monet 5gr");
        System.out.println("uzyto "+ dwaGR+ " monet 2gr");
        System.out.println("uzyto "+ grosz+ " monet 1gr");

    }
}
