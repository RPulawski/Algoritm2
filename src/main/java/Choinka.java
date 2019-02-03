public class Choinka {

    public static void main(String[] args) {
        printFirstTree();
        System.out.println();
        printSecondTree();
        System.out.println();
        printThirdTree();
        System.out.println();
        //printSkos();
    }


    private static void printFirstTree() {
        int[][] tab = new int[6][6];
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i >= j) {
                    tab[i][j] = 1;
                    System.out.print(tab[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static void printSecondTree() {
        int[][] tab = new int[6][6];
        for (int i = 5; i >= 0; i--) {
            for (int j = 5; j >= 0; j--) {
                if (i >= j) {
                    tab[i][j] = 1;
                    System.out.print(tab[i][j]);
                }
            }
            System.out.println();
        }

    }

    private static void printThirdTree() {
        int[][] tab = new int[6][6];
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= 5; j++) {
                if (i <= j) {
                    tab[i][j] = 1;
                    System.out.print(tab[j][i]);
                }

            }System.out.println();
        }
    }

    private static void printSkos() {
        int[][] tab = new int[6][6];
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == j) {
                    tab[i][j] = 1;
                    System.out.print(tab[i][j]);
                }
                System.out.println();
            }
        }
    }
}
