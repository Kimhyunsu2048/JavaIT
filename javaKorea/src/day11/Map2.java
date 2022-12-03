package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Map2Impl map = new Map2Impl();
		map.go();
		map.tester();
		
	}
}

class Map2Impl{
	HashMap<String, String> hm = new HashMap<>();
	public void go() {
		//단어 5개 영한사전
		hm.put("fruit", "과일");
		hm.put("animal", "동물");
		hm.put("tree", "나무");
		hm.put("student", "학생");
		hm.put("company", "회사");
			
	}
	
	public void tester() {
		Scanner sc = new Scanner(System.in);
		String word_eng = null, word_kor = null;
		System.out.println("[영한사전]검색할 단어를 입력하세요>>");
		word_eng = sc.nextLine();
		word_kor = hm.get(word_eng);	
		if((word_kor== null)||word_kor.equals("")) {
			System.out.println("없는 단어입니다.");
		}else {
			System.out.println("뜻:"+word_kor);
		}
		System.out.println("뜻:"+word_kor);
		
//		Set<String> set = hm.keySet();
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			String select = it.next();
//			if(it.next().equals(word_eng)) {
//				word_kor = select;
//				System.out.println("뜻: "+word_kor);
//				break;
//			}
//		}
		sc.close();
		
	}	
}











