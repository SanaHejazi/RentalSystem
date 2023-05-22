package org.example;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.xml.crypto.Data;
import java.io.FileReader;
import java.io.FileWriter;
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


        Customer JoshnSmith=AM.getCustomers().get(0);
        Customer Emily=AM.getCustomers().get(1);
        Customer MichaelBrown=AM.getCustomers().get(2);

        //Solving 'null pointer exception' with creating new memory for rentals...

        JoshnSmith.rentals=new ArrayList<>();
        Emily.rentals=new ArrayList<>();
        MichaelBrown.rentals=new ArrayList<>();

        for (Item item: AM.getBooks())
        {
            if (item.getId()==3)
            {
                rentalStore.rentitem(item,JoshnSmith);

            } else if (item.getId()==6)
            {
                rentalStore.rentitem(item,JoshnSmith);
            }
        }
        for (Item item: AM.getBooks())
        {
            if (item.getId()==1)
            {
                rentalStore.rentitem(item,Emily);

            } else if (item.getId()==7)
            {
                rentalStore.rentitem(item,MichaelBrown);
            }
        }

        for (Item item: AM.getBooks())
        {
            if (item.getId()==4)
            {
                rentalStore.rentitem(item,MichaelBrown);

            } else if (item.getId()==9)
            {
                rentalStore.rentitem(item,MichaelBrown);
            }
        }
        reader.close();

      Gson writing=new Gson();
      String json= writing.toJson(AM);
      String filepath="D:\\Intellij DEA\\RentalClone\\RentalSystem\\RentalProject\\SanaHejazi\\src\\test\\TestYourFork.json";
        try {
// Open the file in write mode
            FileWriter writer = new FileWriter(filepath);

// Write the JSON string to the file
            writer.write(json);
// Close the file
            writer.close();
            System.out.println("JSON data has been written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}