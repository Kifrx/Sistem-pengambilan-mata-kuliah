
/**
 * Write a description of class Matakuliah here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matakuliah
{
    private String idMatkul;
    private String NamaMatkul;
    private int kapasitas;
    private int sks;
    private Dosen dosen;
    private int terisi ;

    /**
     * Constructor for objects of class Matakuliah
     */
    public Matakuliah(String id, String nama, int kapasitas, int sks, Dosen dosen, int terisiAwal)
    {
        this.idMatkul = id;
        this.NamaMatkul = nama;
        this.kapasitas = kapasitas;
        this.sks = sks;
        this.dosen = dosen;
        this.terisi = terisiAwal;
    }
    
    
    public String getId()
    {
        return idMatkul;
    }
    
    public String getNamaMatkul()
    {
        return NamaMatkul;
    }
    
    public int getKapasitas()
    {
        return kapasitas;
    }
    
    public int getSks()
    {
        return sks;
    }
    
    public Dosen getDosen()
    {
        return dosen;
    }
    
    public int getKapasitasTerisi()
    {
        return terisi;
    }
    
    public void tambahPeserta()
    {
        terisi++;
    }
    
    public void kurangiPeserta()
    {
        terisi--;
    }
    
    public void tampilkanInfo()
    {
        System.out.println(NamaMatkul + " (" + idMatkul + ")");
        System.out.println("Dosen pengampu: " + dosen.getName());
        System.out.println("Kapasitas: " + terisi + "/" + kapasitas);
        System.out.println("SKS: " + sks);
        System.out.println();
    }
}
