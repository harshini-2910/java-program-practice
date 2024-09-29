package package1;
import java.util.*;
public class NBase 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("n:");
		int n=sc.nextInt();
		System.out.print("num:");
		int num=sc.nextInt();
		int q, rem;
		String str="";
		do
		{
			q=num/n;
			rem=num%n;
			if(rem>9)
			{
				str=str+(char)(rem-9+64);
			}
			else
				str=str+rem;
			num=q;
		}while(num>0);
		StringBuilder sb=new StringBuilder(str);
		String rev=sb.reverse().toString();
		System.out.println("The N-Base string : "+rev);
	}
}
