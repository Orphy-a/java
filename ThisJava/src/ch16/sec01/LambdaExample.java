package ch16.sec01;

interface Workable{
	void work();
}


class Person{
	public void action(Workable workable){
		workable.work();
	}
}


public class LambdaExample {
	public static void main(String[] args) {
		
		Person person = new Person();
		
		//실행문 2개 => 중괄호 생략 x
		person.action(() -> {
			System.out.println("출근합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
		//실행문 1개 => 중괄호 생략가능
		person.action(()-> System.out.println("퇴근합니다."));
		
		
	}
}
