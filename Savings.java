package package1;
import java.util.Scanner;
public class Savings 
{
	public static void main(String[] args)
	{
		int n=1, week=1, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Days=");
		int day=sc.nextInt();
		for(int i=1;i<=day;i++)
		{
			if(i%6!=0 && i%7!=0)
			{
				sum=sum+n*100;
				n++;
			}
			System.out.println("n="+n);
			System.out.println("Sum="+sum);
			if(i%6==0)
			{
				week++;
				n=week;
			}
		}
		System.out.println("Savings="+sum);
	}
}
