package main.java.org.example;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalStore
{

    List<Movie> movies=new ArrayList<Movie>();
    List<Game> games=new ArrayList<Game>();
    List<Book> books=new ArrayList<Book>();
    List<Customer> customers;


    public void register(String name, String email, String phone, String address, int Id) {
        Customer customer = new Customer(name, email, phone, address, Id);
        customers = new ArrayList<Customer>();
        customers.add(customer);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public void removeGame(Game game) {
        games.remove(game);
    }

    public void removeBook(Book book) {
        books.remove(book);
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

    public List<Game> getavailablegames()
    {
        List<Game> availableGame=new ArrayList<>();
        for(int a=0;a<games.size();a++)
        {
            if (games.get(a).isAvailable()==true)
            {
                availableGame.add(games.get(a));
                return availableGame;
            }
        }

        return null;
    }

    public List<Book> getavailableBooks()
    {
        List<Book> availableBooks=new ArrayList<>();
        for(int a=0;a<books.size();a++)
        {
            if (books.get(a).isAvailable()==true)
            {
                availableBooks.add(books.get(a));
                return availableBooks;
            }
        }

        return null;
    }


    public void rentMovie(Movie movie, Customer customer, int i)
    {
        Rental Rental=new Rental(movie,customer,i);
    }

    public void rentGame(Game game, Customer customer, int i)
    {
        Rental Rental=new Rental(game,customer,i);
    }

    public void rentBook(Book book, Customer customer, int i)
    {
        Rental Rental=new Rental(book,customer,i);
    }

    public void addMovie(String title, String genre, String director, String cast, Date date, int id)
    {

        Movie movie=new Movie(title, genre, director, date, cast, id);

        movies.add(movie);

    }

    public void addGame(int id, String title, String genre, Date relaseDate, String publisherCompany, ArrayList<String> platforms)
    {
        Game game=new Game(id, title, genre, relaseDate, publisherCompany, platforms);

        games.add(game);

    }

    public void addBook(int id, String title, String genre, Data relaseDate, String publisher,String author)
    {
        Book book=new Book(id, title, genre, relaseDate, publisher, author);

       books.add(book);
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

    public Game getGameById(int Id)
    {
        for (int i=0;i<games.size();i++)
        {
            if (Id==games.get(i).getId())
            {
                return games.get(Id);
            }
        }

        return null;
    }

    public Book getBookById(int Id)
    {
        for (int i=0;i<books.size();i++)
        {
            if (Id==books.get(i).getId())
            {
                return books.get(Id);
            }
        }

        return null;
    }
}
