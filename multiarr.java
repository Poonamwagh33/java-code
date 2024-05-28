import java.util.*;

public class multiarr {
    public static void main(String args[]) {
        int[][] MyNumber = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < MyNumber.length; ++i) {
            for (int j = 0; j < MyNumber[i].length; ++j) {
                System.out.println(MyNumber[i][j]);
            }
        }
    }
}