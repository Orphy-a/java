package static_;

class Student {
    private static int studentID;
    private String studentName;
    private String major;
    private int grade;
    
    public Student(String studentName, String major, int grade) {
        studentID++;
        this.studentName = studentName;
        this.major = major;
        this.grade = grade;
    }
    
    public void studentInfo() {
        System.out.println("=============");
        System.out.println("학번 : " + studentID);
        System.out.println("이름 : " + studentName);
        System.out.println("전공 : " + major);
        System.out.println("학년 : " + grade);
        System.out.println("=============");
    }
    
    // studentID를 설정하는 static 메소드 추가
    public static void setStudentID(int id) {
        studentID = id;
    }
}

public class asd {
    public static void main(String[] args) {
        Student.setStudentID(20201000);  // studentID를 20201000으로 설정
        
        Student kim = new Student("김유신", "국문과", 1);
        Student lee = new Student("이순신", "경제학과", 1);
        Student lim = new Student("임꺽정", "경영학과", 1);
        
        kim.studentInfo();
        lee.studentInfo();
        lim.studentInfo();
    }
}

