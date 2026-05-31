package arraya_qspyders;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,76,85,35,25,25};
		for(int i=0;i<arr.length;i++) {
			boolean  dup=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					
					dup=true;break;
				}
			
			}
		
			if(dup==false) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
