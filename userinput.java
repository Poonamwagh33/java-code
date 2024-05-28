import java.util.*;
import java.util.Scanner;

class userinput {
    public static void main(String args[]) {
        Scanner myobj = new Scanner(System.in);
        String username;
        System.out.println("Enter username");
        username = myobj.nextLine();
        System.out.println("username is:" + username);
    }
}