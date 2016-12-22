
public class Time {
	static int hour;
	static int minute;
	static int second;
	static String time;
	
	public static String timeSet(int hr, int min, int sec){
		hour = hr;
		minute = min;
		
		if (hr >= 0 && hr <= 23)
			hour = hr;
		else 
			hour = hr%23;
		
		if (min >= 0 && min <= 59)
			minute = min;
		else 
			{minute = min%59;
			hour+=min/60;
			}
		if (sec >= 0 && sec <= 59)
			second = sec;
		else 
			{second = sec%59;
			min+=sec/60;
			}
		
		time = Integer.toString(hour) +":"+ Integer.toString(minute) +":"+ Integer.toString(second);
		return showTime();
	}
	
	public static String showTime(){
		return time;
	}
}
