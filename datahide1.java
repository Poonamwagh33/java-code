import java.io.*;

class datahide {
    private long CurBalance = 0;
    long bank_id;
    String name;

    public long get_balance(long Id) {
        if (this.bank_id == Id) {
            return CurBalance;

        }
        return -1;
    }

    public void set_balance(long balance, long Id) {
        if (this.bank_id == Id) {
            CurBalance = CurBalance + balance;
        }
    }
}

public class datahide1 {
    public static void main(String[] args) {

        datahide _emp = new datahide();
        _emp.bank_id = 12345;
        _emp.name = "roshan";
        _emp.set_balance(10000, 12345);
        long emp_balance = _emp.get_balance(12345);
        System.out.println("user name" + " " + _emp.name);
        System.out.println("bank_id " + " " + _emp.bank_id);
        System.out.println("current balance " + " " + emp_balance);

    }
}
