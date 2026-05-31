package arraya_qspyders;

public class MergingTwoArrays {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7};
		int [] b= {-1,-2,-3,-4,-5,-6,-7};
		int[] arr=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			arr[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			arr[a.length+j]=b[j];
		}
		/*for(int i = 0; i < arr.length; i++) {
    			if(i < a.length)
        			arr[i] = a[i];
    			else
        			arr[i] = b[i - a.length];
		}
		 * 
		 */
		
		for(int ele:arr) System.out.print(ele+" ");
	}

}
