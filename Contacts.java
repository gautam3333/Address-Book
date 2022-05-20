
public class Contacts
{
    private final String name;
    private final long phone;
    private final String email;
    private final String address;
    
    public Contacts (String name, long phone, String email, String address)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    
    public String getName()
    {
        return name;
    }
    
    public long getPhone()
    {
        return phone;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getAddress()
    {
        return address;
    }
}