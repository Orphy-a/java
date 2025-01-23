package thread;

class Car implements Runnable{
	
	private String name;

	public Car(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "가 동작중입니다.");
				
		}
		
	}
	
	
	
}

public class Sample6 {
	public static void main(String[] args) {
		Car car1 = new Car("1호차");
		
		Thread th1 = new Thread(car1);
		
		th1.start();
		

			for(int i = 1;i<=10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("메인스레드가 동작중입니다.");
					
			}
			
	
		
		
		
		System.out.println("프로그램 종료");
		
	}
}
