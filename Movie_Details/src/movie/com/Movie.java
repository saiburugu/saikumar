package movie.com;

public class Movie {

	public static void main(String[] args) 
	{
		MovieDetailsList MDL=new MovieDetailsList();
		Movie_Details MD=new Movie_Details("BahuBalli","Prabhas","Anushka","Action");
		Movie_Details MD1=new Movie_Details("BahuBalli2","Prabhas","Anushka","Action");
		Movie_Details MD2=new Movie_Details("Varsham","Prabhas","Trisha","Love");
		Movie_Details MD3=new Movie_Details("Bujjigadu","Prabhas","Trisha","Love");
		MDL.add_movie(MD);
		MDL.add_movie(MD1);
		MDL.add_movie(MD2);
		MDL.add_movie(MD3);
		MDL.Display();
		System.out.println(MDL.remove_movie("ghj"));
				MDL.Display();
				for(Movie_Details dm:MDL.Sort("MovieName"))
				{
					System.out.println(dm);
				}
				MDL.Display();
		MDL.remove_All();
		MDL.Display();
	}

}
