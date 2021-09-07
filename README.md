<h1 align="center"> Spring Tutorial for Beginners </h1>
 
![GitHub last commit](https://img.shields.io/github/last-commit/icanerdogan/SpringTutorial-Beginners?style=flat-square)
![GitHub Repo stars](https://img.shields.io/github/stars/icanerdogan/SpringTutorial-Beginners?logo=Github&style=flat-square)
![GitHub followers](https://img.shields.io/github/followers/icanerdogan?color=yellow&logo=Github&style=flat-square)
 
 <h2>File Directory</h2>
 <ul>
     <li><a href="#apache-tomcat"> Apache Tomcat</a></li>
     <li><a href="#apache-eclipse"> Apache Tomcat - Eclipse Bağlantısı</a></li>
     <li><a href="#spring"> Spring Paketlerinin İndirilmesi ve Projeye Entegrasyonu</a></li>
     <li><a href="#hibernate"> Hibernate</a></li>
         <ul>
             <li><a href="#hibernateproje">Hibernate Proje Entegrasyonu </a></li>
         </ul>
     <li><a href="#maven"> Maven </a></li>
         <ul>
             <li><a href="#maven-kurulum"> Maven Kurulumu </a></li>
             <li><a href="#maven-entegre"> Maven Projesine Kütüphane Entegrasyonu </a></li>
         </ul>
     <li><a href="#spring-boot"> Spring Boot </a></li>
         <ul>
            <li><a href="#spring-giris"> Spring Boot : Giriş </a></li>
            <li><a href="#spring-rest"> Spring Boot : Spring Rest </a></li>
            <li><a href="#spring-katman"> Spring Boot : Katmanlı Mimariler </a></li>
         </ul> 
     <li><a href="#sosyal"> Sosyal Medya Hesaplarım </a></li>
 </ul>

<hr>
 <h2 id="apache-tomcat">Apache Tomcat</h2>
 <p>Apache Tomcat, Apache Yazılım Vakfı tarafından geliştirilmiş açık kaynak bir Java Servlet Container uygulamasıdır.</p>
 
 <h3><i>Kurulum</i></h3>
 <ol type="1">
  <li>https://tomcat.apache.org sitesine gidin. Sol tarafta "Download" altındaki kısımında, son sürüme tıklayın.</li><br>
  <li>Çıkan ekranda işletim sisteminize ve sürümünüze en uygun seçeneği seçin ve indirme işlemi başlayacaktır.</li><br> 
  <li> Uygulamamızın kurulumuna devam ederken, aşağıda görülen ekranda "Full" kurulumu seçmeyi unutmayın!</li><br> 
  <li> "Configuration" ekranında Port numaralarımızı aşağıdaki gibi veriyoruz. User Name alanına kullanıcı adımızı "admin" olarak, Password alanına şifremizi "12345" olarak belirliyoruz.</li><br
  <li> "Java Virtual Machine" ekranında gereken JDK dosyamızın dizinini veriyoruz. Burada JDK 11 sürümünü de kullanabilirsiniz!</li><br>
  <li> Programımızın kurulacağı dosya dizinini de aşağıdaki gibi veriyoruz!</li><br>
  <li> Kurulum bittikten sonra "localhost:8080" adresine gittiğinizde karşınıza aşağıdaki web site çıkacktır. Karşınıza bu ekran geliyorsa kurulumunuz başarıyla tamamlanmıştır! </li><br>
 </ol> 
 
 <hr>
 
<h2 id="apache-eclipse"> Apache Tomcat - Eclipse Bağlantısı </h2>
  <h3><i>Kurulum</i></h3>
   <ol type="1">
  <li> Eclipse IDE Programımızı açıyoruz.</li><br>
  <li> File > New > Other kısmına tıklıyoruz! </li><br>
  <li> Karşımıza gelen ekranda "server" yazıp gelen "Server" seçeneğine tıklayıp, Next diyoruz! </li><br>
  <li> Tekrardan karşımıza çıkan ekranda arama kutucuğuna "apache" yazıyoruz ve son sürümünü (10) kurduğumuz için "Tomcat v10.0 Server" seceneğine tıklayıp Next diyoruz!</li><br>
  <li> Bu ekranda Tomcat'i bilgisayarımıza kurduğumuz dizini giriyoruz!</li><br>
  <li> Finish ile kurulumu bitirebiliriz. </li><br>
  <li> Eğer Eclipse IDE uygulamanızda Alt barda "Servers" yok ise bunu aşağıdaki adımları izleyerek ekleyebilirsiniz. </li><br>
  <li> Window > Show View > Other kısmına tıklıyoruz! </li><br>
  <li> Buradan Server > Servers altında "Servers" seceneğine tıklayıp, Open butonuna basıyoruz! </li><br>
 </ol> 

<hr>

<h2 id="spring"> Spring Paketlerinin İndirilmesi ve Projeye Entegrasyonu </h2>
  <h3><i>Kurulum</i></h3>
  
  <ol type="1">
     <li> https://repo.spring.io/release/org/springframework/spring/ Bu adresten sayfanın en altından en güncel spring sürümünü seçiyoruz! <br> <br> <img src="https://i.hizliresim.com/t6hn4dv.PNG"> </li><br>
     <li> Tıkladığımızda karşımıza gelen ekranda "-dist.zip" isimli dosyayı indiriyoruz! <br> <br> <img src="https://i.hizliresim.com/nt8feu8.PNG"></img></li><br>
     <li> İndirilen dosyayı klasörden çıkarıldığında "libs" klasörü içindeki tüm jar dosyalarını kopyalıyoruz! <br> <br> <img src="https://i.hizliresim.com/g4pjc4n.PNG"></img></li><br>
     <li> Eclipse uygulamamızı açıp istediğiniz dizinde "springIntro" adından java projesi oluşturuyoruz. <br> <br> <img src="https://i.hizliresim.com/4ax2z8s.PNG"></img></li><br>
     <li> Projemize sağ tıklayıp New > Folder kısmına gidiyoruz! <br> <br> <img src="https://i.hizliresim.com/efra17w.png"></img></li><br>
     <li> Karşımıza gelen ekranda "libs" olarak belirlediğimiz dosyamızın adını giriyoruz! <br> <br> <img src="https://i.hizliresim.com/lg7q3m9.PNG"></img></li><br>
     <li> Tekrar projemize sağ tıklayıp en alt kısımda bulunan "Properties" alanına tıklıyoruz! <br> <br> <img src="https://i.hizliresim.com/sdas6ix.png"></img></li><br>
     <li> Karşımıza çıkan bu ekranda "Libraries" sekmesine gelip "Classpath"e bir kez tıklıyoruz. Yanda bulunan "Add JARs..." alanına tıklıyoruz! <br> <br> <img src="https://i.hizliresim.com/611cjuf.PNG"></img></li><br>
     <li> Gelen ekranda açtığımız "libs" klasörünü bulup tüm Jar dosyalarını seçiyoruz! (Shift ile ilk jar dosyasına tıklayıp ardından son jar dosyasına tıklarsanız tüm Jar dosyalarını tek seferde seçebilirsiniz!) <br> <br> <img src="https://i.hizliresim.com/a8vbuou.PNG"></img></li><br>
     <li> "OK" tuşuna bastıktan sonra "Apply and Close" ile ekranı kapatıp, projemizi başarıyla hazırlamış oluyoruz!</li><br>
 </ol> 
 
 <hr>
 
 <h2 id="hibernate"> Hibernate </h2>
 <p>Hibernate, veritabanınızdaki tablolar ile classlar ile eşleştirip, class üzerinden veritabanındaki nesneleri ilişkilendirerek "insert", "update", "delete" ve "select" yapabilmemizi sağlıyor.
JDBC ile yapılan tüm veritabanı sorgularını tamamen hibernate ile "generate" olarak yapılıyor.  </p>
  <h3><i>Kurulum</i></h3>
  
  <ol type="1">
     <li> https://hibernate.org/orm/releases/5.4/ adresine gidin ve görseldeki butona tıklayın! Açılan "SourceForge" penceresinde indirme otomatik olarak başlayacaktır.</li><br>
     <li> Eğer bilgisayarınızda MySQL yoksa https://dev.mysql.com/downloads/windows/installer/8.0.html buradan indirmeniz, gerekiyor! Kurulum için detaylı bir kurulum videosu izlemenizi öneririm!  </li><br>
     <li> Eclipse IDE'mize gelip "hibernateDemo" adında proje oluşturduktan sonra projeye sağ tıklayıp New > Folder!a tıklıyoruz. </li><br>
     <li> "libs" adında bir klasör oluşturuyoruz! </li><br>
     <li> İndirdiğimiz hibernate klasörünü RAR'dan çıkardıktan sonra görseldeki uzantıya gidip JAR dosyalarnı kopyalıyoruz. Sonrasında projemizde oluşturduğumuz "libs" içine JAR dosyalarını yapıştırıyoruz! </li><br>
     <li> https://disk.yandex.com.tr/d/O5rimXX5yG0Shw Burada bulunan MySQL bağlantı JAR dosyasını da "libs" klasörü içine atıyoruz. </li><br>
     <li> "libs" klasörü içinde bulunan dosyaları tanımlamak için, projemize sağ tıklayıp "properties" kısmına giriyoruz! </li><br>
     <li> Çıkan ekranda gördüğünüz adımları takip ederek "ADD Jars..." butonuna tıklıyoruz.</li><br>
     <li> Son olarak "hibernateDemo" içindeki JAR dosyalarını ekleyip, Apply ve sonrasına Apply&Close ile ekranı kapatıyoruz!</li><br>
 </ol> 
 
 
 <h2 id="hibernateproje"> Hibernate Proje Entegrasyonu </h2>
  <h3><i>Kurulum</i></h3>
  <ol type="1">
      <li> https://disk.yandex.com.tr/d/Hv0ybf55Y8Mh-A adresine gidin! "hibernate.cfg.xml" dosyasını indirin. </li><br>
      <li> "src" dosyası içine indirdiğiniz dosyayı yapıştırın! </li><br>
      <li> Dosya içinde "connection.url" kısmını veritabanı adınıza göre veriryoruz, yine kullanıcı adınızı ve şifrenizi veritabanınıza göre verin! </li><br>
 </ol>

<hr>

 <h2 id="maven"> Maven </h2>
 <p>Büyük projelerde birçok Jar dosyaları vs. birçok kütüphaneden yararlanıyoruz. Proje devam ettikçe bu paket sayısı artarken, paketlere gelen güncellemelerde takip edilmesi gerekiyor. </p>
 <ul>
 <li>Jar dosyaları yönetilebilir.</li><br>
 <li>Proje şablonları ile standart proje yönetimlerini yapabilirsiniz. </li><br>
 <li>Versiyon takip sistemi de sunuyor.</li><br>
 </ul>
 <p>Biz projemize birşey eklediğimizde veya istediğimizde bunu maven ile yapıyoruz. Bu durumda maven bizim diğer kütüphaneler ile haberleşmeyi sağlıyor.</p>
 <p>Hibernate, Spring gibi firmalar yaptıkları güncellemeleri Maven'a yükler, projeler de bu şekilde rahatlıkla güncellemeleri takip edebilir.</p>
  <h3 id="maven-kurulum"><i>Kurulum</i></h3>
  <ol type="1">
      <li> Öncelikle Help > Install New Software ile maven'ı projemize eklememiz gerekiyor! </li><br>
      <li> Çıkan ekranda Work with kısmına 
http://download.eclipse.org/technology/m2e/releases/ bu linki ekliyoruz ve "Add" butonua basıyoruz. "Group items by category" tikini kaldırıyoruz ve ekranda gördüğünüz "m2e" paketlerine tik koyuyoruz! Next diyip kurulumunu bitiriyoruz. </li><br>
      <li> Maven projesi oluşturmak için öncelikle File > New > Other'a tıklıyoruz! </li><br>
      <li> Gelen ekranda arama kısmına "maven" yazıyoruz ve "Maven Poject" kısmında tıklıyoruz. Next butonuna tıklayıp devam ediyoruz. </li><br>
      <li> Bu ekranda çalışma alanımızı istiyorsanız değiştirebilirsiniz ancak genelde deafult olarak devam edilir! </li><br>
      <li> Filter kısmında "maven-archetype-quickstart" yazıp alt tarafta işaretli olan paketi seçip Next diyip devam ediyoruz! </li><br>
      <li> Bu ekranda "Group Id" şirketimizin adı, "Artifact Id" ise oluşturacağımız projenin adıdır. Örnek olarak aşağıdaki gibi oluşturup Finish ile projemizi tamamlıyoruz! </li><br>
      <li> Oluşturduğumuz dosya içinde <b>pom.xml</b> dosyasında görüldü yere "1." yazısından sonra kullandığımız JDK sürümünü yazıyoruz. Örnek olarak ben JDK 16 sürümünü kullanıyorum.</li><br>
      <li> Projemiz başarıyla oluşturuldu!</li><br>
 </ol>
 
 <h3 id="maven-entegre"><i>Maven Projesine Kütüphane Entegrasyonu</i></h3>
  <ol type="1">
      <li> https://mvnrepository.com adresine gidiyoruz. Bu sitede eklemek projenizde kullanmak istediğiniz kütüphanenizin "maven" içinde mevcut mu kontrol edebilirsiniz! Maven için olan dosyaları yine "dependency" kodlarıyla projenize rahatlıkla ekleyebilirsiniz! Arama kısmına projemize eklemek istediğimiz "hibernate" kütüphanesini yazıyoruz. <br> <br> <img src="https://i.hizliresim.com/fpjvv4u.PNG"> </li>
      <li> Gelen ekranda en son final sürümünü seçebilirsiniz!<br> <br> <img src="https://i.hizliresim.com/ekhn2ey.PNG"> </li>
      <li> İstediğiniz sürüme tıkladığınızda karşınıza "maven" dependency kod blokları gelecektir. Bu kod bloğunu kopyalıyoruz. <br> <br> <img src="https://i.hizliresim.com/8lw21q0.PNG"> </li>
      <li> <b>pom.xml</b> içine kod bloğumuzu aşağıdaki gibi eklememiz yeterlidir!<br> <br> <img src="https://i.hizliresim.com/npzazc1.PNG"> </li>
      <li>Dilediğiniz tüm kütüphaneler için bu adımları uygulayabilirsiniz!</li>
 </ol>
 
 <hr>
 
 <h1 id="spring-boot"> Spring Boot </h1>
  
 <h2 id="spring-giris"> Spring Boot : Giriş </h2>
 <h3 id="maven-kurulum"><i>Kurulum</i></h3>
  <ol type="1">
      <li> https://start.spring.io adresine gidiyoruz. "Dependencies" kısmına Spring Web ekliyoruz. Buraya ekleyeceğimiz dosyaları sonradan pom.xml dosyamıza https://mvnrepository.com sitesinden istediğimiz kütüphanenin dependency kodlarını bularak ekleyebiliriz. Sonrasında "Group" ile şirket adımızı, "Artifact" ile projemizin adını veriyoruz. Java kısmı karşısında JDK sürümümüzü seçiyoruz.  GENERATE butonuna tıklayın ve inen dosyası RAR içinden çıkarın! </li><br>
      <li> Eclipse içinde File > Import kısmına tıklıyoruz! </li><br>
      <li> Import ekranımızda karşımıza gelen arama kutucuğuna "maven" yazıp "Existing Maven Projects" seçiyoruz. Bu şekilde var olan bir maven projesini projemize eklemeyi amaçlıyoruz! Next diyoruz!</li><br>
      <li> Bu ekranda "Browse" seçeneğine tıklıyoruz! İndirdiğimiz ve RAR'dan çıkardığımız dosyamıza girip karşımıza "src" klasörünü görünceye kadar ilerliyoruz. OK butonnuna basın ve Projects altında "pom.xml" kısmı görüyorsanız doğru bir şekilde ilerlediğiniz anlamına geliyor! </li><br>
      <li> Finish ile projemizi eklemiş oluyoruz!</li><br>
 </ol>
 
 <h2 id="spring-rest"> Spring Boot : Spring REST </h2>
  <p> Java ile Front-end(Angular, React, Vue, Mobil Uygulama) teknolojileriyle kullanıcıya buluşturulurken arka tarafta işin back-end teknolojisine Rest API denir. Burada Controller sınıfı Spring boot işlemlerinde @RestController sınıfımıza "Controller" özelliği kazandırır.</p>
  
 <h2 id="spring-katman"> Spring Boot : Katmanlı Mimari</h2>

<p> <b>Data Access:</b> Veri erişim katmanımızdır. Bu katmanda sadece ver erişim işlemleri yapılır. Temel JDBC, Spring Data, Hibernate kodları buraya yazılır.
İsimlendirmelerinde DAL veya DAO kısaltmaları kullanılır.

<b>Business:</b> İş kurallarının yazıldığı katmandır. Mesela ehliyet alacak biri direksiyon, sınavdan vs. gerekli notu almış mı diye kontrol ettiğimiz if'lerin olduğu katmandır.
İsimlendirmelerde Service ile kullanılır.

<b>UI:</b> Kullanıcı arayüzümüzdür. Burası Swing, Angular, Mobile ile kullanılır.

Tüm bu katmanlar birbiriyle Interface aracılığıyla haberleşir. Haberleşme Data Access ile Business ve Business ile UI arasında olur. Data Access ile UI arasında bir haberleşme olamaz çünkü kullanıcı yaptığı bir işlem direkt olarak veritabanına eklenmesi mümkün değildir. Kullanıcı UI ile yaptığı değişiklikleri Business katmanı sorgulamasını, uygunluğunu kontrol eder.</p>
<h3><i>Kurulum</i></h3>
<ol type="1">
      <li> Bu kısımda tarayıcı üzerinden projemizdeki ekleme, güncelleme, silme işlemleri için https://www.postman.com/downloads/ ekranından "Postman" uygulamasını indirmeniz gerekmektedir!</li><br>
      <li> "Port is already in use" hatası aldığınızda application.property dosyası içinden yaptığımız gibi port numarasını değiştirebilirsiniz! </li><br>
      <li> Postman uygulamamıza giriş yapıyoruz. File > New > HTTP Request içine giriyoruz. Yeni koleksiyon oluşturuyoruz ve "Request name" kısmına bir isim veriyoruz! </li><br>
      <li> <b>http://localhost:8082/api/cities</b> adresini GET ile yazıyoruz. Bu sayede tüm şehirlerimizi veritabanımızdan çekebiliyoruz. İsterseniz dosya formatını JSON olarak çekebilirsiniz! "Status: 200 OK" uyarısı işlemin başarıyla gerçekleştiğini gösterir! </li><br>
      <li> <b>http://localhost:8082/api/cities/4094</b> adresine yine GET içinde yazıp SEND butonuna tıklıyoruz! Görüldüğü gibi projemizdeki tek bir şehri alma fonksiyonumuz çalıştırıyor!</li><br>
      <li> <b>http://localhost:8082/api/add</b> linkini POST içinde yazdığımızda Body > row kısmına girip istediğimiz özelliklere sahip şehrimizi giriyoruz! ID kısmını vermiyoruz bu şekilde GeneratedValue özelliği sayesinde bize ID kısmı otomaotik şekilde üretiliyor!</li><br>
      <li> <b>http://localhost:8082/api/update</b> linkini yine POST içinde yazıyoruz ve bu sefer güncellemek istediğimiz şehrin ID'sini veriyoruz bu şekilde verilen ID'nin olduğu şehrin tüm özellikleri yeniden değiştiriliyor! </li><br>
      <li> Burada "Port is already in use" hatası aldığımızında portumuzu 8083'e taşıyoruz! http://localhost:8083/api/delete linkini POST içinde Body > raw içine JSON formatında yazıyoruz burada girdiğimiz ID'ye sahip şehir siliniyor!</li><br>
 </ol>

<p> Umarım Faydalı Olmuştur, Çok teşekkür ederim!</p>

<h2 id="sosyal"> Sosyal Medya Hesaplarım </h2>
<h4> <b> <a href="https://www.linkedin.com/in/ibrahimcanerdogan/"> LINKEDIN </a> </b> </h4>
<h4> <b> <a href="https://www.youtube.com/channel/UCevIikvuddEfPCBECo8UGLg"> YOUTUBE </a> </b> </h4>
<h4> <b> <a href="https://github.com/icanerdogan"> GITHUB </a> </b> </h4>
<h4> <b> <a href="https://icanerdogan.medium.com"> MEDIUM </a> </b> </h4>
