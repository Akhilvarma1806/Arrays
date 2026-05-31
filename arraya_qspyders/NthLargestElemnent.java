package arraya_qspyders;

import java.util.Scanner;

public class NthLargestElemnent {

	public static void main(String[] args) {
		int[] arr= {12,21,54,56,32,87,9,76,23};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
//		for(int ele:arr) {
//			System.out.print(ele+" ");
//			}
		System.out.println(arr[arr.length-n]);

	}

}
