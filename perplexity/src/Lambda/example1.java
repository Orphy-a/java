package Lambda;

public class example1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            Thread thread1 = new Thread(() -> {
                try {
                    Thread.sleep(1000); // 1초 대기
                    System.out.println("1번 스레드 실행중");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            Thread thread2 = new Thread(() -> {
                try {
                    Thread.sleep(1000); // 1초 대기
                    System.out.println("2번 스레드 실행중");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            thread1.start();
            thread2.start();
			
            
            try {
                thread1.join(); // thread1이 종료될 때까지 대기
                thread2.join(); // thread2가 종료될 때까지 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
						
		

		
		System.out.println("실행 종료");
		
	}
}
