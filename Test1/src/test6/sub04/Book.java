package test6.sub04;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	boolean isBorrowed;
	
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		isBorrowed = false;
	}
	
	
	public void borrowBook() {
		if (!isBorrowed) {
	        isBorrowed = true;
	        System.out.println("'" + title + "' 도서가 대출되었습니다.");
	    } else {
	        System.out.println("이 도서는 이미 대출 중입니다.");
	    }
    }
	
	public void returnBook() {
		if (isBorrowed) {
	        isBorrowed = false;
	        System.out.println("'" + title + "' 도서가 반납되었습니다.");
	    } else {
	        System.out.println("이 도서는 대출 중이 아닙니다.");
	    }
		
	}
	
	public void getBookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		System.out.println("대출여부 : " + (isBorrowed ? "불가능":"가능"));
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	
}
