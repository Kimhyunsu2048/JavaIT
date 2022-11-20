package day08;

public class Phone {
	public static void main(String[] args) {
		PhoneImp1 pi = new PhoneImp1();
		pi.bigdata();
		pi.Net();
		pi.Msg();
		pi.call();
		pi.speed();
		
	}

}

//Interface(선언만) -> InterfaceImp1(구현까지)
//Imp1 : 구현부
class PhoneImp1 extends AbstractClass1{

	@Override
	public void call() {
		System.out.println("전화를 합니다.");
		
	}

	@Override
	public void Msg() {
		System.out.println("문자를 합니다.");
		
	}

	@Override
	public void Net() {
		System.out.println("인터넷을 합니다.");
		
	}

	@Override
	public void speed() {
		System.out.println("LET 빠름.");
		
	}
	
}

