import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String st="";
    for(int i=0;i<s.length();i++)
    {
      char ch = s.charAt(i);
      st = ch+st;
    }
    if(s.equals(st))
      System.out.println("Palindrome");
    else
      System.out.println("Not Palindrome");
  }
}
