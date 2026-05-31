package arraya_qspyders;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {12,21,54,56,32,87,9,76,23};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1] ){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int ele:arr) System.out.print(ele+" ");
	}

}
