package arraya_qspyders;

public class CircularRightShift {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,76,85,35,25,25};
		int last=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		for(int ele:arr) System.out.print(ele+" ");
	}

}
