package package1;
import java.util.*;
public class SpecialFib 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=fib(n);
		System.out.println("Result="+(res%47));
	}
	public static int fib(int n) 
	{
		if(n<=1)
			return 1;
		return fib(n-1)*fib(n-1)+fib(n-2)*fib(n-2);		
	}
}
