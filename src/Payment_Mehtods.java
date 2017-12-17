public class Payment_Mehtods {

    private String ID;
    private float Balance;

    Payment_Mehtods()
    {
        ID = "";
        Balance = 0;
    }

    Payment_Mehtods(String id, float balance)
    {
        ID = id;
        Balance = balance;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public String getID() {
        return ID;
    }

    public float getBalance() {
        return Balance;
    }
}
