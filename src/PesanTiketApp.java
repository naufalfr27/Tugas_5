import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Do your magic here
        System.out.print("Masukan nama pembeli: ");
        String nama = scanner.nextLine();

        System.out.println("\nPilih tahap pembelian: ");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembeli (1/2): ");
        int tahap = scanner.nextInt();

        if(tahap == 1){
            System.out.println("\nPilih jenis tiket: ");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            int jenisTiket = scanner.nextInt();
            scanner.nextLine();

            if(jenisTiket != 1 && jenisTiket != 2){
                System.out.println("\nInput tidak valid!");                
            } else{
                System.out.print("\nMasukan jumlah tiket yang ingin dibeli: ");
                int jumlahTiket = scanner.nextInt();

                Tiket tiket;
                if (jenisTiket == 1) {
                    tiket = new VIP();
                    Pemesanan pemesanan = new Pemesanan(nama, "Presale", tiket, jumlahTiket);
                    pemesanan.cetakNota();
                } else if (jenisTiket == 2) {
                    tiket = new VVIP();
                    Pemesanan pemesanan = new Pemesanan(nama, "Presale", tiket, jumlahTiket);
                    pemesanan.cetakNota();
                } 
            }

        } else if(tahap == 2){
            System.out.println("\nPilih jenis tiket: ");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            int jenisTiket = scanner.nextInt();
            scanner.nextLine();

            if(jenisTiket != 1 && jenisTiket != 2 && jenisTiket != 3){
                System.out.println("\nInput tidak valid!");
            } else{
                System.out.print("\nMasukan jumlah jenis tiket yang ingin dibeli: ");
                int jumlahTiket = scanner.nextInt();

                Tiket tiket;
                if (jenisTiket == 1) {
                    tiket = new Festival();
                    Pemesanan pemesanan = new Pemesanan(nama, "Reguler", tiket, jumlahTiket);
                    pemesanan.cetakNota();
                } else if (jenisTiket == 2) {
                    tiket = new VIP();
                    Pemesanan pemesanan = new Pemesanan(nama, "Reguler", tiket, jumlahTiket);
                    pemesanan.cetakNota();
                } else if (jenisTiket == 3) {
                    tiket = new VVIP();
                    Pemesanan pemesanan = new Pemesanan(nama, "Reguler", tiket, jumlahTiket);
                    pemesanan.cetakNota();
                } 
            }
              

        } else {
            System.out.println("\nInput tidak valid!");
        }  


    }
}
