# (23)_Introduction_JMeter_and_Tutorial_Record_with_JMeter

## Introduction JMeter
 A. Apache Jmeter
  - Merupakan perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk membuat uji perilaku fungsional dan mengukur kinerja situs web.
  - Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya. 
  - Pros of Jmeter
   a. Open source
   b. Easy to use with GUI/Non GUI

 B. Open JMeter
  - Open terminal
  - Navigate to the bin folder
   cd this/is/your/folder/apache-jmeter-version/bin
  - Run JMeter (.\meter.bot)

## Recording Your First Test
 A. Open JMeter
  - Open terminal
  - Navigate to bin folder 
   cd this/is/your/folder/apache-jmeter-version/bin
  - Run JMeter (.\jmeter)

 B. Some components of JMeter Script
  - Test Plan
   Rencana besar tes yang akan dilakukan (parent)
  - Thread Group
   Kumpulan thread yang menjalankan skenario yang sama
  - Samplers
   Sebutan untuk request yang dikirim ke server
  - Config elements
   Element yang digunakan untuk konfigurasi atau modifikasi sampler request yang dikirimi ke server
  - Listeners
   Perekam data yang dihasilkan dari tes
  - Timers
   Fitur ini akan jalan duluan sebelum fitur yang lain berjalan
  - Assertions
   Seperti assert pada API/Web/Testing, merupakan kriteria tambahan apakah pass/tidak
  - Pre-post processors
   Fitur yang memproses response data sebelum/sesudah test

## Summary Report 
 Success rate = (jumlah_response_2xx/jumlah_thread)*100%