import javax.xml.crypto.Data;

public class Movie extends Item
{
    private String Director;
    private String Cast;
    double fee;


    public Movie(String title,String genre,String director,Data relaseData,String cast,int id)
    {
        super(id,title,genre,relaseData);
        Director=director;
        Cast=cast;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public String getCast() {
        return Cast;
    }

    public String getDirector() {
        return Director;
    }

    public void rentMovie(Movie movie, Customer customer, int i)
    {
        Rental Rental=new Rental(movie,customer,i);
    }
     public void returnMovie()
     {
         setAvailable(true);

     }


}
