import javax.xml.crypto.Data;
import java.util.Date;

public class Book extends Item
{

    private String publisher;
    private String author;
    public Book(int id, String title, String genre, Data relaseDate, String publisher,String author) {
        super(id, title, genre, (Date) relaseDate);
        this.author=author;
        this.publisher=publisher;
    }
    public void rentBook(Book book, Customer customer, int i)
    {
        Rental Rental=new Rental(book,customer,i);
    }

    public void returnBook()
    {
        setAvailable(true);

    }

}
