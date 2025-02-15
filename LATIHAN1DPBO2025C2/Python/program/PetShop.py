# class declaration
class PetShop:

    # atribut private
    __id = ""
    __nama_produk = ""
    __kategori_produk = ""
    __harga_produk = ""

   # konstruktor
    def __init__(self, id="", nama_produk="", _kategori_produk="", harga_produk=""):
        self.__id = id
        self.__nama_produk = nama_produk
        self.__kategori_produk = _kategori_produk
        self.__harga_produk = harga_produk

    # Getter and Setter

    def get_id(self):
        return self.__id

    def set_id(self, id):
        self.__id = id

    def get_nama_produk(self):
        return self.__nama_produk

    def set_nama_produk(self, nama_produk):
        self.__nama_produk = nama_produk

    def get_kategori_produk(self):
        return self.__kategori_produk

    def set_kategori_produk(self, kategori_produk):
        self.__kategori_produk = kategori_produk

    def get_harga_produk(self):
        return self.__harga_produk

    def set_harga_produk(self, harga_produk):
        self.__harga_produk = harga_produk
