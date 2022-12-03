package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List5 {
	public static void main(String[] args) {
		ListClass5 lc5 = new ListClass5();
		lc5.go();		
	}
}

class ListClass5{
	public void go() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		String word = null;
		
		while(true) {
			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			select = Integer.parseInt(sc.nextLine());
			String str = sc.next();
			
			if(str.equals("1")) {
				System.out.println("추가할 항목입력>>");
				String str1 = sc.next();
				arr.add(str1);		
			}else if(str.equals("2")) {
				System.out.println("수정할 위치를 입력하세요>>");
				int num1 = sc.nextInt();
				System.out.println("수정할 내용을 입력하세요>>");
			    String str2 = sc.next();
				arr.set(num1, str2);
			}else if(str.equals("3")) {
				System.out.println("삭제할 위치를 입력하세요>>");
				int num2 = sc.nextInt();
				arr.remove(num2);
			}else if(str.equals("4")) {
				for(int i =0; i<arr.size();i++) {
					System.out.println(arr.get(i)+" ");
				}
			}else if(str.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("숫자를 0~4까지 입력해주세요");
			}
			
		}
		sc.close();
	}	
}
