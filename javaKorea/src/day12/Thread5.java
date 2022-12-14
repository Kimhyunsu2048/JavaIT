package day12;

public class Thread5 {
	public static void main(String[] args) {
		// 멀티쓰레드
		// 우선순위를 정하는 방법2
		// 1. join() :지금 실행중인 쓰레드말고 전부 대기하라
		// 2. setPriority() : 우선순위 정하기

		MyThread5 mt5 = new MyThread5();
		MyThread5Ex mt5ex = new MyThread5Ex();
		
		mt5.start();
		
		try { mt5.join(); }	// join() : 나 말고 대기
		catch (InterruptedException e) {}
		
		mt5ex.start(); 
		
	}

}

class MyThread5 extends Thread{
	//0.5초에 한번씩 add (총 20번)
		@Override
		public void run() {
			for(int i =0;i<20;i++) {
				Thread4.arr.add(""+i);
				try {
					sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			}
		}
}

class MyThread5Ex extends Thread{
	@Override
	public void run() {
		
		for (int j = 0; j < 10; j++) {
			for(int i =0;i<Thread4.arr.size();i++) {
				System.out.print(Thread4.arr.get(i)+" ");	
			}
			System.out.println();

		}

	}
}
