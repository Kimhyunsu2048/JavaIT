package day01;

public class Var3 {
	public static void main(String[] args) {
		// 변수(variable) - 저장공간
		// 저장공간에도 종류가 많음
		// 숫자형, 소수점 있는 숫자형, 글자형, ...
		
		String 변수1 = "저장공간1";
		// 13-4; 	// 컴퓨터가 의미 알수 x
		// 변수에 '형태' 정함
		
		//자료형(type)
		// 숫자를 저장하는 공간
		int 뺄셈 = 13-4;
		
		// 글자를 저장하는 공간
		String 주소 = "13-4";
		String 휴대폰 = "010-2524-1212";
		//소수점 있는 숫자
		double 파이 = 3.14;
		
		System.out.println(뺄셈);
		System.out.println(휴대폰);
		System.out.println(파이);
		
		// = : 같다X, 오른쪽에 있는 값을 왼쪽 공간에 넣는다.
		// 변수(공간)을 처음 만들때는 자료형을 붙여줘야함
		// 이미 만들어진 변수에 다른 값을 넣거나 사용할때
		// 자료형없이 적어줘야함
		
		휴대폰 = "010-1234-5678"; 	// 이미 있는 휴대폰이라는 저장공간에 값을 덮어씌움
		System.out.println(휴대폰);
		
		//공간을 처음 만들땐
		String var1;		//공간만 만듦 (선언)
		String var2 = "hi"; // 공간만들면서 값도 넣어줌 (초기화)
		var1 = "hello"; 	// 이미 있는 공간에 값을 넣음 (대입)
		
		String name = "원빈";
		String birth = "1950년 5월 5일";
		int year = 1950, month = 5, day =5;
		double height = 177.0;
		System.out.println("이름: "+name);
		System.out.println("생일 "+year+"년"+month+"월"+day+"일");
		System.out.println("키: "+height+"cm");
		
		
	}
}
