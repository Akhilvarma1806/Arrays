package arraya_qspyders;

import java.util.Scanner;

public class FrequenceyOfSpecificElement {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35,25,25};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n=sc.nextInt();
		int count=0;
		for(int ele:arr) {
			if(n==ele) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("element is not found");
		}
		else {
		System.out.println(count);
		}
	}

}
