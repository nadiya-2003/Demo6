import java.util.Scanner;
class BreakEx2
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i=1;
while(i<25)
{
if(i%5==0)break;
System.out.print(i+" ");

i++;
}
}
}