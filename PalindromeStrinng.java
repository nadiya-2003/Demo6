import java.util.Scanner;
class PalindromeStrinng
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String n;
String rs="";
n=s.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
if(n.equals(rs))
{
System.out.println("It is a Palindrome");
}
else
{
System.out.println("It is  not a Palindrome");
}
}
}