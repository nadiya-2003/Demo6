import java.util.Scanner;
class BreakEx1
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
int i=0;
while(true)
{
System.out.print(i+",");
i++;
if(i==n)break;
}
}
}