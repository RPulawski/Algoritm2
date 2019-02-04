public class DoubleWords {
    public static void main(String[] args) {

        String word1 = "ABBCABBC";
        String word2 = "ABBCABBD";

        System.out.println(checkIfTextContainsDoubleWords(word1));
        System.out.println(checkIfTextContainsDoubleWords(word2));
    }

    private static int checkIfTextContainsDoubleWords(String text) {
        int middle = text.length()/2;
      String wordnr1 = text.substring(0,middle);
      String wordnr2 = text.substring(middle);
      return wordnr1.compareTo(wordnr2);
        }
    }

