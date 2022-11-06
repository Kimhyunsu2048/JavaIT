package day04;

public class While3 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(i+"번");
			i++;
		}
		
		// #1
		int j = 0;
		while (j < 5) {
			System.out.println("안녕");
			j++;
		}
		
		// #2
		int k = 1;
		int sum1 = 0;
		while (k < 11) {
			sum1 += k;
			k++;
		}
		System.out.println(sum1);
		
		// #3
		int m = 1;
		int sum2 = 0;
		while (m < 51) {
			sum2 += m;
			m++;
		}
		System.out.println(sum2);
		
		
	}
}
