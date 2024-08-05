public class replacespcchar {
    public static void main(String[] args) {
        String str = "Poonam Wagh";
        int index = 6;
        char ch = 'F';
        System.out.println("original string=" + str);
        str = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println("modified string=" + str);
    }
}
