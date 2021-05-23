<h1 align="center"> Spring Tutorial for Beginners </h1>
 <a href="https://github.com/icanerdogan"><img src="https://r.resimlink.com/oMpRqPTd.png"></img></a>
 
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
  <li>https://tomcat.apache.org sitesine gidin. Sol tarafta "Download" altındaki kısımında, son sürüme tıklayın.</li>
  <li>Çıkan ekranda işletim sisteminize ve sürümünüze en uygun seçeneği seçin ve indirme işlemi başlayacaktır. <br> <br> <img src="https://r.resimlink.com/MV0B.png"></img></li>
  <li> Uygulamamızın kurulumuna devam ederken, aşağıda görülen ekranda "Full" kurulumu seçmeyi unutmayın! <br> <br> <img src="https://r.resimlink.com/Ut9XFcL7.png"></img></li>
  <li> "Configuration" ekranında Port numaralarımızı aşağıdaki gibi veriyoruz. User Name alanına kullanıcı adımızı "admin" olarak, Password alanına şifremizi "12345" olarak belirliyoruz. <br> <br> <img src="https://r.resimlink.com/oxMtuYf.png"></img></li>
  <li> "Java Virtual Machine" ekranında gereken JDK dosyamızın dizinini veriyoruz. Burada JDK 11 sürümünü de kullanabilirsiniz! <br> <br> <img src="https://r.resimlink.com/WY6fN8o.png"></img></li>
  <li> Programımızın kurulacağı dosya dizinini de aşağıdaki gibi veriyoruz! <br> <br> <img src="https://r.resimlink.com/aE7Cw6K.png"></img></li>
  <li> Kurulum bittikten sonra "localhost:8080" adresine gittiğinizde karşınıza aşağıdaki web site çıkacktır. Karşınıza bu ekran geliyorsa kurulumunuz başarıyla tamamlanmıştır! <br> <br> <img src="https://r.resimlink.com/4DvUjx5y.png"></img></li>
 </ol> 
 
 <hr>
 
<h2 id="apache-eclipse"> Apache Tomcat - Eclipse Bağlantısı </h2>
  <h3><i>Kurulum</i></h3>
   <ol type="1">
  <li> Eclipse IDE Programımızı açıyoruz.</li>
  <li> File > New > Other kısmına tıklıyoruz! <br> <br> <img src="https://r.resimlink.com/ItvR.png"></img></li>
  <li> Karşımıza gelen ekranda "server" yazıp gelen "Server" seçeneğine tıklayıp, Next diyoruz! <br> <br> <img src="https://r.resimlink.com/8HKL.png"></img></li>
  <li> Tekrardan karşımıza çıkan ekranda arama kutucuğuna "apache" yazıyoruz ve son sürümünü (10) kurduğumuz için "Tomcat v10.0 Server" seceneğine tıklayıp Next diyoruz! <br> <br> <img src="https://r.resimlink.com/7VNvd3.png"></img></li>
  <li> Bu ekranda Tomcat'i bilgisayarımıza kurduğumuz dizini giriyoruz! <br> <br> <img src="https://r.resimlink.com/4WIGN.png"></img></li>
  <li> Finish ile kurulumu bitirebiliriz. </li>
  <li> Eğer Eclipse IDE uygulamanızda Alt barda "Servers" yok ise bunu aşağıdaki adımları izleyerek ekleyebilirsiniz. </li>
  <li> Window > Show View > Other kısmına tıklıyoruz! <br> <br> <img src="https://r.resimlink.com/qT9O.png"></img></li>
  <li> Buradan Server > Servers altında "Servers" seceneğine tıklayıp, Open butonuna basıyoruz! <br> <br> <img src="https://r.resimlink.com/Ii1KW.png"></img></li>
 </ol> 

<hr>

<h2 id="spring"> Spring Paketlerinin İndirilmesi ve Projeye Entegrasyonu </h2>
  <h3><i>Kurulum</i></h3>
  
  <ol type="1">
     <li> https://repo.spring.io/release/org/springframework/spring/ Bu adresten sayfanın en altından en güncel spring sürümünü seçiyoruz! <br> <br> <img src="https://i.hizliresim.com/t6hn4dv.PNG"> </li>
     <li> Tıkladığımızda karşımıza gelen ekranda "-dist.zip" isimli dosyayı indiriyoruz! <br> <br> <img src="https://i.hizliresim.com/nt8feu8.PNG"></img></li>
     <li> İndirilen dosyayı klasörden çıkarıldığında "libs" klasörü içindeki tüm jar dosyalarını kopyalıyoruz! <br> <br> <img src="https://i.hizliresim.com/g4pjc4n.PNG"></img></li>
     <li> Eclipse uygulamamızı açıp istediğiniz dizinde "springIntro" adından java projesi oluşturuyoruz. <br> <br> <img src="https://i.hizliresim.com/4ax2z8s.PNG"></img></li>
     <li> Projemize sağ tıklayıp New > Folder kısmına gidiyoruz! <br> <br> <img src="https://i.hizliresim.com/efra17w.png"></img></li>
     <li> Karşımıza gelen ekranda "libs" olarak belirlediğimiz dosyamızın adını giriyoruz! <br> <br> <img src="https://i.hizliresim.com/lg7q3m9.PNG"></img></li>
     <li> Tekrar projemize sağ tıklayıp en alt kısımda bulunan "Properties" alanına tıklıyoruz! <br> <br> <img src="https://i.hizliresim.com/sdas6ix.png"></img></li>
     <li> Karşımıza çıkan bu ekranda "Libraries" sekmesine gelip "Classpath"e bir kez tıklıyoruz. Yanda bulunan "Add JARs..." alanına tıklıyoruz! <br> <br> <img src="https://i.hizliresim.com/611cjuf.PNG"></img></li>
     <li> Gelen ekranda açtığımız "libs" klasörünü bulup tüm Jar dosyalarını seçiyoruz! (Shift ile ilk jar dosyasına tıklayıp ardından son jar dosyasına tıklarsanız tüm Jar dosyalarını tek seferde seçebilirsiniz!) <br> <br> <img src="https://i.hizliresim.com/a8vbuou.PNG"></img></li>
     <li> "OK" tuşuna bastıktan sonra "Apply and Close" ile ekranı kapatıp, projemizi başarıyla hazırlamış oluyoruz!</li>
 </ol> 
 
 <hr>
 
 <h2 id="hibernate"> Hibernate </h2>
 <p>Hibernate, veritabanınızdaki tablolar ile classlar ile eşleştirip, class üzerinden veritabanındaki nesneleri ilişkilendirerek "insert", "update", "delete" ve "select" yapabilmemizi sağlıyor.
JDBC ile yapılan tüm veritabanı sorgularını tamamen hibernate ile "generate" olarak yapılıyor.  </p>
  <h3><i>Kurulum</i></h3>
  
  <ol type="1">
     <li> https://hibernate.org/orm/releases/5.4/ adresine gidin ve görseldeki butona tıklayın! Açılan "SourceForge" penceresinde indirme otomatik olarak başlayacaktır. <br> <br> <img src="https://r.resimlink.com/igaIr.png"> </li>
     <li> Eğer bilgisayarınızda MySQL yoksa https://dev.mysql.com/downloads/windows/installer/8.0.html buradan indirmeniz, gerekiyor! Kurulum için detaylı bir kurulum videosu izlemenizi öneririm! <br> <br> <img src="https://r.resimlink.com/5ozsQ.png"> </li>
     <li> Eclipse IDE'mize gelip "hibernateDemo" adında proje oluşturduktan sonra projeye sağ tıklayıp New > Folder!a tıklıyoruz.<br> <br> <img src="https://r.resimlink.com/aYVEn7P.png"> </li>
     <li> "libs" adında bir klasör oluşturuyoruz! <br> <br> <img src="https://r.resimlink.com/X1WLiVs.png"> </li>
     <li> İndirdiğimiz hibernate klasörünü RAR'dan çıkardıktan sonra görseldeki uzantıya gidip JAR dosyalarnı kopyalıyoruz. Sonrasında projemizde oluşturduğumuz "libs" içine JAR dosyalarını yapıştırıyoruz! <br> <br> <img src="https://r.resimlink.com/uSPI.png"> </li>
     <li> https://disk.yandex.com.tr/d/O5rimXX5yG0Shw Burada bulunan MySQL bağlantı JAR dosyasını da "libs" klasörü içine atıyoruz.<br> <br> </li>
     <li> "libs" klasörü içinde bulunan dosyaları tanımlamak için, projemize sağ tıklayıp "properties" kısmına giriyoruz!<br> <br> <img src="https://r.resimlink.com/se3c1tgZ.png"> </li>
     <li> Çıkan ekranda gördüğünüz adımları takip ederek "ADD Jars..." butonuna tıklıyoruz. <br> <br> <img src="https://r.resimlink.com/5NYqzh.png"> </li>
     <li> Son olarak "hibernateDemo" içindeki JAR dosyalarını ekleyip, Apply ve sonrasına Apply&Close ile ekranı kapatıyoruz! <br> <br> <img src="https://r.resimlink.com/iFeBg4.png"> </li>
 </ol> 
 
 
 <h2 id="hibernateproje"> Hibernate Proje Entegrasyonu </h2>
  <h3><i>Kurulum</i></h3>
  <ol type="1">
      <li> https://disk.yandex.com.tr/d/Hv0ybf55Y8Mh-A adresine gidin! "hibernate.cfg.xml" dosyasını indirin. </li>
      <li> "src" dosyası içine indirdiğiniz dosyayı yapıştırın! </li>
      <li> Dosya içinde "connection.url" kısmını veritabanı adınıza göre veriryoruz, yine kullanıcı adınızı ve şifrenizi veritabanınıza göre verin! <br> <br> <img src="https://r.resimlink.com/ImMWv0.png"> </li>
 </ol>

<hr>

 <h2 id="maven"> Maven </h2>
 <p>Büyük projelerde birçok Jar dosyaları vs. birçok kütüphaneden yararlanıyoruz. Proje devam ettikçe bu paket sayısı artarken, paketlere gelen güncellemelerde takip edilmesi gerekiyor. </p>
 <ul>
 <li>Jar dosyaları yönetilebilir.</li>
 <li>Proje şablonları ile standart proje yönetimlerini yapabilirsiniz. </li>
 <li>Versiyon takip sistemi de sunuyor.</li>
 </ul>
 <p>Biz projemize birşey eklediğimizde veya istediğimizde bunu maven ile yapıyoruz. Bu durumda maven bizim diğer kütüphaneler ile haberleşmeyi sağlıyor.</p>
 <p>Hibernate, Spring gibi firmalar yaptıkları güncellemeleri Maven'a yükler, projeler de bu şekilde rahatlıkla güncellemeleri takip edebilir.</p>
  <h3 id="maven-kurulum"><i>Kurulum</i></h3>
  <ol type="1">
      <li> Öncelikle Help > Install New Software ile maven'ı projemize eklememiz gerekiyor! <br> <br> <img src="https://r.resimlink.com/G8ZkzcD.png"<li> </li>
      <li> Çıkan ekranda Work with kısmına 
http://download.eclipse.org/technology/m2e/releases/ bu linki ekliyoruz ve "Add" butonua basıyoruz. "Group items by category" tikini kaldırıyoruz ve ekranda gördüğünüz "m2e" paketlerine tik koyuyoruz! Next diyip kurulumunu bitiriyoruz. <br> <br> <img src="https://r.resimlink.com/OdYo.png"> </li>
      <li> Maven projesi oluşturmak için öncelikle File > New > Other'a tıklıyoruz!  <br> <br> <img src="https://r.resimlink.com/PKWLu.png"> </li>
      <li> Gelen ekranda arama kısmına "maven" yazıyoruz ve "Maven Poject" kısmında tıklıyoruz. Next butonuna tıklayıp devam ediyoruz. <br> <br> <img src="https://r.resimlink.com/Gh5g.png"> </li>
      <li> Bu ekranda çalışma alanımızı istiyorsanız değiştirebilirsiniz ancak genelde deafult olarak devam edilir! <br> <br> <img src="https://r.resimlink.com/CyWJVO.png"> </li>
      <li> Filter kısmında "maven-archetype-quickstart" yazıp alt tarafta işaretli olan paketi seçip Next diyip devam ediyoruz! <br> <br> <img src="https://r.resimlink.com/BCVTlKMv.png"> </li>
      <li> Bu ekranda "Group Id" şirketimizin adı, "Artifact Id" ise oluşturacağımız projenin adıdır. Örnek olarak aşağıdaki gibi oluşturup Finish ile projemizi tamamlıyoruz! <br> <br> <img src="https://r.resimlink.com/HCZ1gP5t.png"> </li>
      <li> Oluşturduğumuz dosya içinde <b>pom.xml</b> dosyasında görüldü yere "1." yazısından sonra kullandığımız JDK sürümünü yazıyoruz. Örnek olarak ben JDK 16 sürümünü kullanıyorum.<br> <br> <img src="https://r.resimlink.com/GiKBr.png"> </li>
      <li> Projemiz başarıyla oluşturuldu!</li>
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
      <li> https://start.spring.io adresine gidiyoruz. "Dependencies" kısmına Spring Web ekliyoruz. Buraya ekleyeceğimiz dosyaları sonradan pom.xml dosyamıza https://mvnrepository.com sitesinden istediğimiz kütüphanenin dependency kodlarını bularak ekleyebiliriz. Sonrasında "Group" ile şirket adımızı, "Artifact" ile projemizin adını veriyoruz. Java kısmı karşısında JDK sürümümüzü seçiyoruz.  GENERATE butonuna tıklayın ve inen dosyası RAR içinden çıkarın! <br> <br> <img src="https://r.resimlink.com/6b3LRPx.png"> </li>
      <li> Eclipse içinde File > Import kısmına tıklıyoruz! <br> <br> <img src="https://r.resimlink.com/YUhrmuqK.png"> </li>
      <li> Import ekranımızda karşımıza gelen arama kutucuğuna "maven" yazıp "Existing Maven Projects" seçiyoruz. Bu şekilde var olan bir maven projesini projemize eklemeyi amaçlıyoruz! Next diyoruz!<br> <br> <img src="https://r.resimlink.com/oF4DyeK.png"> </li>
      <li> Bu ekranda "Browse" seçeneğine tıklıyoruz! İndirdiğimiz ve RAR'dan çıkardığımız dosyamıza girip karşımıza "src" klasörünü görünceye kadar ilerliyoruz. OK butonnuna basın ve Projects altında "pom.xml" kısmı görüyorsanız doğru bir şekilde ilerlediğiniz anlamına geliyor! <br> <br> <img src="https://r.resimlink.com/0O74.png"> </li>
      <li> Finish ile projemizi eklemiş oluyoruz!</li>
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
      <li> Bu kısımda tarayıcı üzerinden projemizdeki ekleme, güncelleme, silme işlemleri için https://www.postman.com/downloads/ ekranından "Postman" uygulamasını indirmeniz gerekmektedir!</li>
      <li> "Port is already in use" hatası aldığınızda application.property dosyası içinden yaptığımız gibi port numarasını değiştirebilirsiniz! </li>
      <li> Postman uygulamamıza giriş yapıyoruz. File > New > HTTP Request içine giriyoruz. Yeni koleksiyon oluşturuyoruz ve "Request name" kısmına bir isim veriyoruz! </li>
      <li> <b>http://localhost:8082/api/cities</b> adresini GET ile yazıyoruz. Bu sayede tüm şehirlerimizi veritabanımızdan çekebiliyoruz. İsterseniz dosya formatını JSON olarak çekebilirsiniz! "Status: 200 OK" uyarısı işlemin başarıyla gerçekleştiğini gösterir! <br> <br> <img src="https://r.resimlink.com/39sb.png"> </li>
      <li> <b>http://localhost:8082/api/cities/4094</b> adresine yine GET içinde yazıp SEND butonuna tıklıyoruz! Görüldüğü gibi projemizdeki tek bir şehri alma fonksiyonumuz çalıştırıyor! <br> <br> <img src="https://r.resimlink.com/p86WQ.png"> </li>
      <li> <b>http://localhost:8082/api/add</b> linkini POST içinde yazdığımızda Body > row kısmına girip istediğimiz özelliklere sahip şehrimizi giriyoruz! ID kısmını vermiyoruz bu şekilde GeneratedValue özelliği sayesinde bize ID kısmı otomaotik şekilde üretiliyor! <br> <br> <img src="https://r.resimlink.com/P2NzcXhf.png"> </li>
      <li> <b>http://localhost:8082/api/update</b> linkini yine POST içinde yazıyoruz ve bu sefer güncellemek istediğimiz şehrin ID'sini veriyoruz bu şekilde verilen ID'nin olduğu şehrin tüm özellikleri yeniden değiştiriliyor!<br> <br> <img src="https://r.resimlink.com/2Ic7w8d.png"> </li>
      <li> Burada "Port is already in use" hatası aldığımızında portumuzu 8083'e taşıyoruz! http://localhost:8083/api/delete linkini POST içinde Body > raw içine JSON formatında yazıyoruz burada girdiğimiz ID'ye sahip şehir siliniyor!<br> <br> <img src="https://r.resimlink.com/1DfrGqZi.png"> </li>
 </ol>

<p> Umarım Faydalı Olmuştur, Çok teşekkür ederim!</p>

<h2 id="sosyal"> Sosyal Medya Hesaplarım </h2>
<h4> <b> <a href="https://www.linkedin.com/in/ibrahimcanerdogan/"> LINKEDIN </a> </b> </h4>
<h4> <b> <a href="https://www.youtube.com/channel/UCevIikvuddEfPCBECo8UGLg"> YOUTUBE </a> </b> </h4>
<h4> <b> <a href="https://github.com/icanerdogan"> GITHUB </a> </b> </h4>
<h4> <b> <a href="https://icanerdogan.medium.com"> MEDIUM </a> </b> </h4>
