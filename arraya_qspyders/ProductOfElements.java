package arraya_qspyders;

public class ProductOfElements {

	public static void main(String[] args) {
		int[ ] arr= {12,43,25,65,76,85,35};
		int product=1;
		for(int element:arr) {
			product*=element;
		}
		System.out.println(product);
	}

}
