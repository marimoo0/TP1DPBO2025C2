# LATIHAN 1 DPBO 2025

## -- Janji --

Saya Khana Yusdiana NIM 2100991 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.Aamiin.

## -- Desain Program --

Terdapat 2 Kelas yaitu kelas Petshop dan Crud

#### 1. Kelas Petshop

- memiliki private atribut betipe data string untuk menyimpan data id, nama_produk, kategori_produk, harga_produk dari petshop (khusus php terdapat foto). Pada program ini id dijadikan sebagai atribut primary key pada data Petshop.
- memiliki public method kontruktor, setter, dan getter untuk id, nama_produk, kategori_produk, harga_produk. Setter untuk menginisialisasi atribut sedangkan getter untuk mereturn nilai atribut pada

#### 2. Kelas Crud

- memiliki private atribut bertipe data list of object Petshop untuk menyimpan objek-objek petshop
- memiliki public method :

  - konstruktor
  - CREATE : membuat objek petshop, lalu memasukan objek tersebut ke dalam list
  - READ : menampilkan isi dari list of object petshop
  - UPDATE : merubah/mengupdate data id, nama_produk, kategori_produk, harga_produk, dan foto petshop dari objek petshop yang dipilih (id dijadikan patokan dalam memilih objek yang akan di update)
  - DELETE : menghapus objek petshop yang dipilih (id ijadikan patokan dalam memilih objek yang akan di hapus)

  ## -- Penjelasan Alur --

- Pertama, import library dan file kelas yang digunakan
- intansiasi objek Crud untuk membuat list of objek petshop.
- Lalu masuk ke dalam looping crud
- Program akan menampilkan menu CRUD (Create, Read, Update, Dellete), dan user diminta untuk menginput nilai integer untuk memilih menu yang diinginkan
- Jika user menginput 1 maka akan dilakukan proses create objek petshop, user akan diminta untuk menginputkan data objek mahasiswa berupa id, nama_produk, kategori_produk, harga_produk. Selanjutnya program memanggil method create pada crud
- Jika user menginput 2 maka akan dilakukan proses read/menampilkan list of objek petshop, lalu program memanggil method read pada crud
- Jika user menginput 3 maka akan dilakukan proses update objek petshop, user akan diminta untuk menginputkan data objek petshop berupa id petshop yang data nya akan diubah. Selanjutnya program memanggil method update pada crud, dalam method update ini apabila id yang akan diubah ditemukan pada list maka user perlu menginputkan data petshop berupa nama_produk, kategori_produk, harga_produks dan foto yang terbaru
- Jika user menginput 4 maka akan dilakukan proses delete objek petshop, user akan diminta untuk menginputkan data objek petshop berupa id petshop yang objek nya akan di hapus dari list. Selanjutnya program memanggil method delete pada crud.
- Jika user menginput 0 maka keluar dari program

## -- Dokumentasi saat Program di Jalankan --

### Program dengan CPP

![1](https://github.com/marimoo0/TP1DPBO2025C2/blob/ff8af00077ad9dfb0d574b8f628f7df31b6c3afd/LATIHAN1DPBO2025C2/CPP/SS/Screenshot_1.png)
