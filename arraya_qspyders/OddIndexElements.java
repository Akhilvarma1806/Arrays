package arraya_qspyders;

public class OddIndexElements {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35};
		for(int i=1;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
		}
//		or can use if statement i%2!=0

	}

}
