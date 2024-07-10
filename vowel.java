public class vowel {
    public static void vowel_consonant(char y) {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' || y == 'A' || y == 'E' || y == 'I' || y == 'O'
                || y == 'U')
            System.out.println("character is vowel");
        else
            System.out.println("character is consonant");

    }

    public static void main(String args[]) {
        vowel_consonant('W');
        vowel_consonant('I');
    }
}
