package package1;

public class randomClass
{
	public static void main(String[] args)
	{
		int num=12408;
		int result=rev(num);
		System.out.println("number reversed="+result);
	}
	static int rev(int n)
	{
		if(n==0)
			return 0;
		return ((n%10)*10)+rev(n/10);
	}
}
