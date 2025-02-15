# Saya Khana Yusdiana NIM 2100991 mengerjakan soal Latihan 1
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
# untuk keberkahanNya maka saya tidak melakukan kecurangan
# seperti yang telah dispesifikasikan. Aamiin. 

# import class file
from Crud import Crud

# Intansiasi objek crud
crud = Crud()

# deklarasi variabel untuk menampung string inputan
id = ""
nama_produk = ""
kategori_produk = ""
harga_produk = ""

# variabel untuk memilih menu crud
n = 5
while n != 0:
    # menampilkan menu
    print("\nMenu: ")
    print("0. Exit")
    print("1. Create")
    print("2. Read")
    print("3. Update")
    print("4. Delete")
    print("\nSilahkan pilih menu yang diinginkan: ")
    # input menu pilihan
    n = int(input())
    # jika menu yang dipilih adalah 1
    if (n == 1):
        # meminta masukan data objek mahasiswa
        print("\nMasukan data yang ingin dibuat !")
        print("Id: ")
        id = str(input())
        print("Nama Produk : ")
        nama_produk = str(input())
        print("Kategori Produk: ")
        kategori_produk = str(input())
        print("Harga Produk: ")
        harga_produk = str(input())
        # memanggil method create yang ada pada objek crud
        crud.create(id, nama_produk, kategori_produk, harga_produk)
    # jika menu yang dipilih adalah 2
    elif (n == 2):
        crud.read()  # memanggil method read yang ada pada objek crud
    # jika menu yang dipilih adalah 3
    elif (n == 3):
        # input nim mahasiswa yang data nya akan di update
        print("\nMasukan Id yang akan di update : ")
        id = str(input())
        # memanggil method update yang ada pada objek crud
        crud.update(id)
    # jika menu yang dipilih adalah 4
    elif (n == 4):
        # input nim mahasiswa yang data nya akan di update
        print("\nMasukan Id yang akan di delete : ")
        id = str(input())
        # memanggil method update yang ada pada objek crud
        crud.delete(id)
    # jika menu yang dipilih adalah 0
    elif (n == 0):
        print("\nTerima Kasih")
