// import library
#include <iostream>
#include <string>

// menggunakan standard namespace
using namespace std;

// deklarasi kelas PetShop
class Petshop
{
    // atribut private
private:
    string id, nama_produk, kategori_produk, harga_produk;

public:
    /* konstruktor */

    // konstruktor tanpa parameter
    Petshop()
    {
        // set isi atribut secara default
        this->id = "";
        this->nama_produk = "";
        this->kategori_produk = "";
        this->harga_produk = "";
    }

    // konstruktor dengan parameter
    Petshop(string id, string nama_produk, string kategori_produk, string harga_produk)
    {
        // set isi atribut sesuai isi parameter
        this->id = id;
        this->nama_produk = nama_produk;
        this->kategori_produk = kategori_produk;
        this->harga_produk = harga_produk;
    }

    /* Getter dan Setter*/

    // Get id
    string get_id()
    {
        return this->id;
    }

    // Set id
    void set_id(string id)
    {
        this->id = id;
    }
    // Get nama produk
    string get_nama_produk()
    {
        return this->nama_produk;
    }

    // Set nama produk
    void set_nama_produk(string nama_produk)
    {
        this->nama_produk = nama_produk;
    }

    // Get kategori produk
    string get_kategori_produk()
    {
        return this->kategori_produk;
    }

    // Set kategori produk
    void set_kategori_produk(string kategori_produk)
    {
        this->kategori_produk = kategori_produk;
    }

    // Get harga produk
    string get_harga_produk()
    {
        return this->harga_produk;
    }

    // Set harga produk
    void set_harga_produk(string harga_produk)
    {
        this->harga_produk = harga_produk;
    }

    /* desktruktor */

    // default
    ~Petshop() // desktruktor
    {
    }
};
