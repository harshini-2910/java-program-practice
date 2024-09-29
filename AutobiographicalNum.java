package package1;
import java.util.*;
import java.util.HashSet;
public class AutobiographicalNum 
{
	public static void main(String[] args)
	{
		HashSet<Integer> count=new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int num=sc.nextInt();
		String str=Integer.toString(num);
		char[] ch=str.toCharArray();
		System.out.println("ch array:");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
			count.add(Integer.parseInt(Character.toString(ch[i])));
		}
		System.out.println("count:"+count);
		System.out.println("op:"+count.size());
	}
}
