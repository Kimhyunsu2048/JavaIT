package day08;

public class Extends1 {
	public static void main(String[] args) {
		Star star = new Star(5000, "아메리카노");
		
		StarBupyeong sb = new StarBupyeong(3000,"녹차");
		sb.sell();
		sb.info();
		
	}

}

// 1.상속용, 2.모든 메서드가 재정의되어야 함, 3.명세서(룰제공) ===> Interface: 명세서대로 안하면 오류발생(누락방지)
class Star{
	// 본사 : 스타벅스가 갖춰야할 기본 데이터와 기능
	private int price;
	protected String menu;
	static int menu2;	// 기존 변수와 다른 공간에 저장되어서 계속 살아있음
	
	// 생성자로 가격, 메뉴 정하기
	public Star(int price, String menu) {
		this.price = price;
		this.menu = menu;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	// oo을 판매합니다.
	public void sell() {
		System.out.println(getMenu()+"을(를) 판매합니다.");
	}
		
	// ㅇㅇ의 가격은 ㅇㅇ입니다.
	public void info() {
		System.out.println(getMenu()+"의 가격은 "+getPrice()+"입니다.");
	}
	
}

class StarBupyeong extends Star{	
	// 부평점 : 스타벅스가 기본적으로 갖춰야할 것 + 부평점만의 특징
	// 생성자로 가격, 메뉴 재정의하기
	StarBupyeong(int price, String menu) {
		super(price, menu);		
	}
	
	// 부평점 - ㅇㅇ을 판매합니다
	@Override
	public void sell() {
		int num =0 ; // sell 함수가 사용되는 동안에만 생성되었다가 sell 함수가 끝나면 없어짐(지역변수)
		System.out.println("부평점-"+getMenu()+"를 판매합니다");
	}
	
	// 부평점 - ㅇㅇ의 가격은 ㅇㅇ입니다.
	@Override
	public void info() {
		System.out.println("부평점-"+getMenu()+"의 가격은"+getPrice()+"원 입니다.");
	}
	
}

// 인터페이스를 상속받을때는 implements
class StarGangnam implements Star2{
	int price;
	String menu;
	
	public StarGangnam(int price, String menu) {
		this.price = price;
		this.menu = menu;
	}

	@Override
	public void sell() {
		System.out.println("강남점-"+menu+"를 판매합니다.");
		
	}

	@Override
	public void info() {
		System.out.println("강남점-"+menu+"의 가격은"+price+"원 입니다.");
		
	}	
		
}

interface AA{
	
}

// 다중상속 가능
class SS extends Star implements AA, Star2{
	
	SS(int price, String menu) {
		super(price, menu);
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
	
}



















