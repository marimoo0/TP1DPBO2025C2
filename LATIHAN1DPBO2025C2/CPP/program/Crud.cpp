// import library dan file
#include <iostream>
#include <list>
#include <string>
#include "Petshop.cpp"

// menggunakan standard namespace
using namespace std;

// deklarasi kelas CRUD
class Crud
{
private:
    list<Petshop> llist; // list of objek Petshop

public:
    // Konstruktor
    Crud() {}

    // Method create
    void create(string id, string nama_produk, string kategori_produk, string harga_produk)
    {
        llist.push_back(Petshop(id, nama_produk, kategori_produk, harga_produk));
    }

    // Method read
    void read()
    {
        cout << "\nList Produk Petshop: " << '\n';
        int i = 0;
        for (list<Petshop>::iterator it = llist.begin(); it != llist.end(); it++)
        {
            cout << (i + 1) << ".| "
                 << it->get_id() << " | "
                 << it->get_nama_produk() << " | "
                 << it->get_kategori_produk() << " | "
                 << it->get_harga_produk() << '\n';
            i++;
        }
    }

    // Method update
    void update(string id)
    {
        string nama_produk, kategori_produk, harga_produk;

        for (list<Petshop>::iterator it = llist.begin(); it != llist.end(); it++)
        {
            if (id == it->get_id())
            {
                cout << "\nMasukkan data baru:\n";
                cout << "Nama Produk: ";
                cin >> nama_produk;
                cout << "Kategori Produk: ";
                cin >> kategori_produk;
                cout << "Harga Produk: ";
                cin >> harga_produk;

                // Memanggil method setter yang sesuai
                it->set_nama_produk(nama_produk);
                it->set_kategori_produk(kategori_produk);
                it->set_harga_produk(harga_produk);
                break;
            }
        }
    }

    // Method delete
    void del(string id)
    {
        for (list<Petshop>::iterator it = llist.begin(); it != llist.end(); it++)
        {
            if (id == it->get_id())
            {
                llist.erase(it);
                break;
            }
        }
    }

    // Destructor
    ~Crud() {}
};
