package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountUsingMap 
{

	public static void main(String[] args) 
  {
	Scanner sc= new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int[]arr=new int [n];
	
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
	
	for(int i=0;i<n;i++)
	{
		int key=arr[i];
		int feq=0;
		if(map.containsKey(key)) 
		{
			feq =map.get(key);
		}
		feq++;
		map.put(key, feq);
	}
	
	int q;
	q=sc.nextInt();
	
	while(q-- !=0)
	{
		int number;
		
		number=sc.nextInt();
		
		if(map.containsKey(number))
		{
			System.out.println(map.get(number));
		}
		else
			System.out.println(0);
	}
 }
}
