import java.util.Scanner;

public class stokbarang16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Manajemen Stok Barang");
        System.out.println("============================================================");
        
        while (true) {
            System.out.print("\nMasukkan nama barang (atau 'selesai' untuk mengakhiri): ");
            String namaBarang = scanner.nextLine();
            
            if (namaBarang.toLowerCase().equals("selesai")) {
                break;
            }
            
            System.out.print("Masukkan jumlah stok " + namaBarang + ": ");
            int jumlahStok = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Masukkan harga per unit " + namaBarang + ": ");
            double hargaPerUnit = Double.parseDouble(scanner.nextLine());
            
            double totalNilaiStok = jumlahStok * hargaPerUnit;
            
            System.out.println("\nInformasi Barang:");
            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Stok Tersedia: " + jumlahStok);
            System.out.println("Harga Per Unit: Rp " + String.format("%,.2f", hargaPerUnit));
            System.out.println("Total Nilai Stok: Rp " + String.format("%,.2f", totalNilaiStok));
            
            System.out.print("\nMasukkan jumlah permintaan " + namaBarang + ": ");
            int jumlahPermintaan = Integer.parseInt(scanner.nextLine());
       
            if (jumlahPermintaan <= jumlahStok) {
                int stokSetelahPermintaan = jumlahStok - jumlahPermintaan;
                double totalNilaiSetelahPermintaan = stokSetelahPermintaan * hargaPerUnit;
                
                System.out.println("\nHasil Pemrosesan Permintaan:");
                System.out.println("Status: Permintaan dapat dipenuhi");
                System.out.println("Jumlah yang diminta: " + jumlahPermintaan);
                System.out.println("Sisa stok: " + stokSetelahPermintaan);
                System.out.println("Total nilai sisa stok: Rp " + String.format("%,.2f", totalNilaiSetelahPermintaan));
            } else {
                System.out.println("\nHasil Pemrosesan Permintaan:");
                System.out.println("Status: Stok tidak mencukupi");
                System.out.println("Jumlah yang diminta: " + jumlahPermintaan);
                System.out.println("Stok tersedia: " + jumlahStok);
                System.out.println("Kekurangan stok: " + (jumlahPermintaan - jumlahStok));
            }
            
            System.out.println("============================================================");
        }
        
        System.out.println("\nProgram selesai!");
        scanner.close();
    }
}