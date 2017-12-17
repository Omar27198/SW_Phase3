import java.util.ArrayList;

public class Product {

    String ID;
    String Name;
    Brand Brand;
    float Price;
    int Product_Quantity;

    public Product()
    {
        ID = "";
        Name = "";
        Price = 0;
        Product_Quantity = 0;
    }

    Product(String id, String name, Brand brand, float pri, int Quantity)
    {
        ID = id;
        Name = name;
        Brand = brand;
        Price = pri;
        Product_Quantity = Quantity;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBrand(Brand brand) {
        Brand = brand;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public void setProduct_Quantity(int Quantity) {
        Product_Quantity = Quantity;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public Brand getBrand() {
        return Brand;
    }

    public float getPrice() {
        return Price;
    }

    public int getProduct_Quantity() {
        return Product_Quantity;
    }

    boolean Check_Product_Availability(ArrayList<Product> Queue,Product p1)
    {
        if (Queue.contains(p1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void Check_Payment_Method(String payment,Voucher v1,float price)
    {
        switch (payment)
        {
            case "Cash":
                System.out.println("Cash Done");
                break;

            case "Visa":
                System.out.println("Visa Done");
                break;

                /*
            case "Voucher":
                if(v1.get_balance()> price)
                    System.out.println("done");
                else
                    System.out.println("you don't have enough money");
                break;
             */
            default:
                System.out.println("Enter Vaild Payment Method!!");
        }

    }

}
