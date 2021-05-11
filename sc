#Andreas Nugroho
#71200646

#seorang pegawai kesuitan menentukan angka terkecil,angka positif dan angka negatif pada sebuah data
#bantulah pegawai tersebut membuat program untuk membantu menyelesaikan pekerjaannya

#input
#banyak data yang akan di inputkan
#datanya

#proses
#perulangan

#output
#angka terkecil angka positif dan angka negatif

tampung = set()
masuk = int(input("Masukkan banyaknya data set: "))

for i in range(1,masuk+1):
    isi = int(input("MAsukkan data ke %d pada set: "%i))
    tampung.add(isi)

print("data pada set: ",tampung)
urut = sorted(tampung)
#maks = len(urut)
print("Angka terkecil dari data tersebut adalah")
print(urut[0])
print("Angka positif pada data tersebut adalah")
for positif in tampung:
    if positif >= 0:
        print(positif,end=" ")
print("\nAngka negatif pada data tersebut adalah")
for negatif in tampung:
    if negatif < 0:
        print(negatif,end=" ")
