package day04;

public class For3 {
	public static void main(String[] args) {
		// #1
		// 5번 안녕하기
		for(int i=0; i<5; i++) {
			System.out.println("안녕");
		}
		
		// #3
		// 1~10까지 합 구하기
		int sum = 0;
		for(int i=1; i<11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// #4
		// 10~1 거꾸로 출력하기
		for(int a = 10; a > 0; a--) {
			System.out.println(a);
		}
			
		// #5
		// 0~20까지 2씩 증가시키면서 출력하기
		for(int b = 0; b <= 20; ) {
			System.out.println(b);
			b += 2;
		}
			
		
	
		
	}
}
