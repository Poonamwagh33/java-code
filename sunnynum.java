public class sunnynum {
    public static void main(String[] args) {
        int inputNumber = 8;
        double next = inputNumber + 1;
        double square_root = Math.sqrt(next);
        if ((square_root - Math.floor(square_root)) == 0)
            System.out.println(inputNumber + " is a sunny number");
        else
            System.out.println(inputNumber + " is not a sunny number.");
    }
}
