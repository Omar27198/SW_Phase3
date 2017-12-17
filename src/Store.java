import java.util.ArrayList;

public class Store {

    private String ID;
    private String name ;
    private int phone ;
    private String Address ;

    private ArrayList<Product> Products_in_This_Store = new ArrayList<>();

    Store()
    {
        ID = "";
        name = "" ;
        phone = 0 ;
        Address = "" ;
    }

    public void setProducts_in_This_Store(ArrayList<Product> products_in_This_Store) {
        Products_in_This_Store = products_in_This_Store;
    }
    public ArrayList<Product> getProducts_in_This_Store() {
        return Products_in_This_Store;
    }


    public void setID(String ID) { this.ID = ID; }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getID() { return ID; }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return Address;
    }

}
