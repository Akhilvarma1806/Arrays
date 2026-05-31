package arraya_qspyders;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[]args) {
		int[] a= {12,13,14,15,16,17,18,19};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element to be found");
		int key=sc.nextInt();
		int found=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				found=i;
				break;
			}
		}
		
	if(found!=-1) {
		System.out.println("element found at index "+found);
		
	}
	else {
		System.out.println("element not found");
	}
	}
}
