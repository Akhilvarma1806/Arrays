package arraya_qspyders;

public class FindingDuplicates {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,76,85,35,25,25};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) { 
					
					System.out.println(arr[i]);
				}
				break;
			}
		}
	}
}
