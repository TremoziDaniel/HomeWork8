import java.util.Scanner;

public class hWork1 {
    static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String inputText = scan.nextLine();
        char firstChar = scan.next().charAt(0);
        char secondChar = scan.next().charAt(0);
        replaceChar(inputText, firstChar, secondChar);
    }

    static void replaceChar(String inputText, char firstChar, char secondChar) {
        char[] charInputText = inputText.toCharArray();

        for (int i = 0; i < inputText.length(); i++) {
            if (charInputText[i] == firstChar) {
                charInputText[i] = secondChar;
            }
        }
        inputText = String.valueOf(charInputText);

        System.out.println(inputText);
    }
}
