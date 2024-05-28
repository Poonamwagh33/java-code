public class arithmeticexpt
{
    void divide(int a,int b)
    {
        int res=a/b;
        System.out.println("Division process has been done successfully");
        System.out.println("Results came after division is:" +res);
    }
    public static void main(String args[])
    {
        arithmeticexpt obj=new arithmeticexpt();
        obj.divide(1,0);
    }
}