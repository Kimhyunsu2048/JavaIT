package day07;

public class Extends4 {
	public static void main(String[] args) {
		Human hm = new Human("원빈", 20);
		Human hm2 = new Human("원빈123", 20111);
		hm.personInfo();
		
		Member mm = new Member(hm, 1000);
		Member mb = new Member("원빈", 20, 1000);
		Member mb1 = new Member("이나영", 25, 1001);
		Member mb2 = new Member("유재석", 22, 1002);
		mb.memberInfo();
		mb1.memberInfo();
		mb2.memberInfo();
		mm.memberInfo();
		
		
	}

}

// 클래스 : 사람(Human)
// 이름, 나이
// 생성자를 통해서 정보를 입력
// 게터, 세터
// 변수는 private, 메서드는 public
class Human{
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void personInfo() {
		System.out.println("사람 정보- name : "+name+", age:"+age);
	}
	Human(){}
}




// 클래스 : 회원(Member) -> 사람 클래스 상속 받음
// +회원번호
// 생성자를 통해서 정보를 입력
// 회원번호 게터세터
// +회원소개
class Member extends Human{
	private int memNo;
	
	public Member(String name, int age, int memNo) {
		super(name, age); // 부모의 생성자를 사용
		this.memNo = memNo;
	}
	
	public Member(Human human, int memNo) {
		this.setName(human.getName());
		this.setAge(human.getAge());
		this.memNo = memNo;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	
	public void memberInfo() {
		System.out.println("회원 정보- name : "+name+", age:"+age+", memNo : "+MemNo);
	}
	
	
	
	
	
}
