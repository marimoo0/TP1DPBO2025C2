import java.util.ArrayList;
import java.util.Scanner;

// deklarasi kelas crud
public class Crud {

    // atribute private
    private ArrayList<PetShop> list; // list of objek Petshop

    /* konstruktor */
    public Crud() {
        list = new ArrayList<>();
    }

    // method create : membuat objek Petshop
    public void create(String id, String nama_produk, String kategori_produk, String harga_produk) {
        // instansiasi objek Petshop
        PetShop pts = new PetShop(id, nama_produk, kategori_produk, harga_produk);
        // masukan objek ke dalam list
        list.add(pts);
    }

    // method read : menampilkan isi list
    public void read() {
        // menampilkan isi list of objek Petshop
        System.out.println("\nList Produk : \n");
        int i;
        for (i = 0; i < list.size(); i++) {
            System.out
                    .println(Integer.toString(i + 1) + ".| " + list.get(i).getId() + " | "
                            + list.get(i).getNama_produk() + " | " + list.get(i).getKategori_produk() + " | "
                            + list.get(i).getHarga_produk());
        }
    }

    // method update : update objek yang ingin diubah
    public void update(String id) {
        Scanner sc = new Scanner(System.in);

        // deklrasi variabel untuk menampung nama produk, kategori produk, harga produk
        // dari data yang
        // akan diubah
        String nama_produk, kategori_produk, harga_produk;

        // perulangan untuk mencari objek yang akan di ubah berdasarkan id yang
        // diinput
        for (int i = 0; i < list.size(); i++) {
            // apabila id pada objek nya sama dengan id inputan
            if (id.equals(list.get(i).getId())) {
                // input isi variabel nama produk, kategori produk, harga produk dari data yang
                System.out.println('\n' + "Masukan data yang ingin diubah !");
                System.out.println("Nama Produk: ");
                nama_produk = sc.next();
                System.out.println("Kategori Produk: ");
                kategori_produk = sc.next();
                System.out.println("Harga Produk: ");
                harga_produk = sc.next();

                // update data yang ingin diubah dengan menggunakan method setter di kelas
                // petshop
                list.get(i).setNama_produk(nama_produk);
                list.get(i).setKategori_produk(kategori_produk);
                list.get(i).setHarga_produk(harga_produk);
                break;
            }
        }
    }

    // method delete : delete objek yang ingin dihapus
    public void delete(String id) {
        // perulangan untuk mencari objek yang di akan di hapus berdasarkan id yang
        // diinput
        for (int i = 0; i < list.size(); i++) {
            // apabila id pada objek nya sama dengan id inputan
            if (id.equals(list.get(i).getId())) {
                list.remove(list.get(i)); // hapus objek pada list
                break;
            }
        }
    }
}
