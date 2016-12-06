package blkGUIone;

public enum TEMPLE_TYPE {
	PLEASE_SELECT_ONE_TEMPLE("",""),
	ASIA_MINOR("The Temple at Teos in Asia Minor","Teos was one of the twelve cities."),
	HERCULER("temple of herculer","The Temple of Hercules Victor or Hercules Olivarius is a Roman temple in Piazza"
			+ "\n Bocca della Verità, in the area of the Forum Boarium close to the Tiber in Rome."),
	TEMPLE2("temple2","descriptions"),
	DORIC("Doric","Description of Doric"),
	TEMPLE3("temple3","Description of temple3"),
	TEMPLE4("temple4","Description of temple4"),
	TEMPLE5("temple5","Description of temple5");
	String name="";
	private String info="";
	
	TEMPLE_TYPE(String n,String i){
		name=n;
		info=i;
	}
	
	public String getName(){
		return name;
	}
	
	public String getInfo(){
		return info;
	}
	
}
