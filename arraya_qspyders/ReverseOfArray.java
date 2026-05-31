package arraya_qspyders;

public class ReverseOfArray {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35};
		
//		to print values in reverse
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		
//		to actually reverse
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int ele:arr) {
		System.out.print(ele+" ");
		}
	}

}
