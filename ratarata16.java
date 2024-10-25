import java.util.Scanner;

public class ratarata16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0;
        int jumlahSiswa = 0;
        int jumlahDiatasRataRata = 0;
        
        System.out.println("Program Manajemen Nilai Siswa");
        System.out.println("============================");

        while (true) {
            System.out.print("\nMasukkan nama siswa (atau 'selesai' untuk mengakhiri): ");
            String nama = scanner.nextLine();
            
            if (nama.toLowerCase().equals("selesai")) {
                break;
            }
            System.out.print("Masukkan nilai " + nama + ": ");
            double nilai = Double.parseDouble(scanner.nextLine());
            
            total += nilai;
            jumlahSiswa++;
            
            double rataRataSementara = total / jumlahSiswa; 
            if (nilai >= rataRataSementara) {
                jumlahDiatasRataRata++;
            } 
            System.out.println("Rata-rata saat ini: " + String.format("%.2f", rataRataSementara));
        }
    
        if (jumlahSiswa == 0) {
            System.out.println("\nTidak ada data yang dimasukkan!");
            return;
        }
        
        double rataRata = total / jumlahSiswa;
        int jumlahDibawahRataRata = jumlahSiswa - jumlahDiatasRataRata;
        double persentaseDiatasRataRata = (double) jumlahDiatasRataRata / jumlahSiswa * 100;
    
        System.out.println("\nHasil Analisis Nilai:");
        System.out.println("============================");
        System.out.println("1. Rata-rata kelas: " + String.format("%.2f", rataRata));
        System.out.println("2. Jumlah siswa di atas rata-rata: " + jumlahDiatasRataRata);
        System.out.println("3. Jumlah siswa di bawah rata-rata: " + jumlahDibawahRataRata);
        System.out.println("5. " + 
            (persentaseDiatasRataRata > 50 ? "Mayoritas siswa di atas rata-rata" : "Mayoritas siswa di bawah rata-rata"));
        
        scanner.close();
    }
}