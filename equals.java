public class equals {
    public static void main(String[] args) {
        Short a = new Short("20");
        Short b = new Short("20");
        boolean output = a.equals(b);
        System.out.println("Does " + a + "equals" + b + ":" + output);
    }
}
