package student;
import java.util.Date;

public class Person {
	private String Name,gender,phone;
	private Date birth;
	private Adresse adresse;
	String email ;

	public Person()
	{
		
	}
	
	public Person (String name,String gender,String phone,Date birth,Adresse adresse,String email) {
		this.Name=name;
		this.gender=gender;
		this.phone=phone;
		this.birth=birth;
		this.adresse=adresse;
		this.email=email;
		
	}

	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Date getBirth() {
		return birth;
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}


	public void DisplayInfo() {
		System.out.println(this.getName());
		System.out.println(this.getGender());
		System.out.println(this.getPhone());
		System.out.println(this.getBirth());
		System.out.println(this.getAdresse());
	}

	private Adresse getAdresse() {
		
		return this.adresse;
	}
	
}
