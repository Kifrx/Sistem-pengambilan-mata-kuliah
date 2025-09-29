
import java.util.ArrayList;

public class Mahasiswa
{
    private String NRP;
    private String Name;
    private ArrayList<Matakuliah>matkulDiambil= new ArrayList<>();

    /**
     * Constructor for objects of class Mahasiswa
     */
    public Mahasiswa(String NRP, String Name)
    {
        this.NRP = NRP;
        this.Name = Name;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getNRP()
    {
        return NRP;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public void ambilMatkul(Matakuliah mk)
    {
        if (mk.getKapasitasTerisi() >= mk.getKapasitas())
        {
            System.out.println("Kelas yang anda pilih penuh, tidak dapat mengambil kelas");
        }else{
            matkulDiambil.add(mk);
            mk.tambahPeserta();
            System.out.println("Berhasil mengambil " + mk.getNamaMatkul());
            
        }
    }
    
    
    public void dropMatkul(Matakuliah mk)
    {
        if (matkulDiambil.remove(mk)){
            mk.kurangiPeserta();
            System.out.println("Berhasil drop " + mk.getNamaMatkul());
    
        } else {
            System.out.println("Anda tidak mengambil matakuliah ini.");
        }
    }
    
    public void tampilkanMatkulDiambil() 
    {
        if (matkulDiambil.isEmpty()){
            System.out.println ("Anda belum mengambil matakuliah.");
        }else{
            System.out.println ("Matakuliah yang anda ambil;");
            for (Matakuliah mk : matkulDiambil) {
                System.out.println ("- " + mk.getNamaMatkul() + " (" + mk.getId() + ")");
            }
        }
        
    }
}
