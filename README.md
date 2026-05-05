#   Percobaan 1

##  Soal

1.	Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
2.	Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
3.	Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
4.	Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
5.	Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
6.	Tunjukkan potongan kode program yang merupakan queue overflow!
7.	Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!

---

##  Jawaban

1.  Atribut front dan rear diberikan nilai awal -1 karena angka tersebut berada di luar indeks array Java yang sah (dimulai dari 0), sehingga secara teknis menandakan bahwa antrian masih kosong, sementara size bernilai 0 karena menunjukkan jumlah elemen yang tersimpan saat ini memang belum ada.  
2.  Potongan kode <mark>if (rear == max - 1) { rear = 0; }</mark> pada method Enqueue bertujuan untuk menjalankan logika antrian melingkar, di mana jika posisi belakang sudah mencapai indeks terakhir array namun antrian belum penuh, maka posisi rear akan diputar kembali ke indeks 0 agar slot kosong di bagian depan bisa diisi kembali.  
3.  Kegunaan potongan kode <mark>if (front == max - 1) { front = 0; }</mark> pada method Dequeue adalah untuk memindahkan posisi depan antrian kembali ke awal array (indeks 0) setelah data di posisi terakhir array diambil, sehingga alur pengambilan data pada circular queue tetap berlanjut dengan benar.  
4.  Pada method print, variabel i tidak dimulai dari 0 melainkan dari posisi front karena dalam queue, data pertama yang mengantri tidak selalu berada di indeks awal array akibat proses penambahan dan pengambilan data yang dinamis, sehingga pencetakan harus mengikuti posisi front yang aktif.  
5.  Maksud dari potongan kode <mark>i = (i + 1) % max;</mark> adalah untuk menggeser indeks penunjuk secara melingkar menggunakan operasi modulo, sehingga saat perulangan mencapai batas akhir indeks array, nilai i akan otomatis kembali ke angka 0 untuk melanjutkan proses pencetakan elemen hingga mencapai posisi rear.  
6.  Potongan kode program yang menunjukkan kondisi queue overflow adalah bagian <mark>if (IsFull()) { System.out.println("Queue sudah penuh"); }</mark> pada method Enqueue, yang berfungsi mencegat penambahan data jika kapasitas array sudah mencapai batas maksimal.  
7.  Dengan menambahkan perintah <mark>System.exit(0);</mark> tepat di bawah pesan informasi "Queue sudah penuh" pada method Enqueue dan di bawah pesan "Queue masih kosong" pada method Dequeue.

---

#   Percobaan 2