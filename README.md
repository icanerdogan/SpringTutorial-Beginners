<h1 align="center"> Spring Tutorial for Beginners </h1>
 
 <a href="https://github.com/icanerdogan"><img src="https://r.resimlink.com/oMpRqPTd.png"></img></a>
 
 <h2>File Directory</h2>
 <ul>
     <li><a href="#apache-tomcat"> Apache Tomcat</a></li>
     <li><a href="#apache-eclipse"> Apache Tomcat - Eclipse Bağlantısı</a></li>
     <li><a href="#spring"> Spring Paketlerinin İndirilmesi ve Projeye Entegrasyonu</a></li>
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
