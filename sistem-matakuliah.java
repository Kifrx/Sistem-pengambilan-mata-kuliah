import java.util.ArrayList; 
import java.util.Scanner;

public class Sistem
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Selamat datang di pengambilan Matakuliah---");
        System.out.print("Masukkan nama anda: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NRP anda: ");
        String nrp = sc.nextLine();
        
        Mahasiswa mhs = new Mahasiswa(nrp, nama);
        
        // Membuat data dosen 
        Dosen d1 = new Dosen("D001", "Fajar Baskoro"); 
        Dosen d2 = new Dosen("D002", "Baskoro Adi");
        
        // Membuat data matkul
        ArrayList<Matakuliah> daftarMatkul = new ArrayList<>();
        daftarMatkul.add(new Matakuliah("EF240157", "PBO", 47, 3, d1, 15));
        daftarMatkul.add(new Matakuliah("EF240155", "PWEB", 50, 4, d1, 44));
        daftarMatkul.add(new Matakuliah("EF240150", "SISOP", 50, 4, d2, 50));
        
        int pilihan;
        do {
            System.out.println("\nBerikut ini Matakuliah yang ada untuk anda:");
            int idx = 1;
            for (Matakuliah mk : daftarMatkul) {
                System.out.print(idx + ". ");
                mk.tampilkanInfo(); 
                idx++; 
            }
            
            System.out.println("Pilih menu:");
            System.out.println("1. Ambil matakuliah");
            System.out.println("2. Drop matakuliah");
            System.out.println("3. Tampilkan matakuliah yang diambil");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch(pilihan){
                case 1:
                    System.out.println("Masukkan nomor matakuliah yang ingin diambil");
                    int ambil = sc.nextInt();
                    sc.nextLine();
                    
                    if (ambil > 0 && ambil <= daftarMatkul.size()){
                        mhs.ambilMatkul(daftarMatkul.get(ambil-1));
                        
                    }else{
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nomor matakuliah yang ingin didrop: ");
                    int drop = sc.nextInt();
                    sc.nextLine();
                    if (drop > 0 && drop <= daftarMatkul.size()) {
                        mhs.dropMatkul(daftarMatkul.get(drop - 1));
                    }else{
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 3:
                    mhs.tampilkanMatkulDiambil();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default: System.out.println("Pilihan tidak valid.");
                
            }   
            
            
        }while (pilihan != 4);
        sc.close();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
