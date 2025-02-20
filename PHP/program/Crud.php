<?php
// import file
require ('PetShop.php');

// deklarasi kelas crud
class Crud {
     // atribute private
    private $arraypts = array(); // list of objek petshop

    /* konstruktor */
    public function __construct( ) {
    }

    // method create : membuat objek petshop
    public function create($id, $nama_produk, $kategori_produk, $harga_produk, $foto){
        // instansiasi objek petshop
        $pts = new PetShop($id, $nama_produk, $kategori_produk, $harga_produk, $foto);
         // masukan objek ke dalam list
        array_push($this->arraypts, $pts);
    }

    // method read : menampilkan isi list
    public function read(){
        // menampilkan isi list of objek petshop dalam tabel
        echo "<center><table border='3'>";
        echo "<tr>
            <th> id </th>
            <th> Nama Produk </th>
            <th> kategori Produk </th>
            <th> Harga Produk </th>
            <th> Foto </th>
            </tr>";
            for ($i=0; $i < count($this->arraypts); $i++) { 
                echo "<tr><td>";
                echo $this->arraypts[$i]->get_id();
                echo "</td><td>";
                echo $this->arraypts[$i]->get_nama_produk();
                echo "</td><td>";
                echo $this->arraypts[$i]->get_kategori_produk();
                echo "</td><td>";
                echo $this->arraypts[$i]->get_harga_produk();
                echo "</td><td>";
                echo "<img src='" . $this->arraypts[$i]->get_foto(). "'style='width: 150px'>";
                echo "</td>";
                echo "</tr>";
            }
        echo "</table> </center>";
        }

    // method update : update objek yang ingin diubah
    public function update($id, $nama_produk, $kategori_produk, $harga_produk, $foto ){
        // perulangan untuk mencari objek yang akan di ubah berdasarkan id yang diinput
        for ($i=0; $i < count($this->arraypts); $i++) { 
            // apabila id pada objek nya sama dengan id inputan
            if ($this->arraypts[$i]->get_id() == $id) {
                // update data yang ingin diubah dengan menggunakan method setter di kelas petshop
                $this->arraypts[$i]->set_nama_produk($nama_produk);
                $this->arraypts[$i]->set_kategori_produk($kategori_produk);
                $this->arraypts[$i]->set_harga_produk($harga_produk);
                $this->arraypts[$i]->set_foto($foto);
                break;
            }
        }
    }

    // method delete : delete objek yang ingin dihapus
    public function delete($id){
        // perulangan untuk mencari objek yang akan di hapus berdasarkan id yang diinput
        for ($i=0; $i < count($this->arraypts); $i++) { 
            // apabila id pada objek nya sama dengan id inputan
            if ($this->arraypts[$i]->get_id() == $id) {
                array_splice($this->arraypts, $i,1); // hapus objek pada list
              break;
            }
        }
    }
}

?>