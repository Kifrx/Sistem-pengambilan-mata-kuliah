
/**
 * Write a description of class Dosen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dosen
{
    
    private String NIP;
    private String Name;

    /**
     * Constructor for objects of class Dosen
     */
    public Dosen(String NIP, String Name)
    {
        
        this.NIP = NIP;
        this.Name = Name; 
    }

    public String getNIP()
    {
        return NIP;
    }
    
    public String getName()
    {
        return Name;
    }
}
