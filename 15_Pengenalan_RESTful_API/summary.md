# (15)_Pengenalan_RESTful_API

## API & REST API

 ### API (*Application Programming Interface*)

    API memungkinkan komunikasi dan pertukaran data antara 2 atau lebih software/sistem yang terpisah.

 ### REST API (*Representational State Transfer Application Programming Interface*)

    HTTP Method:
    1. GET (Membaca data)
    2. PUT (Membuat/mengganti data)
    3. POST (Membuat data baru)
    4. DELETE (Menghapus data yang ada)

    REST API Component
    1. Method
    2. URL (Base URL + Path)
    3. Header
    4. Body

    HTTP Response Code
    1. 200 Ok
    2. 201 Created
    3. 400 Bad Request
    4. 404 Not Found
    5. 401 Unauthorized
    6. 405 Method Not Allowed
    7. 500 Internal Server Error
    
## Testing API

 *Approach of API Testing*
   1. Mengerti fungsi dari API
   2. Dapat mengaplikasikan teknik testing
   3. Input parameter untuk API perlu **direncanakan** dan ditentukan sebelumnya
   4. Jalankan *test case* dan **bandingkan** antara hasil yang diharapkan dengan hasil yang didapatkan

 *What's API Testing*
   1. API berbeda dengan GUI
   2. Mengirim **request** dan mendapatkan **response**-nya
   3. Memverifikasi response yang benar dan error handiling

 *Kind of API Testing*
  1. Functionality
  2. Load Test
  3. Security

 *API Testing Tools*
  1. Postman
  2. Frisby
  3. JMeter
  4. REST-assured

 *Difference between API test & Unit test*
  A. Unit Test
   - Dilakukan oleh **Developer**
   - Fungsi **terpisah**
   - Develop bisa mengakses **source code**
   - Hanya **dasar** functionality yang di test
   - Scopenya **teratas**
   - Biasanya dilakukan **sebelum** build

  B. API test
   - **Tester** perform it
   - **End to End**
   - **Tidak bisa** mengakses source code
   - Hanya fungsi **API** saja
   - Semua functional **issue**
   - Scope lebih **luas**
   - Dilakukan **setelah** build

 *API Testing Process*
  1. Specification Review
  2. Specification Develop
  3. Framework Develop
  4. Test Case Develop
  5. Execution & Report

 *Test Cases for API Testing*
  - Mendapatkan balikan(response) yang **sesuai** dengan inputan
  - Apakah memberikan **balikan** atau tidak
  - Apakah **mengganggu** fitur yang lain atau tidak.
  - **Update** struktur data
  - **Memodifikasi** data yang ada

 *Best Practices of API Testing*
  - **Kelompokkan** test case kedalam beberapa kategori
  - Beri **Judul** yang sesuai pada setiap test
  - Harus **berhati-hati** ketika melakukan test yang berhubungan dengan menghapus sesuatu
  - Ketika membuat test case harus dipikirkan juga segala **kombinasi** input pada API

 *Types of Output of an API*
  - Bisa berbentuk apa saja, tetapi pada umumnya **JSON atau XML**
  - Status balikan **(response)** apakah Passed atau Fail
  - Memanggil fungsi API **lain**

 *Common Types of Test in API Testing*
  - memverifikasi apakah kita mendapat **respon** dari API
  - memverifikasi apakah hasil input/request sudah **sesuai** atau belum
  - Memverifikasi apakah data yang kita **input/update** sudah benar-benar berubah atau bertambah
  - Memverifikasi **waktu** respon yang diberikan

 *Type of ugs that API testing Detects*
  - Gagal melakukan error **handling** pada keadaan tertentu
  - Kesulitan untuk **tersambung** dan mendapat respon API
  - isu **keamanan**
  - **Performance** Issuee
  - **Error** atau **warning** yang tidak tepat
  - **Struktur** dari data respon tidak benar (JSON & XML)

## Advantages
 *Advantages of Testing API*
  - Efisiensi **waktu**
  - **Bahasa** yang independen
  - Mengurangi **biaya** testing
  - Mengurangi **resiko**