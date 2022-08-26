# ANALISIS SOAL PENUGASAN 

## 2. Tuliskan secara lengkap, simpulan dari gambar dibawah!
![alt text](soal5(2).jpg)

**jawaban :**

Dalam bahasa pemrograman java tersebut masih ditemukan konflik. Hal ini ditunjukan dengan warna hijau dan merah. Kemungkinan pada project *CalculatorServiceImpl* ini dikerjakan oleh dua orang (panggil saja *A* dan *B*). Si *A* yang mengerjakan bagian *add* sudah melakukan merge duluan dengan *master* dan sudah di pull di *cloud*. Jadi ketika repositori di *cloud* sudah terupdate, si *B* masih mengerjakan file yang lama (yang belum terupdate). Kemudian ketika si *B* ingin melakukan push dan merge dengan yang ada di *repository cloud*, terjadilah *conflict* seperti itu. Hal ini ditunjukan oleh bagian yang berwarna hijau (yang kemungkinan sudah duluan di merger) dan bagian yang merah (yang mergernya telat). Dan perlu dilakukan perubahan manual oleh *@author*.