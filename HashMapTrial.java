package package1;
import java.util.HashMap;
public class HashMapTrial 
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> n=new HashMap<>();
		int nums[]= {1,2,3,4,5,6,7,8,9};
		int target=17;
        int diff; 
        int[] arr=new int[2];      
        for(int i=0;i<nums.length;i++)
        {
            diff=target-nums[i];
            if(n.containsKey(diff))
            {
                arr[0]=n.get(diff);
                arr[1]=i;
            }
            else    
                n.put(nums[i],i);
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
	}
}
