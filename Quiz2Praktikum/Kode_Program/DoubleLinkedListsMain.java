import java.util.Scanner;

public class DoubleLinkedListsMain {

    public static void menu() {
        System.out.println("\nPilih Menu:");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan by Nama");
        System.out.println("5. Hitung total pendapatan");
        System.out.println("6. Keluar");
        System.out.println("-------------------");
    }

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        int nomorAntrian = 0;
        int pilih;
        String[] nama = {"Mamluatul", "Abyaz A.M", "Yoshinoya", "SusiSusanti"};
        String[] nohp  = {"08224500000", "0822451111", "0822452222", "081234456"};
        int[] kodePesanan = {1,2,3,4};
        String[] namaPesanan = {"Bulgogi", "Mie Goreng", "Nasi Rendang", "Soto Ayam"};
        int[] harga = {25000, 15000, 25000, 15000};
        
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {

                case 1:
                    Pembeli pem = new Pembeli(nama[nomorAntrian], nohp[nomorAntrian], kodePesanan[nomorAntrian]);
                    Pesanan pes = new Pesanan(kodePesanan[nomorAntrian], harga[nomorAntrian], namaPesanan[nomorAntrian]);
                    dll.addLast(pem, pes);
                    System.out.println("Nomor Antrian : " + nomorAntrian+1);
                    System.out.println("Nama Customer : " + nama[nomorAntrian]);
                    System.out.println("Nomor Hp : " + nohp[nomorAntrian]);
                    nomorAntrian++;
                    break;
                case 2:
                    dll.print();
                    break;
                case 3:
                    System.out.println(dll.head.buyer.nomor + dll.head.buyer.namaPembeli + dll.head.buyer.NoHp);
                    dll.removeFirst();
                    break;
                case 4:
                    break;
                case 5:
                    dll.hitungPendapatan();
                    break;
                case 6:
                    System.out.print("Terima Kasih");
                    break;
                
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}