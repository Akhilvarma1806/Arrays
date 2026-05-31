package arraya_qspyders;

public class MinimumElement {

	public static void main(String[] args) {
		int[] arr = {12, 21, 54, 56, 32, 87, 9, 76, 23};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
