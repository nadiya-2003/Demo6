import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int rev=0;
int rem;
int temp=n;
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(rev==temp)
{
System.out.println("It is a palindrome");
}
else
{
System.out.println("It is not a palindrome");

}


}
}

