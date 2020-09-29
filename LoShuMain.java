
public class LoShuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//it's a MagicSquare if the sum of all rows,
	    //columns, and diagonals add up to the same 
	    //number
		int[][] a = new int[][] {    { 4, 9, 2 },  
			                         { 3, 5, 7 },
			                         { 8, 1, 6 }	};	   
			                               
			                         
			                 
			                         
		//creating the LoShu Object with the array 'a' as parameter	                         
		LoShu magicSquare = new LoShu(a);
		//printing the array
		magicSquare.printSquare();
		
		
		
		//Creating a loop for printing all of the rows and their sums,
		//and creating a variable sumOfAllRows that will later be used
		//to determine if it's a magic square:
		int sumOfAllRows = 0;
		for (int i = 0; i < a.length; i++) {
			sumOfAllRows += magicSquare.rowSum(i);
			System.out.print ("Sum of row " + (i+1) + ": "  + magicSquare.rowSum(i) + "\t");
		}
		
		
		System.out.println();
		
		//Similar to the loop above, this prints the summary 
		//for the columns:
		int sumOfAllColumns = 0;
		for (int i = 0; i < a.length; i++) {
			sumOfAllColumns += magicSquare.colSum(i);
			System.out.print ("Sum of column " + (i+1) + ": "  + magicSquare.colSum(i) + "\t");
		}
		
		
		System.out.println();
		
		//Sum of diagonals:
		System.out.print ("Sum of left diagonal: " + magicSquare.diag1Sum() + "\t");
		System.out.print("Sum of right diagonal: " + magicSquare.diag2Sum() + "\t");
		int diagonals = magicSquare.diag1Sum() + magicSquare.diag2Sum();
		
		System.out.println();
		
		
		//is 1-9 included?
		boolean inc = true;
		for (int i = 1; i <= 9; i++) {
			if (magicSquare.hasValue(i) == false) {
				inc = false;
				break;
			}
		}
		if (inc == true) {
		System.out.println("Good! Square has values 1-9");
		}
		else {
			System.out.println("Values of the square are not 1-9");
		}
		
		
		System.out.println();
		
		//determining if it's a MAgic Square according to the criteria
		if (sumOfAllRows == sumOfAllColumns && (sumOfAllRows)/(3) == magicSquare.diag1Sum() && 
				(sumOfAllRows)/(3) == magicSquare.diag2Sum() && inc == true ) 
		{
	    System.out.println ("It's a Magic Square!");
		}
		else {
			System.out.println ("It's not a Magic Square");
		}
		                                               
	}
}


