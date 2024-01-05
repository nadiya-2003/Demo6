import java.util.Scanner;
class ContinueEx2
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i=0;
while(i<25)
{
i++;
if(i%5==0)continue;
System.out.print(i+" ");

}
}
}