package student;

import java.util.Date;

public class SuperAdmin extends Person{
	
	public SuperAdmin() {
		super();
	}

	public SuperAdmin(String name, String gender, String phone, Date birth, Adresse adresse,String email) {
		super(name, gender, phone, birth, adresse,email);
	}
	public void DisplayInfo()
	{
		super.DisplayInfo();
	}
	

}

