package arraya_qspyders;

public class SumOfElements {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
