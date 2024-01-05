import java.util.Scanner;
class ContiueEx1
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
byte i=0;
while(true)
{
i++;
if(i%5==0)continue;
System.out.print(i+",");  
}
}
}