public class Cash extends Payment_Mehtods {

    private String Address;

    Cash(){
        Address = "";
    }

    Cash(String address){
        Address = address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress() {
        return Address;
    }
}
