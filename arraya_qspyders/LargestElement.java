package arraya_qspyders;

public class LargestElement {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35};
		int largest=arr[0];
		for(int ele:arr) {
			if(ele>largest) {
				largest=ele;
			}
		}
		System.out.println(largest);
	}

}
