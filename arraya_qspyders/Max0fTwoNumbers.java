package arraya_qspyders;

public class Max0fTwoNumbers {

	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 5, 3, 8, 1};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2) max2=arr[i];
		}
		System.out.println(max1+max2);
	}

}
