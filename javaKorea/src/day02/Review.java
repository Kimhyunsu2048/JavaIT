package day02;

public class Review {
	public static void main(String[] args) {
		// 프로그래밍 언어(자바) : 컴퓨터한테 일을 시키기위한 문법
		// 슬래시 2개 적으면 그 줄은 프로그래밍 언어가 아니라 메모로 간주 (주석)
		
		//출력 syso -> Ctrl + Space 자동완성
		// 실행(디버깅없이 시작) crtl + F11
		String word = "Java";
		
		System.out.println("Hello "+word);
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello "+word);
		System.out.println("Hello World");
		System.out.println("Hello "+word);
		
		// 코드 복사 : ctrl +alt + ↓
		// ctrl + z : 뒤로돌리기
		// ctrl + y : 뒤로돌리기 취소
		// F11 : 디버깅모드 (한줄씩 실행) -> 모드가 바뀌므로 될수있으면 누르지 말것
		// 디버그 : de + bug 나방을 제거한다
		
		// 변수 : 저장공간
		String str = "Hi"; 	// 글자를 저장할 수 있는 공간
		int num = 0; 	//숫자를 저장할 수 있는 공간
		double dnum = 0.0;	// 소수점 있는 숫자를 저장할 수있는 공간
		
		// 자료형 변환
		System.out.println((double)num);
		
		// 변수(공간)을 처음 만들땐 변수이름 앞에다가 자료형을 적어주고
		// 이미 만들어진 변수(공간)을 사용할땐 자료형 없이 적어준다.
		str = "Hello";  // 다른 값을 대입
		System.out.println(str); 	// 사용
		
		// = : 대입연산자 (오른쪽에 있는 값을 왼쪽의 공간에 담는다)
		str = "Java2"; 	// 왼쪽은 '공간'역할, 오른쪽은 '값'의 역할
		
		word = str;		// word: 공간, str : 안에 들어있는 값
		System.out.println(word);
		
		// +, -, *, /
		
		// 변수이름 만들때
		// 1. 맨앞에는 숫자x, 특수문자x (한글, 영어)
		// 2. 띄어쓰기x (_)
		// 3. 특수문자x (예외도 있음)
		
		// 자바 개발환경 : 인텔리제이(사기업), Egov (국가행정SI)
		
		
	}
}
