package ArrayList_Application;

public class Contacts {
    private String Name;
    private String PhoneNo;

    public Contacts(String name, String phoneNo) {
        Name = name;
        PhoneNo = phoneNo;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }

    public void setPhoneNo(String PhoneNo)
    {
        this.PhoneNo = PhoneNo;
    }
    public String getPhoneNo() {
        return PhoneNo;
    }

    public static Contacts mycontact(String name , String phoneNo)
    {
        return new Contacts(name,phoneNo);
    }
}
