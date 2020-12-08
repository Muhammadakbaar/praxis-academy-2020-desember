# Java OOP Concepts Tutorial
Untuk latihan ini saya membuat KebunBinatang.jar
di dalamnya ada 

Nama Kelas | Keterangan
---------- | ----------
Hewan.class | Kelas ini adalah parent class dari Burung.class. Pada kelas ini saya deklarasikan 5 atribut/variabel dan 2 method yaitu variabel umur, bobot, jk, jenis, nama, sedangkan untuk method-nya yaitu makan(), dan tidur().
Burung.class | Kelas ini adalah child class dari Burung.class sehingga dapat mewarisi atribut-atribut dari parent-nya. Kelas ini juga saya gunakan sebagai parent class dari BurungOnta.class dan BurungHantu.class. Pada kelas ini saya isikan nilai varibel jenis dengan "burung".
BisaTerbang.class | Kelas ini saya gunakan sebagai interface karena dari sekian banyak burung ada burung yang bisa terbang dan ada juga yang tidak bisa maka saya buat abstract method terbang().
BurungOnta.class | Kelas ini adalah child class dari Burung.class, karena Burung.class adalah child class dari Hewan.class maka kelas ini juga mewarisi atribut-atribut dari Hewan.class ditambah dengan atribut-atribut dari Burung.class. Karena burung onta tidak bisa terbang maka saya tidak mengimplementasikan method terbang() dari interface BisaTerbang.
BurungHantu.class | Kelas ini adalah child class dari Burung.class hampir sama dengan BurungOnta.class bedanya burung ini bisa terbang maka saya implementasikan method terbang dari interface BisaTerbang.
KebunBinatang.class | Kelas ini saya gunakan sebagai main class yg berfungsi sebagai kelas yang pertama kali dijalankan ketika program tersebut dieksekusi. Pada kelas ini saya buat constructor bOnta sebagai objek dari kelas BurungOnta dan bHantu sebagai objek dari kelas BurungHantu. Pada kelas ini juga saya isikan atribut-atribut dari objek tersebut kecual atribut jenis karena atribut sudah ada nilainya dari kelas Burung. Untuk hasilnya saya hanya melakukan output dari atribut-atribut objek tersebut, behavior, dan interfacenya.  
