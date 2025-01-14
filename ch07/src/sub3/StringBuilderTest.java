package sub3;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		//String 객체의 immutable(불변성) 특성으로 메모리 낭비 발생
		String str = "Hello";
		System.out.println("str : " + str);
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "World"; // 새로운 문자열 삽입
		System.out.println("str : " + str);
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		
		//String의 불변성을 개선한 StringBuilder로 문자열 가공
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb : " + sb);
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		
		sb.append(" World"); // 메모리 낭비 발생 x
		System.out.println("sb : " + sb);
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		
		
	}
	
}
