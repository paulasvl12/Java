
import java.util.Scanner;




public class MonthDaysMain {
 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
	
       System.out.println ("Enter a month from 1-12");
      int  month = scan.nextInt();
      
     // input validation. Months have to be in between 1 and 12
        while (month < 1 || month > 12) {
        	System.out.println ("Not a valid month. Try again 1-12");
        	month = scan.nextInt();
        }
        
        
       System.out.println ("Enter a year");
       int year = scan.nextInt();
       
       // input validation for years. Years have to be greater than 0
       while (year < 1) {
       	System.out.println ("Not a valid year. Try again starting at 1");
        year = scan.nextInt();
       }
       
       
       // Creating the MonthDays object taking as parameters the scanned variables
       MonthDays md1 = new MonthDays (month, year);
       System.out.println ("Month " + month + " of the year " + year +
    		   " has " + md1.getNumberOfDays() + " days");
       
	}

}
