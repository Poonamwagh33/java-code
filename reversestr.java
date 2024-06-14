public class reversestr {
    public static void main(String args[]) {
        String str = "Poonam";
        String rstr = " ";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rstr = ch + rstr;
        }
        System.out.println("reverse string=" + rstr);
    }
}