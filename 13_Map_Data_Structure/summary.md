# (13)_Map_Data_Structure

## Implementasi Hashmap
 1. HashMap
  Merupakan impelemntasi dari map yang menggunakan algoritma struktur data *hash table*.
  Untuk membuat hashmap kita bisa membuat dahulu sebuah variable bernama bulan dan tipe data Map
  
  contoh : 
  public static void main(String[]args){
  Map<String, Integer> bulan = **new HashMap**<>();
   bulan.put("Januari",1);
   bulan.put("Februari",2);
   bulan.put("Agustus",8);
   sout(bulan);
  }

 2. WeakHashMap
  Masih menggunakan *hash tabel*, tapi bedanya key bisa dihilangkan jika sudah tidak digunakan.
  
  contoh : 
  public static void main(String[]args){
  Map<String, Integer> bulan = **new WeakHashMap**<>();
   bulan.put("Januari",1);
   bulan.put("Februari",2);
   bulan.put("Agustus",8);
   **System.gc();**             //untuk menandakan bahwa key bisa dihilangkan dari map jika tidak digunakan lagi
   sout(bulan);
  }

 3. IdentityHashMap
  Masih menerapkan *hash Table*, tetapi jika key masih memiliki refrensi pada memory yang berbeda maka akan dianggap sebagai data yang berbeda.
  contoh :
  
  public static void main(String[]args){
  Map<String, Integer> bulan = **new IdentityHashMap**<>();
   var key = "Januari.Awal";
   var awal = "Awal";
   var key2 = "Januari" + "." Awal;

   // walaupun key1 = key2 tapi dia didefinisikan pada refrensi memory yang berbeda, jadi dianggap berbeda.

   bulan.put("key",1); 
   bulan.put("key2",2);
   bulan.put("Agustus",8);
   sout(bulan.size());
  }

 4. LinkedHashMap
  Tidak ada perbedaan yang signifikan dengan *Hash Map* yang biasa, 
  namun secara internal LinkHashMap menerapkan *doubling link list* dan juga *hash Tabel* sbg struktur data di dalam mapnya.
  
  contoh :
  public static void main(String[]args){
  Map<String, Integer> bulan = **new LinkedHashMap**<>();
   bulan.put("Januari",1);
   bulan.put("Februari",2);
   bulan.put("Agustus",8);
   sout(bulan);
  }

 5. ImmutableMap
  Immutable = tidak dapat diubah. 
  Jadi map dalam bentuk ini tidak dapat diubah isinya, baik ditambah, diedit, maupun dikurangi.
  
  contoh :
  public static void main(String[]args){
  Map<String, Integer> bulan = **Map.of**(
   "Januari",1,
   "Februari",2,
   "Agustus",8
  );
   sout(bulan);
  }

## Sorted Map
 1. Sorted Map 
  Map yang dapat diurutkan baik secara **acending** ataupun **descending**. Penerapan sorting ini memiliki caranya sendiri".
  
  contoh : (Outputnya nanti akan ditampilkan sesuai abjad)
  public static void main(String[]args){
  **SortedMap**<String, Integer> bulan = **TreeMap**<>();
   bulan.put("Januari",1);
   bulan.put("Februari",2);
   bulan.put("Agustus",8);
   sout(bulan);
  }

 
 2. With Comparator
  Bertujuan untuk membandingkan antara data key yang memiliki urutan terlebih dahulu dan juga sebaliknya.
  
  contoh : (Outputnya nanti akan ditampilkan sesuai abjad)
  public static void main(String[]args){
  **SortedMap**<Person, Integer> persons = **TreeMap<>(new Comparator<Person>**() (
    // Dari sini hingga kebawah sangat berbeda dengan Sorted Map
    @Override
    Public int compare(Person o1, Person o2){
	return o2.getName().compareTo(o1.getName());
	}
    ));
   persons.put(new Person("Moryku"),1);
   persons.put(new Person("Alterra"),2);
   persons.put(new Person("Academy"),8);

   for (var key: person.entrySet()) (
   sout(key.getKey().getName());
   )
  }

 3. Navigable Map
  Masih termasuk sorted map tetapi dengan method" untuk menavigasi yang lebih lengkap, 
  mulai dari key yang paling rendah -> paling tinggi
  key paling awal -> paling akhir

  contoh : (Outputnya nanti akan ditampilkan sesuai dengan sout)
  public static void main(String[]args){
  **NavigableMap<String, Integer> bulan = TreeMap**<>();
   bulan.put("Januari",1);
   bulan.put("Februari",2);
   bulan.put("Agustus",8);
   // Berbeda dari yang Sorted Map
   **sout(bulan.lowerKey("Februari"));**
  }

## Tambahan
 Hash Map :
  1. HashMap
  2. WeakHashMap
  3. IdentityHashMap
  4. LinkedHashMap
  5. ImmutableMap
 Sorted Map :
  1. Sorted Map
  2. With Comparator
  3. Navigable Map