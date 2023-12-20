package Arrays;

public class SecondLargestSmallestEle {
	
	public static int secondLargestElement(int arr[], int n) {
		if (n < 2) {
			return -1;
		}
		int large = arr[0];
		int sLarge = Integer.MIN_VALUE;
		int i;
		for (i = 1; i < n; i++) {
			if (arr[i] > large) {
				sLarge = large;
				large = arr[i];
			} else if (arr[i] > sLarge && arr[i] != large) {
				sLarge = arr[i];
			}
		}
		return sLarge;
	}
	
	public static void main(String[] args) {
		int arr[] = {22, 34, 2, 4, 32, 546, 323, 8573, 232};
		System.out.println("Second largest element is " + secondLargestElement(arr, arr.length));
	}
}
