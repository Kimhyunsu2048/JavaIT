package day10;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		MyString4 ms4 = new MyString4();
		ms4.go();
		
	}

}

class MyString4{
	Scanner sc = new Scanner(System.in);
	
	public void go() {
		System.out.println(won());
		
	}
	
	public String won() {
		//정수를 입력받아서 천원단위로 ,를 찍어 출력
		//5000000 ==> 5,000,000
		System.out.println("숫자를 입력하세요");
		long num = Integer.parseInt(sc.nextLine());
//		String result = Integer.toString(num);
//
//		int count = 0;
//		
//		//코드 작성
//		while((num>1000) > 0) {
//			if(num/1000 >= 1000) {
//				num1 = num%1000;
//				num2 = num/1000;
//				continue;					
//			}else {
//				num1 = num%1000;
//				break;
//			}
//			return result;
//		}
		
		
	}
	
}
