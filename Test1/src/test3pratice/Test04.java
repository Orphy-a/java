package test3pratice;

class Student{
	
	protected static int studentId;
	private String name;
	private String major;
	private int grade;
	
	public Student(String name, String major, int grade) {
		studentId++;
		this.name = name;
		this.major = major;
		this.grade = grade;
	}


	public void show() {
		System.out.println("===============");
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("===============");
	}
	
	
}


public class Test04 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000;
		
		Student kim = new Student("김유신", "국문과", 3);
		kim.show();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.show();
		
		Student lim = new Student("임꺽정", "컴퓨터공학과", 2);
		lim.show();
		
		
	}
}
