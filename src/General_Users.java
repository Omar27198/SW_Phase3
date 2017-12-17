import java.*;
import java.io.*;
import java.lang.*;
import java.util.*;

public class General_Users {

    private String Name;
    private String Password;
    private String Email;

    General_Users() {
        Name = "";
        Password = "";
        Email = "";
    }

    General_Users(String name, String pass, String email) {
        Name = name;
        Password = pass;
        Email = email;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String pass) {
        Password = pass;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    void View_specific_Product(ArrayList<Product> Queue)
    {
        Scanner sca = new Scanner(System.in);
        String name;
        System.out.print("Enter Name of Product you want to seach for:   ");
        name = sca.nextLine();

        for (int i = 0; i < Queue.size(); i++)
        {
            Product p1 = Queue.get(i);
            int temp = p1.getProduct_Quantity();
            temp++;
            p1.setProduct_Quantity(temp);
            if (name == p1.Name)
            {
                System.out.println("the price of this product is: " + p1.Price);
                System.out.println("the prand  of this product is: " + p1.Brand);
                System.out.println("the name of this product is: " + p1.Name);
            }
            else
            {
                System.out.println("Product does not exists.");
            }
        }
    }

    void Explore_Products(ArrayList<Product> Queue)
    {
        for (int i = 0; i < Queue.size(); i++)
        {
            Product p1 = Queue.get(i);
            int temp = p1.getProduct_Quantity();
            temp++;
            p1.setProduct_Quantity(temp);
            System.out.println("the price of this product is: " + p1.Price);
            System.out.println("the prand  of this product is: " + p1.Brand);
            System.out.println("the name of this product is: " + p1.Name);
        }
    }

    void Explore_Products_in_store(ArrayList<Product> Queue)
    {
        for (int i = 0; i < Queue.size(); i++)
        {
            Product p1 = Queue.get(i);
            int temp = p1.getProduct_Quantity();
            temp++;
            p1.setProduct_Quantity(temp);
            System.out.println("the price of this product is: " + p1.Price);
            System.out.println("the prand  of this product is: " + p1.Brand);
            System.out.println("the name of this product is: " + p1.Name);
        }
    }
}
