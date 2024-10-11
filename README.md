# POST TEST 2 PBO

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

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/4edb3761-1db1-4ed8-82fd-e23ed69ae7d6)
![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/d08df48d-c06d-4815-9d96-52d80154dd1f)
![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/3e41bd76-0b19-4dc6-8325-6e1adbe26434)

### Class Parent 
Tidak terdapat penerapan **best practice dari Final Class, Final Property, dan Final Method** karena class tersebut akan di turunkan ke class child. Kelas Pegawai adalah sebuah kelas abstrak **(Fitur Abstraction)** yang berperan sebagai kerangka dasar untuk kelas-kelas turunan yang akan mengimplementasikan metodenya. Kelas Pegawai menyediakan dua variabel anggota (nama dan id) dan juga metode-metode getter dan setter untuk mengakses dan mengubah nilai-nilai variabel ini. Konsep ini memungkinkan kita untuk menggeneralisasi perilaku yang berkaitan dengan pegawai dalam kode program seperti dokter dan perawat. Dapat mengimplementasikan metode tampilkanInformasi() sesuai dengan jenis pegawai yang bersangkutan, sehingga dapat menampilkan informasi pegawai tersebut secara spesifik sesuai dengan jenisnya.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/8c42d59a-905d-4478-9196-04ad4f813018)

## Class Child
Terdapat penerapan best practice dari Final Class, Final Property, dan Final Method.
### Dokter 
Kelas Dokter adalah implementasi kelas turunan yang mewarisi dari kelas abstrak Pegawai **(Fitur Inheritance)**. Memiliki variabel anggota "spesialisasi" yang digunakan untuk menyimpan informasi tentang spesialisasi dokter. Kelas "Dokter" memiliki konstruktor yang menerima tiga parameter: "nama", "id", dan "spesialisasi". Dalam konstruktor tersebut, menggunakan "super(nama, id)" untuk memanggil konstruktor kelas "Pegawai". Ini untuk menginisialisasi atribut "nama" dan "id", yang bersifat umum untuk semua pegawai, sementara atribut "spesialisasi" yang khusus untuk dokter diinisialisasi dengan nilai yang diberikan dalam konstruktor. Menggunakan **Fitur Overriding/Override** tampilkanInformasi(). Dalam implementasi ini, metode tampilkanInformasi() mencetak ID, nama, dan spesialisasi dokter ke layar. 

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/1a47350e-5a4b-4d64-ba29-5664a939544c)

### Perawat 
Kelas Perawat adalah implementasi kelas turunan yang mewarisi dari kelas abstrak Pegawai **(Fitur Inheritance)**. Memiliki variabel anggota "shift" yang digunakan untuk menyimpan informasi tentang shift kerja perawat. Terdapat konstruktor yang digunakan untuk menginisialisasi objek Perawat. Konstruktor ini menerima tiga parameter: nama, id, dan shift. Konstruktor ini memanggil konstruktor kelas Pegawai menggunakan super(nama, id) untuk menginisialisasi nilai nama dan id yang bersifat umum untuk semua pegawai. Menggunakan **Fitur Overriding/Override** tampilkanInformasi(). Dalam implementasi ini, metode tampilkanInformasi() mencetak ID, nama, dan shift kerja perawat ke layar. 

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/f3a3b021-b601-499d-85f3-b537a39f5b4d)

### Pasien
Kelas Pasien berfungsi sebagai representasi objek pasien. Ini tidak terkait dengan kelas Pegawai seperti Dokter atau Perawat, jadi tidak ada warisan terhadap metode abstrak tampilkanInformasi() dari Pegawai. Memiliki tiga variabel anggota, yaitu nama, Keluhan, dan id. Terdapat konstruktor yang digunakan untuk menginisialisasi objek Pasien. Konstruktor ini menerima tiga parameter: nama, id, dan Keluhan. Konstruktor ini menginisialisasi atribut-atribut pasien dengan nilai yang sesuai sesuai dengan parameter yang diberikan saat pembuatan objek Pasien.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/1cffaa10-7256-4f3e-a239-0763fc3fcf85)
![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/ab01716b-23cd-42e9-8516-7bd3fa2363e3)


## Output
**Tampilan Awal**

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/72bb0647-cb25-41cf-847c-8c988d19941c)

### CRUD 
### CREATE
**1. Dokter**

Gambar dibawah ini  merupakan hasil dari tambah dokter (opsi 1) yang mana nama nya Sandrina dan spesialisnya adalah Orthopedi.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/3c6bfe6e-7aee-4d7c-b15d-706c34d9c58d)

**2. Perawat**

Gambar dibawah ini merupakan hasil dari tambah perawat (opsi 2) yang mana nama nya Ikhsan dan shift nya adalah Pagi.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/bd4e30de-2db9-4955-b16d-c0e5182bcad1)

**3. Pasien**

Gambar dibawah ini merupakan hasil dari tambah pasien (opsi 3) yang mana nama nya Tia dan keluhannya adalah Batuk.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/06befa96-d90b-4100-a7fb-54c0d6a5a6d4)


### READ
**1. Pegawai (Dokter, Perawat)**

Gambar dibawah ini menampilkan hasil dari create pada opsi 1 dan 2 tadi bisa diliat outputnya sama dengan yang diatas.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/b29276cd-da30-4a8b-af10-fb0d275f858d)

**2. Pasien**

Gambar dibawah ini menampilkan hasil dari create pada opsi 3 tadi bisa diliat outputnya sama dengan yang diatas.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/f5dc3286-77af-4c35-8865-f0f33e103a16)

### UPDATE 
**1. Update Dokter**

Gambar dibawah ini merupakan hasil terbaru dari pengeditan nama dokter yang sebelumnya Sandrina dan berspesialisasi Orthopedi berubah menjadi dokter Aulia spesialis Gigi.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/eb0a3004-ce5e-479c-a41b-139b378ccd48)

**2. Update Perawat**

Gambar dibawah ini merupakan hasil terbaru dari pengeditan nama perawat yang sebelumnya Ikhsan dan mempunyai shift Pagi berubah menjadi perawat Iklam dan mempunyai shift Malam.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/cb018358-0e56-46df-9216-bf8587170440)

**3. Update Pasien**

Gambar dibawah ini merupakan hasil terbaru dari pengeditan nama pasien yang sebelumnya Tia dan mempunyai keluhan Batuk berubah menjadi pasien Sagita dan mempunyai keluhan Demam.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/fa13dfd8-bc3a-4a08-a9e8-2a7ad898a705)

### DELETE
**1. Hapus Dokter**

Gambar dibawah ini merupakan output jika data dokter yang telah dimasukkan di awal tadi dihapus.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/c7e3b0fc-1f6b-4355-b363-60f9d2e07158)

**2. Hapus Perawat**

Gambar dibawah ini merupakan output jika data perawat yang telah dimasukkan di awal tadi dihapus.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/abc364b2-eca2-4b7b-b351-a8fe59e5c2e9)

**3. Hapus Pasien**

Gambar dibawah ini merupakan output jika data pasien yang telah dimasukkan di awal tadi dihapus.

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/68f10e64-8008-4725-933c-c8194faa6e7d)

### ARRAY LIST KOSONG
**1. Pegawai**

Gambar dibawah adalah output jika ArrayList Pegawai masih belum terisi oleh objek

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/a9f77d0b-621e-4f95-a628-b03da616e11b)

**2. Pasien**

Gambar dibawah adalah output jika ArrayList Pasien masih belum terisi oleh objek

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/d06ffb85-2181-43a3-8413-cd50500b2500)

### SALAH MASUKKAN (INPUT)

Gambar dibawah adalah output jika user salah menginputkan angka ke dalam halaman utama 

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/8a2f37fd-1a94-4dce-9ed5-76d07487b371)

### EXIT 

Gambar dibawah adalah jika user memilih opsi 8 yakni keluar dari program

![image](https://github.com/SandrinaAulia/pbo-post-test-2/assets/121924124/86ab92ed-1330-4b6b-b97a-dadbd4c839cc)
