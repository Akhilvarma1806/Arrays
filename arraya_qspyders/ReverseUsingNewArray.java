package arraya_qspyders;

public class ReverseUsingNewArray {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35};
		int[] newArr=new int[arr.length];
		for(int i=arr.length-1,j=0;i>=0;i--,j++) {
			newArr[j]=arr[i];
		}
		for(int ele:newArr) System.out.print(ele+" ");

	}

}
