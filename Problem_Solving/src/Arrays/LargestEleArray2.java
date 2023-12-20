package Arrays;

public class LargestEleArray2

{
	public static int findlargestElement(int arr[])
	{
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

	public static void main(String[] args)
	{
		int arr1[]= {2,3,2,1,34,11,4,113,2412,13,9};
		int arr2[]= {2,3,18,5,33,6,7,99,4,3,664,74};
		
	        System.out.println("arr1 largest element is "+findlargestElement(arr1));
	        System.out.printf("arr2 largest element is "+ findlargestElement(arr2));
	}
}
