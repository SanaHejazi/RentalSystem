import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class RentalStore
{

    List<Movie>movies;
    List<Customer>customers;

    public  void register(String name,String email,String phone,String address,int Id)
    {
        Customer customer=new Customer(name, email, phone, address, Id);
        customers=new ArrayList<Customer>();
        customers.add(customer);
    }
    public void removeMovie()
    {
        movies.remove(movies);
    }

    public List<Movie> getavailableMovies()
    {
        for (Movie movies:movies
             )
        {
           return (List<Movie>) movies;
        }
        return null;
    }

    public void rentMovie(Movie movie,Customer customer)
    {

    }

    public void addMovie(String title, String genre, String director, String cast, Data data, int id)
    {
        Movie movie=new Movie(title, genre, director, cast, data, id);
        movies=new ArrayList<Movie>();
        movies.add(movie);
    }
}
