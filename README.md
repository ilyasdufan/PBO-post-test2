# PBO POST TEST 2

**Nama  : Ilyas Dufan Setyawan**

**NIM   : 2309116074**

**Kelas : Sistem Informasi B 2023**  

## Tema  
Pada Post Test ke 2 kali ini saya mengambil tema Sebelumnya Yaitu "Sistem Karyawan Dan Pegawai Pada Perusahaan Rumah Sakit" yang memiliki class/entitas yakni :
1. Dokter
2. Perawat
3. Pasien

Dimana untuk ke 3 entitas tersebut bisa melakukan CRUD yakni Create (Tambah), Read (Lihat), Update (Edit) dan Delete (Hapus). 
## Penjelasan Source Code Program
### Class Main 
Terdapat penerapan best practice dari Final Class, Final Property, dan Final Method.

**1. Penyataan Import**
-  Fungsi dari pernyataan import com.child dan com.parent adalah mengimport kelas-kelas tersebut agar dapat menggunakan operasi CRUD pada kelas Child dan Parent tanpa harus menuliskan kualifikasi paket lengkap setiap kali ingin digunakan.
-  Serta terdapat pula CRUD yang berfungsi untuk menambah/mambuat, melihat, mengedit, dan menghapus objek-objek dari class Child maupun Parent. Program ini memanfaatkan konsep objek dan pengelolaan koleksi menggunakan ArrayList. **(Penerapan property/method static)**
-  Mengimpor kelas Scanner dari paket java.util, yang digunakan untuk membaca masukan dari pengguna serta kelas ArrayList dari paket java.util ke dalam kode sebagai penyimpanan data. (Line 14-21)

**2. Deklarasi Kelas**
- Kelas ini diberi nama Main. Kata kunci public berarti bahwa kelas ini dapat diakses dari kelas lain. Kata kunci final berarti bahwa kelas ini tidak dapat diwariskan (yaitu, tidak dapat diperluas).
- Kelas ini diberi nama "Main." Penggunaan kata kunci "public" mengartikan bahwa kelas ini memungkinkan akses ke kelas dari berkas lainnya. Dengan kata lain, kelas "Main" dapat diakses dan digunakan dari luar kelas ini. Selain itu, kata kunci "final" digunakan untuk mendefinisikan bahwa kelas ini bersifat tetap dan tidak dapat mengalami perubahan setelah deklarasi. Ini berarti kelas "Main" tidak dapat diubah atau diperluas dengan menurunkannya ke dalam kelas lain.
  
**3. Pengulangan Menu**
- Ini berarti bahwa kode yang ada dalam loop while true akan terus dieksekusi secara berulang tanpa henti sampai program dihentikan secara manual oleh pengguna.

**4. Opsi Menu**
- Dalam perulangan yang berjalan terus-menerus, program menampilkan sebuah menu yang berisi beberapa pilihan kepada pengguna. Pengguna diminta untuk memberikan input berupa pilihan yang mereka inginkan dari menu yang ditampilkan.
- Program menggunakan pernyataan switch dengan kasus-kasus yang sesuai dengan setiap pilihan dalam menu. Ketika pengguna memasukkan pilihan mereka, program akan mengevaluasi input tersebut dengan pernyataan switch dan mengeksekusi kode yang tersebut dengan pilihan yang sesuai. 

**5. Panggilan Method**
- Bergantung pada apa yang pengguna pilih, metod seperti CRUD tambahDokter(), tambahPerawat(), dll yang akan dipanggil.

![image](https://github.com/user-attachments/assets/be37324a-1e17-42d8-a586-9cea848c7ebe)
![image](https://github.com/user-attachments/assets/8ed68f5d-c89d-4a0a-85ac-99171f089840)
![image](https://github.com/user-attachments/assets/be9faa16-70b0-4766-b422-e95a1d05238a)
![image](https://github.com/user-attachments/assets/ec38f843-a880-489b-8799-88d1f42c9a9e)
![image](https://github.com/user-attachments/assets/25a10177-5546-4274-9bce-bc635aa48190)
![image](https://github.com/user-attachments/assets/d9957065-506f-4ca1-9aa5-1cd07aef0a86)
![image](https://github.com/user-attachments/assets/486f781e-ccd3-4f68-92dc-78889bc6028e)
![image](https://github.com/user-attachments/assets/14035af1-26df-4593-9686-3c847c9accff)
![image](https://github.com/user-attachments/assets/f4d1899b-dea2-49a0-a324-13e8378501a4)


### Class Parent 
Tidak terdapat penerapan **best practice dari Final Class, Final Property, dan Final Method** karena class tersebut akan di turunkan ke class child. Kelas Pegawai adalah sebuah kelas abstrak **(Fitur Abstraction)** yang berperan sebagai kerangka dasar untuk kelas-kelas turunan yang akan mengimplementasikan metodenya. Kelas Pegawai menyediakan dua variabel anggota (nama dan id) dan juga metode-metode getter dan setter untuk mengakses dan mengubah nilai-nilai variabel ini. Konsep ini memungkinkan kita untuk menggeneralisasi perilaku yang berkaitan dengan pegawai dalam kode program seperti dokter dan perawat. Dapat mengimplementasikan metode tampilkanInformasi() sesuai dengan jenis pegawai yang bersangkutan, sehingga dapat menampilkan informasi pegawai tersebut secara spesifik sesuai dengan jenisnya.

![image](https://github.com/user-attachments/assets/25fd4481-32ef-47ad-bfd1-7b0ea3594544)

## Class Child
Terdapat penerapan best practice dari Final Class, Final Property, dan Final Method.
### Dokter 
Kelas Dokter adalah implementasi kelas turunan yang mewarisi dari kelas abstrak Pegawai **(Fitur Inheritance)**. Memiliki variabel anggota "spesialisasi" yang digunakan untuk menyimpan informasi tentang spesialisasi dokter. Kelas "Dokter" memiliki konstruktor yang menerima tiga parameter: "nama", "id", dan "spesialisasi". Dalam konstruktor tersebut, menggunakan "super(nama, id)" untuk memanggil konstruktor kelas "Pegawai". Ini untuk menginisialisasi atribut "nama" dan "id", yang bersifat umum untuk semua pegawai, sementara atribut "spesialisasi" yang khusus untuk dokter diinisialisasi dengan nilai yang diberikan dalam konstruktor. Menggunakan **Fitur Overriding/Override** tampilkanInformasi(). Dalam implementasi ini, metode tampilkanInformasi() mencetak ID, nama, dan spesialisasi dokter ke layar. 

![image](https://github.com/user-attachments/assets/25c9e7b9-aa39-4771-836c-cdee13d0c659)

### Perawat 
Kelas Perawat adalah implementasi kelas turunan yang mewarisi dari kelas abstrak Pegawai **(Fitur Inheritance)**. Memiliki variabel anggota "shift" yang digunakan untuk menyimpan informasi tentang shift kerja perawat. Terdapat konstruktor yang digunakan untuk menginisialisasi objek Perawat. Konstruktor ini menerima tiga parameter: nama, id, dan shift. Konstruktor ini memanggil konstruktor kelas Pegawai menggunakan super(nama, id) untuk menginisialisasi nilai nama dan id yang bersifat umum untuk semua pegawai. Menggunakan **Fitur Overriding/Override** tampilkanInformasi(). Dalam implementasi ini, metode tampilkanInformasi() mencetak ID, nama, dan shift kerja perawat ke layar. 

![image](https://github.com/user-attachments/assets/01ec3542-cdbd-4382-8cc5-81d99528dbc8)

### Pasien
Kelas Pasien berfungsi sebagai representasi objek pasien. Ini tidak terkait dengan kelas Pegawai seperti Dokter atau Perawat, jadi tidak ada warisan terhadap metode abstrak tampilkanInformasi() dari Pegawai. Memiliki tiga variabel anggota, yaitu nama, Keluhan, dan id. Terdapat konstruktor yang digunakan untuk menginisialisasi objek Pasien. Konstruktor ini menerima tiga parameter: nama, id, dan Keluhan. Konstruktor ini menginisialisasi atribut-atribut pasien dengan nilai yang sesuai sesuai dengan parameter yang diberikan saat pembuatan objek Pasien.


![image](https://github.com/user-attachments/assets/cf089f63-54b0-4b0e-8f0e-5c9afa5b25f9)
![image](https://github.com/user-attachments/assets/d3299c3b-b9c1-424f-8358-3bc167394530)


## Output
**Tampilan Awal**

![image](https://github.com/user-attachments/assets/ddc0629a-579d-4da0-92ae-3829258944b9)

### CRUD 
### CREATE
**1. Dokter**

Gambar dibawah ini  merupakan hasil dari tambah dokter (opsi 1).


![image](https://github.com/user-attachments/assets/78a79c61-e408-45ff-858d-e2f946bcc1eb)


**2. Perawat**

Gambar dibawah ini merupakan hasil dari tambah perawat (opsi 2) yang mana nama nya Ikhsan dan shift nya adalah Pagi.


![image](https://github.com/user-attachments/assets/a5afa754-5a11-485a-acc1-f295035bc861)


**3. Pasien**

Gambar dibawah ini merupakan hasil dari tambah pasien (opsi 3).


![image](https://github.com/user-attachments/assets/e4aea2e0-e159-47fe-9c2f-15474856fae1)

### UPDATE 
**1. Update Dokter**

Gambar dibawah ini merupakan hasil terbaru dari pengeditan nama dokter.


![image](https://github.com/user-attachments/assets/c82d787a-ad6b-4f71-a073-c758a54bbcd1)

**2. Update Perawat**

Gambar dibawah ini merupakan hasil terbaru dari pengeditan nama perawat.

![image](https://github.com/user-attachments/assets/032d78c7-c62c-4e7e-8299-dd7d79d49e5b)


**3. Update Pasien**

Gambar dibawah ini merupakan hasil terbaru dari pengeditan nama pasien.

![image](https://github.com/user-attachments/assets/825ea684-6b9d-4187-b86f-ae0d64e379c3)

### DELETE
**1. Hapus Dokter**

Gambar dibawah ini merupakan output jika data dokter yang telah dimasukkan di awal tadi dihapus.

![image](https://github.com/user-attachments/assets/0997ac5b-c596-4fd3-b1ef-60b39e8e9257)

**2. Hapus Perawat**

Gambar dibawah ini merupakan output jika data perawat yang telah dimasukkan di awal tadi dihapus.

![image](https://github.com/user-attachments/assets/4ba9bec8-6508-4520-99f4-a3d4ec18c294)

**3. Hapus Pasien**

Gambar dibawah ini merupakan output jika data pasien yang telah dimasukkan di awal tadi dihapus.

![image](https://github.com/user-attachments/assets/b9bdb63b-4cb1-4db5-b4df-3815deea480c)

### ARRAY LIST KOSONG
**1. Pegawai**

Gambar dibawah adalah output jika ArrayList Pegawai masih belum terisi oleh objek

![image](https://github.com/user-attachments/assets/7c28eeef-d9c8-4095-8b2a-4c862c6229f5)

**2. Pasien**

Gambar dibawah adalah output jika ArrayList Pasien masih belum terisi oleh objek


![image](https://github.com/user-attachments/assets/4e27da11-37f2-4a10-9c2e-d9d22d4c1822)


### SALAH MASUKKAN (INPUT)

Gambar dibawah adalah output jika user salah menginputkan angka ke dalam halaman utama 

![image](https://github.com/user-attachments/assets/ff120a19-e941-4a9e-9078-2308c217369a)

### EXIT 

Gambar dibawah adalah jika user memilih opsi 8 yakni keluar dari program

![image](https://github.com/user-attachments/assets/6e029bb3-c6b1-49cd-ba72-50df5ec0a39c)

