# (20)_Web_Programming

## HTML (Hypertext Markup Language)

 A. Pengertian HTML
  Merupakan sebuah standar yang digunakan secara luas untuk menampilkan halaman web.

 B. Dokumentasi HTML
  - <!DOCTYPE html> => mendefinisikan dokumen ini sebagai HTML5
  - <html> => elemen root dari halaman HTML
  - <head> => berisi info meta tentang dokumen
  - <title> => menentukan judul untuk dokumen 
  - <body> => berisi konten halaman yang terlihat

 C. Struktur HTML

  ![alt text](1.jpg)

 D. Contoh Tag HTML
  menggunakan tag div, contoh: <div>content HTML </div>

 E. Tag Heading& Paragraph HTML
  heading dibagi dari heading 1 sampai 6, contoh:
  <h1> Heading satu</h1>
  <h2> Heading dua</h2>
  <p> Paragraph</p>

 F. Styling pada Paragraph HTML
  - <strong> membuat text lebih tebal </strong>
  - <em> penekanan pada text menjadi italic</em>
  - <s> membuat text dengan garis tercoret</s>
  - <br/> (line break untuk membuat garis baru)

 G. Tag Link HTML
  - Langsung
  <a href="https://www.google.com"> web google </a>
  
  - Membuka tab baru
  <a href="https://www.google.com" target="_blank"> web google </a>

 H. Tag Image HTML
  <img src="logo-altera.png"/>

 I. List HTML
  Ada dua jenis List dalam HTML:
   1. Ordered List adalah list yang berurut. (<ol>)
   2. Unordered List adalah list yang tak terurut. (<ul>)
  
  Setiap ol dan ul di deklarasikan menggunakan tag <li>

  Cara order List HTML
  <ol></ol> Default dari tag ol untuk menandai item yang terurut.
  <ol>
    <li>HTML</li>
    <li>CSS</li>
    <li>Bootstrap</li>
  </ol>
  outputnya : 
   1. HTML
   2. CSS
   3. Botstrap
  
  Contoh Ordered List HTML

  ![alt text](2.jpg)

  Contoh Unordered List HTML

  ![alt text](3.jpg)
  ![alt text](4.jpg)
 
 J. Tag Table HTML
  - Membuat table pada HTML menggunakan tag <table></table>
  - Setiap **baris** table di deklarasikan menggunakan <tr></tr>
  - Setiap **kolom** table di deklarasikan menggunakan <td></td>
  - Untuk kolom pada table header menggunakan <th></th>

  Contoh Tag Form HTML
   ![alt text](5.jpg)
   ![alt text](6.jpg)


## CSS (Cascading Style Sheets)
 A. Pengertian
  - Dapat menghias halaman web (color, size, font, backgound, width, height, dll). 
  - Dapat mengatur posisi pada halaman web (float, align, display, position, dll).

 B. Menambahkan file CSS
  3 cara menambahkan file CSS ke dalam HTML:
   1. External CSS
    <link rel="stylesheet" href="main.css">
    syntax ini disisipkan ke dalam tag <head> pada HTML. Ekstensi file CSS adalah .css

   2. Internal CSS
    Sytax ini dapat digunakan di dalam satu file HTML. Didefinisikan di dalam elemen <style>, di dalam bagian <head> atau di dalam bagian <body>

    ![alt text](7.jpg)

   3. Inline CSS
    Sytax ini dapat digunakan untuk elemen tunggal pada HTML. Diprioritaskan untuk menerapkan style yang unik.

    ![alt text](8.jpg)

 C. Syntax CSS

 ![alt text](9.jpg)

## BootStrap
  
