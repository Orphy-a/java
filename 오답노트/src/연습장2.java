import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}


public class 연습장2 {
	
	public static void main(String[] args) {
		
		Person person = new Person("앨리스", 25);
		
		String filepath = "C:\\Users\\lotte6\\Desktop\\Apple.txt";
		
		//직렬화
		try {
			//기본스트림
			FileOutputStream fos = new FileOutputStream(filepath);
			//보조스트림 연결
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(person);
			
			oos.close();
			fos.close();		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("직렬화 완료");
		
		
		
		try {
			
			//기본스트림 생성 및 보조스트림 연결
			FileInputStream fis = new FileInputStream(filepath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person person1 = (Person) ois.readObject();
			
			System.out.println("복원된 객체 : " + person1);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
		
		
		
		

	}
		
	
}
