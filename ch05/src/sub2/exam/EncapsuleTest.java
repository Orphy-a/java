package sub2.exam;



public class EncapsuleTest {
	public static void main(String[] args) {
		
		Movie mv = new Movie("글레디에이터", "리들리스콧", 8.0, 20);
		
		if(mv.reserveSeat()) {
			System.out.println("영화 좌석 예매 완료!");
		} else {
			System.out.println("영화 좌석 예매 실패!");
		}
			
		mv.showDetails();
		
		Movie mv2 = new Movie("타이타닉", "제임스카메론", 9.5, 0);
		
		if(mv2.reserveSeat()) {
			System.out.println("영화 좌석 예매 완료!");
		} else {
			System.out.println("영화 좌석 예매 실패!");
		}
		mv2.showDetails();
		
		
	}
}
