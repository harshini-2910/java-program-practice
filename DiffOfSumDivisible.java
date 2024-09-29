package package1;
import java.util.Scanner;
public class DiffOfSumDivisible 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int div=0,notdiv=0;
		int n,m;
		System.out.println("Enter the divisor");
		n=sc.nextInt();
		System.out.println("Enter the dividend");
		m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			if(i%n==0)
			{
				div=div+i;	
				System.out.println("i="+i);
				System.out.println("div="+div);
			}
			else
			{
				notdiv=notdiv+i;
				System.out.println("i="+i);
				System.out.println("not div="+notdiv);
			}
				
		}
		System.out.println("The dfference="+Math.abs(notdiv-div));
		
	}
}
