
public class Clock {
	private Time theTime = new Time();
	private Date theDate = new Date(); 
	boolean mode = true;
	
	public String changeMode(){
		
		if (mode){
			mode = false;
			return theDate.showDate();
		}
			else{
				mode = true;
				return theTime.showTime();
		}
	}
	
	private String Reset(){
		// TODO: implement Reset
		String response = "";
		return response;
	}
	
	private String Set(int p1, int p2, int p3){
		if (mode){
			mode = false;
			return theDate.dateSet(p1, p2, p3);
		}
			else{
				mode = true;
				return theTime.timeSet(p1, p2, p3);
		}
	}
}
