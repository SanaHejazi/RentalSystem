import java.util.Date;

public class Rental
{
    int Id;
    Movie Movie;
    Customer Customer;
    Date RentalDate;
    Date ReturnDate;
    public Rental(Movie movie,Customer customer,int id)
    {
        Movie=movie;
        Customer=customer;
        Id=id;
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

    //Double CalculateLateFee;
}
