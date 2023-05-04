import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalStore
{

    List<Movie> movies=new ArrayList<Movie>();
    List<Customer> customers;


    public void register(String name, String email, String phone, String address, int Id) {
        Customer customer = new Customer(name, email, phone, address, Id);
        customers = new ArrayList<Customer>();
        customers.add(customer);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }


    public List<Movie> getavailableMovies()
    {
        List<Movie> availableMovies=new ArrayList<>();
        for(int a=0;a<movies.size();a++)
        {
            if (movies.get(a).isAvailable()==true)
            {
                availableMovies.add(movies.get(a));
                return availableMovies;
            }
        }

        return null;
    }

    public void rentMovie(Movie movie, Customer customer, int i)
    {
        Rental Rental=new Rental(movie,customer,i);
    }

    public void addMovie(String title, String genre, String director, String cast, Date date, int id)
    {

        Movie movie=new Movie(title, genre, director, date, cast, id);

        movies.add(movie);

    }
    public Customer getCustomerById(int Id)
    {
          for (int i=0;i<customers.size();i++)
          {
              if (Id==customers.get(i).getId())
              {
                  return customers.get(i);
              }
          }

          return null;
    }

    public Movie getMovieById(int Id)
    {
        for (int i=0;i<movies.size();i++)
        {
            if (Id==movies.get(i).getId())
            {
                return movies.get(Id);
            }
        }

        return null;
    }
}
