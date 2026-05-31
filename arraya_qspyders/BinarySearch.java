package arraya_qspyders;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element to be found");
		int key=sc.nextInt();
		int low=0;
		int high=a.length-1;
		int index=-1;
		for(int i=0;i<a.length;i++) {
			int mid=(low+high)/2;
			if(a[mid]==key) {
				index=mid;
			}
			else if(a[mid]<key) {
				low=mid+1;
			}
			else if(a[mid]>key) {
				high=mid-1;
			}
		}
		if(index!=-1) {
			System.out.println("element found at index "+index);
		}
		else System.out.println("element not found");

	}

}
