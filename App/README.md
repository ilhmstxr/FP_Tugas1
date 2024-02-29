AppKasir

Nota, Karyawan, Pembeli
Frozen Food

data:

- nama pembeli
- nama produk
- jumlah produk
- harga satuan produk
- harga subtotal produk
- grandtotal belanjaan
- tanggal
- harga bayar
- kembalian

method:

- tambah produk
- hapus produk
- update produk
- data transaksi

produk: array nama, array harga, array stok.
transaksi: array
transaksi
[
[
nama barang,
harga barang,
stok arang,
tanggal
]
]

alur:

1. karyawan menambahkan:

   - menambah produk
     cara:
     - ketik 1 pada menu produk
     - ketik 1 pada menu tambah barang
     - karyawan menambahkan nama barang
     - karyawan menambah harga barang
     - karyawan menambah stok barang yang tersedia

2. karyawan mengedit stok produk
   cara :

   - ketik 1 menu produk
   - ketik 2 menu edit stok produk
   - ketik nama stok produk yang akan diedit
   - pilih menu 1 untuk edit harga atau 2 untuk edit stok
   - edit stok atau harga barang
   - konfirmasi, pilih 1 untuk setuju atau pilih 2 untuk batal

3. pembeli membeli produk
   cari barang
   cara:

   - ketik 2 untuk menu pembeli
   - ketik 1 menu cari barang
   <!-- - program menampilkan jenis barang (nugget,sosis,dll) -->
   - ketik barang yang akan di beli
   - program menampilkan merek dari jenis barang beserta harganya
   - pelanggan memilih barang beserta stok yang dibeli
   - sistem menanyakan apakah akan menambah atau tidak dengan 1/2
   - pelanggan mengkonfirmasi apakah sudah selesai memilih barang atau tidak dengan pilih 1 / 2

   keranjang
   cara:

   - ketik 2 untuk menu pembeli
   - ketik 2 untuk menu keranjang
   - program menampilkan barang pilihan pelanggan
   - apbila tidak ada barang yang dipilih user maka program akan mengoutput tidak ada barang yang 
   - muncul menu keluar keranjang, hapus barang di keranjang, atau edit barang yang dibeli
   - apabila 

   pembayaran
   cara:

   - ketik 2 untuk menu pembeli
   - ketik 3 untuk menu pembayaran
   - program menampilkan total harga barang yang dipilih
   - pelanggan memasukkan nilai uang yang dibayarkan
   - program menampilkan kembalian uang pelanggan apabila lebih dari nominal yang dibayarkan
   - apabila uang kurang, program akan menampilkan output uang anda kurang dan looping ke masukkan nilai uang yang dibayarkan
     keluar

4. list transaksi yang telah dibuat
   cara:
   - ketik 3 untuk menu transaksi
   - program menampilkan transaksi yang dibuat oleh pelanggan
   - apabila tidak ada transaksi yang dibuat, program akan menampilkan "tidak ada transaksi"

nota:

jenis barang:

    1. sosis
        - kanzler       Rp. 42.000      Stok : 53
        - champ         Rp. 32.000      Stok : 42
        - sonice        Rp. 29.000      Stok : 15

    2. nugget
        - fiesta        Rp. 38.000      Stok : 21
        - goldstar      Rp. 42.000      Stok : 0
        - kanzler       Rp. 45.000      Stok : 23

    3. dimsum
        - ayam          Rp. 25.000      Stok : 31
        - udang         Rp. 27.000      Stok : 22
        - keju          Rp. 26.000      Stok : 12

    4. chikuwa
        - shifudo       Rp. 27.000      Stok : 12
        - cedea         Rp. 24.000      Stok : 45
        - sunfish       Rp. 26.000      Stok : 38
