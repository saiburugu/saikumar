package movie.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieDetailsList 
{
	ArrayList<Movie_Details> movie;

    public MovieDetailsList() 
    {
        this.movie = new ArrayList<>();
    }
    public void add_movie(Movie_Details MD)
    {
    	movie.add(MD);
    }
    public String remove_movie(String MName)
    {
    	for(Movie_Details MD:movie)
    	{
    		if(MD.getMov_Name().equals(MName))
    		{
    			movie.remove(MD);
    			return ("Movie removed");
    		}
    	}
    	return ("Movie Does not exist");
    	
    }
    public void Display()
    {
    	for(Movie_Details MD:movie)
    		System.out.println(MD);
    }
    public void remove_All()
    {
    	movie.removeAll(movie);
    }
    public String find_movie_By_mov_Name(String MName)
    {
    	for(Movie_Details MD:movie)
    	{
    		if(MD.getMov_Name().equals(MName))
    			return ("Movie Name:"+MD.getMov_Name()+"Movie Actor: "+MD.getLead_actor()+"Movie Actories: "+MD.getLead_actories()+"Movie Genre"+MD.getGenre());
    	}
    	return ("Movie is not in list");
    } 
    public String find_movie_By_genre(String MName)
    {
    	for(Movie_Details MD:movie)
    	{
    		if(MD.getGenre().equals(MName))
    			return ("Movie Name:"+MD.getMov_Name()+"Movie Actor: "+MD.getLead_actor()+"Movie Actories: "+MD.getLead_actories()+"Movie Genre"+MD.getGenre());
    	}
    	return ("Movie is not in list");
    }
    public ArrayList<Movie_Details> Sort(String Type)
    {
    	if(Type=="MovieName")
    	{
    		Collections.sort(movie,new Comparator<Movie_Details>() {
    			@Override
    			public int compare(Movie_Details o1,Movie_Details o2) {
    				return o1.getMov_Name().compareTo(o2.getMov_Name());
    			}
    		});
    	}
    	else if(Type=="LeadActor")
    	{
    		Collections.sort(movie,new Comparator<Movie_Details>() {
    			@Override
    			public int compare(Movie_Details o1,Movie_Details o2) {
    				return o1.getLead_actor().compareTo(o2.getLead_actor());
    			}
    		});
    	}
    	else if(Type=="LeadActories")
    	{
    		Collections.sort(movie,new Comparator<Movie_Details>() {
    			@Override
    			public int compare(Movie_Details o1,Movie_Details o2) {
    				return o1.getLead_actories().compareTo(o2.getLead_actories());
    			}
    		});
    	}
    	else if(Type=="Gener")
    	{
    		Collections.sort(movie,new Comparator<Movie_Details>() {
    			@Override
    			public int compare(Movie_Details o1,Movie_Details o2) {
    				return o1.getGenre().compareTo(o2.getGenre());
    			}
    		});
    	}
    	return movie;
    	
    }
    
}
