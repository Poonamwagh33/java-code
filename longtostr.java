public class longtostr {
    public static void main(String[] args) {
        Long varLong = 999999999L;
        String str = varLong + " ";
        System.out.println("converted type: " + str.getClass().getName());
        System.out.println(str);
    }
}
