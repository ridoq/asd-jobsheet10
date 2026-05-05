package Tugas;

import java.util.Scanner;

public class TugasMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS23 antrian = new AntrianKRS23(10); 
        int totalTargetDPA = 30; 
        int pilihan;

        do {
            System.out.println("\n--- Sistem Antrian KRS DPA (Maks 30 Mhs) ---");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian (Proses 2 Mhs)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cek Status Kapasitas & Jumlah");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antrian.tambahAntrian(new Mahasiswa23(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilkanTerakhir();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian saat ini: " + antrian.size);
                    System.out.println("Jumlah mahasiswa sudah KRS: " + antrian.sudahKRS);
                    int belum = totalTargetDPA - antrian.sudahKRS;
                    System.out.println("Sisa mahasiswa yang belum ditangani DPA: " + belum);
                    break;
                case 7:
                    antrian.clear();
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
