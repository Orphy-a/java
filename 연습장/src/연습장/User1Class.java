package 연습장;


//User1 테이블 엔티티 클래스
public class User1Class {
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public User1Class(){};
	
	
	public User1Class(String uid, String name, String hp, int age) {
		this.uid = uid;
		this.name = name;
		this.hp = hp;
		this.age = age;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User1Class [uid=" + uid + ", name=" + name + ", hp=" + hp + ", age=" + age + "]";
	}
	
	
	
	
}
