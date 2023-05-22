package org.example;
import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game extends Item

{

    String PublisherCompany;
    //ArrayList<String> platforms=new ArrayList<String>();
    String aboutGame;


    public Game(int id, String title, String genre, Date relaseDate,String publisherCompany,String aboutGame,boolean isAvailable)
    {
        super(id, title, genre, (Date) relaseDate,isAvailable);
        PublisherCompany=publisherCompany;
        this.aboutGame=aboutGame;

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
