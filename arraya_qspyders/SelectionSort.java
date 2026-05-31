package arraya_qspyders;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {12,21,54,56,32,87,9,76,23};
		for(int i=0;i<arr.length-1;i++) {
			int minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		}
		for(int ele:arr) System.out.print(ele+" ");

	}

}
