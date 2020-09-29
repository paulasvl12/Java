
public class LoShu {

	private int[][] square;
	
	//constructor
	public LoShu (int[][] s) {
		square = s;
		
	}
	
	
	//prints the 2D array clearly formatted to outline rows and columns
	public void printSquare () {
		
		for (int row = 0; row < square.length; row++) {
			for (int col = 0; col < square[row].length; col++) {
				System.out.print(square[row][col]);
				if (col == square[row].length - 1) {
					System.out.println();
				}
				else {
					System.out.print("\t");
				}
			}
		}
		
	}
	
	//returns sum of a given row
	public int rowSum (int i) {
		int sum = 0;
		
		for (int col = 0; col < square[i].length; col++) {
			
			sum += square[i][col];
			
		}
		return sum;
	}
	
	
	//returns sum of a given column
	public int colSum (int i) {
		int sum = 0;
		
		for (int row = 0; row < square.length; row++) {
			
			sum += square[row][i]; 
			
		}
		return sum;
	}
	
	
	//returns sum of diagonal starting at
	//top left corner towards bottom right corner
	public int diag1Sum () {
		int sum = 0;
		//add the first column on the first row,
		//the second column on the second row, the third column
		//on third row, and so on
		for (int row = 0; row < square.length; row++) {
			for (int col = 0; col < square[row].length; col++) {
		//the diagonal exists when the array's column
	    //and row have the same number. ex: square[2][2]
				if (row == col ) {
					sum += square[row][col];
				}
			}
			
		}
		return sum;

	}
	
	//prints diagonal going from bottom left to top right
	public int diag2Sum () {
	   int sum = 0;
		
	   final int LAST_COL = 1;
		
		//we are starting from the right side (or end of row)
		for (int row = 0; row < square.length; row++) {
			//the last column of this array is square[row].length - 1
			//we'll start there, and go down by 1 until it gets to 
			//column of index 0
			for (int col = square[row].length - 1; col > LAST_COL ; col--) {
				sum += square[row][col];
			  
			}
		}
		return sum;
	}
	
	//iterates through the entire array to return true if
	//the value v is in the array
	public boolean hasValue (int v) {
		
		for (int row = 0; row < square.length; row++) {
			for (int col = 0; col < square[row].length; col++) {
				if (square[row][col] == v) {
					return true;
				}
				
			}
		}
		
			return false;
		
		
		
		
	}
	
	
	
}
