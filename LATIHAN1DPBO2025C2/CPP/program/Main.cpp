/* Saya Khana Yusdiana 2100991 mengerjakan soal Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin. */

// import library dan file
#include <bits/stdc++.h>
#include "Crud.cpp"

// menggunakan standarad namespace
using namespace std;

int main()
{
    // deklarasi variabel
    Crud crud;                                             // Intansiasi objek crud
    string id, nama_produk, kategori_produk, harga_produk; // variabel untuk menampung string inputan
    int m;                                                 // variabel untuk memilih menu crud
    do
    {
        // menampilkan menu
        cout << "\nMenu : " << '\n';
        cout << "0. Exit" << '\n';
        cout << "1. Create" << '\n';
        cout << "2. Read" << '\n';
        cout << "3. Update" << '\n';
        cout << "4. Delete" << '\n';

        cout << "\nSilahkan pilih menu yang diinginkan : ";
        cin >> m; // input menu pilihan

        if (m == 1) // jika menu yang dipilih adalah 1
        {
            // meminta masukan data objek produk
            cout << "\nMasukan data produk : \n";
            cout << "id: ";
            cin >> id;
            cout << "Nama Produk: ";
            cin >> nama_produk;
            cout << "Kategori Produk: ";
            cin >> kategori_produk;
            cout << "Harga Produk: ";
            cin >> harga_produk;
            // memanggil method create yang ada pada objek crud
            crud.create(id, nama_produk, kategori_produk, harga_produk);
        }
        else if (m == 2) // jika menu yang dipilih adalah 2
        {
            // memanggil method read yang ada pada objek crud
            crud.read();
        }
        else if (m == 3) // jika menu yang dipilih adalah 3
        {
            // input id produk yang data nya akan di update
            cout << "\nMasukan id produk yang akan di update : ";
            cin >> id;
            // memanggil method update yang ada pada objek crud
            crud.update(id);
        }
        else if (m == 4) // jika menu yang dipilih adalah 4
        {
            // input id produk yang data nya akan di delete
            cout << "\nMasukan id produk yang akan di delete : ";
            cin >> id;
            // memanggil method delete yang ada pada objek crud
            crud.del(id);
        }
        else if (m == 0) // jika menu yang dipilih adalah 0
        {
            cout << "\nTerima Kasih" << '\n';
        }
    } while (m != 0); // perulangan berjalan selama user tidak menginput 0

    return 0;
}