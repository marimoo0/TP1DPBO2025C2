<!-- Saya Khana yusdiana NIM 2100991 mengerjakan soal Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin.  -->

<?php
// import file
require ('Crud.php');

$Crud = new Crud(); // Intansiasi objek crud
// membuat 3 objek petshop untuk dimasukan ke dalam list menggunakan method create pada kelas crud
$Crud->create('201', 'Whiskas', 'Makanan Kucing', '30000', 'foto\1.jpg');
$Crud->create('202', 'Pedigree', 'Makanan Anjing', '35000', 'foto\2.jpg');
$Crud->create('101', 'Kalung Kucing', 'Aksesoris', '5000', 'foto\3.jpg');
// menampilkan isi list menggunakan method read pada kelas crud
$Crud->read();
echo '<center><br> List Produk setelah di Update dan Delete <br> </center>';
// mengupdate objek 
$Crud->update('101', 'Kalung Anjing', 'Aksesoris', '6000', 'foto\4.jpg');
// menghapus objek 
$Crud->delete('201');
// menampilkan isi list menggunakan method read pada kelas crud
$Crud->read();

?>