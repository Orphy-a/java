package test6.sub04;

public class Member {
	
	private String name;
	private String memberId;
	Book borrowedBook;
	
	
	public Member(String name, String memberId) {
		
		this.name = name;
		this.memberId = memberId;
	}
	
	public void borrowBook(Book book) {
		if (!book.isBorrowed) {
	        book.isBorrowed = true;
	        this.borrowedBook = book;
	        System.out.println(name + "님이 '" + book.getTitle() + "' 도서를 대출했습니다.");
	        book.borrowBook();
	    } else {
	        System.out.println("죄송합니다. '" + book.getTitle() + "' 도서는 이미 대출 중입니다.");
	    }
    }
	
	public void returnBook(Book book){
		if (this.borrowedBook != null && this.borrowedBook.equals(book)) {
	        book.isBorrowed = false;
	        System.out.println(name + "님이 '" + book.getTitle() + "' 도서를 반납했습니다.");
	        book.returnBook();
	        this.borrowedBook = null;
	    } else {
	        System.out.println("죄송합니다. 해당 도서를 대출하지 않았습니다.");
	    }
	}
	
	public void getMemberInfo(){
		System.out.println("이름 : " + name);
		System.out.println("회원 ID : " + memberId);
		System.out.println("대출한 도서 : " + (borrowedBook != null ? borrowedBook.getTitle() : "없음"));
		
	}
	
	
}
