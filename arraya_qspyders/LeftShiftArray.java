package arraya_qspyders;

public class LeftShiftArray {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,76,85,35,25,25};
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		for(int ele:arr) System.out.print(ele+" ");

	}

}
