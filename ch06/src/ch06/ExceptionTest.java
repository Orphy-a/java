package ch06;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 날짜 : 2025/01/13
 * 이름 : 오재영
 * 내용 : Java 예외처리 실습하기 
 * */

public class ExceptionTest {
	public static void main(String[] args) {
		
		///////////////////////
		// 실행예외(런타임)
		///////////////////////
		
		// 예외상황1 - 어떤 수를 0으로 나눌때
		int num1 = 1;
		int num2 = 0;
		
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			// 예외가 발생 가능한 코드 작성
			r4 = num1 / num2;
		}catch (ArithmeticException e) { //원래라면 오류에 따라 exception클래스를 입력 해야하지만 (다형성)으로 Exception을 통합으로 사용가능
			// 예외가 발생 했을때 처리 작성
			e.printStackTrace(); //예외내용 콘솔출력
		}
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		
		
		// 예외상황2 - 배열의 잘못된 인덱스를 참조할 때
		int[] arr = {1,2,3,4,5};
		
		
		try {
		for(int i = 0;i<=5;i++) { 
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println();
		} catch(ArrayIndexOutOfBoundsException e) { // exception e 로 작성해도 된다.(다형성)
			e.printStackTrace();
		}
		
		// 예외상황3 - 객체 생성없이 메서드 호출
		Animal animal = null; //객체생성 x => 객체 선언, NULL은 값이 없음을 의미하는 값
		
		
		try {
			animal.move();
		} catch(NullPointerException e){
			e.printStackTrace();
		}
		
		// 예외상황4 - 잘못된 캐스팅
		Animal a1 = new Tiger(); // 업캐스팅(다형성)
		Animal a2 = new Eagle();
		
	
		if (a1 instanceof Tiger) {
			Tiger tiger = (Tiger) a1; // 다운캐스팅
			tiger.move();
			tiger.hunt();
			
		}
		
		try {
			Shark shark = (Shark) a2;
			shark.move();
			shark.hunt();
		} catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		///////////////////////
		// 일반예외(컴파일 타임)
		///////////////////////
		
		//동적 객체 생성
		try {
			Class clazz = Class.forName("sub1.Eagle"); //sub1 패키지에 Eagle 클래스 정보 불러오기
			
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			Eagle eagle = (Eagle) constructor.newInstance();
			
			eagle.move();
			eagle.hunt();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {
			// 예외처리 발생여부 상관없이 마지막에 무조건 실행되는 로직
			System.out.println("finally 실행");
		}
		
		
		
		
		
		System.out.println("프로그램 정상 종료");
	} //main end
}
