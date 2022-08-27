# (6)_Testing_Documentation_(Test Scenario-Test-Case-dll)

### A. ***Test Scenario***
    *Test Scenario* merupakan sekumpulan dokumen yang berisi tentang langkah-langkah sistematis yang disusun oleh *software tester* agar sistem yang ingin dites dapat memenuhi ketentuan yang diinginkan user, memenuhi standar tertentu, dan dapat berfungsi dengan baik. 
    Tujuan dari *test scenario* yaitu:
        1. Memudahkan developer & tester dalam *testing*.
        2. Sebagai landasan dasar sebuah projek.
        3. Sebagai dasar *client/product owner* menyesuaikan dengan *requirement*.
    *Tools* yang dapat digunakan dalam *test scenario* yaitu:
        1. *Google Spread Sheet*.
        2. *Test real*.
        3. *Test link*.
        4. *Test io*,*etc*.
    *How to make a good test scenario?*
        1. *Test Scenario is a **KEY** *.
        2. *Give context*.
        3. *Give details (specification requirement)*.
        4. *Clear and easy to understand*.
        5. *Complete*.
        6. Koheren (berhubungan).
        7. *Prove*.
        8. *Konsisten*.
        9. *End "pop up test*.
        10. *Don't forget a negative case*.
        11. *Think out of the box*.
        12. *Keep update*.

### B. ***Test Case***
    *Test Case* merupakan rancangan/rangkaian mengenai tindakan yang akan dilakukan oleh *software tester* untuk melakukan verifikasi terhadap fitur/fungsi tertentu dari sebuah perangkat lunak. 
    Tujuan dari *test case* adalah memastikan bahwa suatu sistem dapat berjalan dengan baik sesuai dengan kebutuhan awal serta mampu memberikan respon ketika diberikan masukan yang tidak *valid*.
    Komponen dari *test case* yaitu:
        1. *id of test case.*
        2. *desc of test case.*
        3. *Expect result.*
        4. *Actual result.*
        5. *Status*.
        6. *Recommendation*.
    Hal yang perlu diperhatikan dalam membuat *test case*, yaitu:
        1. Pembuatan harus sederhana dan transparan sehingga dapat dicerna dengan jelas oleh siapapun
        2. Harus dibuat dengan prinsip *end to end user* (prespektif pengguna akhir)
        3. Hindari pengulangan *test case*
        4. Jangan berasumsi terhadap sebuah fitur
        5. *test case* harus dapat diidentifikasi 
        6. *Repeatable and solve* (diuji dengan siapapun hasilnya tetap sama)
        7. *Pure review (*test case* harus dapat ditinjau oleh orang lain)

### C. Istilah-istilah
    Dalam QE ada beberapa istilah yang wajib diingat dan diketahui. Istilah-istilah tersebut yaitu:
        1. SDLC (*software development life cycle*) : Dokumen tentang lingkungan sebuah *software development*
            Siklus SDLC ada 6, yaitu:
	            a. *Requirement* (kebutuhan customer)-> dapat dicari infonya dengan cara *interview*
	            b. *Design* (dirancang oleh UI/UX) -> mendesain tampilan untuk perangkat lunak
	            c. *Development* (Sesuai *role* masing-masing) -> FE, BE, QE, UI/UX
	            d. *Testing* (Role QE) -> Menggunakan *Test Section and Case* pada tiap tahapan, mulai dari *Design* sampai *maintenance*
	            e. *Deployment* () -> diakses secara publik
	            f. *Maintenance* (pemeliharaan) -> memperbaiki *issue/bug* dari user saat mengakses aplikasi
        2. STLC (software testing life cycle) -> Siklus yang dimiliki QE untuk mengerjakan testingnya
	            a. *Requirement* analisis
	            b. *Test Planing* : merancang mau kaya gimana -> dokumen *test plan* yang berisi tentang beberapa hal : mau fitur apa aja yang di tes, bagaimana cara tes-nya, pembagiannya, dll
	            c. *Test Design* : tahap dimana kita membuat test case dan test scenario dari tahap sebelumnya 
	            d. *Test Environment setup* : membuat lingkungan pengujian
	            e. *Test execution* : melakukan pengujian dengan acuan *test case* yang dibuat di tahap *test design*
	            f. *Test Closure* : meringkas hasil dari seluruh pengetesannya
    
    Test Reporting -> aksi dalam melaporkan *bug* yang ditemukan.
    Komponen yang perlu dilaporkan ke develop:
	    1. Judul Isu : Data tampil ketika pencarian dengan kata kunci *invalid*
	    2. *Step* (langkah yg di lakukan) : Masuk ke *dashbord*, masukkan kata kunci *invalid*, tujukkan aktual *result*, tunjukkan *expect result*, *screenshoot* atau rekam (bukti).
	    3. Analisis *bug*
	    4. Bukti Pelaporan bisa sesuai menggunakan apk yg digunakan (bisa jira, trello, dll)
