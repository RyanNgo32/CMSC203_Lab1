import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args)
	{
		String title, rating; 
		int sold;
		String letter;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
			
			
			Movie movie = new Movie();
			
			System.out.println("Enter title of a movie: ");
			title = keyboard.nextLine();
			movie.setTitle(title);
			
			System.out.println("Enter the movies rating: ");
			rating = keyboard.nextLine();
			movie.setRating(rating);
			
			System.out.println("Enter number of tickets sold: ");
			sold = keyboard.nextInt();
			
			keyboard.nextLine();
			
			movie.setSoldTickets(sold);
			
			
			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			
			letter = keyboard.nextLine();

			
			
		}while(letter.equals("y"));
		
		keyboard.close();
		System.out.println("Goodbye");
	}

}
