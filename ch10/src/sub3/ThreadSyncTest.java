package sub3;

public class ThreadSyncTest {
	public static void main(String[] args) {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		
		// 작업 스레드 실행(비동기 작업)
		ct1.start();
		ct2.start();
		ct3.start();
		
		
		try {
			ct1.join();
			ct2.join();
			ct3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("count 결과 : " + count.getNum());
		
	}
}
