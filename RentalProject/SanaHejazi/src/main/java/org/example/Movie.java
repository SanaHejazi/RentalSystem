package main.java.org.example;
import javax.xml.crypto.Data;
import java.util.Date;

public class Movie extends Item
{
    private String Director;
    private String Cast;
    double fee;


    public Movie(String title, String genre, String director, Date relaseDate, String cast, int id)
    {
        super(id,title,genre,relaseDate);
        Director=director;
        Cast=cast;
    }

    public String getCast() {
        return Cast;
    }

    public String getDirector() {
        return Director;
    }

    public void rentMovie(Movie movie, Customer customer, int i)
    {
        Rental Rental=new Rental(movie,customer,i);
    }
     public void returnMovie()
     {
         setAvailable(true);

     }


}
