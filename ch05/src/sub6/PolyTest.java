package sub6;


/*
 * 날짜 : 2025/01/10
 * 이름 : 오재영
 * 내용 : Java 다형성 실습하기 
 *
 * 다형성
 * - 상속 관계에서 부모클래스의 기능이 자식클래스에서 다양한 기능으로 변하는 특징
 * - 객체 타입선언을 부모클래스 타입으로 선언 => Animal tiger = new Tiger();
 * - 다형성을 활용하여 프로그래밍 의 중복을 줄이고 통일성과 유연성을 향상
 * */




public class PolyTest {
	public static void main(String[] args) {
		
		
		//다형성을 적용한 객체 생성(업캐스팅) => 부모클래스 변수 = new 자식클래스();
		Animal a1 = new Animal();
		Animal a2 = new Tiger();
		Animal a3 = new Eagle();
		Animal a4 = new Shark();
		
		a1.move();
		
		a2.move();
		a2.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
	
		
		//다형성을 적용한 객체 생성(다운캐스팅) 
		Tiger tiger = (Tiger) a2;
		Eagle eagle = (Eagle) a3;
		Shark shark = (Shark) a4;
		
		//타입 비교 연산
		if(a2 instanceof Tiger) {
			System.out.println("a2은 tiger 입니다.");
		}else if(a3 instanceof Eagle) {
			System.out.println("a3은 eagle 입니다.");
		}else if(a4 instanceof Shark) {
			System.out.println("a4은 shark 입니다.");
		}
		
		
		// 다형성을 활용한 객체 배열
		Animal arr[] = {tiger, eagle, shark};
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		System.out.println();
		
		
		
		
		//////////////////////////////////
		Pet animal1 = new Dog();
		Pet animal2 = new Cat();

		animal1.makeSound();
		animal2.makeSound();
		
		if(animal1 instanceof Dog) {
			System.out.println("1111");
		}
		if(animal2 instanceof Cat) {
			System.out.println("1111");
		}
		
		
		Dog dog = (Dog) animal1;
		Cat cat = (Cat) animal2;
		
		dog.makeSound();
		cat.makeSound();
		
		printSound(dog);
		printSound(cat);
		
		
		
		
	}
	
	public static void printSound(Pet pet) {
		pet.makeSound();
	}
	
	
	
}
