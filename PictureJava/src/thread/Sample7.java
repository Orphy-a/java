package thread;

class Company{
	private int sum = 0;
	
	public synchronized void  add(int a) {
		int tmp = sum;
		System.out.println("현재 금액의 합은 " + tmp + "입니다.");
		System.out.println(a + "원 벌었습니다.");
		tmp += tmp + a;
		System.out.println("금액의 합을 "  + tmp + "원으로 만듭니다.");
		sum = tmp;
		
	}
	
	
}


class Driver extends Thread{
	
	private Company comp;

	public Driver(Company comp) {
		this.comp = comp;
	}
	
	@Override
	public void run() {
		for(int i = 1;i<=3;i++) {
			comp.add(50);
		}
	
	}
	
	
}


public class Sample7 {
	public static void main(String[] args) {
		Company comp = new Company();
		
		Driver drv1 = new Driver(comp);
		drv1.start();
		
		Driver drv2 = new Driver(comp);
		drv2.start();
		
		
		
		
		
		
	}
}
