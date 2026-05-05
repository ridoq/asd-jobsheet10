package Tugas;

public class AntrianKRS23 {
    Mahasiswa23[] data;
    int front, rear, size, max;
    int sudahKRS = 0;

    public AntrianKRS23(int n) {
        max = n;
        data = new Mahasiswa23[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh (maksimal 10)!");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian.");
        }
    }

    public void panggilAntrian() {
        if (size >= 2) {
            System.out.println("Memproses KRS untuk 2 mahasiswa:");
            for (int i = 0; i < 2; i++) {
                Mahasiswa23 mhs = data[front];
                System.out.print("Diproses: ");
                mhs.tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahKRS++;
            }
        } else if (size == 1) {
            System.out.println("Hanya ada 1 mahasiswa di antrian. Memproses 1 orang:");
            Mahasiswa23 mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahKRS++;
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian Saat Ini:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size >= 2) {
            System.out.println("2 Antrian Terdepan:");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        } else if (size == 1) {
            System.out.println("Hanya ada 1 mahasiswa:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanTerakhir() {
        if (!isEmpty()) {
            System.out.print("Antrian Paling Akhir: ");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }
}
