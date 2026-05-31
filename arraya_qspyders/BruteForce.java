package arraya_qspyders;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 5, 3, 8, 1};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter target variable");
		int target=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+"+"+arr[j]+"="+target);
				}
			}
		}

	}

}
