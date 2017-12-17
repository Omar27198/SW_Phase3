import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends General_Users{

    void Buy_Product(ArrayList<Product> Queue, Product prod_name, Voucher v1)
    {

        Product pro=new Product();
        if(pro.Check_Product_Availability(Queue,prod_name))
        {
            System.out.println("Prodcut Exists");
            int index = Queue.indexOf(prod_name);
            Queue.remove(index);
            System.out.println("the price of this product is"+prod_name.Price);
            System.out.println("the prand  of this product is"+prod_name.Brand);
            System.out.println("the name of this product is"+prod_name.Name);
            System.out.println("enter payment method one of the following\n 1:cach\n 2:visa\n 3:voucher");
            Scanner input=new Scanner(System.in);
            String name=input.next();

            pro.Check_Payment_Method(name,v1,prod_name.getPrice());

        }
        else
            System.out.println("product not found");

    }

    public void Suggest_product(ArrayList<Product>p1, Admin a1)
    {
        Product obj = new Product();
        Brand b1=new Brand();
        Scanner var = new Scanner(System.in);
        System.out.println("if you want to add new product press 1");
        int tmp=var.nextInt();
        if(tmp==1)
        {
            System.out.println("Enter Product Name: ");
            obj.setName(var.nextLine());
            System.out.println("Enter Product Brand name: ");
            b1.setName(var.nextLine());
            System.out.println("Enter Product Brand type: ");
            b1.setType(var.nextLine());
            System.out.println("Enter Product Brand id: ");
            b1.setID(var.nextLine());
            obj.setBrand(b1);
            System.out.println("Enter Product Price: ");
            obj.setPrice(var.nextFloat());
            System.out.println("Enter Product id: ");
            obj.setID(var.nextLine());
        }
        if(a1.accept())
            p1.add(obj);
        else
            System.out.println("the addmin didn't accept this procuct");


    }

    void Customer_Sign_up(ArrayList<Customer> map)
    {
        Customer obj = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username for sign up:   ");
        String n = input.next();
        obj.setName(n);
        System.out.print("Enter password for sign up:   ");
        String pass = input.next();
        obj.setPassword(pass);
        System.out.print("Enter email for sign up:   ");
        String email = input.next();
        obj.setEmail(email);
        map.add(obj);
    }

    Customer Customer_sign_in(ArrayList<Customer> Users_arrlist)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username:   ");
        String n = input.next();
        System.out.print("Enter password:   ");
        String pass = input.next();
        for (int i = 0; i < Users_arrlist.size(); i++)
        {
            if (Users_arrlist.get(i).getName().equals(n) && Users_arrlist.get(i).getPassword().equals(pass))
            {
                System.out.println("Succes" + Users_arrlist.get(i));
                return Users_arrlist.get(i);
            }
            else if(i == Users_arrlist.size()-1)
            {
                System.out.println("You don't have an account you need to sign up first!!");
                this.Customer_Sign_up(Users_arrlist);
            }
        }
        Customer ob = new Customer();
        return ob;
    }
}
