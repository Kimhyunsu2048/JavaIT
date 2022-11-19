package day07;

public class Extends3 {
	public static void main(String[] args) {
		TestClassEx tce = new TestClassEx();
		tce.setNum(8, 5.3);
		tce.getMul();
		tce.Print();
		tce.add();
		
	}

}

class TestClass{
	// private : 나 외에 다 사용 불가
	// protected : 상복받은 클래스까지는 허용
	// default(안적으면) : 같은 패키지면 허용
	// public : 같은 프로젝트면 허용
	
	// 상속할거면 private -> protected
	protected int num;
	protected String str;
	protected double dNum;
	
	public void Print() {
		System.out.println("테스트 클래스 사용");
	}
	
}

// TestClass를 상속받아서 수정&추가
class TestClassEx extends TestClass{
	// 추가	
	private int num2;
	public void setNum(int num,double dNum) {
		this.num = num;
		this.dNum = dNum;
	}
	
	public double getMul() {
		System.out.println((double)num*dNum);
		return (double)num*dNum;
	}
	
	//수정(오버라이딩)
	public void Print() {
		System.out.println("테스트");
	}
	
	public int add() {
		System.out.println("더하기 추가");
		super.Print();
		return 0;
	}

}
