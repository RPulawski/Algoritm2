import org.apache.commons.lang3.StringUtils;

public class Palindrom {
    public static void main(String[] args) {
        checkIfTextIsPalindrom("Kajak");
        checkIfTextIsPalindrom("kjak");
        checkIfTextIsPalindrom("A to kanapa pana Kota");
    }

    private static void checkIfTextIsPalindrom(String text) {
        String textnew = text.toLowerCase().replaceAll(" ","");
        String reverse = StringUtils.reverse(textnew);
        if (reverse.equals(textnew)){
            System.out.println("ok");
        }else{
            System.out.println("nie jest");
        }
    }
}
