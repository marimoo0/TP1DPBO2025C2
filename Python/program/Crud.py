# import class file
from PetShop import PetShop


# deklarasi kelas crud


class Crud:
    # atribute private
    __list = []  # list of objek petshop

    # konstruktor
    def __init__(self):
        self.__list = []

    # method create: membuat objek petshop
    def create(self, id, nama_produk, kategori_produk, harga_produk):
        # instansiasi objek petshop, lalu masukan objek ke dalam list
        self.__list.append(
            PetShop(id, nama_produk, kategori_produk, harga_produk))

    # method read: menampilkan isi list
    def read(self):
        #    menampilkan isi list of objek petshop
        print("\nList Produk : \n")
        i = 0
        for pts in self.__list:
            print(str(i+1)+".| ", pts.get_id(), " | ", pts.get_nama_produk(),
                  " | ", pts.get_kategori_produk(), " | ", pts.get_harga_produk(), " | ")
            i += 1

    # method update: update objek yang ingin diubah
    def update(self, id):
        # perulangan untuk mencari objek yang  akan di ubah berdasarkan id yang diinput
        for pts in self.__list:
            # apabila id pada objek nya sama dengan id inputan
            if (pts.get_id() == id):
                # input isi variabel
                print("\nMasukan data yang ingin diubah !")
                print("Nama Produk: ")
                nama_produk = str(input())
                print("Kategori Produk: ")
                kategori_produk = str(input())
                print("Harga Produk: ")
                harga_produk = str(input())
                # update data yang ingin diubah dengan menggunakan method setter di kelas petshop
                pts.set_nama_produk(nama_produk)
                pts.set_kategori_produk(kategori_produk)
                pts.set_harga_produk(harga_produk)
                break

    # method delete: delete objek yang ingin dihapus
    def delete(self, id):
        # perulangan untuk mencari objek yang akan di hapus berdasarkan id yang diinput
        for pts in self.__list:
            # apabila id pada objek nya sama dengan id inputan
            if (pts.get_id() == id):
                # hapus objek pada list
                self.__list.remove(pts)
                break
