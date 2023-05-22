package org.example;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.xml.crypto.Data;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        RentalStore rentalStore=new RentalStore();
        Gson gson = new Gson(); // create a new Gson object
        Reader reader = new FileReader("D:\\Intellij DEA\\RentalClone\\RentalSystem\\RentalProject\\SanaHejazi\\src\\test\\TestYourFork.json"); // open the input file
        AllModules AM=gson.fromJson(reader ,new TypeToken<AllModules>() {}.getType());


        Customer john=AM.getCustomers().get(0);
        Customer Emily=AM.getCustomers().get(1);
        Customer Brown=AM.getCustomers().get(2);

        //Solving 'null pointer exception' with creating new memory for rentals...

        john.rentals=new ArrayList<>();
        Emily.rentals=new ArrayList<>();
        Brown.rentals=new ArrayList<>();

        for (Item item: AM.getBooks())
        {
            if (item.getId()==3)
            {
                rentalStore.rentitem(item,john);


            } else if (item.getId()==6)
            {
                rentalStore.rentitem(item,john);
            }
        }
        for (Item item: AM.getBooks())
        {
            if (item.getId()==1)
            {
                rentalStore.rentitem(item,Emily);

            } else if (item.getId()==7)
            {
                rentalStore.rentitem(item,Brown);
            }
        }

        for (Item item: AM.getBooks())
        {
            if (item.getId()==4)
            {
                rentalStore.rentitem(item,Brown);

            } else if (item.getId()==9)
            {
                rentalStore.rentitem(item,Brown);
            }
        }

        reader.close();



    }
}