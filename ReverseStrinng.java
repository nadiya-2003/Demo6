//reverse the string
import java.util.Scanner;
class ReverseStrinng
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
System.out.println(rs);
}
}