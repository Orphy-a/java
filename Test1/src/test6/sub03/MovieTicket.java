package test6.sub03;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	public void bookTicket() {
		if(isBooked) {
			System.out.println("이미 예약됨");
		}else {
			System.out.println(movieTitle + ", " + screenTime + ", " + seatNumber + " 예매완료");
			isBooked = true;
		}
	}
	
	public void cancelBooking(){
		if(isBooked) {
			System.out.println(movieTitle + ", " + screenTime + ", " + seatNumber + " 취소완료");
			isBooked = false;
		}else {
			System.out.println("아직 예매 안됨");
		}
	}
	
	public void printTicketInfo() {
		
		
		System.out.println("영화제목 : " + movieTitle);
		System.out.println("상영시간 : " + screenTime);
		System.out.println("좌석번호 : " + seatNumber);
		System.out.println("예약여부 : " + (isBooked ? "Yes" : "No"));
		
	}
	
	
	
	
}
