import java.io.*;
import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
      String str="Poonam", nstr=" ";
      char ch;
      System.out.println("original word:");
      System.out.println("Poonam");
      for(int i=0;i<str.length();i++)
      {
        ch=str.charAt(i);
        nstr=ch+nstr;
      }
      System.out.println("Reversed word:"+nstr);
    }
}