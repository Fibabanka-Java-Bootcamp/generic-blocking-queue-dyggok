## Generic Blocking Quene 

Queue veri yapısı, yani diğer bir ifadeyle kuyruk yapısını Java'nın generic yapısıyla oluşturmaya çalıştım. Öncelikle, kuyruğa veri eklemek için add adlı metodu, kuyruktan veri silmeden veriyi sadece okumak için peek metodu ve kuyruğun başına gelen her veriyi silmek için de poll adlı metodu kullanıyoruz. Ayrıca veriyi eklediğimiz ve veriyi sildiğimiz add ve poll metotlarının sırasıyla işlem yapması ve daha güvenli olması için metotların synchronized olmasını sağlıyoruz. 

Her gelen veriyi okumak ve set etmek için ValueClass adı verilen bir sınıf açıp, gelen verileri buradan alıp burada set ediyoruz. Her gelen veriyi işlemek için de Queue sınıfını kullanıyoruz. Bu sınıfta önemli olan şey herhangi bir array ve liste yapısı kullanmadan, OOP kullanımını göstermek adına verileri new operatörünü kullanarak obje üzerinden birbirini referans olarak göstermesini sağlıyoruz. 

Main sınıfında ise sadece diğer sınıflarda eklenen metotları kullanıyoruz ve console ekranında metotların düzgün çalışıp çalışmadığını kontrol ediyoruz. 