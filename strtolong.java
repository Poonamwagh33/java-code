public class strtolong {
    public static void main(String[] args) {
        String str = "999999999";
        System.out.println("string :" + str);
        long varLong = Long.parseLong(str);
        System.out.println("Long:" + varLong);
    }
}
