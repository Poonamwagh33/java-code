public class perimaterrect {
    public static void perimeter(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        System.out.println(
                "The perimeter of given length is" + length + " and breadth  " + breadth + " is  = " + perimeter);
    }

    public static void main(String args[]) {
        int length = 10;
        int breadth = 15;
        perimeter(length, breadth);
    }
}
