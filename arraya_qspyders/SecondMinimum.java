package arraya_qspyders;

public class SecondMinimum {

	public static void main(String[] args) {
		int[] arr = {12, 21, 54, 56, 32, 87, 9, 76, 23};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]<min2) {
				min2=arr[i];
			}
		}
		System.out.println(min2);
	}

}
