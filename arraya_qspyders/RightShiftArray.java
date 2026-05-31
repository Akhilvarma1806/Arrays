package arraya_qspyders;

public class RightShiftArray {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,76,85,35,25,25};
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=0;
		for(int ele:arr) System.out.print(ele+" ");
	}

}
