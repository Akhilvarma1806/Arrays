package arraya_qspyders;

import java.util.Scanner;

public class InsertAtSpecificPosition {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,76,85,35,25,25};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr value to be entered");
		int val=sc.nextInt();
		System.out.println("enter index value to be inserted");
		int index=sc.nextInt();
		int [] newArr=new int[arr.length+1];
		if(index<0 || index>newArr.length) {
			System.out.println("invalid index");
			return;
		}
		for(int i=0;i<newArr.length;i++) {
			if(i<index) {
				newArr[i]=arr[i];
			}
			else if(i==index) {
			newArr[i]=val;
			}
			else {
				newArr[i]=arr[i-1];
			}
		}
		for(int ele:newArr)
		System.out.print(ele+" ");

	}

}
