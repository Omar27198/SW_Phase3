public class Visa extends Payment_Mehtods {

    private String ID;
    private String Password;

    Visa(){
        ID = "";
        Password = "";
    }

    Visa(String id, String pass){
        ID = id;
        Password = pass;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }
}
