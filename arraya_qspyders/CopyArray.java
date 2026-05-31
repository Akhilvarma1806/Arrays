package arraya_qspyders;

public class CopyArray {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35};
		int[] newArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		for(int ele:newArr) {
		System.out.print(ele+" ");
		}

	}

}
