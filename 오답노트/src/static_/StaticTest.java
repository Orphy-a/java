package static_;

class Name{
	static void print() {
		System.out.println("내 이름은 홍길동 입니다.");
	}
	public void print2() {
		System.out.println("내 이름은 이순신입니다.");
	}
}

public class StaticTest {
	public static void main(String[] args) {
		
		Name.print();
		//Name.print2();
		
	}
	
}
