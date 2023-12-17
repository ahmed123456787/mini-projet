package student;

import java.io.Serializable;

public class Cycle_Ingenieur implements Cycle, Serializable{
	

    public Cycle_Ingenieur()
    {
    
    }

    public String getNomCycle() {
        return "Cycle Ingénieur";
    }

    public int getDureeCycle() {
        return 5; 
    }
  
}
