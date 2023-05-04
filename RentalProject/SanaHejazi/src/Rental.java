import java.util.Date;

public class Rental
{
    private int Id;
    private Movie Movie;
    private Game Game;
    private Book Book;
    private Customer Customer;
    private Date RentalDate;
    private Date ReturnDate;
    public Rental(Movie movie,Customer customer,int id)
    {
        Movie=movie;
        Customer=customer;
        Id=id;
        movie.setAvailable(false);
    }

    public Rental(Book book,Customer customer,int id)
    {
        Book=book;
        Customer=customer;
        Id=id;
        book.setAvailable(false);
    }

    public Rental(Game game, Customer customer, int id)
    {
       Game=game;
        Customer=customer;
        Id=id;
        game.setAvailable(false);
    }

    public int getId() {
        return Id;
    }

    public Movie getMovie() {
        return Movie;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public Date getRentalDate() {
        return RentalDate;
    }

    public Date getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(Date returnDate) {
        ReturnDate = returnDate;
    }
    public void setRentalDate(Date rentalDate) {
        RentalDate=rentalDate;
    }
    Double CalculateLateFee()
    {
        int t;
        t=RentalDate.getDay()-ReturnDate.getDay();
        return t*(getMovie().fee);
    }
}
