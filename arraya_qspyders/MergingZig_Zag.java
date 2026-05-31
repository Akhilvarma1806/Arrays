package arraya_qspyders;

public class MergingZig_Zag {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7};
		int [] b= {-1,-2,-3,-4,-5,-6,-7,};
		int [] arr=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			arr[k++]=a[i];
			arr[k++]=b[i];
		}
		for(int ele:arr) System.out.print(ele+" ");
	
		/*
		 * if lengths of arrays are different
		 * int i = 0, j = 0, k = 0;

			while(i < a.length || j < b.length) {

    			if(i < a.length)
        			arr[k++] = a[i++];

    			if(j < b.length)
        			arr[k++] = b[j++];
				}
		 */
	}
	
}
