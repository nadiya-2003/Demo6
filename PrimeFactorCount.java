import java.util.Scanner;
class PrimeFactorCount
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
  if(n%i==0)
 {
count++;
  System.out.print(i);
    
if(i!=n)
{
System.out.print(",");
}

 }
}
System.out.println("\n Count of Factors of "+n+" " +"is"+" "+count);
if(count==2)
{
System.out.println("It is a Prime ");
}
else
{
System.out.println("It is not a Prime ");
}


}
}