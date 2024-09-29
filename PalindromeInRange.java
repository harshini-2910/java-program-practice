package package1;
import java.util.Scanner;
public class PalindromeInRange 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int num=0,rev=0,digit;
		for(int i=a;i<=b;i++)
		{
			num=i;
			while(num!=0)
			{
				digit=num%10;
				rev=rev*10+digit;
				num=num/10;
			}
			if(rev==i)
				System.out.print(i+"  ");
			rev=0;
		}
	}
}
