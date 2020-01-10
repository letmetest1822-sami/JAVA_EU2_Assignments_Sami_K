package assignments.Assignments4;

public class Question014_ABC_bookSeller {

	public static void main(String[] args) {
		/* ABC Booksellers has a book club that awards points to its customers
		 * based on the number of books purchased each month. 
		 * The points are awarded as follows:

If a customer purchases 0 books, he or she earns 0 points.
If a customer purchases 1 book, he or she earns 5 points.
If a customer purchases 2 books, he or she earns 15 points.
If a customer purchases 3 books, he or she earns 30 points.
If a customer purchases 4 books or more books, he or she earns 60 points.
		* Write a program that lets the user declare 
		* the number of books that he or she has purchased this month 
		* and then display the number of points awarded.*/
		
		int PointsEarned, NumberOfBooksPurchased = 0;
		
		switch (NumberOfBooksPurchased) {
			case 0:
				PointsEarned =  0;
				System.out.println("No points were earned in this month because no books were purchased." );
				break;
			case 1:
				PointsEarned =  5;
				System.out.println("The points earned in this month is " + PointsEarned + " for the purchased " + NumberOfBooksPurchased  +" books." );
				break;
				
			case 2:
				PointsEarned =  15;
				System.out.println("The points earned in this month is " + PointsEarned + " for the purchased " + NumberOfBooksPurchased  +" books." );
				break;
				
			case 3:
				PointsEarned = 30;
				System.out.println("The points earned in this month is " + PointsEarned + " for the purchased " + NumberOfBooksPurchased  +" books." );
				break;
				
			default:
				PointsEarned = 60;
				System.out.println("The points earned in this month is " + PointsEarned + " for the purchased " + NumberOfBooksPurchased  +" books." );
				break;
		}	
				

	}

}
