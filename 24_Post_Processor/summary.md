# (24)_Post_Processor

## Apa itu post processor
 merupakan elemen dari test plan yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan dari permintaan sampel. Post processor ini biasa digunakan untuk mengekstraksi nilai-nilai tertentu dari sebuah respon dari request sample, misalnya kita dapat mengekstrak nilai variabel sesi dari permintaan HTTP dan meneruskan nilai variable sesi ke permintaan selanjutnya.

## JSON Path
 - Digunakan untuk ekstrak isi dari json response
 - Beberapa ekspresi yang umum digunakan:
  a. $ => root element
  b. . => child operator (object)
  c. [] => child operator (array)
  d. .. => recursive descent (langsung ke objek)
  e. * => wildcard (all things)
  f. [startend] => array slice operator borrowed

## JMeter Post Processor are at the heart of Performance Testing