public class codept {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Poonam Wagh");
        int unicode = str.codePointAt(10);
        System.out.println("unicode of character" + "at position 10" + "in StringBuffer = " + unicode);
    }
}
