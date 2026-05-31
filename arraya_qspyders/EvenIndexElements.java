package arraya_qspyders;

public class EvenIndexElements {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35};
		for(int i=0;i<arr.length;i++) {
//			or can use i+=2
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
			
		}
	}

}
