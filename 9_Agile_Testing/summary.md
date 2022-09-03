# (9)_Agile_Testing

## A. Pengertian SDLC

 SDLC (*software development life cycle*) : proses menggunakan software untuk mendesain, mendevelop, dan testing untuk meningkatkan kualitas sebuah software (*software development*)
    Siklus SDLC ada 6, yaitu:
	    a. *Requirement* (kebutuhan customer)-> mengumpulkan kebutuhan, membuat diagram proses, dan performa analisis dari prosesnya
	    b. *Design* (dirancang oleh UI/UX) -> mendesain tampilan untuk perangkat lunak
	    c. *Development* (Sesuai *role* masing-masing) -> Mendevelop code dan database (FE, BE)
	    d. *Testing* (Role QE) -> Menggunakan *Test Section and Case* pada tiap tahapan, mulai dari *Design* sampai *maintenance*
	    e. *Deployment* () -> diakses secara publik
	    f. *Maintenance* (pemeliharaan) -> memperbaiki *issue/bug* dari user saat mengakses aplikasi

## B. Agile Testing
 Secara fundamental, *Agile Testing* adalah perubahan *mindset* dari tradisional testing.
 Ada 5 kunci *testing manifesto*, yaitu:
    1. Testing adalah kegiatan bukan fase
    2. Mencegah bug daripada menemukan bug
    3. Jangan jadi pemeriksa, jadilah penguji (user prespektif)
    4. Jangan coba-coba merusak sistem, bantulah membangun sistem sebaik mungkin
    5. Seluruh tim bertanggung jawab atas kualitas, bukan hanya penguji

## Testing Pyramid 
 1. unit testing
    Uji ini biasa disebut uji komponen secara individual sebelum menjadi sebuah rangkaian. Komponen ini akan di test apakah dapat berjalan atau tidak sesuai dengan fungsi awalnya.
 2. Integration testing
    Pada tahap ini uji rangkaian dari komponen dilakukan. Hal ini bertujuan untuk memeriksa rangkaian dapat berjalan dengan baik atau tidak, memeriksa kinerja dari rangkaian, dan testing program yang dirancang.
 3. UI (end-to-end)
    Tahap yang menguji apakah sistem yang telah didevelop telah sesuai dengan kebutuhan/kepuasan pengguna.