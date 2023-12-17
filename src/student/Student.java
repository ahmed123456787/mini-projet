package student;
import java.util.*;


	public class Student extends Person{
		
		private String promotion ;
		private int section,groupe;
		private ArrayList <Module> ModuleStudy;
		private  float GradeFinal ;
		private Cycle Cylce_Etud ;
		
		public Cycle getCyle() {
		return Cylce_Etud;
	}
	public void setCyle(Cycle cyle) {
		Cylce_Etud = cyle;
	}
		public float getGradeFinal()
			
{
return this.GradeFinal;
}
public void SetGradeFinal(float X)
{
this.GradeFinal=X;
}
		
		public void AffecterModule()
		{
			ArrayList<Module> AllModules = All_List.modules;
			for(Module M:AllModules )
				{
					if(M.Formation.getNomCycle().equals(this.Cylce_Etud.getNomCycle()))
					{
						this.ModuleStudy.add(M);
					}
				}
		}
		
		public Student (String name,String gender,String phone,Date birth,Adresse adresse,String email) {
			super(name,gender,phone,birth,adresse,email);
			this.ModuleStudy=new ArrayList();
		}
		public String getPromotion() {
			return promotion;
		}
		public void setPromotion(String promoton) {
			this.promotion = promoton;
		}
		public int getSection() {
			return section;
		}

		public void setSection(int section) {
			this.section = section;
		}

		public int getGroupe() {
			return groupe;
		}

		public void setGroupe(int groupe) {
			this.groupe = groupe;
		}
		
		public void Displayinfo() {
			this.DisplayInfo();
			System.out.println("The Groupe :"+this.getGroupe());
			System.out.println("The Section :"+this.getSection());
			System.out.println("The Promotion :"+this.getPromotion());
		}
		
		
		

	}
