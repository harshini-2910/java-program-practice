package package1;
import java.util.*;
public class EucDistance 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		float x1=sc.nextFloat();
		float x2=sc.nextFloat();
		float x3=sc.nextFloat();
		float y1=sc.nextFloat();
		float y2=sc.nextFloat();
		float y3=sc.nextFloat();
		float dist=(float) (Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2))+Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2))+Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2)));
		System.out.format("distance=%.2f",dist);
	}
}
