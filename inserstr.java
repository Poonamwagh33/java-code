import java.lang.*;

public class inserstr {
    public static String insertString(String originalString, String stringToBeInserted, int index) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < originalString.length(); i++) {
            newString.append(originalString.charAt(i));
            if (i == index) {
                newString.append(stringToBeInserted);
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        String originalString = "geeksgeeks";
        String stringToBeInserted = "for";
        int index = 4;
        System.out.println("Original string: " + originalString);
        System.out.println("String to be inserted: " + stringToBeInserted);
        System.out.println("String to be inserted at index: " + index);
        System.out.println("Modified string: " + insertString(originalString, stringToBeInserted, index));
    }
}
