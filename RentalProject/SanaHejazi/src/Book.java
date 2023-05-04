import javax.xml.crypto.Data;

public class Book extends Item
{

    private String publisher;
    private String author;
    public Book(int id, String title, String genre, Data relaseData, String publisher,String author) {
        super(id, title, genre, relaseData);
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
