public class MoneyGiver {
    public static void main(String[] args) {

        calculateUsedMoney(567.84);
    }

    private static void calculateUsedMoney(double amount) {
        int howMany200 = 0;
        int howMany100 = 0;
        int howMany50 = 0;
        int howMany20 = 0;
        int howMany10 = 0;
        int howMany5 = 0;
        int howMany2 = 0;
        int howMany1 = 0;
        int howMany0_05 = 0;
        int howMany0_02 = 0;
        int howMany0_01 = 0;
        int howMany0_1 = 0;
        int howMany0_2 = 0;
        int howMany0_5 = 0;

        while (amount - 200 >= 0) {
            amount -= 200;
            howMany200++;
        }
        if (howMany200 > 0) {
            System.out.println("uzyto " + howMany200 + " banknotow 200zl");
        }

        while (amount - 100 >= 0) {
            amount -= 100;
            howMany100++;
        }
        if (howMany100 > 0) {
            System.out.println("uzyto " + howMany100 + " banknotow 100zl");
        }
        while (amount - 50 >= 0) {
            amount -= 50;
            howMany50++;
        }
        if (howMany50 > 0) {
            System.out.println("uzyto " + howMany50 + " banknotow 50zl");
        }
        while (amount - 20 >= 0) {
            amount -= 20;
            howMany20++;
        }
        if (howMany20 > 0) {
            System.out.println("uzyto " + howMany20 + " banknotow 20zl");
        }
        while (amount - 10 >= 0) {
            amount -= 10;
            howMany10++;
        }
        if (howMany10 > 0) {
            System.out.println("uzyto " + howMany10 + " banknotow 10zl");
        }
        while (amount - 5 >= 0) {
            amount -= 5;
            howMany5++;
        }
        if (howMany5 > 0) {
            System.out.println("uzyto " + howMany5 + " monet 5zl");
        }
        while (amount - 2 >= 0) {
            amount -= 2;
            howMany2++;
        }
        if (howMany2 > 0) {
            System.out.println("uzyto " + howMany2 + " monet 2zl");
        }
        while (amount - 1 >= 0) {
            amount -= 1;
            howMany1++;
        }
        if (howMany1 > 0) {
            System.out.println("uzyto " + howMany1 + " monet 1zl");
        }
        while (amount - 0.5 >= 0) {
            amount -= 0.5;
            howMany0_5++;
        }
        if (howMany0_5 > 0) {
            System.out.println("uzyto " + howMany0_5 + " monet 50gr");
        }
        while (amount - 0.2 >= 0) {
            amount -= 0.2;
            howMany0_2++;
        }
        if (howMany0_2 > 0) {
            System.out.println("uzyto " + howMany0_2 + " monet 20gr");
        }
        while (amount - 0.1 >= 0) {
            amount -= 0.1;
            howMany0_1++;
        }
        if (howMany0_1 > 0) {
            System.out.println("uzyto " + howMany0_1 + " monet 10gr");
        }
        while (amount - 0.05 >= 0) {
            amount -= 0.05;
            howMany0_05++;
        }
        if (howMany0_05 > 0) {
            System.out.println("uzyto " + howMany0_05 + " monet 5gr");
        }
        while (amount - 0.02 >= 0) {
            amount -= 0.02;
            howMany0_02++;
        }
        if (howMany0_02 > 0) {
            System.out.println("uzyto " + howMany0_02 + " monet 2gr");
        }
        while (amount - 0.01 >= 0) {
            amount -= 0.01;
            howMany0_01++;
        }
        if (howMany0_01 > 0) {
            System.out.println("uzyto " + howMany0_01 + " monet 1gr");
        }
    }
}
