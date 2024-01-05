import java.util.Scanner;
class ProductDigits
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int pro=1;
int rem;
while(n>0)
{
rem=n%10;
pro=pro*rem;
n=n/10;
}
System.out.println(pro);
}
}

