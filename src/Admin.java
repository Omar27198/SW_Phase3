import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends General_Users {

    public void Add_new_product(ArrayList<Product> Queue)
    {
        Product p1=new Product();
        Scanner input=new Scanner(System.in);
        System.out.println("enter product id");
        p1.ID=input.nextLine();
        System.out.println("enter product name");
        p1.Name=input.nextLine();
        System.out.println("enter product brand name");
        String brand_name=input.nextLine();
        System.out.println("enter product brand id");
        String brand_id=input.nextLine();
        System.out.println("enter product brand type");
        String brand_type=input.nextLine();
        Brand b1=new Brand();
        b1.setType(brand_type);
        b1.setName(brand_name);
        b1.setID(brand_id);
        p1.setBrand(b1);
        System.out.println("enter product price");
        p1.Price=input.nextFloat();
        Queue.add(p1);
    }

    public void add_new_store(ArrayList<Store>h1)
    {
        Store s1=new Store();
        Scanner input=new Scanner(System.in);
        System.out.println("enter store name ");
        s1.setName(input.nextLine());
        System.out.println("enter store phone");
        s1.setPhone(input.nextInt());
        System.out.println("enter store address");
        s1.setAddress(input.nextLine());
        h1.add(s1);
    }

    public void add_new_brand(ArrayList<Brand> h1)
    {
        Brand s1 = new Brand();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Store ID: ");
        s1.setID(input.nextLine());
        System.out.print("Enter Store Name: ");
        s1.setName(input.nextLine());
        System.out.print("Enter Store Type: ");
        s1.setType(input.nextLine());
        h1.add(s1);
    }

    public boolean accept()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("if your an admin do you want to accept this product\n 1:accept \n 2:don't accept");
        String str=  input.nextLine();
        if(str=="accept")
            return true;
        else
            return false;
    }

    void Admin_Sign_up(ArrayList<Admin> map)
    {
        Admin obj = new Admin();
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

    Admin Admin_sign_in(ArrayList<Admin> Users_arrlist)
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
                this.Admin_Sign_up(Users_arrlist);
            }
        }
        Admin ob = new Admin();
        return ob;
    }
}
