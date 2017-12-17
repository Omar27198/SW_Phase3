public class Voucher extends Payment_Mehtods{

    private String CardCode;

    Voucher(){
        CardCode = "";
    }

    Voucher(String cardcode){
        CardCode = cardcode;
    }

    public void setCardCode(String cardCode) {
        CardCode = cardCode;
    }

    public String getCardCode() {
        return CardCode;
    }
}

