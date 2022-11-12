package day04;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// 입력받은 나라의 수도를 알려주는 프로그램 개발하기
		// 국가, 수도
		
		// 어느 나라의 수도가 궁금하신가요?
		// '미국' 입력할 경우
		// 미국의 수도는 워싱턴 입니다.
		String in;	// 사용자로부터 입력받은 값을 저장할 변수
		int idx;	// 입력받은 문자열의 값과 동일한 문자열의 위치를 백업해둘 변수
		
		Scanner sc = new Scanner(System.in);
		
		String nations[] = {"한국","미국","일본","중국","영국","프랑스","독일","스페인","체코","호주"};
		String cities[] = {"서울","워싱턴","도쿄","베이징","런던","파리","베를린","마드리드","프라하","캔버라"};
		
		String answer = null;		
		
		System.out.println("어느 나라의 수도가 궁금하신가요?");
		answer = sc.nextLine();	
		
//		for(int i=0;i<nations.length; i++) {
//			if(answer.equals(nations[i])) {
//				System.out.println(answer+"의 수도는 "+cities[i]+"입니다");
//			}
//		}
		
		int i=0;	
		
		while(i<nations.length) {
			if(answer.equals(nations[i])) {
				System.out.println(answer+"의 수도는 "+cities[i]+"입니다");
				break;
				
			}else {
				i++;

			}
		}
				
		
	}
}
