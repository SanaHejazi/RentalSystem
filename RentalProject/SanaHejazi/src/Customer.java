import java.util.ArrayList;
import java.util.List;

public class Customer
{
    String name;
    String email;
    String phone;
    String address;
    int Id;

    List<Rental> rentals=new ArrayList<Rental>();
    public Customer(String name,String email,String phone,String address,int Id)
    {
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.Id=Id;
    }
    Rental Rental;

    public int getId() {
        return Id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    //public List<Rental> getRentals()
    //{
    //    for (List<Rental> sana: Rental.
    //        )
    //    {
    //       return sana;

    // }
    // return null;
    //}
}

