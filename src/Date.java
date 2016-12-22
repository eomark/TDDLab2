
public class Date {
	public enum months {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
	
	static int year;
	static int month;
	static int day;
	static String date;
	
	public static String dateSet(int yr, int mn, int dy){
		year = yr;
		month = mn;
		day= dy;
		
		// Assesuming that all months are 30 days
		if (day >= 0 && day <= 30)
			day = dy;
		else 
			day %= 30;
		
		if (year >= 2000 && year <= 2100)
			year = yr;
		else 
			year = 2000;
		
		//TODO: add one for month
		
		date = Integer.toString(year) +"-"+ String.valueOf(months.values()[month-1]) +"-"+ Integer.toString(day);
		return showDate();
	}
	
	public static String showDate(){
		return date;
	}
}
