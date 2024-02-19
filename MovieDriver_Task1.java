import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args)
	{
		String title, rating; 
		int sold;
		
		Scanner keyboard = new Scanner(System.in);
		
		Movie movie = new Movie();
		
		System.out.println("Enter title of a movie: ");
		title = keyboard.nextLine();
		movie.setTitle(title);
		
		System.out.println("Enter the movies rating: ");
		rating = keyboard.nextLine();
		movie.setRating(rating);
		
		System.out.println("Enter number of tickets sold: ");
		sold = keyboard.nextInt();
		movie.setSoldTickets(sold);
		
		
		
		keyboard.close();
		
		System.out.println("Goodbye");
	}

}
