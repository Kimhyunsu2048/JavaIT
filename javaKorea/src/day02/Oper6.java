package day02;

public class Oper6 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정한 기능)
		// 1. 산술연산자 : +, -, *, /, %
		// 2. 대입연산자 : =
		// 3. 누적연산자 : +=, -=, *=, /=
		// 4. 증감연산자 : ++, --
		// 5. 비교연산자 : >, <, >=, <=, ==, !=
		// 6. 논리연산자 : &&, ||, !
		
		// && : and (앞뒤 모두 true 여야만 true)
		// || : or (앞 또는 뒤 둘 중 하나만 true여도 true)
		// ! : not (boolean값을 반대로 바꿈), true -> false, false -> true
		boolean tst = !(true); // false
		System.out.println(tst);
		
		boolean 참 = true;
		boolean 거짓 = false;
		
		// and &&
		System.out.println("참&&참: "+(참 && 참));
		System.out.println("참&&거짓: "+(참 && 거짓));
		System.out.println("거짓&&참: "+(거짓 && 참));
		System.out.println("거짓&&거짓: "+(거짓 && 거짓));
		
		//청소년 : 14이상 ~20미만
		int age = 15;
		System.out.println(age >= 14 && age <20);
		
		// or || 
		System.out.println("참||참: "+(참 || 참));
		System.out.println("참||거짓: "+(참 || 거짓));
		System.out.println("거짓||참: "+(거짓 || 참));
		System.out.println("거짓||거짓: "+(거짓 || 거짓));
		
		// 키가 150cm이상이거나 나이가 15이상이면 통과
		double height = 160.0;
		System.out.println(height >= 150 || age >= 15);
		
		// not ! 아니면 : 맞으면 틀린걸로, 틀리면 맞는거로
		System.out.println(!참);  // false
		System.out.println(!거짓); // true
		
		System.out.println("=================");
		

		

		
		
	}
}
