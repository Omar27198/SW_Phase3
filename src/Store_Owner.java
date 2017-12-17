import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store_Owner extends General_Users {

    private ArrayList<Store> Stores_Of_This_Owner = new ArrayList<>();

    Store_Owner() {

    }

    public void setOwner_store(ArrayList<Store> ownerstore) {
        this.Stores_Of_This_Owner = ownerstore;
    }

    public ArrayList<Store> getOwner_store() {
        return Stores_Of_This_Owner;
    }

    public void Add_Product_To_Store(ArrayList<Product> Product_Queue)
    {
        Product p1 = new Product();
        Scanner input = new Scanner(System.in);
        System.out.println("enter product id");
        p1.ID = input.next();
        System.out.println("enter product name");
        p1.Name = input.next();
        System.out.println("enter product brand name");
        String brand_name = input.next();
        System.out.println("enter product brand id");
        String brand_id = input.next();
        System.out.println("enter product brand type");
        String brand_type = input.next();
        Brand b1 = new Brand();
        b1.setType(brand_type);
        b1.setName(brand_name);
        b1.setID(brand_id);
        p1.setBrand(b1);
        System.out.println("enter product price");
        p1.Price = input.nextFloat();
        Product_Queue.add(p1);
    }

    void Owner_sign_up(ArrayList<Store_Owner> map)
    {
        Store_Owner obj = new Store_Owner();
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

    Store_Owner Owner_sign_in(ArrayList<Store_Owner> Users_arrlist)
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
                System.out.println("Succes" + Users_arrlist.get(i).Stores_Of_This_Owner);
                return Users_arrlist.get(i);
            }
            else if(i == Users_arrlist.size()-1)
            {
                System.out.println("You don't have an account you need to sign up first!!");
                this.Owner_sign_up(Users_arrlist);
            }
        }
        Store_Owner ob = new Store_Owner();
        return ob;
    }

    public void Add_Store()
    {
        Store obj = new Store();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter store ID:   ");
        obj.setID(input.next());
        System.out.print("Enter store name:   ");
        obj.setName(input.next());
        System.out.print("Enter store phone:   ");
        obj.setPhone(input.nextInt());
        System.out.print("Enter store address:   ");
        obj.setAddress(input.next());
        //s1.add(obj);
        this.Stores_Of_This_Owner.add(obj);
    }

    public void Get_most_viewed_product_in_store(ArrayList<Product>p1)
    {
        Product ob = null;
        for (int i = 0; i < p1.size(); i++)
        {
            for (int j = i+1; j < p1.size(); j++)
            {
                if (p1.get(i).getProduct_Quantity() > p1.get(j).getProduct_Quantity())
                {
                    ob = p1.get(i);
                }
                else
                {
                    ob = p1.get(j);
                }
            }
        }
        System.out.println("Product Name: " + ob.getName() + "\tBrand: " + ob.getBrand() + "\tPrice" + ob.getPrice());
    }

    public void Explore_number_of_views_each_product_in_store(ArrayList<Product>p1)
    {
        Product ob = null;
        for (int i = 0; i < p1.size(); i++)
        {
            ob = p1.get(i);
            System.out.println("Product:" + ob.getName() + "\tNumber Of Views: " + ob.getProduct_Quantity());
        }
    }

    public void Suggest_product(ArrayList<Product>p1,Admin a1)
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
}
