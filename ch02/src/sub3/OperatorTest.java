package sub3;

/*
날짜 : 2024/12/31
이름 : 오재영
내용 : Java 연산자 실습
*/

public class OperatorTest {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		//산술연산자
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2;
		int result5 = num4 % num3;
		
		
		System.out.println("num1 + num2 : " + result1);
		System.out.println("num1 - num2 : " + result2);
		System.out.println("num2 * num3 : " + result3);
		System.out.println("num4 / num2 : " + result4);
		System.out.println("num4 % num2 : " + result5);

		//증감연산자
		int num = 0;
		System.out.println("num : " + num);

		num++; //변수 값 1증가
		System.out.println("num : " + num);
		
		++num; //변수 값 1증가
		System.out.println("num : " + num);
		
		num--; //변수 값 1감소
		System.out.println("num : " + num);
		
		--num; //변수 값 1감소
		System.out.println("num : " + num);
		
		
		//복합대입연산자
		num1 += 1;
		num2 -= 2;
		num3 *= 3;
		num4 /= 4;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		
		//비교연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2;
		boolean rs2 = var1 < var2;
		boolean rs3 = var1 >= var2;
		boolean rs4 = var1 <= var2;
		boolean rs5 = var1 == var2;
		boolean rs6 = var1 != var2;

		System.out.println("rs1 : " + rs1); //var1은 var2보다 크다
		System.out.println("rs2 : " + rs2); //var1은 var2보다 작다
		System.out.println("rs3 : " + rs3); //var1은 var2보다 크거나 같다
		System.out.println("rs4 : " + rs4); //var1은 var2보다 작거나 같다
		System.out.println("rs5 : " + rs5); //var1은 var2는 서로 같다
		System.out.println("rs6 : " + rs6); //var1은 var2는 서로 다르다
		
		//논리연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3 > 3) && (var4 > 3); //var3이 3보다 크고 그리고 var4가 3보다 크다.		
		boolean res2 = (var3 > 2) && (var4 > 3); //var3이 2보다 크고 그리고 var4가 3보다 크다.		
		boolean res3 = (var3 > 3) || (var4 > 3); //var3이 3보다 크고 또는 var4가 3보다 크다.
		boolean res4 = (var3 > 3) || (var4 > 5); //var3이 3보다 크고 또는 var4가 5보다 크다.
		boolean res5 = !(var3 > var4); //var3는 var4보다 크다.(부정) false => true
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
		
	}
}
