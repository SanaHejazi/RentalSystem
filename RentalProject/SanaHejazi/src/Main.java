import javax.xml.crypto.Data;
import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        Date RelaseData=new Date();
        //Movie Moie1=new Movie("TinTin","Action","Arad","Gholi", (Data) RelaseData,2);
        RentalStore RentShop=new RentalStore();
        RentShop.register("Ali","sanahejazirad","0911124","azadi",3);
        System.out.println(RentShop.getCustomerById(3));
        System.out.println(RentShop);


    }
}