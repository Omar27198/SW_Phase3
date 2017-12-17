public class Brand {

    private String ID;
    private String Name;
    private String Type;

    Brand()
    {
        ID = "";
        Name = "";
        Type = "";
    }

    Brand(String id, String name, String type)
    {
        ID = id;
        Name = name;
        Type = type;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }
}
