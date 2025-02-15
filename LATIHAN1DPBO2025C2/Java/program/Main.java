/* Saya Khana Yusdiana 2100991 mengerjakan soal Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin. */

// Import library
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // deklarasi variabel
        Crud crud = new Crud(); // Intansiasi objek crud
        String id, nama_produk, kategori_produk, harga_produk; // variabel untuk menampung string inputan
        int z; // variabel untuk memilih menu crud
        Scanner sc = new Scanner(System.in);
        do {
            // menampilkan menu
            System.out.println('\n' + "Menu: ");
            System.out.println("0. Exit");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");

            System.out.println('\n' + "Silahkan pilih menu yang diinginkan : ");

            z = sc.nextInt(); // input menu pilihan

            if (z == 1) { // jika menu yang dipilih adalah 1
                // meminta masukan data objek produk
                System.out.println('\n' + "Masukan data produk: ");
                System.out.println("id: ");
                id = sc.next();
                System.out.println("Nama Produk: ");
                nama_produk = sc.next();
                System.out.println("Kategori Produk: ");
                kategori_produk = sc.next();
                System.out.println("Harga Produk: ");
                harga_produk = sc.next();
                // memanggil method create yang ada pada objek crud
                crud.create(id, nama_produk, kategori_produk, harga_produk);
            } else if (z == 2) { // jika menu yang dipilih adalah 2
                crud.read(); // memanggil method read yang ada pada objek crud
            } else if (z == 3) { // jika menu yang dipilih adalah 3
                // input id produk yang data nya akan di update
                System.out.println('\n' + "Masukan id yang akan di update : ");
                id = sc.next();
                // memanggil method update yang ada pada objek crud
                crud.update(id);
            } else if (z == 4) { // jika menu yang dipilih adalah 4
                System.out.println('\n' + "Masukan id yang akan di delete : ");
                id = sc.next();
                crud.delete(id); // memanggil method delete yang ada pada objek crud
            } else if (z == 0) { // jika menu yang dipilih adalah 0
                System.out.println('\n' + "Terima Kasih");
            }
        } while (z != 0); // perulangan berjalan selama user tidak menginput 0

        sc.close();
    }
}