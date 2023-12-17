package student;

import java.sql.Date;
import java.util.ArrayList;

public class Teacher extends Person{
	
	ArrayList<Float> ModulesResp  = new ArrayList<Float>();
	ArrayList<Float> Sections = new ArrayList<Float>();
	
	public Teacher(String name , String gender ,String phone ,Date date ,Adresse adress, ArrayList<Float> Sections ,ArrayList<Float> ModulesResp , String email) {
		super(name,gender,phone,date,adress,email);
		this.ModulesResp=ModulesResp;
	}
	
	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Programs responsible for it : ");
		for(int i=0;i<ModulesResp.size();i++) {
			System.out.println("Programe : "+ModulesResp.get(i));
			System.out.println("The Section is : "+Sections.get(i));	
			System.out.println();
			}		
		}

}
