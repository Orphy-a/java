package ch06.sec15;

public class SingletonExample {
	public static void main(String[] args) {
		
		/*
		Singleton obj1 = new Singleton(); //컴파일 에러 
		Singleton obj1 = new Singleton(); //컴파일 에러
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
	}
}
