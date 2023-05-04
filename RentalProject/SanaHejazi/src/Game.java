import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game extends Item

{

    String PublisherCompany;
    ArrayList<String> platforms=new ArrayList<String>();


    public Game(int id, String title, String genre, Data relaseDate,String publisherCompany,ArrayList<String> platforms)
    {
        super(id, title, genre, (Date) relaseDate);
        PublisherCompany=publisherCompany;
        this.platforms=platforms;
    }
    public void rentGame(Game game, Customer customer, int i)
    {
        Rental Rental=new Rental(game,customer,i);
    }

    public void returnGame()
    {
        setAvailable(true);

    }




}
