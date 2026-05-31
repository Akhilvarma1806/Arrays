package arraya_qspyders;

public class SecondLargest {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35};
		int largest=arr[0];
		int second=arr[1];
		for(int ele:arr) {
			if(ele>largest) {
				second=largest;
				largest=ele;
			}
			else if(ele>second && ele!=largest) {
				second=ele;
			}
			
		}

		System.out.println(second);
	}

}
