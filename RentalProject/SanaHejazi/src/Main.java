import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

                         //TEST...


        ArrayList<String> platforms=new ArrayList<>();
        platforms.add("PS4");
        platforms.add("PS5");
        platforms.add("Xbox");
        Date releasedate=new Date(2003,2,2);
        Date releasedate2=new Date(2003,2,2);
        Date rentalDate=new Date(2003,2,21);
        Date returnDate=new Date(2003,2,26);


        RentalStore rentalStore=new RentalStore();
        rentalStore.register("Sana","sanahejazirad","0936601","nehzat",12);
        rentalStore.addGame(12,"TEKKEN","Action",releasedate,"ATOMI",platforms);

        for (Game sana:rentalStore.getavailablegames()
             )
        {
            System.out.println(sana.getTitle());

        }

//        rentalStore.addMovie("tintin","action","hogo","jame",releasedate,123);
//        rentalStore.addMovie("tomandjerry","action","hesam","tony",releasedate2,353);
//        System.out.println(rentalStore.getCustomerById(12).getName());
//
//        rentalStore.rentMovie(rentalStore.movies.get(0),rentalStore.customers.get(0),12);
//        rentalStore.movies.get(0).setRentalDate(rentalDate);
//        rentalStore.movies.get(0).setReturnDate(returnDate);
//        System.out.println(rentalStore.movies.get(0).CalculateLateFee());

//
//        for (Movie sana:rentalStore.getavailableMovies()
//             )
//        {
//            System.out.println(sana.getTitle());
//
//        }

//        rentalStore.removeMovie(rentalStore.movies.get(1));
//
//        for (Movie sana:rentalStore.getavailableMovies()
//             )
//        {
//            System.out.println(sana.getTitle());
//
//        }



    }
}