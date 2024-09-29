package package1;
import java.util.Scanner;

public class PasswordCheck 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password: ");
		String pswd=sc.nextLine();
		char[] str=pswd.toCharArray();
		int n=str.length;
		int p=checkPassword(str, n);
		System.out.println(p);
	}
	public static int checkPassword(char[] str, int n)
	{
		boolean num=false, cap=false;
		if(Character.isDigit(str[0])==true)
			return 0;
		if(n<4)
			return 0;
		for(int i=0;i<n;i++)
		{
			if(Character.isDigit(str[i]))
				num=true;
			if(Character.isUpperCase(str[i]))
				cap=true;
			if((str[i]=='/') ||(str[i]==' '))
				return 0;
		}
		if(cap && num)
			return 1;
		return 0;
	}
}
