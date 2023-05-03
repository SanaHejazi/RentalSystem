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
    }

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

    public List<Rental> getRentals() {
        return rentals;
    }
}

