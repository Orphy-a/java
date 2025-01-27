package user2;

public class User2 {

	private String uid;
	private String name;
	private String birth;
	private String country;
	public User2(String uid, String name, String birth, String country) {
		super();
		this.uid = uid;
		this.name = name;
		this.birth = birth;
		this.country = country;
	}
	
	public User2() {}
	
	
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




	public String getBirth() {
		return birth;
	}




	public void setBirth(String birth) {
		this.birth = birth;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	@Override
	public String toString() {
		return "User2 [uid=" + uid + ", name=" + name + ", birth=" + birth + ", country=" + country + "]";
	}
	
	
	
	
	

}
