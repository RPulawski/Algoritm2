public class Choinka {

    public static void main(String[] args) {
        printFirstTree(6);
        System.out.println();
        printSecondTree(6);
        System.out.println();
        printThirdTree(6);
        System.out.println();
        printFourthTree(6);
        System.out.println();
        printSkos(6);
        System.out.println();
        printO(6);
        System.out.println();
        printX(6);
    }


    private static void printFirstTree(int number) {
        for (int row = 0; row <= number; row++) {
            String line = "";
            for (int column = 0; column <= number; column++) {
                if (row <= column) {
                    line += " ";
                } else {
                    line += "*";
                }
            }
            System.out.println(line);
        }
    }

    private static void printSecondTree(int number) {
        for (int row = 0; row <= number; row++) {
            String line = "";
            for (int column = number - 1; column >= 0; column--) {
                if (row <= column) {
                    line += "*";
                } else {
                    line += " ";
                }
            }

            System.out.println(line);
        }
    }

    private static void printThirdTree(int number) {
        for (int row = 0; row <= number; row++) {
            String line = "";
            for (int column = number - 1; column >= 0; column--) {
                if (row <= column) {
                    line += " ";
                } else {
                    line += "*";
                }
            }
            System.out.println(line);
        }
    }

    private static void printFourthTree(int number) {
        for (int row = 0; row <= number; row++) {
            String line = "";
            for (int column = 0; column <= number - 1; column++) {
                if (row <= column) {
                    line += "*";
                } else {
                    line += " ";
                }
            }
            System.out.println(line);
        }
    }


    private static void printSkos(int number) {
        int front = 0;
        for (int row = 0; row < number; row++) {
            String line = "";
            for (int column = 0; column < number; column++) {
                if (column == front) {
                    line += "*";
                } else {
                    line += " ";
                }
            }
            front++;
            System.out.println(line);
        }
    }

    private static void printO(int number) {
        int front = 0, back = number - 1;
        for (int row = 0; row < number; row++) {
            String line = "";
            for (int column = 0; column <= number - 1; column++) {
                if (column == front || column == back || row == front || row == back) {
                    line += "*";
                } else {
                    line += " ";
                }
            }
            System.out.println(line);
        }
    }

    private static void printX(int number) {
        int front = 0, back = number - 1;
        for (int row = 0; row < number; row++) {
            String line = "";
            for (int column = 0; column < number; column++) {
                if (column == front || column == back) {
                    line += "*";
                } else {
                    line += " ";
                }
            }
            front++;
            back--;
            System.out.println(line);
        }


    }
}
