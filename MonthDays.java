
public class MonthDays {

	private int month, year;
	

	
int []	days= new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
	
// initializing the constructor 
	public MonthDays (int m, int y) {
		month=m;
		year=y;
	}
	
	
// this method will return the amount of days in the month scanned depending on
// the year scanned
	public int getNumberOfDays() {
		
		if (year%100 == 0) {
			if (year%400 == 0) {
				days[1]=29;
			}
		}
			else if (year%4 == 0){
				days[1]=29;
			}
	
		return days[month - 1];

	}
	

	
	
}
		
	


	
	

