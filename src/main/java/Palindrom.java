import org.apache.commons.lang3.StringUtils;

public class Palindrom {
    public static void main(String[] args) {
        checkIfTextIsPalindrom("Kajak");
        checkIfTextIsPalindrom("kojak");
        checkIfTextIsPalindrom("A to kanapa pana Kota");
        checkWithoutApache("Kajak");
        checkWithoutApache("Kojak");
        checkWithoutApache("A to kanapa pana Kota");
    }

    private static void checkIfTextIsPalindrom(String text) {
        String preparedText = text.toLowerCase().replaceAll(" ", "");
        String reverse = StringUtils.reverse(preparedText);
        if (reverse.equals(preparedText)) {
            System.out.println("ok");
        } else {
            System.out.println("nie jest");
        }
    }

    private static void checkWithoutApache(String text) {
        String preparedText = text.toLowerCase().replaceAll(" ","");
        int counter = 0;
        for (int i = 0; i < preparedText.length(); i++) {
            if ( preparedText.charAt(i)== preparedText.charAt(preparedText.length()-i -1)) {
                counter++;
            }
        }
        if(counter == preparedText.length()){
            System.out.println("jest");
        }else{
            System.out.println("nie jest");
        }
    }
}
