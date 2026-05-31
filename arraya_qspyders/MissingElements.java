package arraya_qspyders;

public class MissingElements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5, 6};
		int n=arr.length+1;
		int accsum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(accsum-sum);
		
//		if multiple sre there
		 int[] arr1= {1, 2, 4, 6, 8, 10};
		 for(int j=0;j<arr1.length-1;j++) {
			 int diff=arr1[j+1]-arr1[j];
			 if(diff>1) {
				 for(int k=1;k<diff;k++) {
				 System.out.print(arr1[j]+k+" ");
				 }
				}
		 }

	}

}
