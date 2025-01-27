package test6.sub06;

public class Patient {
	
	private String name;
	private String id;
	private int age;
	private String diagnosis;
	
	
	
	public Patient(String name, String iD, int age, String diagnosis) {
		this.name = name;
		this.id = iD;
		this.age = age;
		this.diagnosis = diagnosis;
	}



	@Override
	public String toString() {
		return "Patient [name=" + name + ", id=" + id + ", age=" + age + ", diagnosis=" + diagnosis + "\n";
	}
	

}
