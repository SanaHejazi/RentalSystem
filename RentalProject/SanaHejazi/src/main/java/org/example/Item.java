package org.example;
import java.util.Date;

public class Item
{
    private Boolean IsAvailable;
    private String Genre;
    private int id;
    private String Title;
    private Date RelaseDate;
    //private Date RentalDate;
    //private Date ReturnDate;


    public void setAvailable(Boolean available) {
        IsAvailable = available;
    }

    public int getId() {
        return id;
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


    public Date getRelaseData() {
        return RelaseDate;
    }

    public Boolean getAvailable() {
        return IsAvailable;
    }
    public Item(int id, String title, String genre, Date relaseDate,boolean IsAvailable) {
    this.id = id;
    Title = title;
    Genre = genre;
    RelaseDate = relaseDate;
    this.IsAvailable=IsAvailable;
}

//    public Date getRentalDate() {
//        return RentalDate;
//    }
//
//    public Date getReturnDate() {
//        return ReturnDate;
//    }
//
//    public void setReturnDate(Date returnDate) {
//        ReturnDate = returnDate;
//    }
//    public void setRentalDate(Date rentalDate) {
//        RentalDate=rentalDate;
//    }
//    Double CalculateLateFee()
//    {
//        int rentDays;
//        double cost=2.5;
//        rentDays=ReturnDate.getDate()-RentalDate.getDate();
//        return rentDays*cost;
//    }




}
