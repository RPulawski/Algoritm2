

public class SzyfrCezara {
    //WEJSCIE: NIEPRZYJACIEL JEST BARDZO BLISKO
    //WYJSCIE: QLHSUCBMDFLHO MHVW EDUGCR EOLVNR

    public static void main(String[] args) {
        System.out.println(decipherCode("NIEPRZYJACIEL JEST BARDZO BLISKO", 3));

    }

    private static String decipherCode(String text, int shift) {
        StringBuilder newWord = new StringBuilder();
        char ch;

        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                ch = (char) (text.charAt(i) + shift);
                if ((Character.isLowerCase(text.charAt(i)) && ch > 'z')
                        || (Character.isUpperCase(text.charAt(i)) && ch > 'Z')) {
                    ch = (char) (text.charAt(i) - (26 - shift));
                }

            }
            newWord.append(ch);
        }
        return newWord.toString();

    }
}

