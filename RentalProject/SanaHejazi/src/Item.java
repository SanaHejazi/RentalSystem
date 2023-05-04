import javax.xml.crypto.Data;

public class Item
{
    private Boolean IsAvailable=true;
    private String Genre;
    private int Id;
    private String Title;
    private Data RelaseData;


    public void setAvailable(Boolean available) {
        IsAvailable = available;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getGenre() {
        return Genre;
    }

    public boolean isAvailable()
    {
        return IsAvailable;
    }


    public Data getRelaseData() {
        return RelaseData;
    }

    public Boolean getAvailable() {
        return IsAvailable;
    }
    public Item(int id, String title, String genre, Data relaseData) {
    Id = id;
    Title = title;
    Genre = genre;
    RelaseData = relaseData;
}




}
