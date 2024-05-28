public class main implements runnable {
    public static void main(String args[]) {
        main obj = new main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside thr thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}