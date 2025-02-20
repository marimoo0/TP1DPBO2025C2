// deklarasi kelas petshop
public class PetShop {
    // atribut private
    private String id, nama_produk, kategori_produk, harga_produk;

    /* konstruktor */

    // konstruktor tanpa parameter
    public PetShop() {
        // set isi atribut secara default
        this.id = "";
        this.nama_produk = "";
        this.kategori_produk = "";
        this.harga_produk = "";
    }

    // konstruktor dengan parameter
    public PetShop(String id, String nama_produk, String kategori_produk, String harga_produk) {
        // set isi atribut sesuai isi parameter
        this.id = id;
        this.nama_produk = nama_produk;
        this.kategori_produk = kategori_produk;
        this.harga_produk = harga_produk;
    }

    /* Getter dan Setter */

    // Get id
    public String getId() {
        return this.id;
    }

    // set id
    public void setId(String id) {
        this.id = id;
    }

    // Get nama_produk
    public String getNama_produk() {
        return this.nama_produk;
    }

    // set nama_produk
    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    // get kategori produk
    public String getKategori_produk() {
        return this.kategori_produk;
    }

    // set kategori produk
    public void setKategori_produk(String kategori_produk) {
        this.kategori_produk = kategori_produk;
    }

    // get harga produk
    public String getHarga_produk() {
        return this.harga_produk;
    }

    // set harga produk
    public void setHarga_produk(String harga_produk) {
        this.harga_produk = harga_produk;
    }
}
