import javax.xml.crypto.Data;

public class Movie
{
    private int Id;
    private String Title;
    private String Genre;
    private String Director;
    private String Cast;
    private Data RelaseData;
    private Boolean IsAvailable;

    double fee;


    public Movie(String title,String genre,String director,String cast,Data data,int id)
    {
        Title=title;
        Genre=genre;
        Director=director;
        Cast=cast;
        RelaseData=data;
        Id=id;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getCast() {
        return Cast;
    }

    public String getDirector() {
        return Director;
    }

    public String getGenre() {
        return Genre;
    }

    public Data getRelaseData() {
        return RelaseData;
    }

    public boolean isAvailable()
    {
        return IsAvailable;
    }

    public void setAvailable(Boolean available) {
        IsAvailable = available;
    }
}
