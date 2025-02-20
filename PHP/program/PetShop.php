<?php
// deklarasi kelas petshop
class PetShop {
    // atribut private
    private $id = '';
    private $nama_produk = '';
    private $kategori_produk = '';
    private $harga_produk = '';
    private $foto = '';

    // konstruktor
    public function __construct( $id = '', $nama_produk = '' , $kategori_produk = '', $harga_produk = '',$foto='' ) {
        $this->id = $id;
        $this->nama_produk = $nama_produk;
        $this->kategori_produk = $kategori_produk;
        $this->harga_produk = $harga_produk;
        $this->foto = $foto;
    }
 /* Getter dan Setter */
    public function set_nim($id){
        $this->id = $id;
    }

    public function get_id(){
        return $this->id;
    }
    
    public function set_nama_produk($nama_produk){
        $this->nama_produk = $nama_produk;
    }
    public function get_nama_produk(){
        return $this->nama_produk;
    }
    public function set_kategori_produk($kategori_produk){
        $this->kategori_produk = $kategori_produk;
    }

    public function get_kategori_produk(){
        return $this->kategori_produk;
    }
    
    public function set_harga_produk($harga_produk){
        $this->harga_produk = $harga_produk;
    }
    public function get_harga_produk(){
        return $this->harga_produk;
    }
    public function set_foto($foto){
        $this->foto = $foto;
    }
    public function get_foto(){
        return $this->foto;
    }

}

?>