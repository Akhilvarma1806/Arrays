package arraya_qspyders;

public class UniqueElements {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,76,85,35,25,25};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
