# IBB Ecodation Java Core
https://www.youtube.com/watch?v=o_d5sjNeF34
https://github.com/hamitmizrak/ibb_ecodation_javacore/

# Git
git init
git add .
git commit -m "add message"
git push -u origin master

git clone  https://github.com/hamitmizrak/ibb_ecodation_javacore.git

# Java Common Rules ()
Class isimleri PascalCase göre yazılır
Class isimleri: Fiil olarak kullanmayız (mak-mek)
Class : Java 1 tane public class vardır (inner class hariç)
Class : Java static class yoktur (inner class hariç)

Paket isimleri: Küçük harflerle yazılır.
Paket isimleri: fiil olarak kullanmayız (mak-mek)
Paket kısa net bir şekilde olması gerekiyor.

Javada Her biten kelime ; ile bitirmek zorundayız.

# Java Core Information
Java case sensitive bir dildir. (Küçük büyük harfe duyarlı yüksek seviyede bir dildir.)

# Maven Nedir ?
Maven Nedir?
Maven, Java projelerini oluşturmak, yönetmek ve otomatikleştirmek için kullanılan bir build automation (inşa otomasyonu) aracıdır. Apache tarafından geliştirilmiştir ve özellikle Java projelerinde bağımlılık yönetimi, derleme, test etme ve dağıtım süreçlerini kolaylaştırır. Maven, XML tabanlı bir yapılandırma dosyası olan pom.xml kullanarak projenin yapılandırmasını ve bağımlılıklarını yönetir.

Maven’in Sağladıkları:

Bağımlılık Yönetimi: Projeye eklenmesi gereken kütüphaneleri otomatik olarak indirir.
Proje Yapılandırması: Projeyi standart bir yapıda düzenler.
Otomatik Derleme: Projeyi derler (mvn compile).
Test Çalıştırma: JUnit ve TestNG gibi test araçlarıyla testleri çalıştırır (mvn test).
Paketleme: Projeyi jar veya war formatında paketler (mvn package).
Dağıtım Yönetimi: Uygulamayı uzak sunuculara veya depolara gönderir (mvn deploy).

# pom.xml Nedir?
pom.xml (Project Object Model) dosyası, Maven projelerinin merkezi yapılandırma dosyasıdır. Projenin bağımlılıklarını, sürüm bilgilerini, eklentilerini ve yapılandırmalarını içerir.

Örnek bir pom.xml dosyası:

<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.7.4</version>
        </dependency>
    </dependencies>
</project>
Bu dosya:

Projenin kimliğini (groupId, artifactId, version)
Bağımlılıklarını (dependencies)
Yapılandırmalarını içerir.

# JDK Nedir ? JDK (Java Development Kit) Nedir?
JDK (Java Development Kit), Java ile uygulama geliştirmek için kullanılan geliştirme ortamıdır. İçerisinde:

JRE (Java Runtime Environment) (Çalışma zamanı ortamı)
JVM (Java Virtual Machine) (Java Sanal Makinesi)
Java Compiler (javac) (Java derleyicisi)
Java Debugger (jdb) (Hata ayıklayıcı)
Java API ve kütüphaneleri bulunur.
JDK olmadan Java kodu yazılamaz ve çalıştırılamaz.

# JRE Nedir ?JRE (Java Runtime Environment) Nedir?
JRE (Java Runtime Environment), Java uygulamalarını çalıştırmak için gereken ortamdır. İçerisinde:

JVM (Java Virtual Machine) bulunur.
Java Kütüphaneleri içerir.
Çalışma zamanı dosyaları bulunur.
Eğer sadece Java programlarını çalıştırmak istiyorsanız, JDK yerine sadece 
JRE yükleyebilirsiniz. Ancak, JRE Java kodu yazmak veya derlemek için 
yeterli değildir.

# JVM (Java Virtual Machine) Nedir?
JVM (Java Virtual Machine), Java programlarını çalıştıran sanal bir makinedir. JVM sayesinde Java platform bağımsızdır çünkü Java kodu her işletim sisteminde çalışabilecek bayt koduna (.class dosyalarına) çevrilir.

JVM’in Görevleri:

Bayt kodunu çalıştırır.
Bellek yönetimini yapar (Garbage Collection).
Çoklu iş parçacığını (multithreading) destekler.
Platform bağımsızlığı sağlar.

# Compiler Nedir ?
Compiler (Derleyici) Nedir?
Compiler (Derleyici), insan tarafından yazılan yüksek seviyeli programlama dillerini makine koduna veya bayt koduna dönüştüren bir programdır. Java’da derleyici javac olarak adlandırılır.

Java'da Çalışma Süreci:

Java kodu yazılır: MyClass.java
Derleyici (javac) çalıştırılır: javac MyClass.java
Bayt kodu (.class dosyası) oluşturulur: MyClass.class
JVM bayt kodunu çalıştırır.

# Intepreter Nedir ?
Interpreter (Yorumlayıcı) Nedir?
Interpreter (Yorumlayıcı), programın satır satır çalıştırılmasını sağlayan bir programdır. Java’da JVM içerisinde yer alan yorumlayıcı (interpreter), bayt kodlarını satır satır çalıştırır.

Derleyici (Compiler) vs. Yorumlayıcı (Interpreter):

Derleyici: Tüm kodu derleyerek tek seferde çalıştırılabilir hale getirir.
Yorumlayıcı: Kodu satır satır çalıştırır.
Java hem derleyici (javac) hem de yorumlayıcı (JVM içinde) kullanır.

# Java Nedir?
Java, nesne yönelimli (OOP), platform bağımsız, güvenli, çok iş parçacıklı (multithreading) ve taşınabilir bir programlama dilidir.

1995’te Sun Microsystems tarafından geliştirildi.
"Bir kere yaz, her yerde çalıştır" (Write Once, Run Anywhere - WORA) prensibiyle çalışır.
Mobil, web, masaüstü ve büyük ölçekli sistemlerde kullanılır.

# Java’nın Özellikleri Nelerdir?
Platform Bağımsızdır. (JVM sayesinde her yerde çalışır)
Nesne Yönelimli Programlama (OOP) Desteği vardır.
Güvenlidir. (Bellek yönetimi ve güvenlik mekanizmaları içerir)
Çok İş Parçacıklı (Multithreading) çalışmayı destekler.
Otomatik Bellek Yönetimi (Garbage Collection) yapar.
Dağıtık ve Ağ Tabanlı Uygulamaları Destekler.

# Data Types (Veri Tipleri) Nedir?
Java'da değişkenlerin alabileceği veri türlerini ifade eder. İki ana kategoriye ayrılır:

Primitive Types (İlkel Veri Tipleri)
Reference Types (Referans Tipleri)

# Primitive Types Nedir?
Java'daki ilkel veri tipleri (Primitive Types) hafızada doğrudan değer saklayan basit veri türleridir.

Veri Tipi	Boyut	Varsayılan Değer	Aralık
byte	1B	0	-128 to 127
short	2B	0	-32,768 to 32,767
int	4B	0	-2^31 to 2^31-1
long	8B	0L	-2^63 to 2^63-1
float	4B	0.0f	~7 basamak
double	8B	0.0d	~15 basamak
char	2B	'\u0000'	Unicode karakterler
boolean	1B	false	true veya false

#  Wrapper Types Nedir?
Wrapper Class’lar, primitive veri tiplerinin nesne olarak kullanılmasını sağlar.

Örneğin:

int num = 10;
Integer obj = Integer.valueOf(num);
Primitive -> Wrapper Dönüşümleri:

int -> Integer
double -> Double
char -> Character
boolean -> Boolean
Wrapper class’lar Java Collections API’lerinde kullanılır çünkü koleksiyonlar 
yalnızca nesne saklayabilir.

# Java Core (Primitive Types)
javac (Java Compiler) ve bayt kodu (bytecode) süreci, derleme süresi ve 
oluşturulan .class dosyasının boyutunu etkileyebilir. Aşağıda bunun nasıl gerçekleştiğine dair detaylı bir açıklama bulabilirsiniz.

# 1. javac Derleyici ve Derleme Süresi
Derleme Süresini Etkileyen Faktörler
Kodun Karmaşıklığı:

Daha fazla sınıf, metod ve kod satırı içeren projeler daha uzun sürede derlenir.
Büyük projelerde, bağımlılıklar ve import edilen kütüphaneler derleme süresini uzatabilir.
Optimize Edilmiş Derleme (javac Seçenekleri):

Incremental Compilation (Artımlı Derleme):
Eğer sadece değişiklik yapılan sınıflar derlenirse, javac süresi kısalır.
Hata Ayıklama Seçenekleri (-g:none):
javac -g:none komutu hata ayıklama bilgilerini içermeyen bir bytecode oluşturur ve derleme süresini kısaltabilir.
Çoklu İş Parçacığı (Multithreading) Kullanımı:
Büyük projelerde Gradle gibi derleme sistemleri çoklu iş parçacığı desteği sağlar, böylece derleme süresi azalır.
Donanım ve JVM Yapılandırması:

Daha hızlı CPU ve SSD kullanan sistemlerde derleme süresi düşer.
Yetersiz RAM veya düşük işlem gücü derleme süresini artırır.
# 2. Bayt Kodu (Bytecode) ve Dosya Boyutu
   Bytecode, javac tarafından üretilen platformdan bağımsız bir ara koddur ve .class dosyalarında saklanır.

Bytecode Boyutunu Etkileyen Faktörler
Kodun İçeriği ve Karmaşıklığı:

Uzun metotlar, fazla satır kod ve daha fazla class tanımlaması dosya boyutunu artırır.
Yerel Değişkenler ve Sabit Havuzu (Constant Pool):

Java’nın String Constant Pool ve diğer sabit değişkenleri yönetme mekanizması, fazla sayıda string veya sabit tanımı içeren kodlarda .class dosyasının boyutunu artırabilir.
Kullanılan Optimizasyonlar:

JVM Optimizasyonları:
JVM, bayt kodunu çalıştırırken Just-In-Time (JIT) Compiler gibi tekniklerle optimizasyon yapar.
Inline Kod Kullanımı:
final ve static değişkenlerin derleme zamanında yerine konulması, bytecode boyutunu artırabilir.
Lombok, Annotation Processing ve Kütüphaneler:

Lombok, Spring gibi kütüphaneler otomatik kod üretme (code generation) yapıyorsa, .class dosya boyutunu artırabilir.
Annotation Processing, derleme zamanında ek kodlar üreterek dosya boyutunu büyütebilir.
Obfuscation (Kod Gizleme) ve Minifikasyon:

Eğer kod ProGuard veya R8 gibi optimizasyon araçlarıyla küçültülürse, bytecode dosya boyutu azalır.
Android projelerinde R8 ve ProGuard kullanımı, bytecode boyutunu küçültmek için yaygın bir tekniktir.
# 3. Örnek Bir Kodun Derleme Süresi ve Bytecode Boyutu Üzerindeki Etkisi
   Aşağıdaki iki kodu karşılaştıralım:

# Kod 1 – Basit Java Kodu
public class SimpleClass {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
Derleme Süresi: Çok kısa (~milisaniyeler)
Bytecode Boyutu: Küçük (~1-2 KB)

# Kod 2 – Daha Büyük ve Karmaşık Kod
import java.util.ArrayList;

public class ComplexClass {
public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();
for (int i = 0; i < 100000; i++) {
numbers.add(i);
}
System.out.println(numbers.size());
}
}
Derleme Süresi: Daha uzun (~milisaniyeler ile saniyeler arasında)
Bytecode Boyutu: Daha büyük (~10-20 KB)
# 4. Sonuç
   Kodun karmaşıklığı ve kullanılan yapılar hem derleme süresini hem de bayt kodunun boyutunu etkiler.
   Optimize edilmiş derleme (javac -g:none, ProGuard gibi araçlar) bytecode boyutunu azaltabilir.
   Büyük projelerde derleme süresi donanıma ve çoklu iş parçacığı desteğine bağlı olarak değişebilir.
   Fazla sayıda sınıf, uzun metotlar ve büyük sabit havuzu derleme süresini ve bytecode boyutunu artırır.
   Özet: Daha fazla kod satırı, büyük sınıflar, fazladan kütüphane kullanımı ve karmaşık yapıların kullanımı hem derleme süresini uzatır hem de .class dosyalarının boyutunu artırır.

# Java Common Rules
Java Değişken İsimlendirme Kuralları ve En İyi Uygulamalar
Java'da değişken isimlendirme kuralları sözdizimsel (syntax) kurallar ve en iyi uygulamalar (best practices) olarak ikiye ayrılır. Sözdizim kurallarına uyulmazsa derleme hatası alınır, en iyi uygulamalara uyulmaması ise okunabilirliği ve bakımı zorlaştırır.
# 1. Java'da Değişken İsimlendirme Kuralları (Syntax Kuralları)
   Java'da değişken isimlendirme aşağıdaki zorunlu kurallara tabidir:

✅ Geçerli Değişken İsimlendirme Kuralları
Alfabede yer alan harfler (a-z, A-Z) kullanılabilir.
Rakamlar (0-9) kullanılabilir, ancak değişken ismi rakamla başlayamaz.
Alt çizgi _ ve dolar işareti $ kullanılabilir.
Java anahtar kelimeleri (reserved words) değişken adı olarak kullanılamaz.
Örneğin, int, class, static, for, if gibi kelimeler değişken adı olamaz.
❌ Geçersiz Değişken İsimlendirme Örnekleri
Geçersiz Değişken	Hata Nedeni
1number	Rakamla başlayamaz
int	Java anahtar kelimesidir
first-name	- işareti kullanılamaz
@value	@ özel karakteri kullanılamaz
my variable	Boşluk içeremez
# 2. Java Değişken İsimlendirme En İyi Uygulamaları (Best Practices)
   Geçerli değişken adları derleme hatası vermez, ancak bazı yazım standartlarına uyulması okunabilirliği artırır. En iyi uygulamalar şunlardır:

✅ 1. Camel Case Kullanımı (Önerilir)
Java'da değişkenler için camelCase kullanılır:

İlk kelime küçük harfle başlar, sonraki kelimeler büyük harfle başlar.
Örnek:

int studentAge;
double accountBalance;
String firstName;
boolean isActive;
✅ 2. Anlamlı ve Açıklayıcı İsimler Seçin
Kısa ve anlamsız değişken adlarından kaçının.
Değişkenin ne yaptığını veya hangi veriyi sakladığını anlatan isimler kullanın.
❌ Kötü Örnek:

int x;
double y;
✅ İyi Örnek:

int studentCount;
double totalSalary;
✅ 3. Değişken Adları Küçük Harfle Başlamalıdır
Java'da değişkenler küçük harfle başlar, ardından gelen kelimeler büyük harfle devam eder.
❌ Kötü Örnek:

int StudentCount;
✅ İyi Örnek:

int studentCount;
✅ 4. Sabit Değerler (Constants) İçin UPPER_CASE Kullanılmalı
final değişkenler büyük harf ve alt çizgi (_) ile yazılmalıdır.
✅ İyi Örnek (Sabitler için):

final double PI = 3.14159;
final int MAX_USERS = 100;
✅ 5. Boşluk ve Özel Karakterler Kullanılmamalıdır
Değişken isimlerinde boşluk (space) veya özel karakterler (@, #, !, -, %) kullanılamaz.

❌ Geçersiz:

int my variable;
String first-name;
✅ Geçerli:

int myVariable;
String firstName;
✅ 6. _ ve $ Kullanımı (Genellikle Önerilmez)
_ ve $ kullanılabilir, ancak genellikle değişken isimlerinde kullanılmaz.
Özel durumlar:
_ genellikle sabit değerlerde (final static) kullanılır.
$ genellikle otomatik üretilen kodlarda kullanılır (örneğin, Java'nın iç mekanizmalarında).
✅ Geçerli:

String _privateVar;  // Genellikle kaçınılır
String $generatedCode;  // Kullanılabilir ama önerilmez
3. Özet
   Kural	Örnek (✅ Doğru)	Örnek (❌ Yanlış)
   Harf, rakam, _, $ kullanılabilir	age, userName, account_balance	user-name, 1stName, my var
   Rakamla başlayamaz	name1	1name
   Anahtar kelimeler kullanılamaz	totalAmount	class, int
   Camel case kullanılmalı	studentCount	Studentcount, student_count
   Sabit değişkenler büyük harfle yazılmalı	MAX_USERS, PI	MaxUsers, piValue
   Boşluk içeremez	fullName	full name
4. Örnek Kullanımlar
   ✅ İyi Uygulama Örnekleri
   public class NamingExample {
   public static void main(String[] args) {
   int studentCount = 25;
   double accountBalance = 1050.75;
   final double PI = 3.14159;
   boolean isAvailable = true;

        System.out.println("Student Count: " + studentCount);
        System.out.println("Account Balance: $" + accountBalance);
        System.out.println("PI: " + PI);
        System.out.println("Available: " + isAvailable);
   }
   }
   Sonuç
   Java değişken isimlendirme kurallarına uymak kodun okunabilirliğini, bakımını ve standartlarını artırır.
   Camel Case kullanımı önerilir: myVariable
   Sabitler (final) büyük harfle yazılır: MAX_VALUE
   Değişken isimleri anlamlı olmalı: userName, totalAmount
   Java anahtar kelimeleri değişken adı olarak kullanılamaz.
   Bu kurallara uymak, kodunuzu daha anlaşılır, düzenli ve sürdürülebilir hale getirecektir. 🚀

Primitive Types
Java'da Primitive Type (İlkel Veri Tipleri) - Detaylı Açıklama
Java'da Primitive Types (İlkel Veri Tipleri), temel ve hafif veri tipleridir. Java'nın hafıza yönetimi, hızlı işlem yapabilme ve düşük bellek tüketimi sağlaması için kullanılırlar. Primitive türler, doğrudan bellekte saklanır ve nesne (Object) değildirler.

Java’da 8 adet primitive type vardır:

Tam sayı tipleri: byte, short, int, long
Ondalıklı sayılar: float, double
Karakter tipi: char
Mantıksal tip: boolean
1. Java'da Primitive Veri Tiplerinin Genel Özellikleri
   Nesne Değildir:

Primitive değişkenler doğrudan bellekte saklanır.
Integer, Double gibi Wrapper Class’lar nesne iken, int, double gibi primitive türler nesne değildir.
Daha Verimlidir:

Nesne yerine doğrudan hafızada saklandıkları için işlemler daha hızlı gerçekleştirilir.
Örneğin, int yerine Integer kullanılırsa heap bellekte fazladan bir nesne oluşur.
Varsayılan Değerleri Vardır:

Primitive değişkenler başlangıç değerleriyle başlar (örneğin int için 0, boolean için false).
Değer Tutarlar, Referans Değil:

Primitive türler değer bazlıdır, yani doğrudan değişkenin içinde tutulur.
int x = 10; yazıldığında, x değişkeninin içinde 10 değeri saklanır.
2. Java Primitive Veri Tipleri
   Aşağıda Java'nın 8 primitive veri tipi detaylı bir şekilde açıklanmaktadır.

A. Tam Sayı Türleri (Integer Types)
Bu veri tipleri ondalıklı olmayan sayıları saklamak için kullanılır.

Tip	Boyut	Aralık	Varsayılan Değer
byte	1 byte	-128 to 127	0
short	2 byte	-32,768 to 32,767	0
int	4 byte	-2³¹ to (2³¹-1)	0
long	8 byte	-2⁶³ to (2⁶³-1)	0L
1. byte (1 Byte - Küçük Tam Sayılar)
   Bellek tasarrufu sağlamak için kullanılır.
   Sık kullanılan küçük değerler için uygundur.
   Örneğin 100 kişilik öğrenci listesi tutarken kullanışlıdır.
   byte smallNumber = 100;
   byte minByte = -128;
   byte maxByte = 127;
2. short (2 Byte - Orta Büyüklükte Tam Sayılar)
   byte'tan büyük, int'ten küçük değerler için kullanılır.
   Bellek kullanımını optimize etmek için uygundur.
   short shortNumber = 32000;
   short minShort = -32768;
   short maxShort = 32767;
3. int (4 Byte - Standart Tam Sayılar)
   Java'da en çok kullanılan tam sayı tipidir.
   Varsayılan olarak tamsayı değerleri int türündedir.
   int myAge = 25;
   int totalUsers = 500000;
   int minInt = -2147483648;
   int maxInt = 2147483647;
4. long (8 Byte - Büyük Tam Sayılar)
   Büyük sayılar için kullanılır.
   Sayının sonuna L harfi eklenmelidir (long number = 10000000000L;).
   long population = 7800000000L; // Dünya nüfusu
   long distanceToSun = 149600000000L; // Güneşe olan mesafe (km)
   B. Ondalıklı Sayılar (Floating Point Types)
   Ondalıklı sayılar için kullanılan kayan nokta tipleridir.

Tip	Boyut	Yaklaşık Hassasiyet	Varsayılan Değer
float	4 byte	~7 basamak	0.0f
double	8 byte	~15 basamak	0.0d
1. float (4 Byte - Daha Az Hassas)
   Daha az yer kaplar ama kesinlik kaybı olabilir.
   Sayının sonuna f eklenmelidir (float pi = 3.14f;).
   float pi = 3.14159f;
   float gravity = 9.81f;
2. double (8 Byte - Daha Hassas)
   Hassas matematiksel işlemler için kullanılır.
   Varsayılan ondalıklı veri tipidir.
   double precisePi = 3.141592653589793;
   double speedOfLight = 299792458.0;
   C. char (Karakter Tipi)
   Tek bir karakter saklar.
   Unicode destekler, yani her dili ve sembolü içerebilir.
   char letter = 'A';
   char digit = '5';
   char symbol = '@';
   char smiley = '\u263A'; // ☺ Unicode karakter
   D. boolean (Mantıksal Veri Tipi)
   İki olası değer alır: true veya false
   Kontrol yapılarında (if, while, for) yaygın kullanılır.
   boolean isJavaFun = true;
   boolean isRaining = false;
3. Primitive Türler İçin Varsayılan Değerler
   Java'da bir primitive değişken başlangıç değeri atanmazsa, şu varsayılan değerleri alır:

Veri Tipi	Varsayılan Değer
byte	0
short	0
int	0
long	0L
float	0.0f
double	0.0d
char	'\u0000' (Boş karakter)
boolean	false
4. Primitive ve Wrapper Class Arasındaki Fark
   Java, primitive türlerin nesne olarak kullanılmasını sağlayan Wrapper Class’ları içerir.

Primitive Type	Wrapper Class
byte	Byte
short	Short
int	Integer
long	Long
float	Float
double	Double
char	Character
boolean	Boolean
Örneğin:

int x = 10;
Integer y = Integer.valueOf(x); // Primitive -> Wrapper (Boxing)
int z = y.intValue(); // Wrapper -> Primitive (Unboxing)
Primitive type - Wrapper Type
Java'da primitive types (ilkel türler) ve wrapper types (sarmalayıcı türler) arasındaki farkları detaylı bir şekilde inceleyelim.

1. Primitive Type ve Wrapper Type Nedir?
   Primitive Types: Java'daki en temel veri türleridir. Bellekte doğrudan değerleri saklarlar ve hafıza açısından daha verimli çalışırlar.
   Wrapper Types: Primitive türlerin nesne (object) olarak kullanılabilmesini sağlayan Java sınıflarıdır. Java'da koleksiyonlar (List, Set, Map gibi) nesnelerle çalıştığından, primitive türlerin nesne versiyonları (wrapper types) kullanılır.
2. Primitive Types ve Wrapper Types Karşılaştırması
   Özellik	Primitive Types	Wrapper Types
   Tanım	Doğrudan değeri saklayan türlerdir.	Primitive türleri sarmalayan sınıflardır.
   Hafıza Kullanımı	Daha az bellek kullanır, daha verimlidir.	Daha fazla bellek tüketir (ekstra nesne oluşturur).
   Depolama	Stack bellekte saklanır.	Heap bellekte saklanır (Nesne olarak oluşturulduğu için).
   Değer Tipi	Değer (value) tipindedir.	Referans (object) tipindedir.
   Null Olabilir mi?	Hayır (null olamaz).	Evet (null olabilir).
   Varsayılan Değer	int → 0, double → 0.0, boolean → false vb.	null (eğer nesne oluşturulmamışsa).
   Nesne Davranışı	Nesne değildir, direkt hesaplama yapar.	Nesnedir, metodları vardır.
   Koleksiyonlarda Kullanım	Doğrudan kullanılamaz (List gibi bir şey yazamayız).	Kullanılabilir (List mümkündür).
   Dönüştürme İşlemi	Boxing & Unboxing gerektirir.	Boxing & Unboxing ile primitive türlere dönüşebilir.
3. Primitive Türler ve Karşılık Gelen Wrapper Türler
   Primitive Type	Wrapper Class
   byte	Byte
   short	Short
   int	Integer
   long	Long
   float	Float
   double	Double
   char	Character
   boolean	Boolean
4. Örneklerle Açıklamalar
   4.1 Primitive Type Kullanımı
   public class PrimitiveExample {
   public static void main(String[] args) {
   int x = 10;
   double y = 20.5;
   boolean isJavaFun = true;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Java eğlenceli mi? " + isJavaFun);
   }
   }
   📌 Burada x, y ve isJavaFun değişkenleri doğrudan bellekte saklanır, nesne oluşturulmaz.

4.2 Wrapper Type Kullanımı
public class WrapperExample {
public static void main(String[] args) {
Integer x = Integer.valueOf(10);
Double y = Double.valueOf(20.5);
Boolean isJavaFun = Boolean.TRUE; // veya new Boolean(true) (Eski kullanım)

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Java eğlenceli mi? " + isJavaFun);
    }
}
📌 Burada x, y ve isJavaFun nesne olarak saklanır, heap bellekte yer kaplar.

5. Autoboxing ve Unboxing (Primitive ile Wrapper Arasındaki Dönüşüm)
   Java 5 ile gelen Autoboxing ve Unboxing, primitive ve wrapper türleri arasında otomatik dönüşüm yapılmasını sağlar.

5.1 Autoboxing (Primitive → Wrapper)
Primitive türler, otomatik olarak wrapper nesnelere dönüşür.

public class AutoboxingExample {
public static void main(String[] args) {
int primitiveValue = 100;
Integer wrapperValue = primitiveValue; // Autoboxing

        System.out.println("Wrapper Integer: " + wrapperValue);
    }
}
Bu kod, Integer wrapperValue = Integer.valueOf(primitiveValue); ile aynıdır.

5.2 Unboxing (Wrapper → Primitive)
Wrapper türler, otomatik olarak primitive değerlere dönüşür.

public class UnboxingExample {
public static void main(String[] args) {
Integer wrapperValue = 200;
int primitiveValue = wrapperValue; // Unboxing

        System.out.println("Primitive int: " + primitiveValue);
    }
}
Bu kod, int primitiveValue = wrapperValue.intValue(); ile aynıdır.

6. Primitive Type vs. Wrapper Type Kullanım Senaryoları
   Senaryo	Primitive Kullanımı	Wrapper Kullanımı
   Hız & Performans Önemli	✅ Daha hızlı	❌ Yavaş
   Bellek Verimliliği	✅ Az bellek kullanır	❌ Fazla bellek harcar
   Koleksiyonlarda Kullanım (List, Set, Map)	❌ Kullanılamaz	✅ Kullanılabilir
   Null Değer Atama	❌ Mümkün değil	✅ Mümkün
   Nesne Yönelimli Programlama Gerekirse	❌ Uygun değil	✅ Nesne olarak kullanılabilir
   Metodlarla Çalışma	❌ Metod içermez	✅ Integer.parseInt(), Double.valueOf() gibi metodlar kullanılabilir
7. Ne Zaman Hangi Tür Kullanılmalı?
   Performans kritikse ve koleksiyonlarla çalışılmıyorsa → Primitive types kullanılmalı.
   Koleksiyonlar (List, Map, Set) veya nesne yönelimli bir yapı gerekiyorsa → Wrapper types kullanılmalı.
   Null değerler gerekliliği varsa → Wrapper types tercih edilmeli.
   Hesaplamalar yapılıyorsa → Primitive types daha hızlı ve verimli çalışır.
8. Sonuç
   Konu	Primitive Type	Wrapper Type
   Hafıza Kullanımı	Az bellek harcar	Daha fazla bellek tüketir
   Hız	Daha hızlıdır	Daha yavaştır
   Null Olabilir mi?	❌ Hayır	✅ Evet
   Nesne mi?	❌ Hayır	✅ Evet
   Koleksiyonlarda Kullanılabilir mi?	❌ Hayır	✅ Evet
   📌 Özetle, performans gereken durumlarda primitive types kullanılır, nesne yönelimli işlemler ve koleksiyonlar için wrapper types gereklidir.

💡 Soru: List<int> list = new ArrayList<>(); neden hatalıdır? 📌 Çünkü primitive types koleksiyonlarda kullanılamaz. List<Integer> list = new ArrayList<>(); şeklinde wrapper type kullanmalıyız.

Bu detaylı açıklamalar, primitive ve wrapper türleri arasındaki farkları net bir şekilde anlamanıza yardımcı olacaktır! 🚀

Sonuç
Primitive türler doğrudan bellekte saklanır, nesne değildir.
Daha hızlıdır ve daha az bellek tüketir.
8 temel tür vardır: byte, short, int, long, float, double, char, boolean.
Matematik işlemleri ve kontrollerde en verimli yöntemleri sunar.
Primitive türler Java'nın temelini oluşturur ve performans açısından büyük avantaj sağlar! 🚀

Wrapper new kullanımı()
Eğer wrapper sınıflarını new anahtar kelimesiyle oluşturmak istiyorsak, her bir primitive türünün wrapper sınıfını kullanarak aşağıdaki gibi yazabiliriz:

public class WrapperExample {
public static void main(String[] args) {
Byte wrapperTypeByte = new Byte((byte) 127);
wrapperTypeByte = null; // Wrapper sınıflar null alabilir
System.out.println(wrapperTypeByte);

        Short wrapperTypeShort = new Short((short) 32767);
        Integer wrapperTypeInt = new Integer(2147483647);
        Long wrapperTypeLong = new Long(9223372036854775807L);

        Float wrapperTypeFloat = new Float(14.23f);
        Double wrapperTypeDouble = new Double(14.23);

        Boolean wrapperTypeBoolean = new Boolean(true);
        Character wrapperTypeChar = new Character('a');

        System.out.println("Short: " + wrapperTypeShort);
        System.out.println("Integer: " + wrapperTypeInt);
        System.out.println("Long: " + wrapperTypeLong);
        System.out.println("Float: " + wrapperTypeFloat);
        System.out.println("Double: " + wrapperTypeDouble);
        System.out.println("Boolean: " + wrapperTypeBoolean);
        System.out.println("Character: " + wrapperTypeChar);
    }
}
Önemli Notlar
Java 9 ve Sonrasında new Kullanımı Önerilmez

Java 9'dan itibaren new Byte(), new Integer() gibi kullanımlar depreceated (kullanım dışı) olarak işaretlenmiştir.
Bunun yerine doğrudan atama yapılmalıdır:
Byte wrapperTypeByte = 127;  // Önerilen kullanım
Çünkü: Java autoboxing mekanizması sayesinde new kullanmadan da bu türleri otomatik olarak wrapper class'lara çevirebilir.
Performans ve Bellek Yönetimi

new kullanımı gereksiz nesne oluşturduğu için heap belleği gereksiz yere doldurur.
Örneğin:
Integer a = 100;  // Autoboxing (Önerilen kullanım)
Integer b = new Integer(100); // Heap bellekte yeni nesne oluşturur
new Integer(100) kullanırsanız heap’te yeni bir nesne oluşturulur ve gereksiz hafıza tüketilir.
Sonuç
Eğer eski sürümlerle çalışmıyorsanız ve özel bir nedeniniz yoksa, new kullanmadan autoboxing yöntemini tercih etmelisiniz.
Java 9+ ile çalışıyorsanız, new kullanmaktan kaçının ve doğrudan atamaları kullanın. 🚀
Stack Memory(Primitive) Heap Memory Memory()
Java'da Primitive Stack Hafıza ve Wrapper Heap Hafıza Arasındaki Farklar
Java'da primitive veri tipleri (int, double, boolean, char, float, long, short, byte) ve wrapper sınıfları (Integer, Double, Boolean, Character, Float, Long, Short, Byte) bellek yönetimi açısından farklı yerlerde saklanır. Bu iki veri tipi arasındaki en büyük fark, stack ve heap bellek yönetimi ile ilgilidir. Şimdi bu farkları çok detaylı şekilde inceleyelim.

1. Stack ve Heap Hafızasının Tanımı
   Java bellek yönetiminde iki temel bölge vardır:

Stack (Yığın Hafıza): Küçük, hızlı ve yönetimi kolaydır. Primitive veri tipleri burada saklanır.
Heap (Yığın Hafıza): Daha büyük, daha yavaş ama esnek bir yapıya sahiptir. Wrapper sınıfları (nesne olarak kullanılan veriler) burada saklanır.
2. Stack ve Heap Hafızasının Karşılaştırılması
   Özellik	Stack (Yığın Hafıza)	Heap (Yığın Hafıza)
   Saklanan Veri Tipleri	Primitive değişkenler (int, double, char)	Nesneler ve Wrapper sınıfları (Integer, Double, Character)
   Bellek Yönetimi	LIFO (Last In First Out – Son giren, ilk çıkar)	Garbage Collector tarafından yönetilir
   Hız	Çok hızlı	Görece daha yavaş
   Erişim Süresi	Stack değişkenlerine erişim daha hızlıdır	Heap değişkenlerine erişim daha yavaştır
   Ömür	Bir metodun çalışma süresi boyunca var olur	Program çalıştığı sürece var olabilir
   Bellek Alanı	Küçüktür	Daha büyüktür
   Çoklu Thread Kullanımı	Thread'e özeldir (Her thread'in kendi stack’i vardır)	Heap bellek tüm thread’ler tarafından paylaşılır
   Otomatik Temizleme	Otomatik temizlenir, Garbage Collector çalışmasına gerek yoktur	Garbage Collector tarafından yönetilir, bellek temizliği gerektiğinde yapılır
3. Primitive ve Wrapper Arasındaki Bellek Kullanım Farkı
   A) Primitive Veri Tipleri (Stack)
   Primitive veri tipleri hafızada doğrudan değer olarak saklanır. Örneğin:

int x = 10;
x değişkeni stack hafızada saklanır.
Stack, değişkenleri hızlı bir şekilde yönetir ve fonksiyon bittiğinde otomatik olarak temizler.
Stack'teki bellek organizasyonu şu şekildedir:

Stack Memory:
+----------------------+
| int x = 10          |
+----------------------+
B) Wrapper Sınıfları (Heap)
Eğer primitive yerine bir wrapper class (nesne) kullanırsak:

Integer y = new Integer(10);
Bu durumda, bellek yapısı şu şekilde olur:

y değişkeni stack içinde bir referans olarak saklanır.
new Integer(10) ifadesiyle oluşturulan nesne heap hafızada saklanır.
Heap’te saklanan nesneye erişmek için stack’te bir referans (adres) tutulur.
Stack Memory:
+----------------------+
| Integer y (ref: 0xA) |
+----------------------+

Heap Memory:
+----------------------+
| [Integer: 10] (0xA) |
+----------------------+
Yani, primitive bir değişken doğrudan değeri içerirken, wrapper class'lar referansları saklar ve asıl veri heap içinde tutulur.

4. Detaylı Örnek: Stack ve Heap Karşılaştırması
   Şimdi stack ve heap farkını anlamak için aşağıdaki kodu inceleyelim:

public class MemoryTest {
public static void main(String[] args) {
int a = 5;
Integer b = new Integer(5);

        modify(a, b);
        
        System.out.println("a: " + a);  // 5
        System.out.println("b: " + b);  // 5
    }
    
    public static void modify(int x, Integer y) {
        x = 10;       // Stack içindeki x değişir
        y = new Integer(10); // Yeni bir nesne oluşturulur (Heap)
    }
}
Kod Çalışma Mantığı
int a = 5; → Stack'te doğrudan 5 değeri saklanır.
Integer b = new Integer(5); → Heap’te yeni bir Integer nesnesi oluşturulur. Stack'te referansı tutulur.
modify(a, b); metoduna çağrılırken:
x → yeni bir stack değişkeni olarak 5 değerini kopyalar (pass by value).
y → referans olarak yeni bir Integer nesnesi alır.
x = 10; → Stack içinde yeni bir değişken yaratılır ve değer değiştirilir.
y = new Integer(10); → Heap’te yeni bir Integer nesnesi oluşturulur, ancak bu modify metodu içinde kalır ve main metodundaki b değişkenini etkilemez.
main metodu bittiğinde, a hâlâ 5, b hâlâ 5 olarak kalır.
Bu durum, primitive’lerin değiştirilememesi (pass-by-value) ve wrapper nesnelerinin yeni bir nesne oluşturduğunda eski referanslarını kaybetmesi nedeniyle oluşur.

5. Wrapper Sınıfları ve Otomatik Boxing / Unboxing
   Java, primitive ve wrapper sınıfları arasında otomatik dönüşüm sağlar. Buna Autoboxing ve Unboxing denir.

Autoboxing (Primitive → Wrapper)
int primitiveValue = 100;
Integer wrapperValue = primitiveValue; // Autoboxing
Burada primitiveValue, otomatik olarak Integer nesnesine dönüştürülür ve heap’te saklanır.
Unboxing (Wrapper → Primitive)
Integer wrapperValue = 200;
int primitiveValue = wrapperValue; // Unboxing
wrapperValue, heap’ten alınıp stack’te saklanan primitiveValue değişkenine atanır.
Bu dönüşümler bazı performans kayıplarına neden olabilir, çünkü primitive tiplerde heap erişimi olmadığı için daha hızlı işlem yapılır.

6. Ne Zaman Primitive, Ne Zaman Wrapper Kullanmalıyız?
   Kullanım Durumu	Primitive Kullan (Stack)	Wrapper Kullan (Heap)
   Hafıza Verimliliği	✅	❌ (Heap daha fazla bellek kullanır)
   Performans (Hızlı Erişim)	✅	❌ (Heap erişimi daha yavaş)
   Nesne Odaklı Programlama (OOP)	❌	✅ (Nesne özellikleri ile kullanılabilir)
   Nullable Değerler (Null Atama)	❌	✅ (Primitive null olamaz, wrapper olabilir)
   Collection (List, Set, Map)	❌	✅ (Primitive veri tipleri Collection ile kullanılamaz)
   Eğer hafıza ve hız önemliyse, primitive tipleri kullanmalıyız.
   Eğer nesne tabanlı programlama, null değeri saklama veya koleksiyonlar (List, Set, Map) ile çalışma gerekiyorsa, wrapper sınıfları kullanmalıyız.

Sonuç
Primitive değişkenler stack hafızada tutulur, doğrudan değeri içerir ve daha hızlıdır.
Wrapper sınıfları heap hafızada saklanır, referans üzerinden erişilir ve daha fazla bellek kullanır.
Otomatik Boxing/Unboxing sayesinde dönüşümler mümkündür, ancak performansa dikkat edilmelidir.
Bu bilgiler doğrultusunda, projenin gereksinimlerine göre en uygun bellek kullanım stratejisini belirlemek gerekir. 🚀

Wrapper new kullanımı
Short wrapperTypeShort = new Short((short) 32767);
bununla Short wrapperTypeShort 2=32767 arasındaki far nedir ?
Java'da aşağıdaki iki satır arasındaki farkı inceleyelim:

Short wrapperTypeShort1 = new Short((short) 32767); // 1. Yöntem (Explicit Object Creation - new kullanımı)
Short wrapperTypeShort2 = 32767; // 2. Yöntem (Autoboxing)
Bu iki yaklaşımın arasındaki temel farklar şunlardır:

1. new Short((short) 32767) Kullanımı (Heap Bellekte Yeni Nesne Oluşturur)
   Short wrapperTypeShort1 = new Short((short) 32767);
   new anahtar kelimesi kullanıldığı için her çağrıldığında yeni bir nesne oluşturulur.
   Heap bellekte ayrı bir nesne yaratılır.
   Garbage Collector (GC) tarafından temizlenmesi gerekir.
   Bellek tüketimi ve performans açısından dezavantajlıdır.
   == operatörü ile karşılaştırıldığında farklı nesneler olduğu için false dönebilir.
   Java 9 ve sonraki sürümlerde bu yöntem depreceated (kullanım dışı) hale gelmiştir.
2. Short wrapperTypeShort2 = 32767; Kullanımı (Autoboxing - Cached Object Kullanımı)
   Short wrapperTypeShort2 = 32767;
   Autoboxing sayesinde primitive short değeri otomatik olarak Short nesnesine dönüştürülür.
   Java'nın Integer ve Short için cache mekanizmasını kullanır.
   Küçük sayı aralıklarında (-128 ile 127 arasında) önbellekten (cache) alınan nesneleri kullanabilir.
   Daha performanslıdır, çünkü her seferinde yeni bir nesne oluşturmaz.
   Farklılıkların Kanıtı: Karşılaştırma Testi
   Aşağıdaki kodu çalıştırarak farkı gözlemleyebiliriz:

public class ShortComparison {
public static void main(String[] args) {
Short wrapperTypeShort1 = new Short((short) 127);
Short wrapperTypeShort2 = 127; // Autoboxing

        Short wrapperTypeShort3 = new Short((short) 127);
        Short wrapperTypeShort4 = 127; // Autoboxing
        
        System.out.println(wrapperTypeShort1 == wrapperTypeShort3); // false (Heap'te farklı nesneler)
        System.out.println(wrapperTypeShort2 == wrapperTypeShort4); // true (Cache mekanizması sayesinde aynı nesne)
        
        Short wrapperTypeShort5 = 32767;
        Short wrapperTypeShort6 = 32767;

        System.out.println(wrapperTypeShort5 == wrapperTypeShort6); // false (Çünkü cache dışında)
    }
}
Sonuçlar
Eğer new kullanırsanız, heap bellekte yeni bir nesne oluşur ve == operatörü farklı nesneler döndürdüğü için false olur.
Eğer Short wrapperTypeShort2 = 32767; şeklinde yazarsanız, Java autoboxing kullanır.
Java -128 ile 127 arasındaki değerleri cache olarak tuttuğu için bu aralıkta == karşılaştırması true dönebilir. Ancak 32767 gibi büyük değerler cache dışında olduğu için farklı nesneler oluşturulur.
Hangi Kullanımı Tercih Etmeliyiz?
✔ Performans açısından Short wrapperTypeShort = 32767; (Autoboxing) tercih edilmelidir.
❌ new Short((short) 32767) kullanımı gereksiz bellek tüketimine neden olur ve önerilmez.

Bu yüzden new ile nesne oluşturmaktan kaçınılmalı ve autoboxing kullanımı tercih edilmelidir. 🚀

Java Life-Cycles
Java'da Compiler mı Önce, Interpreter mı?
Java programlarının çalışma süreci hem compiler (derleyici) hem de interpreter (yorumlayıcı) içerir, ancak önce compiler çalışır, sonra interpreter devreye girer.

Compiler (Derleyici) İlk Çalışır:

Java kaynak kodu (.java dosyaları) Javac (Java Compiler) tarafından Bytecode’a (.class dosyaları) dönüştürülür.
Bytecode işletim sistemine bağımsızdır, yani her ortamda çalışabilir.
Interpreter (Yorumlayıcı) Sonra Çalışır:

Java Virtual Machine (JVM), Bytecode’u alır ve Just-In-Time (JIT) Compiler ile çalıştırılabilir makine koduna dönüştürür.
JVM, Bytecode'u satır satır yorumlar ve çalıştırır.
Java Programının Life-Cycle (Yaşam Döngüsü)
Java'daki bir programın baştan sona yaşam döngüsünü adım adım açıklayalım:

1. Yazılım Aşaması (Source Code - .java Dosyası)
   Geliştirici, Java kaynak kodunu (.java dosyalarını) yazar.
   Örneğin:

public class HelloWorld {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
2. Compilation (Derleme) Aşaması
   Java compiler (javac), kaynak kodunu Bytecode’a çevirir.

Bu aşamada şunlar olur:
Syntax kontrolü yapılır: Derleyici (javac), kodun sözdizimi hatalarını kontrol eder.
Optimizasyon yapılır: Kod en verimli hale getirilir.
Bytecode üretilir: Makineye bağımsız .class dosyası oluşturulur.
Kompilasyon (Derleme) Komutu:
javac HelloWorld.java
Bu komut sonucunda, aşağıdaki dosya oluşur:

HelloWorld.class
Bu .class dosyası Java Bytecode içerir.

3. ClassLoader Aşaması
   Java ClassLoader, .class dosyalarını JVM’ye yükler.

Bootstrap ClassLoader: Java’nın temel sınıflarını (java.lang.*) yükler.
Extensions ClassLoader: Ekstra kütüphaneleri (lib/ext dizinindekileri) yükler.
Application ClassLoader: Kullanıcının kendi yazdığı sınıfları yükler.
4. Bytecode Verification (Bytecode Doğrulama)
   JVM, Bytecode’un güvenliğini kontrol eder.
   Hatalı veya zararlı kodların çalışmasını önler.
   Bellek aşımı veya yasadışı bellek erişimlerini engeller.
5. Interpreter (Yorumlayıcı) Aşaması
   Java Interpreter, Bytecode’u satır satır okur ve çalıştırır.
   Ancak, sürekli yorumlama yavaş olabilir, bu yüzden JIT (Just-In-Time) Compiler devreye girer.
6. Just-In-Time (JIT) Compiler Aşaması
   JIT Compiler, tekrar eden kodları alır ve doğrudan makine koduna çevirir.
   JVM’nin performansını artırır, çünkü aynı kodun sürekli yorumlanmasını önler.
7. Runtime (Çalışma Zamanı)
   Garbage Collector (GC): Kullanılmayan nesneleri bellekten temizler.
   Thread Management: Çoklu işlemler arasında zamanlamayı yönetir.
   Exception Handling: Çalışma sırasında oluşan hataları yakalar.
8. Programın Çıkışı
   Eğer her şey doğru giderse, programın çıktısı ekrana yazdırılır:

Hello, World!
Genel Özet: Java Çalışma Döngüsü
Source Code (.java) yazılır.
Java Compiler (javac) kodu Bytecode (.class) haline getirir.
ClassLoader, .class dosyasını JVM’ye yükler.
Bytecode Verification aşaması güvenlik kontrolü yapar.
Interpreter, Bytecode’u satır satır yorumlar ve çalıştırır.
JIT Compiler, sık kullanılan kodları makine koduna çevirir (performans artırır).
Garbage Collector, kullanılmayan bellekleri temizler.
Program sonucu ekrana yazdırılır.
Compiler vs. Interpreter: Hangisi Önce?
✅ Önce Compiler (javac) çalışır → Sonra Interpreter (JVM) çalışır.
🚀 Sonuç: Java hem compiled (derlenen) hem de interpreted (yorumlanan) bir dildir.

Java Wrapper Type Nedir? – Detaylı Açıklama
1. Wrapper Type (Sarmalayıcı Tür) Nedir?
   Java'da Wrapper Type, primitive type (ilkel veri türleri) ile çalışırken nesneye (Object) ihtiyaç duyduğumuz durumlarda kullanılan sarmalayıcı (wrapper) sınıflardır.

Neden Wrapper Type Kullanılır?
Java’daki primitive veri türleri (int, double, boolean vb.) nesne değildir. Ancak, Java’da birçok yapı (Koleksiyonlar List, Set, Map vb.) nesnelerle çalışır. Bu nedenle primitive türleri nesnelere dönüştürmek için Wrapper Type kullanılır.

Örnek:

int x = 10;          // Primitive type
Integer y = 10;      // Wrapper type (Nesne)
Burada:

x bir primitive int türüdür.
y ise Integer sınıfından bir nesnedir.
2. Primitive Type ve Wrapper Type Karşılaştırması
   Primitive Type	Karşılık Gelen Wrapper Type
   byte	Byte
   short	Short
   int	Integer
   long	Long
   float	Float
   double	Double
   char	Character
   boolean	Boolean
   💡 Wrapper sınıflar, primitive türlerin büyük harfle başlayan ve nesne olarak kullanılabilen versiyonlarıdır.

3. Wrapper Type Kullanımı
   Wrapper sınıfları genellikle koleksiyonlarla çalışma, null değer atama, veri türleri arasında dönüşüm yapma gibi işlemler için kullanılır.

Örnek Kullanım:
import java.util.ArrayList;
import java.util.List;

public class WrapperExample {
public static void main(String[] args) {
List<Integer> sayilar = new ArrayList<>();
sayilar.add(10);  // int → Integer (Autoboxing)
sayilar.add(20);
System.out.println(sayilar); // [10, 20]
}
}
📌 List kullanılamaz! Java Koleksiyonları nesnelerle çalıştığından, List kullanmalıyız.

4. Autoboxing ve Unboxing
   Java 5 ile gelen Autoboxing ve Unboxing, primitive türler ile Wrapper türler arasında otomatik dönüşüm sağlar.

4.1. Autoboxing (Primitive → Wrapper)
Java, primitive türleri otomatik olarak nesneye çevirir.

public class AutoboxingExample {
public static void main(String[] args) {
int primitiveValue = 100;
Integer wrapperValue = primitiveValue; // Autoboxing (int → Integer)

        System.out.println(wrapperValue); // 100
    }
}
Arka planda şuna dönüşür:

Integer wrapperValue = Integer.valueOf(primitiveValue);
4.2. Unboxing (Wrapper → Primitive)
Wrapper türleri, otomatik olarak primitive türlerine dönüştürülür.

public class UnboxingExample {
public static void main(String[] args) {
Integer wrapperValue = 200;
int primitiveValue = wrapperValue; // Unboxing (Integer → int)

        System.out.println(primitiveValue); // 200
    }
}
Arka planda şuna dönüşür:

int primitiveValue = wrapperValue.intValue();
5. Wrapper Type Metotları
   Wrapper sınıfları, primitive türlerde olmayan bazı metotlara sahiptir.

5.1. valueOf() – Primitive’den Wrapper’a Dönüştürme
Integer intObj = Integer.valueOf(10);
Double doubleObj = Double.valueOf(5.5);
Boolean boolObj = Boolean.valueOf(true);

System.out.println(intObj);   // 10
System.out.println(doubleObj); // 5.5
System.out.println(boolObj);  // true
5.2. xxxValue() – Wrapper’dan Primitive’e Dönüştürme
Integer intObj = Integer.valueOf(100);
int primitiveInt = intObj.intValue(); // Wrapper → Primitive

Double doubleObj = Double.valueOf(55.5);
double primitiveDouble = doubleObj.doubleValue(); // Wrapper → Primitive

System.out.println(primitiveInt);  // 100
System.out.println(primitiveDouble); // 55.5
5.3. parseXXX() – String’den Primitive’e Dönüştürme
int sayi = Integer.parseInt("123");
double ondalik = Double.parseDouble("12.34");
boolean dogruMu = Boolean.parseBoolean("true");

System.out.println(sayi);      // 123
System.out.println(ondalik);   // 12.34
System.out.println(dogruMu);   // true
📌 Eğer String geçersizse NumberFormatException hatası alınır!

5.4. toString() – Primitive’den String’e Dönüştürme
int sayi = 456;
String str = Integer.toString(sayi);
System.out.println(str); // "456"
Aynı işlem String.valueOf() ile de yapılabilir:

String str2 = String.valueOf(sayi);
System.out.println(str2); // "456"
6. Wrapper Type Kullanım Senaryoları
   Senaryo	Primitive Kullanımı	Wrapper Kullanımı
   Performans & Bellek	✅ Daha hızlı, az bellek kullanır.	❌ Daha fazla bellek kullanır.
   Koleksiyonlarla Kullanım	❌ Kullanılamaz. (List<int> hata verir)	✅ Kullanılabilir. (List<Integer>)
   Null Değer Atama	❌ Mümkün değil.	✅ Mümkün (Integer x = null;)
   Metot Kullanımı	❌ Metotları yoktur.	✅ valueOf(), parseInt() gibi metotlar içerir.
   Generics (Jenerik Türler)	❌ Kullanılamaz (T extends int olmaz).	✅ Kullanılabilir (T extends Number).
7. Ne Zaman Hangi Tür Kullanılmalı?
   Performans ve bellek önemliyse → primitive type kullanın.
   Koleksiyonlar ve nesne yönelimli programlama gerekiyorsa → wrapper type kullanın.
   Null değeri gerekliyse → wrapper type kullanın.
   Matematiksel hesaplamalar için → primitive type daha hızlıdır.
8. Özet
   Özellik	Primitive Type	Wrapper Type
   Bellek Kullanımı	Az bellek tüketir.	Daha fazla bellek tüketir.
   Hız	Daha hızlıdır.	Daha yavaştır.
   Null Değer	❌ Null olamaz.	✅ Null olabilir.
   Nesne mi?	❌ Hayır.	✅ Evet.
   Metotları Var mı?	❌ Hayır.	✅ parseInt(), valueOf() gibi metotları vardır.
   Koleksiyonlarla Kullanılabilir mi?	❌ Hayır.	✅ Evet.
   📌 Özetle: Wrapper Type, nesne yönelimli programlama ve koleksiyonlarla çalışırken kullanılır. Ancak, performans ve bellek yönetimi açısından primitive type daha avantajlıdır.

💡 Soru: List<int> list = new ArrayList<>(); neden hata verir? 📌 Cevap: Java koleksiyonları nesne tutar. int bir nesne değildir, bu yüzden List<Integer> kullanmalıyız. 🚀

Java Math
Java Math (Matematiksel İşlemler) - Detaylı Açıklama
Java'da matematiksel işlemleri gerçekleştirmek için kullanılan Math sınıfı (java.lang.Math), birçok hazır matematik fonksiyonu sunar. Bu fonksiyonlar sayesinde üstel, logaritmik, trigonometrik ve yuvarlama işlemleri gibi birçok işlemi gerçekleştirebiliriz.

1. Math Sınıfının Genel Özellikleri
   ✅ Math sınıfı java.lang paketinin bir parçasıdır
   ✅ Statik metotlar içerir, bu yüzden nesne oluşturmaya gerek yoktur
   ✅ Performans açısından optimize edilmiştir
   ✅ Temel aritmetik, yuvarlama, üstel işlemler, trigonometri fonksiyonları içerir

Örneğin:

double sqrtValue = Math.sqrt(25); // 5.0
double powerValue = Math.pow(2, 3); // 8.0
double randomValue = Math.random(); // 0 ile 1 arasında rastgele sayı
2. Java Math Sınıfının Kullanımı
   A. Temel Matematiksel İşlemler
   Math sınıfı mutlak değer, maksimum, minimum gibi işlemleri kolayca yapar.

Metot	Açıklama	Örnek Kullanım
Math.abs(x)	x’in mutlak değerini döndürür.	Math.abs(-10) → 10
Math.max(a, b)	a ve b’nin maksimumunu bulur.	Math.max(5, 8) → 8
Math.min(a, b)	a ve b’nin minimumunu bulur.	Math.min(5, 8) → 5
System.out.println(Math.abs(-15)); // 15
System.out.println(Math.max(100, 200)); // 200
System.out.println(Math.min(50, 30)); // 30
B. Üstel ve Logaritmik İşlemler
Metot	Açıklama	Örnek Kullanım
Math.sqrt(x)	x’in karekökünü döndürür.	Math.sqrt(9) → 3.0
Math.pow(x, y)	x’in y. kuvvetini hesaplar.	Math.pow(2, 3) → 8.0
Math.exp(x)	e^x hesaplar.	Math.exp(2) → 7.389
Math.log(x)	x’in doğal logaritmasını hesaplar (ln x).	Math.log(2.718)
Math.log10(x)	x’in 10 tabanında logaritmasını hesaplar.	Math.log10(100) → 2.0
System.out.println(Math.sqrt(16)); // 4.0
System.out.println(Math.pow(2, 5)); // 32.0
System.out.println(Math.exp(1)); // 2.718
System.out.println(Math.log(Math.E)); // 1.0
System.out.println(Math.log10(1000)); // 3.0
C. Yuvarlama İşlemleri
Java Math sınıfı yuvarlama işlemleri için farklı fonksiyonlar sunar.

Metot	Açıklama	Örnek Kullanım
Math.round(x)	En yakın tam sayıya yuvarlar.	Math.round(5.7) → 6
Math.ceil(x)	Yukarı yuvarlar.	Math.ceil(3.2) → 4.0
Math.floor(x)	Aşağı yuvarlar.	Math.floor(3.9) → 3.0
System.out.println(Math.round(4.5)); // 5
System.out.println(Math.ceil(3.2)); // 4.0
System.out.println(Math.floor(6.8)); // 6.0
D. Trigonometri Fonksiyonları
Trigonometri fonksiyonları radyan cinsinden hesaplama yapar.

Metot	Açıklama	Örnek Kullanım
Math.sin(x)	x’in sinüsünü hesaplar.	Math.sin(Math.PI/2) → 1.0
Math.cos(x)	x’in kosinüsünü hesaplar.	Math.cos(0) → 1.0
Math.tan(x)	x’in tanjantını hesaplar.	Math.tan(Math.PI/4) → 1.0
Math.asin(x)	x’in ters sinüsünü hesaplar.	Math.asin(0.5)
Math.acos(x)	x’in ters kosinüsünü hesaplar.	Math.acos(1)
Math.atan(x)	x’in ters tanjantını hesaplar.	Math.atan(1)
System.out.println(Math.sin(Math.PI/2)); // 1.0
System.out.println(Math.cos(0)); // 1.0
System.out.println(Math.tan(Math.PI/4)); // 1.0
E. Rastgele Sayı Üretme
Math.random() metodu 0.0 ile 1.0 arasında rastgele bir sayı döndürür.

Örnek Kullanımlar:

System.out.println(Math.random()); // 0.0 ile 1.0 arasında rastgele sayı
System.out.println((int)(Math.random() * 100)); // 0-99 arası sayı
System.out.println((int)(Math.random() * 50) + 1); // 1-50 arası sayı
F. Sabitler
Math sınıfı matematiksel sabitleri de içerir.

Sabit	Açıklama	Örnek Kullanım
Math.PI	π değeri (3.141592653589793)	Math.PI * r * r (Daire Alanı)
Math.E	Euler sabiti (2.718281828459045)	Math.exp(1) → 2.718
System.out.println(Math.PI); // 3.141592653589793
System.out.println(Math.E); // 2.718281828459045
3. Java Math Kullanımına Örnek
   Aşağıdaki Java programı, Math sınıfının en önemli metodlarını içeren bir örnektir.

public class MathExample {
public static void main(String[] args) {
// Mutlak Değer
System.out.println("Mutlak Değer: " + Math.abs(-25));

        // Karekök ve Üstel İşlemler
        System.out.println("Karekök: " + Math.sqrt(64));
        System.out.println("Üs Al: " + Math.pow(2, 5));

        // Yuvarlama İşlemleri
        System.out.println("Yuvarla (Round): " + Math.round(4.6));
        System.out.println("Yukarı Yuvarla (Ceil): " + Math.ceil(4.2));
        System.out.println("Aşağı Yuvarla (Floor): " + Math.floor(4.9));

        // Rastgele Sayı
        System.out.println("Rastgele Sayı (0-100): " + (int)(Math.random() * 100));

        // Trigonometri
        System.out.println("Sinüs: " + Math.sin(Math.toRadians(90)));
        System.out.println("Kosinüs: " + Math.cos(Math.toRadians(0)));

        // Matematiksel Sabitler
        System.out.println("PI Sayısı: " + Math.PI);
    }
}
Sonuç
Java Math sınıfı, temel ve ileri matematik işlemlerini hızlı ve optimize bir şekilde yapar.
Math metotları static olduğu için nesne oluşturmaya gerek yoktur.
Yuvarlama, üstel işlemler, logaritma, trigonometrik fonksiyonlar gibi birçok fonksiyon içerir.
🚀 Java'da matematik işlemleri için Math sınıfını öğrenmek, sayısal işlemleri hızlı ve verimli yapmanızı sağlar! 🚀

Java Core
Java Core Escape (Kaçış Dizileri) Nedir?
Java'da escape sequences (kaçış dizileri), özel karakterleri String içinde kullanmamızı sağlayan ters eğik çizgi (\) ile başlayan özel karakterlerdir. Normalde doğrudan yazılamayan karakterleri temsil ederler.

💡 Örneğin:

" çift tırnak işareti bir String içinde doğrudan yazılamaz. ("Bu bir "örnek" metin") → Hatalı
Çözüm: \" kaçış dizisi kullanılır. ("Bu bir \"örnek\" metin") → Doğru
Java'daki Kaçış Dizileri (Escape Sequences)
Kaçış Dizisi	Anlamı	Örnek Kullanımı
\n	Yeni satır (Newline)	"Satır 1\nSatır 2"
\t	Sekme (Tab)	"İsim:\tMehmet"
\'	Tek tırnak (Single quote)	char c = '\'';
\"	Çift tırnak (Double quote)	"Bu bir \"örnek\" metin"
\\	Ters eğik çizgi (Backslash)	"C:\\Users\\Documents"
\r	Satır başı (Carriage return)	"Merhaba\rDünya"
\b	Geri al (Backspace)	"ABC\bD" (Sonuç: "ABD")
\f	Form feed (Sayfa sonu)	"Sayfa sonu\fYeni Sayfa"
\uXXXX	Unicode karakteri	"\u00E7" (ç harfi)
Kaçış Dizileriyle Örnekler
1. \n → Yeni Satır
   public class EscapeExample {
   public static void main(String[] args) {
   System.out.println("Merhaba Dünya!\nBu bir alt satıra geçti.");
   }
   }
   Çıktı:

Merhaba Dünya!
Bu bir alt satıra geçti.
2. \t → Sekme (Tab)
   public class EscapeExample {
   public static void main(String[] args) {
   System.out.println("İsim:\tAhmet");
   System.out.println("Soyisim:\tYılmaz");
   }
   }
   Çıktı:

İsim:     Ahmet
Soyisim:  Yılmaz
3. \' ve \" → Tek ve Çift Tırnak
   public class EscapeExample {
   public static void main(String[] args) {
   System.out.println("Bu bir \"Java\" programıdır.");
   System.out.println("Tek tırnak: \'A\' karakteri");
   }
   }
   Çıktı:

Bu bir "Java" programıdır.
Tek tırnak: 'A' karakteri
4. \\ → Ters Eğik Çizgi
   public class EscapeExample {
   public static void main(String[] args) {
   System.out.println("Dosya yolu: C:\\Users\\Documents\\file.txt");
   }
   }
   Çıktı:

Dosya yolu: C:\Users\Documents\file.txt
5. \r → Satır Başı
   public class EscapeExample {
   public static void main(String[] args) {
   System.out.println("Merhaba\rDünya!");
   }
   }
   Çıktı (bazı sistemlerde farklı olabilir):

Dünya!
📌 \r, satır başına döner ve "Dünya!", "Merhaba"nın üzerine yazılır.

6. \b → Geri Al (Backspace)
   public class EscapeExample {
   public static void main(String[] args) {
   System.out.println("ABC\bD");
   }
   }
   Çıktı:

ABD
📌 \b ifadesi, son karakteri siler. "ABC\bD" → C silinir, sonuç "ABD" olur.

7. \f → Form Feed (Sayfa Sonu)
   public class EscapeExample {
   public static void main(String[] args) {
   System.out.println("Sayfa sonu\fYeni Sayfa");
   }
   }
   📌 Çoğu modern sistemde görünmezdir ama yazıcı ve eski terminallerde sayfa sonu karakteri olarak kullanılır.

8. \uXXXX → Unicode Kullanımı
   public class EscapeExample {
   public static void main(String[] args) {
   System.out.println("Türkçe karakter: \u00E7, \u011F, \u015F");
   }
   }
   Çıktı:

Türkçe karakter: ç, ğ, ş
📌 Unicode ile tüm dillerde özel karakterler kullanılabilir.

Sonuç
Java'da kaçış dizileri, String içinde özel karakterleri kullanmamızı sağlar.
En sık kullanılanlar: \n (yeni satır), \t (sekme), \" (çift tırnak), \\ (ters eğik çizgi).
Gelişmiş kullanım: Unicode (\uXXXX) ile özel karakterleri String içinde yazabiliriz.
📌 Özetle: Eğer bir metin içinde özel karakterler yazmak istiyorsanız, escape sequences kullanmanız gereklidir! 🚀

Java Scanner Sınıfı (java.util.Scanner) – Detaylı Açıklama
1. Scanner Nedir?
   Scanner, Java’da kullanıcıdan giriş almak, dosyalardan veri okumak ve stringleri ayrıştırmak (parsing) için kullanılan bir sınıftır. java.util.Scanner paketinde bulunur.

Java’da veri girişlerini almak için System.in (klavyeden giriş), dosyalardan okuma (File), Stringlerden okuma gibi işlemler için kullanılır.

2. Scanner Sınıfının Kullanım Alanları
   Kullanım Alanı	Açıklama
   Kullanıcıdan veri almak	Scanner ile klavyeden giriş alabiliriz.
   Dosya okumak	Dosyalardan satır satır veya kelime kelime veri okuyabiliriz.
   String parçalama	String ifadeleri belirli bir ayraç ile bölebiliriz.
   Veri türlerine dönüştürme	String değerleri int, double, boolean gibi tiplere çevirebiliriz.
3. Scanner Sınıfının Import Edilmesi
   Scanner sınıfı java.util paketinde bulunduğu için kullanmadan önce import edilmesi gerekir:

import java.util.Scanner;
💡 Eğer import java.util.Scanner; yazmazsak, Java bu sınıfı tanımaz ve hata verir!

4. Scanner ile Kullanıcıdan Veri Alma
   Scanner sınıfı ile farklı türlerde veri alabiliriz:

4.1. String Veri Okuma (next() ve nextLine())
import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = scanner.next();  // Tek kelime okur

        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.next();  // Tek kelime okur

        System.out.print("Cümlenizi girin: ");
        scanner.nextLine(); // Önceki enter'ı temizler
        String cumle = scanner.nextLine(); // Bütün satırı okur

        System.out.println("Adınız: " + ad);
        System.out.println("Soyadınız: " + soyad);
        System.out.println("Girdiğiniz cümle: " + cumle);

        scanner.close();
    }
}
Farklar:
Metot	Açıklama
next()	Tek bir kelime okur. Boşluk görünce okuma işlemi durur.
nextLine()	Bütün satırı okur. Enter tuşuna basılana kadar bekler.
💡 Not: nextLine() kullanmadan önce next() veya nextInt() gibi metotlar çalıştırılırsa, enter karakterini temizlemek için bir scanner.nextLine(); satırı eklenmelidir.

4.2. Sayısal Veri Okuma (nextInt(), nextDouble(), nextFloat(), nextLong())
import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Boyunuzu girin: ");
        double boy = scanner.nextDouble();

        System.out.print("Ağırlığınızı girin: ");
        float agirlik = scanner.nextFloat();

        System.out.println("Yaşınız: " + yas);
        System.out.println("Boyunuz: " + boy);
        System.out.println("Kilonuz: " + agirlik);

        scanner.close();
    }
}
Metotlar ve Veri Türleri
Metot	Aldığı Veri Türü
nextInt()	int (Tamsayı)
nextDouble()	double (Ondalıklı sayı)
nextFloat()	float (Küçük ondalıklı sayı)
nextLong()	long (Büyük tamsayı)
nextShort()	short (Küçük tamsayı)
nextByte()	byte (Çok küçük tamsayı)
nextBoolean()	boolean (true/false)
📌 Dikkat: Kullanıcı eğer yanlış türde giriş yaparsa (nextInt() beklerken a girerse), hata (InputMismatchException) oluşur.

5. Scanner ile Dosya Okuma
   Scanner sınıfı sadece klavyeden giriş almak için değil, dosyalardan veri okumak için de kullanılır.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
public static void main(String[] args) {
try {
File file = new File("veri.txt");
Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String satir = scanner.nextLine();
                System.out.println(satir);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı!");
        }
    }
}
Açıklamalar:
new File("veri.txt") → "veri.txt" dosyasını açar.
hasNextLine() → Dosyada satır kaldığı sürece okumaya devam eder.
nextLine() → Satır satır okur.
Dosya yoksa FileNotFoundException fırlatılır.
6. Scanner ile Belirli Bir Ayraca Göre String Parçalama
   Scanner, virgül, boşluk veya özel karakterlere göre string parçalamak için kullanılabilir.

import java.util.Scanner;

public class ScannerDelimiterExample {
public static void main(String[] args) {
String veri = "Ahmet,Mehmet,Ayşe,Fatma";
Scanner scanner = new Scanner(veri);
scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();
    }
}
Çıktı:
Ahmet
Mehmet
Ayşe
Fatma
📌 Özet: scanner.useDelimiter(",") ile virgülü ayırıcı olarak belirledik.

7. Scanner’ın Kapatılması (close())
   Scanner nesnesi kullanıldıktan sonra kapatılmalıdır, aksi halde kaynak sızıntısı olabilir.

scanner.close();
💡 Eğer Scanner kapatılmazsa, bellek sızıntısına neden olabilir!

8. Scanner ile Kullanıcıdan Tekrar Tekrar Veri Alma
   Eğer kullanıcıdan sürekli giriş almak istiyorsak, bir döngü kullanabiliriz.

import java.util.Scanner;

public class ScannerLoopExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Bir sayı girin (Çıkış için -1): ");
            int sayi = scanner.nextInt();
            
            if (sayi == -1) {
                System.out.println("Çıkış yapıldı.");
                break;
            }
            
            System.out.println("Girdiğiniz sayı: " + sayi);
        }

        scanner.close();
    }
}
📌 Kullanıcı -1 girene kadar veri girişi yapabilir.

9. Özet
   Scanner, kullanıcıdan veri almak, dosya okumak, stringleri ayrıştırmak için kullanılır.
   nextInt(), nextDouble(), nextLine(), next() gibi metotlarla farklı veri türleri okunabilir.
   Dosyalardan veri okumak için Scanner(File file) kullanılabilir.
   Belirli bir karaktere göre bölmek için useDelimiter() kullanılabilir.
   Kaynak sızıntısını önlemek için scanner.close(); ile kapatılmalıdır.
   🚀 Scanner, Java'da veri almak için en yaygın kullanılan sınıflardan biridir!

WORA
Java'nın ünlü sloganı "Write Once, Run Anywhere" şeklindedir. "Everywhere" değil, "Anywhere" kullanılır.

Doğru Kullanım:
✅ "Write Once, Run Anywhere" (WORA)

Bu slogan, Java programlarının bir kez yazıldığında farklı platformlarda çalışabileceğini ifade eder. Anywhere kelimesi, "herhangi bir yerde" anlamına gelir, yani farklı işletim sistemleri ve donanımlarda çalışabilir demektir.

Yanlış Kullanım:
❌ "Write Once, Run Everywhere"

"Everywhere" kelimesi "her yerde" anlamına gelir, ancak Java'nın çalışma prensibi tam olarak bu değildir. JVM'nin yüklü olmadığı bir ortamda Java çalışmaz, bu yüzden "everywhere" yerine "anywhere" daha doğru bir ifadedir.

Özetle:
💡 Mülakatta doğru cevap:
✅ "Write Once, Run Anywhere" söylemelisiniz.
❌ "Everywhere" derseniz teknik olarak yanlış olur.
Java'da Conditional (Koşullu) İfadeler Nedir?
Conditional (Koşullu) ifadeler, bir programın belirli koşullara bağlı olarak farklı yollar izlemesini sağlar. Mantıksal karşılaştırmalar ve şartlar kullanarak belirli blokların çalıştırılmasını kontrol ederiz.

Java'da kullanılan başlıca koşullu ifadeler şunlardır:

if ve if-else ifadeleri
else if (çoklu koşullar)
switch-case yapısı
Ternary (?:) operatörü
Short-Circuit (&& ve ||) operatörleri
1. if ve if-else Yapısı
   1.1 if İfadesi
   Koşul doğru (true) olduğunda kod çalıştırılır.
   Yanlış (false) olursa hiçbir şey yapılmaz.
   Örnek 1: Basit if kullanımı

public class IfExample {
public static void main(String[] args) {
int sayi = 10;

        if (sayi > 5) { // Koşul doğru mu? Evet!
            System.out.println("Sayı 5'ten büyüktür.");
        }
    }
}
Çıktı:

Sayı 5'ten büyüktür.
sayi > 5 olduğu için if bloğu çalıştı.
1.2 if-else Yapısı
Koşul true ise if bloğu çalışır.
Koşul false olursa else bloğu çalışır.
Örnek 2: if-else kullanımı

public class IfElseExample {
public static void main(String[] args) {
int sayi = 3;

        if (sayi > 5) {
            System.out.println("Sayı 5'ten büyüktür.");
        } else {
            System.out.println("Sayı 5'ten küçük veya eşittir.");
        }
    }
}
Çıktı:

Sayı 5'ten küçük veya eşittir.
sayi = 3 olduğu için if bloğu çalışmadı, else bloğu çalıştı.
2. else if (Çoklu Koşullar)
   Birden fazla koşulu test etmek için else if kullanılır.
   İlk doğru (true) koşul çalıştırılır, diğerleri atlanır.
   Örnek 3: else if kullanımı

public class ElseIfExample {
public static void main(String[] args) {
int not = 75;

        if (not >= 90) {
            System.out.println("Harf Notu: A");
        } else if (not >= 80) {
            System.out.println("Harf Notu: B");
        } else if (not >= 70) {
            System.out.println("Harf Notu: C");
        } else {
            System.out.println("Harf Notu: F");
        }
    }
}
Çıktı:

Harf Notu: C
not = 75, yani not >= 70 olduğu için sadece "Harf Notu: C" yazdırıldı.
3. switch-case Yapısı
   Bir değişkenin belirli değerlere eşit olup olmadığını kontrol eder.
   Koşula bağlı olarak ilgili case çalıştırılır.
   Eğer hiçbir case eşleşmezse default bloğu çalışır.
   Her case’den sonra break kullanılmazsa, aşağıdaki tüm case’ler çalışır.
   Örnek 4: switch-case ile Gün İsmi
   public class SwitchExample {
   public static void main(String[] args) {
   int gun = 3;

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            default:
                System.out.println("Geçersiz gün numarası");
        }
   }
   }
   Çıktı:

Çarşamba
gun = 3 olduğunda, case 3 çalıştı.
4. Ternary (?:) Operatörü
   Koşullu ifadeleri kısaltmak için kullanılır.
   Tek satırda if-else mantığı sağlar.
   Kullanım:
   (koşul) ? "true ise çalışır" : "false ise çalışır"
   Örnek 5: Ternary Operatörü Kullanımı
   public class TernaryExample {
   public static void main(String[] args) {
   int sayi = 10;
   String sonuc = (sayi > 5) ? "Büyük" : "Küçük veya eşit";
   System.out.println(sonuc);
   }
   }
   Çıktı:

Büyük
sayi > 5 olduğu için "Büyük" değeri atanır.
5. Short-Circuit (&& ve ||) Operatörleri
   Kısa devre (Short-Circuiting), gereksiz hesaplamaları önlemek için kullanılan bir optimizasyondur.

Operatör	Açıklama
&& (AND)	Eğer ilk koşul false ise, ikinci koşula bakmaz.
`
Örnek 6: && ile Short-Circuit Kullanımı
public class ShortCircuitExample {
public static void main(String[] args) {
int a = 5;
int b = 10;

        if (a > 10 && ++b > 15) { // `a > 10` zaten false, ikinci koşula bakmaz
            System.out.println("Koşul sağlandı.");
        }
        System.out.println("b: " + b); // b artırılmadı!
    }
}
Çıktı:

b: 10
a > 10 false olduğu için ++b çalışmaz, b aynı kalır.
Örnek 7: || ile Short-Circuit Kullanımı
public class ShortCircuitExample2 {
public static void main(String[] args) {
int x = 5;
int y = 10;

        if (x < 10 || ++y > 15) { // `x < 10` true, ikinci koşula bakılmaz!
            System.out.println("Koşul sağlandı.");
        }
        System.out.println("y: " + y); // y artırılmadı!
    }
}
Çıktı:

Koşul sağlandı.
y: 10
x < 10 true olduğu için ++y çalışmaz.
Sonuç
Yapı	Kullanım Amacı
if	Belirli bir koşulu test etmek
if-else	Koşul yanlışsa alternatif blok çalıştırmak
else if	Birden fazla koşulu kontrol etmek
switch-case	Belirli değerleri eşleştirerek çalıştırmak
?: (Ternary)	Kısa if-else ifadeleri için
&&, `
Bu koşullu yapılar, Java programlarında karar mekanizmaları oluşturmak için temel taşlardır. 🚀

Loop
Java'da Loop (Döngü) Nedir?
Döngüler (Loops), bir işlemi tekrar tekrar belirli bir koşul sağlanana kadar çalıştırmak için kullanılır. Java'da en yaygın kullanılan döngüler şunlardır:

for döngüsü
while döngüsü
do-while döngüsü
for-each (enhanced for loop)
Bu döngülerle birlikte break ve continue gibi kontrol ifadeleri kullanılarak döngü akışı yönetilebilir.

1. for Döngüsü
   for döngüsü, tekrar sayısı bilinen işlemleri yapmak için kullanılır. Döngü çalıştırılmadan önce, koşul ve artış/azalış değerleri belirlenir.

Yapısı:

for (başlangıç_değeri; koşul; artırma/azaltma) {
// Döngü bloğu
}
Örnek 1: 1'den 5'e kadar yazdırma
public class ForLoopExample {
public static void main(String[] args) {
for (int i = 1; i <= 5; i++) {
System.out.println("i: " + i);
}
}
}
Çıktı:

i: 1
i: 2
i: 3
i: 4
i: 5
i = 1 olarak başlar.
i <= 5 olduğu sürece çalışır.
Her iterasyonda i++ ile i artırılır.
Örnek 2: Çift Sayıları Yazdırma
public class EvenNumbers {
public static void main(String[] args) {
for (int i = 2; i <= 10; i += 2) {
System.out.println("Çift sayı: " + i);
}
}
}
Çıktı:

Çift sayı: 2
Çift sayı: 4
Çift sayı: 6
Çift sayı: 8
Çift sayı: 10
i = 2 olarak başlar.
i <= 10 olduğu sürece çalışır.
i += 2 ile her turda i 2 artırılır.
2. while Döngüsü
   while, koşul sağlandığı sürece çalışan bir döngüdür. Kaç kere çalışacağı önceden bilinmeyen durumlar için kullanılır.

Yapısı:

while (koşul) {
// Döngü bloğu
}
Örnek 3: while ile Sayı Yazdırma
public class WhileLoopExample {
public static void main(String[] args) {
int i = 1;

        while (i <= 5) {
            System.out.println("i: " + i);
            i++; // i artırılıyor, yoksa sonsuz döngü olur.
        }
    }
}
Çıktı:

i: 1
i: 2
i: 3
i: 4
i: 5
İlk olarak i = 1.
Koşul i <= 5 sağlandıkça çalışır.
Her iterasyonda i++ artırılır.
Örnek 4: while ile Kullanıcıdan Veri Alma
import java.util.Scanner;

public class WhileUserInput {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int sayi;

        System.out.println("5 girene kadar sayı girin:");

        while (true) {  // Sonsuz döngü
            sayi = scanner.nextInt();
            if (sayi == 5) {
                System.out.println("Döngü sonlandı.");
                break; // 5 girildiğinde döngü kırılır.
            }
        }
    }
}
Örnek Giriş/Çıkış:

5 girene kadar sayı girin:
1
2
3
5
Döngü sonlandı.
Kullanıcı 5 girene kadar veri girer.
5 girildiğinde break; ile döngü sona erer.
3. do-while Döngüsü
   do-while, önce döngü çalıştırılır, sonra koşul kontrol edilir. Koşul yanlış olsa bile en az bir kere çalışır.

Yapısı:

do {
// Döngü bloğu
} while (koşul);
Örnek 5: do-while ile Kullanıcıdan Şifre Alma
import java.util.Scanner;

public class DoWhileExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int sifre;

        do {
            System.out.print("Şifreyi girin (1234): ");
            sifre = scanner.nextInt();
        } while (sifre != 1234);

        System.out.println("Giriş başarılı!");
    }
}
Örnek Giriş/Çıkış:

Şifreyi girin (1234): 1111
Şifreyi girin (1234): 2222
Şifreyi girin (1234): 1234
Giriş başarılı!
Şifre doğru girilene kadar tekrar eder.
En az bir kez çalışır, çünkü do bloğu önce çalışır.
4. for-each Döngüsü
   for-each, dizi ve koleksiyonları (Array, List, Set, vs.) daha kolay gezmek için kullanılır.

Yapısı:

for (VeriTipi eleman : Dizi/Koleksiyon) {
// Döngü bloğu
}
Örnek 6: for-each ile Dizi Elemanlarını Yazdırma
public class ForEachExample {
public static void main(String[] args) {
int[] sayilar = {10, 20, 30, 40, 50};

        for (int sayi : sayilar) {
            System.out.println("Sayı: " + sayi);
        }
    }
}
Çıktı:

Sayı: 10
Sayı: 20
Sayı: 30
Sayı: 40
Sayı: 50
for-each, for döngüsüne göre daha okunaklıdır.
Diziler, List'ler ve Set'ler üzerinde gezinmek için idealdir.
5. Döngülerde break ve continue Kullanımı
   break: Döngüyü tamamen sonlandırır.
   continue: Mevcut iterasyonu atlar, sonraki tura geçer.
   Örnek 7: break ile Döngüyü Sonlandırma
   public class BreakExample {
   public static void main(String[] args) {
   for (int i = 1; i <= 10; i++) {
   if (i == 5) {
   break; // 5 olduğunda döngü sona erer.
   }
   System.out.println("i: " + i);
   }
   }
   }
   Çıktı:

i: 1
i: 2
i: 3
i: 4
Örnek 8: continue ile Atlatma
public class ContinueExample {
public static void main(String[] args) {
for (int i = 1; i <= 5; i++) {
if (i == 3) {
continue; // 3'ü atla
}
System.out.println("i: " + i);
}
}
}
Çıktı:

i: 1
i: 2
i: 4
i: 5
Özet
Döngü Türü	Kullanım Amacı
for	Sabit sayıda tekrar eder.
while	Koşul sağlandığı sürece tekrar eder.
do-while	En az bir kez çalışır, sonra koşulu kontrol eder.
for-each	Dizileri ve koleksiyonları gezmek için kullanılır.
break, return, continue
Java'da break, return ve continue Nedir?
Bu üç anahtar kelime, akış kontrolüyle ilgilidir ve döngüler, metotlar ve koşullu ifadeler gibi yapılarda kullanılır. Her birinin nasıl çalıştığını detaylı örneklerle açıklayalım.

1. break Anahtar Kelimesi
   break, genellikle döngülerin kırılması (sonlandırılması) için kullanılır. switch-case yapılarında da kullanılır.

Çalışma Mantığı:

break çağrıldığı anda ilgili döngüyü tamamen durdurur.
İç içe döngülerde kullanıldığında, yalnızca bulunduğu döngüyü kırar.
Örnek 1: Döngüyü Kırma
public class BreakExample {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
if (i == 5) {
System.out.println("Döngü 5'e ulaştı ve durduruldu.");
break; // Döngü burada sona erer.
}
System.out.println("i: " + i);
}
}
}
Çıktı:

i: 1
i: 2
i: 3
i: 4
Döngü 5'e ulaştı ve durduruldu.
i == 5 olduğunda break çalışır ve döngü tamamen sona erer.
Örnek 2: İç İçe Döngülerde break Kullanımı
public class NestedBreakExample {
public static void main(String[] args) {
for (int i = 1; i <= 3; i++) {
for (int j = 1; j <= 3; j++) {
if (j == 2) {
break; // Sadece iç döngüyü kırar
}
System.out.println("i: " + i + ", j: " + j);
}
}
}
}
Çıktı:

i: 1, j: 1
i: 2, j: 1
i: 3, j: 1
j == 2 olduğunda iç döngü sona erer, ancak dış döngü devam eder.
2. return Anahtar Kelimesi
   return ifadesi, bir metottan değer döndürmek veya metodu tamamen sonlandırmak için kullanılır.

Çalışma Mantığı:

Eğer bir metodun dönüş tipi void ise, return; metodu erken sonlandırır.
Eğer metodun dönüş tipi bir değer içeriyorsa (int, String, boolean, vs.), return ile bir değer döndürmek zorunludur.
Örnek 1: return ile Metodu Sonlandırma
public class ReturnExample {
public static void main(String[] args) {
System.out.println("Metot çağrılıyor...");
testMetot();
System.out.println("Bu satır çalışmaz çünkü metot return ile durduruldu.");
}

    public static void testMetot() {
        System.out.println("Metot başladı.");
        return;  // Metot burada sona erer.
        // System.out.println("Bu satır asla çalışmaz."); // Hata verir
    }
}
Çıktı:

Metot çağrılıyor...
Metot başladı.
return; çağrıldığı anda metot sona erer.
Örnek 2: return ile Değer Döndürme
public class SumExample {
public static void main(String[] args) {
int result = toplama(5, 10);
System.out.println("Toplam: " + result);
}

    public static int toplama(int a, int b) {
        return a + b; // a + b değerini döndürür.
    }
}
Çıktı:

Toplam: 15
return a + b; ile metot, toplama işleminin sonucunu döndürür.
3. continue Anahtar Kelimesi
   continue, döngü içindeki mevcut yinelemeyi atlayarak bir sonraki tura geçmek için kullanılır. Döngüyü kırmaz, yalnızca belirtilen koşulda o adımı atlar.

Çalışma Mantığı:

continue çağrıldığında, döngünün geri kalan kodları çalıştırılmaz ve bir sonraki iterasyona geçilir.
Genellikle belirli bir durumu atlamak için kullanılır.
Örnek 1: Tek Sayıları Atlamak
public class ContinueExample {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
if (i % 2 != 0) { // Tek sayılar için
continue; // Döngüde kalan işlemleri atla ve bir sonraki adıma geç.
}
System.out.println("Çift sayı: " + i);
}
}
}
Çıktı:

Çift sayı: 2
Çift sayı: 4
Çift sayı: 6
Çift sayı: 8
Çift sayı: 10
i tek sayı olduğunda continue çalışır ve o iterasyonun geri kalan kısmı atlanır.
Örnek 2: İç İçe Döngülerde continue Kullanımı
public class NestedContinueExample {
public static void main(String[] args) {
for (int i = 1; i <= 3; i++) {
for (int j = 1; j <= 3; j++) {
if (j == 2) {
continue; // `j == 2` olduğunda iç döngünün bu iterasyonu atlanır.
}
System.out.println("i: " + i + ", j: " + j);
}
}
}
}
Çıktı:

i: 1, j: 1
i: 1, j: 3
i: 2, j: 1
i: 2, j: 3
i: 3, j: 1
i: 3, j: 3
j == 2 olduğunda continue çalışır ve o adımdaki işlemleri atlar.
Sonuç Karşılaştırması
Anahtar Kelime	Kullanım Alanı	Etkisi
break	Döngüleri ve switch bloklarını kırmak için	Döngü tamamen sona erer.
return	Metotlardan çıkış yapmak için	Metodu bitirir ve değer döndürür.
continue	Döngü içinde belirli bir iterasyonu atlamak için	O iterasyonu atlar, döngü devam eder.
String
Java'da String Nedir? (Detaylı Açıklama)
📌 String Nedir?
Java'da String bir karakter dizisi (text verisi) saklamak için kullanılan sınıf (class) türüdür. Java’da String, ilkel (primitive) bir veri tipi değildir, aksine java.lang.String sınıfına ait bir nesnedir.

Immutable (değiştirilemez) bir yapıya sahiptir.
Heap üzerinde oluşturulur ve String Pool (Havuz) kullanılarak yönetilir.
+ operatörü ile birleştirme (concatenation) yapılabilir.
  equals() ve == farkı gibi önemli detayları vardır.
  📌 1. String Tanımlama Yöntemleri
  Java’da String oluşturmanın iki farklı yolu vardır:

1️⃣ String Havuzu (String Pool) ile Tanımlama
String str1 = "Merhaba"; // String literal ile oluşturuldu
String str2 = "Merhaba";
"Merhaba" String Pool’a eklenir.
Aynı String değerini tekrar oluşturduğumuzda, hafızada yeni bir nesne oluşturulmaz, aynı referansa atanır.
Bellek kullanımını optimize eder.
2️⃣ new Operatörü ile Tanımlama
String str3 = new String("Merhaba");
String str4 = new String("Merhaba");
Her seferinde yeni bir nesne oluşturur (Heap içinde).
Fazladan bellek harcar, çünkü new ile oluşturulan String nesneleri String Pool kullanmaz.
📌 Karşılaştırma:

System.out.println(str1 == str2); // true (Aynı referans)
System.out.println(str3 == str4); // false (Farklı nesneler)
System.out.println(str1.equals(str3)); // true (İçerik karşılaştırması)
📌 2. String Metotları
Java'nın String sınıfı zengin bir metot koleksiyonuna sahiptir. Bunları detaylıca inceleyelim.

✅ 2.1 Uzunluk Öğrenme - length()
String text = "Java Programlama";
System.out.println(text.length()); // 17
✅ 2.2 Karakter Erişimi - charAt(index)
String text = "Java";
System.out.println(text.charAt(0)); // J
System.out.println(text.charAt(2)); // v
✅ 2.3 Parça Alma (Substring) - substring()
String text = "Merhaba Dünya";
System.out.println(text.substring(8)); // "Dünya"
System.out.println(text.substring(0, 7)); // "Merhaba"
✅ 2.4 Küçük ve Büyük Harfe Çevirme - toUpperCase() & toLowerCase()
String text = "Java";
System.out.println(text.toUpperCase()); // "JAVA"
System.out.println(text.toLowerCase()); // "java"
✅ 2.5 String Karşılaştırma - equals() ve equalsIgnoreCase()
String a = "Java";
String b = "java";

System.out.println(a.equals(b)); // false
System.out.println(a.equalsIgnoreCase(b)); // true
📌 Neden == kullanılmamalı?

==, referansları karşılaştırır.
equals() ise içeriği karşılaştırır.
✅ 2.6 String İçerik Kontrolleri
contains() → İçinde geçiyor mu?
String text = "Java öğrenmek çok eğlenceli!";
System.out.println(text.contains("Java")); // true
System.out.println(text.contains("Python")); // false
startsWith() & endsWith() → Başlangıç ve Bitiş Kontrolü
String text = "Merhaba Dünya";
System.out.println(text.startsWith("Merhaba")); // true
System.out.println(text.endsWith("Dünya")); // true
✅ 2.7 String Parçalama - split()
String metin = "Java,Python,C++";
String[] diller = metin.split(",");

for (String dil : diller) {
System.out.println(dil);
}
Çıktı:

Java
Python
C++
✅ 2.8 trim() - Boşlukları Kaldırma
String text = "   Java   ";
System.out.println(text.trim()); // "Java"
✅ 2.9 Değiştirme - replace() ve replaceAll()
String text = "Java kolaydır";
System.out.println(text.replace("kolay", "harika")); // "Java harikadır"
📌 3. String Birleştirme (Concatenation)
1️⃣ + Operatörü ile
String s1 = "Merhaba";
String s2 = " Dünya";
String sonuc = s1 + s2;
System.out.println(sonuc); // "Merhaba Dünya"
2️⃣ concat() Metodu ile
String s1 = "Java";
String s2 = " Programlama";
System.out.println(s1.concat(s2)); // "Java Programlama"
📌 4. StringBuilder ve StringBuffer
📌 String nesneleri değiştirilemez (immutable) olduğu için, çok fazla işlem yapıldığında StringBuilder veya StringBuffer kullanmak daha verimlidir.

1️⃣ StringBuilder (Daha Hızlı)
StringBuilder sb = new StringBuilder("Java");
sb.append(" Programlama");
System.out.println(sb); // "Java Programlama"
2️⃣ StringBuffer (Thread-Safe)
StringBuffer sb = new StringBuffer("Java");
sb.append(" Öğreniyorum");
System.out.println(sb); // "Java Öğreniyorum"
Özellik	String	StringBuilder	StringBuffer
Değiştirilebilir mi?	❌ Hayır	✅ Evet	✅ Evet
Hızlı mı?	🚀 Yavaş	⚡ Hızlı	🔒 Daha yavaş (Thread-safe)
Thread-Safe mi?	❌ Hayır	❌ Hayır	✅ Evet
📌 5. String ile == ve equals() Farkı
String str1 = "Java";
String str2 = new String("Java");

System.out.println(str1 == str2); // false (Farklı referanslar)
System.out.println(str1.equals(str2)); // true (Aynı içerik)
📌 Özetle:

==, hafızadaki referansları karşılaştırır.
equals(), içeriği karşılaştırır.
📌 6. String Pool ve Bellek Yönetimi
String Pool, String nesnelerinin tekrar kullanılmasını sağlayarak bellek optimizasyonu yapar.

String str1 = "Hello";
String str2 = "Hello";
System.out.println(str1 == str2); // true (Aynı referans)
Ama:

String str3 = new String("Hello");
System.out.println(str1 == str3); // false (Yeni nesne)
📌 Sonuç
String immutable’dır, değiştirilemez.
Karşılaştırma için equals() kullanılır.
Çok fazla işlem yapılacaksa StringBuilder tercih edilmelidir.
Bellek yönetimi için String Pool mekanizması vardır.
🚀 String’leri etkili kullanmak, Java programlarının performansını artırabilir! 🚀

switch-case ile if-elseif-else arasındaki farklar nelerdir
Java'da switch-case ve if-else if yapıları, akış kontrolü sağlamak için kullanılır ancak bazı temel farklara sahiptir:

1. Kullanım Alanı:
   if-else if Yapısı: Mantıksal karşılaştırmaların, aralıkların ve karmaşık koşulların değerlendirilmesi için daha esnektir. Her türlü karşılaştırmayı kullanabilirsiniz.
   switch-case Yapısı: Genellikle bir değişkenin belirli sabit değerlerle eşleşmesini kontrol etmek için kullanılır. Daha okunaklı ve performanslı olabilir.
2. Desteklenen Değerler:
   if-else if: Tüm karşılaştırmaları destekler (<, >, <=, >=, ==, !=, &&, || vb.).
   switch-case: Sadece belirli sabit değerlere (int, char, String, enum, vb.) göre çalışır.
3. Performans:
   if-else if: Koşullar sırasıyla kontrol edilir, uzun bir zincir varsa performans düşebilir.
   switch-case: Derleyici switch ifadelerini optimize edebilir ve "jump table" gibi mekanizmalar sayesinde daha hızlı çalışabilir.
4. Okunabilirlik:
   if-else if: Uzun koşullar içeren kodlar okunabilirliği zorlaştırabilir.
   switch-case: Daha düzenli ve okunaklı olabilir, özellikle sabit değerlerle çalışırken.
   Örnek Kullanım:
1. if-else if ile Kullanım
   int sayi = 5;

if (sayi > 0 && sayi <= 10) {
System.out.println("Sayı 1 ile 10 arasında");
} else if (sayi > 10 && sayi <= 20) {
System.out.println("Sayı 11 ile 20 arasında");
} else {
System.out.println("Sayı 20’den büyük");
}
✅ Avantaj: Aralık bazlı kontroller için uygundur.

2. switch-case ile Kullanım
   int gun = 3;
   switch (gun) {
   case 1:
   System.out.println("Pazartesi");
   break;
   case 2:
   System.out.println("Salı");
   break;
   case 3:
   System.out.println("Çarşamba");
   break;
   default:
   System.out.println("Geçersiz gün");
   }
   ✅ Avantaj: Sabit değerlere göre işlem yaparken daha düzenli bir yapı sunar.

Ne Zaman Hangi Yapıyı Kullanmalıyız?
Kriter	if-else if	switch-case
Koşul Karmaşıklığı	Esnek (>, <, &&,
Performans	Daha yavaş olabilir	Daha hızlı olabilir
Okunabilirlik	Karmaşık olabilir	Daha düzenli
Veri Türü	Her türlü veriyle çalışır	Sadece belirli veri türlerini destekler (int, char, String, enum)
Eğer aralık bazlı ve karmaşık koşullar söz konusuysa if-else if, eğer sabit değerlere göre seçim yapılıyorsa switch-case kullanmak en iyi seçimdir. 🚀

switch-case ile if-elseif-else arasındaki hız faktöri
Java'da switch-case ve if-else if yapılarının algoritmik analizi için Big-O karmaşıklıklarını ve çalışma mekanizmalarını inceleyelim.

1. Zaman Karmaşıklığı (Time Complexity)
   İf-Else If-Else
   if (x == 1) {
   // İşlem 1
   } else if (x == 2) {
   // İşlem 2
   } else if (x == 3) {
   // İşlem 3
   } else {
   // Varsayılan işlem
   }
   En iyi durum (Best Case) - O(1): Eğer ilk if koşulu doğruysa, yalnızca bir kontrol yapılır.
   En kötü durum (Worst Case) - O(n): Tüm if blokları kontrol edildikten sonra else bloğuna ulaşılırsa n adet karşılaştırma yapılır.
   Ortalama durum (Average Case) - O(n/2) ≈ O(n): Rastgele bir değerde ortalama olarak n/2 karşılaştırma yapılır.
   ✅ Sonuç: if-else if yapısı lineer zaman karmaşıklığına (O(n)) sahiptir.

Switch-Case
switch (x) {
case 1:
// İşlem 1
break;
case 2:
// İşlem 2
break;
case 3:
// İşlem 3
break;
default:
// Varsayılan işlem
}
Switch-case’in algoritmik analizi derleyici tarafından nasıl optimize edildiğine bağlıdır:

Jump Table Kullanımı (O(1))

Eğer case ifadeleri küçük ve sıralı tamsayılar (int, char, enum) ise derleyici jump table oluşturur.
Jump table, doğrudan indeksleme yaparak ilgili case’e gider. Yani sabit zamanda (O(1)) çalışır.
Binary Search Kullanımı (O(log n))

Eğer case değerleri çok büyük, rastgele dağılmış veya sıralı değilse, JVM genellikle binary search kullanır.
Binary search, O(log n) zaman karmaşıklığı sağlar.
✅ Sonuç:

Eğer jump table uygulanırsa → O(1)
Eğer binary search uygulanırsa → O(log n)
Eğer çok fazla case varsa ve fallback olarak lineer kontrol yapılırsa → O(n) (çok nadir)
2. Uzay (Bellek) Karmaşıklığı (Space Complexity)
   Yapı	Uzay Karmaşıklığı
   If-Else If	O(1) (Yalnızca değişkenler için bellek kullanır)
   Switch-Case (Jump Table)	O(n) (Tüm case değerlerini içeren bir tablo saklar)
   Switch-Case (Binary Search)	O(1) (Ekstra bellek kullanmaz)
   if-else yapısında ekstra bellek kullanılmaz.
   switch-case için jump table yöntemi kullanılıyorsa, tüm olası case değerleri için bir tablo tutulduğundan O(n) bellek kullanımı olabilir.
3. Karşılaştırmalı Tablo
   Özellik	If-Else If	Switch-Case
   Zaman Karmaşıklığı (Worst Case)	O(n)	O(1) (Jump Table) veya O(log n) (Binary Search)
   En iyi durum	O(1)	O(1)
   Ortalama durum	O(n)	O(1) veya O(log n)
   Aralık Kontrolü	Evet	Hayır
   Hız (Küçük n için)	Yavaş olabilir	Daha hızlı
   Hız (Büyük n için)	Daha yavaş (O(n))	Daha hızlı (O(1) veya O(log n))
   Esneklik	Daha esnek	Sadece belirli değerler için uygun
4. Ne Zaman Hangi Yapıyı Kullanmalıyız?
   Durum	Önerilen Yapı
   Aralık bazlı karşılaştırmalar (x > 10, x < 50 gibi)	If-Else If
   Mantıksal koşullar (&&, `
   Sabit değerleri karşılaştırma	Switch-Case
   Küçük ve ardışık integer değerleriyle çalışıyorsanız	Switch-Case (O(1) Jump Table)
   Büyük ve rastgele dağılımlı değerlerde	Switch-Case (O(log n) Binary Search)
   Sonuç
   if-else if daha esnektir ancak O(n) performansı nedeniyle büyük kod bloklarında yavaş olabilir.
   switch-case daha hızlıdır ve jump table veya binary search kullanarak O(1) veya O(log n) çalışabilir.
   Küçük sayılar ve sabit değerler için switch-case tercih edilmelidir.
   Mantıksal ifadeler ve aralık kontrolleri için if-else if kullanılır.
   Bu analiz ışığında, senaryoya göre uygun olanı seçmek en iyi yaklaşımdır. 🚀

switch-case ile if-elseif-else arasındaki hız faktöri
Method
Java'da Metot (Method) Nedir? (Detaylı Açıklama)
📌 1. Metot (Method) Nedir?
Java'da metot (method), belirli bir işi gerçekleştiren kod bloklarıdır.
Metotlar, kod tekrarını önler, programı daha düzenli hale getirir ve yeniden kullanılabilirlik sağlar.
Bir metot, parametre alabilir, bir değer döndürebilir veya sadece bir işlemi gerçekleştirebilir.

📌 2. Java’da Metot Tanımlama
Java'da bir metot 4 ana bileşenden oluşur:

Erişim Belirleyici (Access Modifier) → public, private, protected
Geri Dönüş Tipi (Return Type) → void, int, double, String, vb.
Metot Adı (Method Name) → camelCase kuralına uygun olmalıdır.
Parametre Listesi (Parameters) → Metodun giriş değerleri.
📌 Genel Metot Tanımı:

erişimBelirteci geriDönüşTipi metotAdı(parametreler) {
// Metot gövdesi (method body)
}
📌 3. Parametresiz ve Parametreli Metotlar
✅ 3.1 Parametresiz Metot
Parametresiz metot, hiçbir giriş almadan belirli bir işlemi gerçekleştirir.

public class MetotOrnek {
public static void selamVer() {
System.out.println("Merhaba, hoş geldiniz!");
}

    public static void main(String[] args) {
        selamVer(); // Metot çağrıldı
    }
}
Çıktı:

Merhaba, hoş geldiniz!
Metot parametre almaz.
Çağrıldığında her zaman aynı çıktıyı üretir.
✅ 3.2 Parametreli Metot
Bir metot, giriş değerleri (parametreler) alarak farklı sonuçlar üretebilir.

public class MetotOrnek {
public static void selamVer(String isim) {
System.out.println("Merhaba, " + isim + "!");
}

    public static void main(String[] args) {
        selamVer("Ahmet"); // Parametre olarak "Ahmet" gönderildi
        selamVer("Ayşe");  // Parametre olarak "Ayşe" gönderildi
    }
}
Çıktı:

Merhaba, Ahmet!
Merhaba, Ayşe!
📌 Metot farklı girişlerle farklı sonuçlar üretebilir.

📌 4. Geri Dönüş Tipi (Return Type)
Metotlar, işlem sonucunda bir değer döndürebilir. Bunun için geri dönüş tipi belirtilmelidir.

✅ 4.1 void Metotlar
Eğer metot bir değer döndürmeyecekse, void olarak tanımlanır.

public class VoidExample {
public static void yazdir(String mesaj) {
System.out.println(mesaj);
}

    public static void main(String[] args) {
        yazdir("Java metotları öğreniyoruz!");
    }
}
Çıktı:

Java metotları öğreniyoruz!
📌 void metotlar, bir işlem yapar ama geri dönüş değeri yoktur.

✅ 4.2 Değer Döndüren Metotlar
Metot bir işlem sonucunda bir değer döndürebilir.

public class MetotOrnek {
public static int kareAl(int sayi) {
return sayi * sayi;
}

    public static void main(String[] args) {
        int sonuc = kareAl(5);
        System.out.println("Sonuç: " + sonuc);
    }
}
Çıktı:

Sonuç: 25
📌 Metot int türünde bir değer döndürdüğü için return ifadesi kullanıldı.

📌 5. Metot Aşırı Yükleme (Method Overloading)
📌 Aynı isimli birden fazla metot tanımlamak mümkündür, ancak parametreleri farklı olmalıdır.

public class OverloadingExample {
public static int toplama(int a, int b) {
return a + b;
}

    public static double toplama(double a, double b) {
        return a + b;
    }

    public static int toplama(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(toplama(5, 10));        // int parametreli
        System.out.println(toplama(5.5, 2.5));    // double parametreli
        System.out.println(toplama(1, 2, 3));      // 3 parametreli
    }
}
Çıktı:

15
8.0
6
📌 Method Overloading ile farklı parametre türlerine göre farklı işlemler yapılabilir.

📌 6. static ve non-static Metotlar
✅ 6.1 static Metotlar
Sınıfa aittir, nesne oluşturmadan çağrılabilir.
Doğrudan ClassName.metotAdi() şeklinde erişilir.
public class MathUtil {
public static int kupAl(int x) {
return x * x * x;
}

    public static void main(String[] args) {
        System.out.println(kupAl(3)); // 27
    }
}
✅ 6.2 non-static Metotlar
Nesne oluşturularak çağrılır.
Her nesne için farklı değerler tutabilir.
public class HesapMakinesi {
public int topla(int a, int b) {
return a + b;
}

    public static void main(String[] args) {
        HesapMakinesi hm = new HesapMakinesi();
        System.out.println(hm.topla(3, 7)); // 10
    }
}
📌 7. Rekürsif (Recursive) Metotlar
📌 Metot, kendi kendini çağırır. Özellikle faktöriyel, Fibonacci gibi hesaplamalarda kullanılır.

public class RecursionExample {
public static int faktoriyel(int n) {
if (n == 1) {
return 1;
}
return n * faktoriyel(n - 1);
}

    public static void main(String[] args) {
        System.out.println(faktoriyel(5)); // 120
    }
}
Çıktı:

120
📌 Özyinelemeli metotlar, dikkatli kullanılmazsa sonsuz döngüye neden olabilir!

📌 8. final Metotlar (Override Engelleme)
Bir metot final olarak tanımlanırsa, alt sınıflar tarafından değiştirilemez.
class Hayvan {
public final void sesCikar() {
System.out.println("Ses çıkarıyorum!");
}
}

class Kedi extends Hayvan {
// public void sesCikar() {} // HATA! Çünkü final metot değiştirilemez.
}
📌 9. Özet
Özellik	Açıklama
Parametresiz Metot	Hiçbir giriş almadan çalışır.
Parametreli Metot	Dışarıdan veri alır ve ona göre işlem yapar.
Geri Dönüşlü Metot	İşlem sonucunu döndürür.
Overloading (Aşırı Yükleme)	Aynı isimli farklı parametrelerle metot tanımlanır.
Static Metot	Nesne oluşturmadan çağrılabilir.
Non-Static Metot	Nesne oluşturarak kullanılır.
Rekürsif (Recursive) Metot	Kendi kendini çağıran metottur.
📌 Java'da metotlar, kod tekrarını önler ve programın yönetilebilirliğini artırır! 🚀

Javada Adresleme Nasıldır ?
Java'da Adresleme Nasıl Çalışır? (Bellek Yönetimi ve Referanslar)
Java'da adresleme, bellek yönetimi, nesne referansları ve değişkenlerin nasıl saklandığıyla ilgilidir. Java, bellek yönetimini büyük ölçüde otomatik hale getirir (Garbage Collector sayesinde), ancak bellekte verilerin nasıl tutulduğunu anlamak önemlidir.

1. Java'da Bellek Alanları
   Java'da bellek iki ana bölüme ayrılır:

Bellek Alanı	Ne İçin Kullanılır?
Stack Bellek	Yerel değişkenler, primitive türler ve referans değişkenleri burada saklanır.
Heap Bellek	Tüm nesneler burada saklanır. Heap üzerindeki nesneler referans değişkenleri tarafından işaret edilir.
📌 Önemli: Java'da Bellek Adresleme Mantığı
Primitive türler (int, double, char, vb.) stack bellekte doğrudan saklanır.
Referans türler (String, Array, Object, vb.) heap bellekte saklanır, ancak değişkenler stack'te sadece adresini (referansını) tutar.
Nesneye erişim, referans üzerinden yapılır (C++'daki pointer'lara benzemez, ama mantık olarak benzer çalışır).
2. Örneklerle Java'da Adresleme
   🎯 Örnek 1: Primitive Veri Türlerinin Stack Üzerinde Saklanması
   public class PrimitiveStackExample {
   public static void main(String[] args) {
   int a = 10;
   int b = a; // b, a'nın değerini alır (Kopyalanır, adres paylaşımı olmaz)
   b = 20;

        System.out.println("a: " + a); // 10
        System.out.println("b: " + b); // 20
   }
   }
   📌 Stack Bellek Yapısı:

a değişkeni stack bellekte saklanır (a -> 10).
b = a; dediğimizde b için yeni bir bellek alanı açılır ve 10 kopyalanır.
b değiştiğinde a etkilenmez, çünkü primitive değişkenler direkt olarak stack bellekte saklanır ve kopyalanır.
🎯 Örnek 2: Referans Türleri ve Heap Bellek
class Araba {
String model;
}

public class ReferenceExample {
public static void main(String[] args) {
Araba araba1 = new Araba();
araba1.model = "BMW";

        Araba araba2 = araba1; // araba1'in referansı kopyalandı

        araba2.model = "Mercedes";

        System.out.println("araba1 Model: " + araba1.model); // Mercedes
        System.out.println("araba2 Model: " + araba2.model); // Mercedes
    }
}
📌 Heap Bellek Yapısı:

Araba araba1 = new Araba();
Yeni bir Araba nesnesi Heap bellekte oluşturulur.
araba1 değişkeni, stack bellekte nesnenin heap adresini tutar.
Araba araba2 = araba1;
araba2, araba1 ile aynı heap adresini işaret eder (Yeni nesne oluşturulmaz!).
Yani araba1 ve araba2 aynı nesneyi gösterir.
araba2.model = "Mercedes";
araba2 üzerinden nesne değiştirildiği için, araba1 de aynı nesneyi gösterdiğinden değişim her iki değişkende de görünür.
🚨 Önemli Not:
Eğer araba2 = new Araba(); yapsaydık, heap bellekte yeni bir nesne oluşturulurdu ve araba1 ile bağı kopardı.

3. Adresleme Mantığı: == vs .equals()
   📌 == Operatörü (Bellek Adresi Karşılaştırması)
   İki referansın aynı heap adresine mi işaret ettiğini kontrol eder.
   📌 .equals() Metodu (İçerik Karşılaştırması)
   Nesnelerin içeriğini karşılaştırır.
   String s1 = new String("Merhaba");
   String s2 = new String("Merhaba");

System.out.println(s1 == s2); // false (Farklı heap nesneleri)
System.out.println(s1.equals(s2)); // true (İçerik aynı)
📌 Neden?

s1 ve s2 ayrı new String() ile oluşturulduğundan farklı heap adreslerinde saklanır.
Ancak içerikleri aynı olduğundan .equals() true döndürür.
4. Garbage Collector (Çöp Toplayıcı)
   Java’da manuel free() veya delete yoktur (C++ gibi).
   Garbage Collector (GC), kullanılmayan nesneleri otomatik olarak temizler.
   GC'nin Çalıştığı Durumlar:
   Bir nesneye referans kalmazsa temizlenir:
   Araba araba1 = new Araba();
   araba1 = null; // Bu nesne artık Garbage Collector tarafından temizlenebilir.
   Eğer referans başka bir nesneye atanırsa, önceki nesne erişilemez olur:
   Araba araba1 = new Araba();
   Araba araba2 = new Araba();
   araba1 = araba2; // Önceki araba1 nesnesi artık kullanılmaz ve GC temizleyebilir.
   ✅ Heap bellekten silinme işlemi Garbage Collector tarafından yönetilir.

5. Nesneleri Kopyalama ve Adresleme
   Eğer nesnenin farklı bir kopyasını oluşturmak istiyorsak deep copy (derin kopya) yapmalıyız.
   📌 Shallow Copy (Yüzeysel Kopyalama - Aynı Referansı Kullanır)
   Araba araba1 = new Araba();
   araba1.model = "Audi";

Araba araba2 = araba1; // Aynı heap adresini gösterir
araba2.model = "Tesla";

System.out.println(araba1.model); // Tesla
📌 Deep Copy (Derin Kopyalama - Yeni Bir Nesne Oluşturur)
Araba araba1 = new Araba();
araba1.model = "Audi";

Araba araba2 = new Araba();
araba2.model = araba1.model; // Yeni nesneye ayrı değer atanıyor.

araba2.model = "Tesla";

System.out.println(araba1.model); // Audi (Değişmez!)
System.out.println(araba2.model); // Tesla
✅ Deep Copy kullanarak heap bellekte farklı nesneler oluşturmuş olduk.

6. Özet: Java'da Adresleme
   Tür	Saklandığı Bellek	Adresleme Mantığı
   Primitive Türler (int, char, double, vb.)	Stack Bellekte	Direkt değer saklanır, referans kullanılmaz
   Referans Türler (String, Array, Object)	Stack’te referans, Heap’te nesne	Heap’te nesne tutulur, stack sadece adresini saklar
   == Operatörü	Heap adreslerini karşılaştırır	Aynı heap nesnesine mi işaret ediyor?
   .equals() Metodu	İçeriği karşılaştırır	İçerik aynı mı?
   Garbage Collector (GC)	Heap’teki kullanılmayan nesneleri temizler	Kullanılmayan nesneleri siler
   ✅ Java, bellek adresleme işlemlerini otomatik olarak yönetir, ancak referans mantığını anlamak performans açısından önemlidir. 🚀

Dizi(Array)
Java'da Dizi (Array) Nedir? (Detaylı Açıklama)
📌 1. Dizi (Array) Nedir?
Java'da dizi (array), aynı veri tipindeki birden fazla elemanı tek bir değişken içinde saklamak için kullanılır.
Diziler:

Sabit bir boyuta sahiptirler (Oluşturulduktan sonra boyutu değiştirilemez).
Aynı türden elemanları saklarlar (int, double, String, vb.).
Dizi indisleri (index) 0'dan başlar.
Diziler bellek üzerinde bitişik (contiguous) olarak saklanır.
📌 2. Java’da Dizi Tanımlama ve Kullanımı
✅ 2.1 Dizi Tanımlama
Dizi tanımlamanın iki temel yolu vardır:

1️⃣ İlk Yöntem: Dizi Tanımlama ve Bellekte Yer Ayırma

int[] sayilar = new int[5]; // 5 elemanlı bir int dizisi
Dizinin boyutu 5 olarak belirlendi ve varsayılan değerlerle (0) dolduruldu.
2️⃣ İkinci Yöntem: Tanımlama ve Değer Atama

int[] sayilar = {10, 20, 30, 40, 50};
Dizi doğrudan tanımlandı ve elemanları atandı.
📌 Önemli:

Java’da dizinin boyutu sonradan değiştirilemez.
Bir dizi null olabilir ama başlangıçta boyutu belirtilmeden oluşturulamaz.
🚫 Hatalı Tanımlama

int[] dizi;
dizi = {1, 2, 3, 4}; // HATA! Doğrudan böyle atama yapılamaz.
✅ Doğru Kullanım

int[] dizi;
dizi = new int[]{1, 2, 3, 4};
📌 3. Dizi Elemanlarına Erişim ve Değiştirme
Dizi elemanlarına indeks (index) numarası kullanılarak erişilir.

public class DiziErisim {
public static void main(String[] args) {
int[] sayilar = {10, 20, 30, 40, 50};

        // Dizinin 0. elemanını yazdırma
        System.out.println("İlk eleman: " + sayilar[0]); // 10
        
        // Dizinin 2. elemanını değiştirme
        sayilar[2] = 100;
        
        System.out.println("Yeni 2. eleman: " + sayilar[2]); // 100
    }
}
📌 Dizi indisleri 0'dan başlar ve dizi.length - 1 kadar gider.

📌 4. Dizinin Boyutunu Öğrenme
Java'da bir dizinin boyutu, .length özelliği ile öğrenilir.

public class DiziBoyutu {
public static void main(String[] args) {
int[] dizi = {10, 20, 30, 40};
System.out.println("Dizi uzunluğu: " + dizi.length); // 4
}
}
📌 Dikkat:

dizi.length bir metot değil, bir özelliktir (() parantezleri kullanılmaz).
📌 5. Dizi Üzerinde Döngüler Kullanımı
✅ 5.1 for Döngüsü ile Dizi Kullanımı
public class DiziDongu {
public static void main(String[] args) {
int[] sayilar = {5, 10, 15, 20, 25};

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Eleman " + i + ": " + sayilar[i]);
        }
    }
}
Çıktı:

Eleman 0: 5
Eleman 1: 10
Eleman 2: 15
Eleman 3: 20
Eleman 4: 25
✅ 5.2 for-each Döngüsü ile Dizi Kullanımı
public class ForEachOrnek {
public static void main(String[] args) {
String[] diller = {"Java", "Python", "C++", "JavaScript"};

        for (String dil : diller) {
            System.out.println("Programlama Dili: " + dil);
        }
    }
}
Çıktı:

Programlama Dili: Java
Programlama Dili: Python
Programlama Dili: C++
Programlama Dili: JavaScript
📌 for-each dizileri gezmek için kullanışlıdır ama dizinin indeksine erişemez.

📌 6. Çok Boyutlu Diziler (Multidimensional Arrays)
✅ 6.1 İki Boyutlu (2D) Dizi Tanımlama
int[][] matris = new int[3][3]; // 3x3'lük bir matris
📌 Başlangıç değerleri 0 olur.

✅ 6.2 Değer Atama ve Erişim
public class IkiBoyutluDizi {
public static void main(String[] args) {
int[][] matris = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};

        System.out.println("Orta Eleman: " + matris[1][1]); // 5
    }
}
📌 İlk indeks satır, ikinci indeks sütunu temsil eder.

✅ 6.3 for Döngüsü ile Çok Boyutlu Diziyi Yazdırma
public class MatrisYazdirma {
public static void main(String[] args) {
int[][] matris = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Çıktı:

1 2 3
4 5 6
7 8 9
📌 matris.length satır sayısını, matris[i].length sütun sayısını verir.

📌 7. Java’da Dizi Kopyalama
✅ 7.1 System.arraycopy() Kullanımı
public class DiziKopyalama {
public static void main(String[] args) {
int[] orijinal = {1, 2, 3, 4, 5};
int[] kopya = new int[5];

        System.arraycopy(orijinal, 0, kopya, 0, 5);

        for (int eleman : kopya) {
            System.out.print(eleman + " ");
        }
    }
}
Çıktı:

1 2 3 4 5
📌 Diziyi manuel kopyalamaya göre daha verimlidir.

📌 8. Arrays Sınıfı ile Dizi İşlemleri
Java’nın java.util.Arrays sınıfı, diziler için yardımcı metotlar içerir.

✅ 8.1 Arrays.toString() - Diziyi String'e Çevirme
import java.util.Arrays;

public class ArraysExample {
public static void main(String[] args) {
int[] sayilar = {3, 1, 4, 1, 5};
System.out.println(Arrays.toString(sayilar));
}
}
Çıktı:

[3, 1, 4, 1, 5]
📌 9. Özet
Özellik	Açıklama
Dizi Tanımlama	int[] dizi = new int[5];
Diziye Değer Atama	dizi[0] = 10;
Dizi Boyutu	dizi.length
Tek Boyutlu Dizi	{10, 20, 30}
Çok Boyutlu Dizi	int[][] matris = new int[3][3];
Dizi Kopyalama	System.arraycopy()
Dizi Sıralama	Arrays.sort(dizi);
📌 Java’da diziler, veri saklama ve yönetme açısından oldukça önemli yapılardır! 🚀

Erişim Belirleyiciler
📌 Java'da Paketler (Packages) ve Erişim Belirleyiciler (Access Modifiers) Nedir? (Detaylı Açıklama)
Java'da paketler (packages) ve erişim belirleyiciler (access modifiers), programların düzenlenmesi, modüler hale getirilmesi ve erişim kontrolü sağlanması için kullanılan iki temel yapıdır.

🔹 1. Java'da Paketler (Packages) Nedir?
📌 Paket (Package), benzer sınıfları (class), arayüzleri (interface) ve diğer bileşenleri bir arada tutan bir dizin yapısıdır.
Paketler sayesinde:

Kod daha düzenli hale gelir.
Ad çakışmaları (name conflict) önlenir.
Erişim belirleyicilerle güvenlik sağlanır.
Yeniden kullanılabilir bileşenler oluşturulabilir.
🔸 1.1 Paket Tanımlama ve Kullanımı
Bir Java dosyasında paketi belirlemek için package anahtar kelimesi kullanılır. Dosyanın en üstüne yazılmalıdır.

package com.ornek.paket; // Paketin tanımlanması

public class Selam {
public void mesaj() {
System.out.println("Merhaba, paket kullanımı!");
}
}
📌 Paket ismi, genellikle ters domain adı şeklinde belirlenir.
Örneğin:

package com.google.search;
package org.apache.commons;
🔸 1.2 Paket İçindeki Sınıfı Kullanma (import)
Başka bir paketten bir sınıf kullanmak için import ifadesi kullanılır.

import com.ornek.paket.Selam; // Paket içindeki sınıfı dahil ettik

public class Main {
public static void main(String[] args) {
Selam nesne = new Selam();
nesne.mesaj();
}
}
📌 Eğer aynı paketteysek, import kullanmadan doğrudan sınıfı çağırabiliriz.

🔸 1.3 Tüm Paket İçeriğini Dahil Etme
Eğer bir paketin tüm sınıflarını kullanmak istiyorsak, * karakterini kullanabiliriz.

import com.ornek.paket.*;

public class Main {
public static void main(String[] args) {
Selam nesne = new Selam();
nesne.mesaj();
}
}
📌 Ancak, import ile sadece kullanılacak sınıfları dahil etmek daha performanslıdır.

🔸 1.4 static import ile Metotları ve Değişkenleri Dahil Etme
Bazı durumlarda, sınıf adını yazmadan doğrudan bir metot veya değişkene erişmek için static import kullanılabilir.

import static java.lang.Math.*;

public class MathExample {
public static void main(String[] args) {
System.out.println(sqrt(25)); // 5.0
System.out.println(pow(2, 3)); // 8.0
}
}
📌 Normalde Math.sqrt(25) şeklinde çağırılır. Ancak static import sayesinde sqrt(25) olarak doğrudan çağrılabilir.

🔸 1.5 Varsayılan Paket (Default Package)
Eğer package ifadesi kullanılmazsa, sınıf varsayılan pakette (default package) olur.
Ancak varsayılan paket kullanımı büyük projelerde önerilmez.

public class Varsayilan {
public void mesaj() {
System.out.println("Varsayılan paket içindeyim.");
}
}
Bu sınıf, herhangi bir pakete ait olmadığı için diğer paketler tarafından doğrudan kullanılamaz.

🔹 2. Java’da Erişim Belirleyiciler (Access Modifiers)
Erişim belirleyiciler, sınıf, metot ve değişkenlerin erişim seviyelerini belirler.

🔸 2.1 Java'daki Erişim Belirleyiciler
Erişim Belirleyici	Açıklama	Aynı Sınıf	Aynı Paket	Alt Sınıflar (Inheritance)	Diğer Paketler
public	Her yerden erişilebilir.	✅	✅	✅	✅
private	Sadece tanımlandığı sınıfta erişilebilir.	✅	❌	❌	❌
protected	Aynı paket ve alt sınıflardan erişilebilir.	✅	✅	✅	❌
Varsayılan (default)	Sadece aynı paket içindeki sınıflar erişebilir.	✅	✅	❌	❌
🔸 2.2 public Erişim Belirleyici
Tüm sınıflardan erişilebilir.
Global kullanılacak metotlar ve sınıflar genellikle public olarak tanımlanır.
package com.ornek;

public class PublicOrnek {
public String mesaj = "Bu bir public değişkendir.";

    public void goster() {
        System.out.println(mesaj);
    }
}
Başka bir sınıfta:

import com.ornek.PublicOrnek;

public class Main {
public static void main(String[] args) {
PublicOrnek nesne = new PublicOrnek();
nesne.goster();
}
}
📌 Başka paketlerden bile erişilebilir.

🔸 2.3 private Erişim Belirleyici
Sadece tanımlandığı sınıf içinde erişilebilir.
Dışarıdan çağrılamaz.
class PrivateOrnek {
private String gizliMesaj = "Bu bir private değişkendir.";

    private void goster() {
        System.out.println(gizliMesaj);
    }
}
📌 Başka sınıflardan gizliMesaj veya goster() metoduna erişilemez.

🚫 Yanlış Kullanım:

PrivateOrnek nesne = new PrivateOrnek();
nesne.goster(); // HATA! Erişim engellendi.
📌 Ancak getter ve setter metotları ile erişim sağlanabilir.

class PrivateOrnek {
private String gizliMesaj = "Bu bir private değişkendir.";

    public String getMesaj() {
        return gizliMesaj;
    }
}
🔸 2.4 protected Erişim Belirleyici
Aynı paketteki sınıflar ve alt sınıflar (subclass) erişebilir.
Farklı paketlerden sadece extends ile türetilen sınıflar erişebilir.
package com.ornek;

public class ProtectedOrnek {
protected String mesaj = "Bu bir protected değişkendir.";
}
Başka bir paket içindeki alt sınıfta (subclass) kullanılabilir:

import com.ornek.ProtectedOrnek;

public class AltSinif extends ProtectedOrnek {
public void yazdir() {
System.out.println(mesaj);
}
}
📌 Ancak new ile nesne oluşturulursa erişilemez!

ProtectedOrnek nesne = new ProtectedOrnek();
System.out.println(nesne.mesaj); // HATA! Çünkü başka paketteyiz.
🔸 2.5 Varsayılan (Default) Erişim
Eğer erişim belirleyici yazılmazsa, sadece aynı paketteki sınıflar erişebilir.
class DefaultOrnek {
String mesaj = "Bu bir varsayılan (default) değişkendir.";
}
Başka bir pakette:

DefaultOrnek nesne = new DefaultOrnek(); // HATA! Çünkü başka paketteyiz.
📌 Sonuç ve Karşılaştırma
Erişim Belirleyici	Sınıf İçinden	Aynı Paketten	Alt Sınıflardan (Inheritance)	Diğer Paketlerden
public	✅	✅	✅	✅
private	✅	❌	❌	❌
protected	✅	✅	✅	❌
Varsayılan (default)	✅	✅	❌	❌
📌 Paketler ve erişim belirleyiciler, Java’da kodun organize edilmesi ve güvenliği açısından büyük önem taşır! 🚀

Tarih
📌 Java'da Tarihler ve Zaman İşlemleri (Detaylı Açıklama)
Java'da tarih ve zaman işlemleri için birçok sınıf ve API bulunmaktadır. Java 8'den önce ve sonra farklı yöntemler kullanılmıştır.

Java 8 öncesi: java.util.Date, java.util.Calendar, java.text.SimpleDateFormat
Java 8 sonrası: java.time paketi (LocalDate, LocalTime, LocalDateTime, ZonedDateTime, vb.)
🔹 1. Java'da Tarih ve Zaman Kullanımı
✅ 1.1 java.util.Date Sınıfı (Eski Yöntem)
Date sınıfı, tarih ve zaman bilgilerini saklayan eski bir sınıftır.
Ancak modifiye edilemez (immutable) olduğu için yetersizdir.

import java.util.Date;

public class DateExample {
public static void main(String[] args) {
Date simdikiZaman = new Date(); // Şu anki tarih ve saat
System.out.println("Bugünün Tarihi: " + simdikiZaman);
}
}
Çıktı (Anlık Değişir):

Bugünün Tarihi: Mon Feb 12 14:30:21 TRT 2025
📌 Sorunlar:

Zaman dilimi (TimeZone) destekleri yetersizdir.
Daha iyi biçimlendirme ve zaman işlemleri için SimpleDateFormat ve Calendar kullanmak gerekir.
✅ 1.2 SimpleDateFormat ile Tarih Biçimlendirme
SimpleDateFormat kullanarak, tarihleri istenilen formatta gösterebiliriz.

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
public static void main(String[] args) {
Date tarih = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String formatliTarih = sdf.format(tarih);
        System.out.println("Formatlı Tarih: " + formatliTarih);
    }
}
Çıktı:

Formatlı Tarih: 12/02/2025 14:30:21
📌 Format Açıklamaları:

dd → Gün (12)
MM → Ay (02)
yyyy → Yıl (2025)
HH:mm:ss → Saat, dakika, saniye (14:30:21)
✅ 1.3 java.util.Calendar ile Tarih Manipülasyonu
Calendar, Date sınıfının eksikliklerini gidermek için geliştirilmiş bir sınıftır.

import java.util.Calendar;

public class CalendarExample {
public static void main(String[] args) {
Calendar cal = Calendar.getInstance();

        System.out.println("Yıl: " + cal.get(Calendar.YEAR));
        System.out.println("Ay: " + (cal.get(Calendar.MONTH) + 1)); // Aylar 0'dan başlar!
        System.out.println("Gün: " + cal.get(Calendar.DAY_OF_MONTH));
    }
}
📌 Eksikleri:

Karmaşık bir yapıdadır.
Java 8 ile daha modern API'ler gelmiştir.
🔹 2. Java 8 ve Sonrası (java.time Paketi)
📌 Java 8 ile gelen java.time paketi, modern ve güçlü tarih/zaman işlemleri sağlar.

Immutable (değiştirilemez) nesneler oluşturur.
Daha okunaklı ve kolay manipülasyon sağlar.
Zaman dilimleri ve biçimlendirme desteği daha iyidir.
✅ 2.1 LocalDate (Sadece Tarih İçin)
LocalDate, sadece tarih (gün, ay, yıl) bilgisi tutar, saat tutmaz.

import java.time.LocalDate;

public class LocalDateExample {
public static void main(String[] args) {
LocalDate bugun = LocalDate.now(); // Bugünün tarihi
System.out.println("Bugünün Tarihi: " + bugun);

        LocalDate ozelTarih = LocalDate.of(2025, 2, 12); // Özel bir tarih
        System.out.println("Özel Tarih: " + ozelTarih);
    }
}
📌 LocalDate, tarih hesaplamaları için idealdir.

✅ 2.2 LocalTime (Sadece Saat İçin)
LocalTime, sadece saat, dakika, saniye tutar, tarih bilgisi içermez.

import java.time.LocalTime;

public class LocalTimeExample {
public static void main(String[] args) {
LocalTime simdikiSaat = LocalTime.now();
System.out.println("Şu anki saat: " + simdikiSaat);
}
}
Çıktı (Anlık Değişir):

Şu anki saat: 14:30:21.345
📌 Mikrosaniye ve nanosaniye bile içerebilir.

✅ 2.3 LocalDateTime (Tarih ve Saat Birlikte)
LocalDateTime, hem tarih hem de saat bilgisini içerir.

import java.time.LocalDateTime;

public class LocalDateTimeExample {
public static void main(String[] args) {
LocalDateTime simdi = LocalDateTime.now();
System.out.println("Şu an: " + simdi);
}
}
📌 LocalDateTime, LocalDate ve LocalTime birleşimidir.

✅ 2.4 ZonedDateTime (Zaman Dilimi ile Tarih ve Saat)
📌 Farklı zaman dilimlerine göre tarih/saat almak için ZonedDateTime kullanılır.

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
public static void main(String[] args) {
ZonedDateTime istanbulSaati = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
System.out.println("İstanbul Saati: " + istanbulSaati);
}
}
📌 Dünya çapında geçerli zaman dilimlerini kullanarak çalışabilirsiniz.

🔹 3. Java'da Tarih İşlemleri
✅ 3.1 Tarih ve Saat Manipülasyonu
plusDays(), minusMonths(), plusHours() gibi metotlarla tarih/saat hesaplamaları yapılabilir.

import java.time.LocalDate;

public class DateManipulation {
public static void main(String[] args) {
LocalDate bugun = LocalDate.now();
LocalDate birHaftaSonra = bugun.plusDays(7);
LocalDate birAyÖnce = bugun.minusMonths(1);

        System.out.println("Bugün: " + bugun);
        System.out.println("Bir Hafta Sonra: " + birHaftaSonra);
        System.out.println("Bir Ay Önce: " + birAyÖnce);
    }
}
📌 Immutable olduğu için, tarih değişmez, yeni bir tarih nesnesi oluşturulur.

🔹 4. Tarih Karşılaştırma
📌 Tarihler isBefore(), isAfter(), isEqual() metotlarıyla karşılaştırılabilir.

import java.time.LocalDate;

public class DateComparison {
public static void main(String[] args) {
LocalDate tarih1 = LocalDate.of(2025, 2, 12);
LocalDate tarih2 = LocalDate.of(2025, 5, 15);

        System.out.println("tarih1, tarih2'den önce mi? " + tarih1.isBefore(tarih2));
        System.out.println("tarih1, tarih2 ile aynı mı? " + tarih1.isEqual(tarih2));
    }
}
📌 Tarihler sıralama veya geçerlilik kontrollerinde kullanışlıdır.

📌 5. Özet
Sınıf	Ne İçin Kullanılır?
Date	Eski tarih/saat sınıfı, önerilmez.
Calendar	Eski tarih manipülasyonu, önerilmez.
SimpleDateFormat	Tarih biçimlendirme, eski yöntem.
LocalDate	Sadece tarih (yıl, ay, gün).
LocalTime	Sadece saat (saat, dakika, saniye).
LocalDateTime	Tarih + Saat birlikte.
ZonedDateTime	Zaman dilimi ile tarih/saat işlemleri.
📌 Java 8+ ile java.time kullanarak daha güçlü ve güvenilir tarih işlemleri yapabilirsiniz! 🚀

Exception
📌 Java'da Exception (İstisna) Nedir? (Detaylı Açıklama)
# 🔹 1. Exception (İstisna) Nedir?
Exception (İstisna), program çalışırken meydana gelen beklenmedik hatalar ve öngörülemeyen durumları ifade eder.
Java'da Exception Handling (İstisna Yönetimi) sayesinde programın çökmesi engellenir ve hatalar yönetilebilir hale gelir.

📌 Java'da hatalar iki ana kategoriye ayrılır:

Checked Exceptions (Denetlenen İstisnalar)
Unchecked Exceptions (Denetlenmeyen İstisnalar)
# 🔹 2. Java'da Exception Hiyerarşisi
Java'daki tüm hata türleri Throwable sınıfından türetilir.

Throwable
├── Exception  (Checked Exceptions)
│   ├── IOException
│   ├── SQLException
│   ├── FileNotFoundException
│   ├── ClassNotFoundException
│   ├── InterruptedException
│
├── RuntimeException (Unchecked Exceptions)
│   ├── ArithmeticException
│   ├── NullPointerException
│   ├── ArrayIndexOutOfBoundsException
│   ├── IllegalArgumentException
│   ├── NumberFormatException
│
└── Error
├── StackOverflowError
├── OutOfMemoryError
├── VirtualMachineError
📌 2.1 Exception (İstisna)
Programcı tarafından kontrol edilebilir hatalardır.
try-catch blokları ile yakalanabilir.
Örnekler: IOException, SQLException, FileNotFoundException.
📌 2.2 RuntimeException (Çalışma Zamanı İstisnaları)
Kod çalıştırıldığında ortaya çıkan beklenmedik hatalardır.
Önceden kontrol edilmek zorunda değildir.
Örnekler: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException.
📌 2.3 Error (Sistemsel Hatalar)
Programcı tarafından kontrol edilemez.
Genellikle JVM kaynaklı hatalardır.
Örnekler: OutOfMemoryError, StackOverflowError.
🔹 3. Java'da Exception Handling (İstisna Yönetimi)
✅ 3.1 try-catch Blokları ile Hata Yönetimi
try-catch bloğu, hata alabilecek kodları yönetmek için kullanılır.

public class TryCatchExample {
public static void main(String[] args) {
try {
int sayi = 10 / 0; // Hata: Bölme işlemi sıfıra bölünemez!
} catch (ArithmeticException e) {
System.out.println("Hata: Sıfıra bölme hatası!");
}
System.out.println("Program devam ediyor...");
}
}
Çıktı:

Hata: Sıfıra bölme hatası!
Program devam ediyor...
📌 try bloğu hata içerirse, catch bloğu devreye girer ve program çökmeden devam eder.

✅ 3.2 Multiple Catch (Birden Fazla catch Bloğu Kullanımı)
Farklı hataları yakalamak için birden fazla catch bloğu kullanılabilir.

public class MultipleCatchExample {
public static void main(String[] args) {
try {
int[] dizi = {1, 2, 3};
System.out.println(dizi[5]); // Hata: Dizinin sınırları aşılıyor!
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Hata: Dizi sınırları aşıldı!");
} catch (ArithmeticException e) {
System.out.println("Hata: Matematiksel hata!");
}
System.out.println("Program devam ediyor...");
}
}
Çıktı:

Hata: Dizi sınırları aşıldı!
Program devam ediyor...
📌 Her catch bloğu, farklı hata türlerini yakalamak için kullanılır.

✅ 3.3 finally Bloğu (Her Koşulda Çalışan Kod)
finally bloğu, hata olsun ya da olmasın her durumda çalışır.
Genellikle kaynakları kapatmak için kullanılır (File, Database Connection, vb.).
public class FinallyExample {
public static void main(String[] args) {
try {
int sonuc = 10 / 2;
System.out.println("Sonuç: " + sonuc);
} catch (ArithmeticException e) {
System.out.println("Hata: Matematiksel hata!");
} finally {
System.out.println("Bu blok her zaman çalışır!");
}
}
}
Çıktı:

Sonuç: 5
Bu blok her zaman çalışır!
📌 Hata olsun veya olmasın, finally bloğu her zaman çalışır.

✅ 3.4 throws ile Hata Bildirme
📌 Bir metot hata üretebiliyorsa, bunu throws ile belirtmelidir.

import java.io.*;

public class ThrowsExample {
public static void dosyaOku() throws IOException {
FileReader file = new FileReader("dosya.txt");
BufferedReader br = new BufferedReader(file);
System.out.println(br.readLine());
}

    public static void main(String[] args) {
        try {
            dosyaOku();
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası!");
        }
    }
}
📌 throws, metot içinde oluşabilecek hataları bildirmek için kullanılır.

✅ 3.5 throw ile Manuel Hata Fırlatma
📌 Kendi özel hatalarınızı fırlatmak için throw kullanılır.

public class ThrowExample {
public static void kontrolEt(int yas) {
if (yas < 18) {
throw new IllegalArgumentException("Yaş 18'den küçük olamaz!");
}
System.out.println("Giriş başarılı.");
}

    public static void main(String[] args) {
        kontrolEt(16); // Hata fırlatılır
    }
}
Çıktı:

Exception in thread "main" java.lang.IllegalArgumentException: Yaş 18'den küçük olamaz!
📌 throw, özel hatalar oluşturmak için kullanılır.

🔹 4. Özel Exception (Custom Exception)
Java'da kendimize özel hata sınıfları oluşturabiliriz.

class YasHatasi extends Exception {
public YasHatasi(String mesaj) {
super(mesaj);
}
}

public class CustomExceptionExample {
public static void kontrolEt(int yas) throws YasHatasi {
if (yas < 18) {
throw new YasHatasi("Yaş 18'den küçük olamaz!");
}
System.out.println("Giriş başarılı.");
}

    public static void main(String[] args) {
        try {
            kontrolEt(16);
        } catch (YasHatasi e) {
            System.out.println("Özel Hata: " + e.getMessage());
        }
    }
}
Çıktı:

Özel Hata: Yaş 18'den küçük olamaz!
📌 Kendi hata türlerimizi oluşturup fırlatabiliriz.

📌 5. Özet
Exception Türü	Açıklama	Örnek
Checked Exception	Derleme (compile-time) sırasında kontrol edilir.	IOException, SQLException
Unchecked Exception	Çalışma zamanında (runtime) meydana gelir.	NullPointerException, ArithmeticException
Error	Sistem kaynaklı büyük hatalar.	StackOverflowError, OutOfMemoryError
📌 Exception Handling ile programlarımız hata alsa bile çökmemeyi ve düzgün çalışmayı sürdürmeyi başarabilir. 🚀

javda null değeri ne zaman kullanmalıyım ?
Java'da null değeri, bir referansın herhangi bir nesneyi işaret etmediğini belirtmek için kullanılır. Ancak, dikkatli kullanılmalıdır, çünkü NullPointerException hatasına neden olabilir.

# 1. null Ne Zaman Kullanılır?
   a) Nesne Başlatmadan (Initialize) Kullanım
   Bir String veya nesne henüz belirsizse null atanabilir:
   String metin = null;
   System.out.println(metin); // null
   Ancak, kullanılmadan önce null kontrolü yapılmalıdır:
   if (metin != null) {
   System.out.println(metin.length()); // NullPointerException'ı önler
   }
   b) Nesne Ataması Sonradan Yapılacaksa
   Eğer bir nesne ilerleyen aşamalarda atanacaksa ama şimdilik bir değere sahip olmaması gerekiyorsa:
   class Araba {
   String model = null; // Model henüz belirlenmedi
   }
   Böylece ilk başta bellek tüketilmez, nesne oluşturulduğunda atanır.
   c) Bir Nesne Serbest Bırakılmak (Garbage Collection) İstenirse
   Java'da manuel bellek yönetimi yoktur, ancak bir nesne null yapılarak çöp toplayıcının (Garbage Collector) temizlemesine izin verilebilir.
   Araba araba = new Araba();
   araba = null; // Garbage Collector artık bu nesneyi temizleyebilir
   d) Koleksiyonlarda Başlangıç Değeri Olarak
   Eğer bir List veya Map içinde başlangıçta bir değerin olmaması gerekiyorsa:
   Map<String, String> isimler = new HashMap<>();
   isimler.put("Ali", null); // Ali için henüz bir değer yok
   Ancak, null yerine Optional kullanımı önerilir (bkz. Optional<T>).
# 2. null Kullanımında Dikkat Edilmesi Gerekenler
   🚨 NullPointerException (NPE) Hatası
   Eğer null olan bir nesneye metot çağrısı yapılırsa:

String kelime = null;
System.out.println(kelime.length()); // 🚨 NullPointerException Hatası!
Çözüm: null kontrolü yapın:

if (kelime != null) {
System.out.println(kelime.length());
}
# 3. null Kullanımına Alternatifler
   a) Optional<T> Kullanımı (Tavsiye Edilir ✅)
   Java 8+, null hatalarını önlemek için Optional<T> sunar:
   Optional<String> kelime = Optional.ofNullable(null);
   System.out.println(kelime.orElse("Varsayılan Değer")); // Varsayılan Değer
   ✅ Avantajı: null kontrollerini otomatik yapar.

b) Boş String Kullanımı ("" yerine null)
Bazı durumlarda null yerine boş string ("") kullanmak daha güvenli olabilir:

String mesaj = ""; // NullPointerException riski yok
# 4. Özet: null Kullanımı
   Durum	Kullanım
   Değişkenin başlatılmadığını belirtmek için	✅ Kullanılabilir
   Bir nesnenin çöp toplayıcı tarafından temizlenmesini sağlamak için	✅ Kullanılabilir
   Koleksiyonlarda bilinmeyen değerler için	✅ Kullanılabilir (Ancak Optional önerilir)
   Metot çağrılarında ve işlemlerde null değer beklenmiyorsa	🚫 Kullanılmamalı (Yerine Optional veya boş nesne kullanılmalı)
   Kontrol edilmeden null üzerinden işlem yapmak (.length(), .get(), vb.)	🚫 NullPointerException hatasına neden olabilir
   ✅ Sonuç: null dikkatli kullanılmalıdır. Gereksiz null kullanımı yerine Optional<T>, varsayılan değerler veya boş nesneler kullanılabilir. 🚀

Dizi(Array)
**Java'da Dizi (Array) Nedir? **
📌 1. Dizi (Array) Nedir?
Java'da dizi (array), aynı veri tipindeki birden fazla elemanı tek bir değişken içinde saklamak için kullanılır.
Diziler:

Sabit bir boyuta sahiptirler (Oluşturulduktan sonra boyutu değiştirilemez).
Aynı türden elemanları saklarlar (int, double, String, vb.).
Dizi indisleri (index) 0'dan başlar.
Diziler bellek üzerinde bitişik (contiguous) olarak saklanır.
📌 2. Java’da Dizi Tanımlama ve Kullanımı
✅ 2.1 Dizi Tanımlama
Dizi tanımlamanın iki temel yolu vardır:

1️⃣ İlk Yöntem: Dizi Tanımlama ve Bellekte Yer Ayırma

int[] sayilar = new int[5]; // 5 elemanlı bir int dizisi
Dizinin boyutu 5 olarak belirlendi ve varsayılan değerlerle (0) dolduruldu.
2️⃣ İkinci Yöntem: Tanımlama ve Değer Atama

int[] sayilar = {10, 20, 30, 40, 50};
Dizi doğrudan tanımlandı ve elemanları atandı.
📌 Önemli:

Java’da dizinin boyutu sonradan değiştirilemez.
Bir dizi null olabilir ama başlangıçta boyutu belirtilmeden oluşturulamaz.
🚫 Hatalı Tanımlama

int[] dizi;
dizi = {1, 2, 3, 4}; // HATA! Doğrudan böyle atama yapılamaz.
✅ Doğru Kullanım

int[] dizi;
dizi = new int[]{1, 2, 3, 4};
📌 3. Dizi Elemanlarına Erişim ve Değiştirme
Dizi elemanlarına indeks (index) numarası kullanılarak erişilir.

public class DiziErisim {
public static void main(String[] args) {
int[] sayilar = {10, 20, 30, 40, 50};

        // Dizinin 0. elemanını yazdırma
        System.out.println("İlk eleman: " + sayilar[0]); // 10
        
        // Dizinin 2. elemanını değiştirme
        sayilar[2] = 100;
        
        System.out.println("Yeni 2. eleman: " + sayilar[2]); // 100
    }
}
📌 Dizi indisleri 0'dan başlar ve dizi.length - 1 kadar gider.

📌 4. Dizinin Boyutunu Öğrenme
Java'da bir dizinin boyutu, .length özelliği ile öğrenilir.

public class DiziBoyutu {
public static void main(String[] args) {
int[] dizi = {10, 20, 30, 40};
System.out.println("Dizi uzunluğu: " + dizi.length); // 4
}
}
📌 Dikkat:

dizi.length bir metot değil, bir özelliktir (() parantezleri kullanılmaz).
📌 5. Dizi Üzerinde Döngüler Kullanımı
✅ 5.1 for Döngüsü ile Dizi Kullanımı
public class DiziDongu {
public static void main(String[] args) {
int[] sayilar = {5, 10, 15, 20, 25};

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Eleman " + i + ": " + sayilar[i]);
        }
    }
}
Çıktı:

Eleman 0: 5
Eleman 1: 10
Eleman 2: 15
Eleman 3: 20
Eleman 4: 25
✅ 5.2 for-each Döngüsü ile Dizi Kullanımı
public class ForEachOrnek {
public static void main(String[] args) {
String[] diller = {"Java", "Python", "C++", "JavaScript"};

        for (String dil : diller) {
            System.out.println("Programlama Dili: " + dil);
        }
    }
}
Çıktı:

Programlama Dili: Java
Programlama Dili: Python
Programlama Dili: C++
Programlama Dili: JavaScript
📌 for-each dizileri gezmek için kullanışlıdır ama dizinin indeksine erişemez.

📌 6. Çok Boyutlu Diziler (Multidimensional Arrays)
✅ 6.1 İki Boyutlu (2D) Dizi Tanımlama
int[][] matris = new int[3][3]; // 3x3'lük bir matris
📌 Başlangıç değerleri 0 olur.

✅ 6.2 Değer Atama ve Erişim
public class IkiBoyutluDizi {
public static void main(String[] args) {
int[][] matris = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};

        System.out.println("Orta Eleman: " + matris[1][1]); // 5
    }
}
📌 İlk indeks satır, ikinci indeks sütunu temsil eder.

✅ 6.3 for Döngüsü ile Çok Boyutlu Diziyi Yazdırma
public class MatrisYazdirma {
public static void main(String[] args) {
int[][] matris = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Çıktı:

1 2 3
4 5 6
7 8 9
📌 matris.length satır sayısını, matris[i].length sütun sayısını verir.

📌 7. Java’da Dizi Kopyalama
✅ 7.1 System.arraycopy() Kullanımı
public class DiziKopyalama {
public static void main(String[] args) {
int[] orijinal = {1, 2, 3, 4, 5};
int[] kopya = new int[5];

        System.arraycopy(orijinal, 0, kopya, 0, 5);

        for (int eleman : kopya) {
            System.out.print(eleman + " ");
        }
    }
}
Çıktı:

1 2 3 4 5
📌 Diziyi manuel kopyalamaya göre daha verimlidir.

📌 8. Arrays Sınıfı ile Dizi İşlemleri
Java’nın java.util.Arrays sınıfı, diziler için yardımcı metotlar içerir.

✅ 8.1 Arrays.toString() - Diziyi String'e Çevirme
import java.util.Arrays;

public class ArraysExample {
public static void main(String[] args) {
int[] sayilar = {3, 1, 4, 1, 5};
System.out.println(Arrays.toString(sayilar));
}
}
Çıktı:

[3, 1, 4, 1, 5]
📌 9. Özet
Özellik	Açıklama
Dizi Tanımlama	int[] dizi = new int[5];
Diziye Değer Atama	dizi[0] = 10;
Dizi Boyutu	dizi.length
Tek Boyutlu Dizi	{10, 20, 30}
Çok Boyutlu Dizi	int[][] matris = new int[3][3];
Dizi Kopyalama	System.arraycopy()
Dizi Sıralama	Arrays.sort(dizi);
📌 Java’da diziler, veri saklama ve yönetme açısından oldukça önemli yapılardır! 🚀

Erişim Belirleyiciler
📌 Java'da Paketler (Packages) ve Erişim Belirleyiciler (Access Modifiers) Nedir? (Detaylı Açıklama)
Java'da paketler (packages) ve erişim belirleyiciler (access modifiers), programların düzenlenmesi, modüler hale getirilmesi ve erişim kontrolü sağlanması için kullanılan iki temel yapıdır.

🔹 1. Java'da Paketler (Packages) Nedir?
📌 Paket (Package), benzer sınıfları (class), arayüzleri (interface) ve diğer bileşenleri bir arada tutan bir dizin yapısıdır.
Paketler sayesinde:

Kod daha düzenli hale gelir.
Ad çakışmaları (name conflict) önlenir.
Erişim belirleyicilerle güvenlik sağlanır.
Yeniden kullanılabilir bileşenler oluşturulabilir.
🔸 1.1 Paket Tanımlama ve Kullanımı
Bir Java dosyasında paketi belirlemek için package anahtar kelimesi kullanılır. Dosyanın en üstüne yazılmalıdır.

package com.ornek.paket; // Paketin tanımlanması

public class Selam {
public void mesaj() {
System.out.println("Merhaba, paket kullanımı!");
}
}
📌 Paket ismi, genellikle ters domain adı şeklinde belirlenir.
Örneğin:

package com.google.search;
package org.apache.commons;
🔸 1.2 Paket İçindeki Sınıfı Kullanma (import)
Başka bir paketten bir sınıf kullanmak için import ifadesi kullanılır.

import com.ornek.paket.Selam; // Paket içindeki sınıfı dahil ettik

public class Main {
public static void main(String[] args) {
Selam nesne = new Selam();
nesne.mesaj();
}
}
📌 Eğer aynı paketteysek, import kullanmadan doğrudan sınıfı çağırabiliriz.

🔸 1.3 Tüm Paket İçeriğini Dahil Etme
Eğer bir paketin tüm sınıflarını kullanmak istiyorsak, * karakterini kullanabiliriz.

import com.ornek.paket.*;

public class Main {
public static void main(String[] args) {
Selam nesne = new Selam();
nesne.mesaj();
}
}
📌 Ancak, import ile sadece kullanılacak sınıfları dahil etmek daha performanslıdır.

🔸 1.4 static import ile Metotları ve Değişkenleri Dahil Etme
Bazı durumlarda, sınıf adını yazmadan doğrudan bir metot veya değişkene erişmek için static import kullanılabilir.

import static java.lang.Math.*;

public class MathExample {
public static void main(String[] args) {
System.out.println(sqrt(25)); // 5.0
System.out.println(pow(2, 3)); // 8.0
}
}
📌 Normalde Math.sqrt(25) şeklinde çağırılır. Ancak static import sayesinde sqrt(25) olarak doğrudan çağrılabilir.

🔸 1.5 Varsayılan Paket (Default Package)
Eğer package ifadesi kullanılmazsa, sınıf varsayılan pakette (default package) olur.
Ancak varsayılan paket kullanımı büyük projelerde önerilmez.

public class Varsayilan {
public void mesaj() {
System.out.println("Varsayılan paket içindeyim.");
}
}
Bu sınıf, herhangi bir pakete ait olmadığı için diğer paketler tarafından doğrudan kullanılamaz.

🔹 2. Java’da Erişim Belirleyiciler (Access Modifiers)
Erişim belirleyiciler, sınıf, metot ve değişkenlerin erişim seviyelerini belirler.

🔸 2.1 Java'daki Erişim Belirleyiciler
Erişim Belirleyici	Açıklama	Aynı Sınıf	Aynı Paket	Alt Sınıflar (Inheritance)	Diğer Paketler
public	Her yerden erişilebilir.	✅	✅	✅	✅
private	Sadece tanımlandığı sınıfta erişilebilir.	✅	❌	❌	❌
protected	Aynı paket ve alt sınıflardan erişilebilir.	✅	✅	✅	❌
Varsayılan (default)	Sadece aynı paket içindeki sınıflar erişebilir.	✅	✅	❌	❌
🔸 2.2 public Erişim Belirleyici
Tüm sınıflardan erişilebilir.
Global kullanılacak metotlar ve sınıflar genellikle public olarak tanımlanır.
package com.ornek;

public class PublicOrnek {
public String mesaj = "Bu bir public değişkendir.";

    public void goster() {
        System.out.println(mesaj);
    }
}
Başka bir sınıfta:

import com.ornek.PublicOrnek;

public class Main {
public static void main(String[] args) {
PublicOrnek nesne = new PublicOrnek();
nesne.goster();
}
}
📌 Başka paketlerden bile erişilebilir.

🔸 2.3 private Erişim Belirleyici
Sadece tanımlandığı sınıf içinde erişilebilir.
Dışarıdan çağrılamaz.
class PrivateOrnek {
private String gizliMesaj = "Bu bir private değişkendir.";

    private void goster() {
        System.out.println(gizliMesaj);
    }
}
📌 Başka sınıflardan gizliMesaj veya goster() metoduna erişilemez.

🚫 Yanlış Kullanım:

PrivateOrnek nesne = new PrivateOrnek();
nesne.goster(); // HATA! Erişim engellendi.
📌 Ancak getter ve setter metotları ile erişim sağlanabilir.

class PrivateOrnek {
private String gizliMesaj = "Bu bir private değişkendir.";

    public String getMesaj() {
        return gizliMesaj;
    }
}
🔸 2.4 protected Erişim Belirleyici
Aynı paketteki sınıflar ve alt sınıflar (subclass) erişebilir.
Farklı paketlerden sadece extends ile türetilen sınıflar erişebilir.
package com.ornek;

public class ProtectedOrnek {
protected String mesaj = "Bu bir protected değişkendir.";
}
Başka bir paket içindeki alt sınıfta (subclass) kullanılabilir:

import com.ornek.ProtectedOrnek;

public class AltSinif extends ProtectedOrnek {
public void yazdir() {
System.out.println(mesaj);
}
}
📌 Ancak new ile nesne oluşturulursa erişilemez!

ProtectedOrnek nesne = new ProtectedOrnek();
System.out.println(nesne.mesaj); // HATA! Çünkü başka paketteyiz.
🔸 2.5 Varsayılan (Default) Erişim
Eğer erişim belirleyici yazılmazsa, sadece aynı paketteki sınıflar erişebilir.
class DefaultOrnek {
String mesaj = "Bu bir varsayılan (default) değişkendir.";
}
Başka bir pakette:

DefaultOrnek nesne = new DefaultOrnek(); // HATA! Çünkü başka paketteyiz.
📌 Sonuç ve Karşılaştırma
Erişim Belirleyici	Sınıf İçinden	Aynı Paketten	Alt Sınıflardan (Inheritance)	Diğer Paketlerden
public	✅	✅	✅	✅
private	✅	❌	❌	❌
protected	✅	✅	✅	❌
Varsayılan (default)	✅	✅	❌	❌
📌 Paketler ve erişim belirleyiciler, Java’da kodun organize edilmesi ve güvenliği açısından büyük önem taşır! 🚀

Formatter
📌 Java Formatter Nedir? (Detaylı Anlatım)
Formatter sınıfı, Java'da metinleri biçimlendirmek (formatlamak) için kullanılan bir sınıftır. printf(), String.format() gibi yöntemlerle çalışır ve sayıları, tarihleri, metinleri özel formatlara sokmak için kullanılır.

📌 Kullanım Alanları
✅ Metin biçimlendirme (String.format() ve printf())
✅ Sayıları belirli ondalık hassasiyette göstermek
✅ Tarih ve saat biçimlendirme
✅ Tablolar, raporlar veya dosya çıktıları için veri düzenleme

1️⃣ Formatter Kullanımı
java.util.Formatter doğrudan kullanılabilir. Ancak genellikle String.format() veya System.out.printf() ile dolaylı olarak kullanılır.

import java.util.Formatter;

public class Main {
public static void main(String[] args) {
Formatter formatter = new Formatter();
formatter.format("Merhaba %s, yaşınız %d", "Ahmet", 25);
System.out.println(formatter);
formatter.close();
}
}
🎯 Çıktı:

Merhaba Ahmet, yaşınız 25
📌 Açıklamalar:
%s → String türü için yer tutucu.
%d → Tam sayı türü için yer tutucu.
formatter.close(); → Formatter’ı kapatarak belleği serbest bırakır.
2️⃣ String.format() ile Kullanım (Önerilen)
Formatter kullanmanın en yaygın yolu String.format() metodudur. Bu yöntemle formatlı bir String döndürülür.

public class Main {
public static void main(String[] args) {
String formattedString = String.format("Merhaba %s, yaşınız %d", "Ayşe", 30);
System.out.println(formattedString);
}
}
🎯 Çıktı:

Merhaba Ayşe, yaşınız 30
📌 String.format() kullanmanın avantajı: ✅ Tek satırda formatlama sağlar.
✅ Formatter nesnesi oluşturmaya gerek kalmaz.
✅ Daha az bellek tüketir.

3️⃣ printf() ile Kullanım
Eğer doğrudan ekrana yazdırmak istiyorsanız System.out.printf() kullanabilirsiniz.

public class Main {
public static void main(String[] args) {
System.out.printf("Merhaba %s, yaşınız %d\n", "Mehmet", 40);
}
}
🎯 Çıktı:

Merhaba Mehmet, yaşınız 40
4️⃣ Biçimlendirme (Format Specifiers)
Java Formatter'da kullanılan temel format belirteçleri şunlardır:

Belirteç	Açıklama	Örnek Kullanım	Çıktı
%d	Tam sayı	System.out.printf("%d", 25);	25
%f	Ondalıklı sayı	System.out.printf("%.2f", 3.14159);	3.14
%s	String	System.out.printf("%s", "Merhaba");	Merhaba
%c	Tek karakter	System.out.printf("%c", 'A');	A
%b	Boolean	System.out.printf("%b", true);	true
%n	Yeni satır	System.out.printf("Merhaba%nDünya");	Merhaba (alt satır) Dünya
5️⃣ Ondalıklı Sayılar için Biçimlendirme
public class Main {
public static void main(String[] args) {
double pi = 3.14159265359;
System.out.printf("Pi sayısı: %.2f\n", pi); // 2 ondalık basamak göster
}
}
🎯 Çıktı:

Pi sayısı: 3.14
✔ %.2f → Ondalıklı sayıyı iki basamağa yuvarlar.
✔ %.3f → Üç basamak gösterir.

6️⃣ Sayıları Sağdan ve Soldan Hizalama
Metinleri hizalamak için %10s veya %-10s gibi formatlar kullanılabilir.

public class Main {
public static void main(String[] args) {
System.out.printf("|%10s|%n", "Merhaba");  // Sağdan hizalar
System.out.printf("|%-10s|%n", "Merhaba"); // Soldan hizalar
}
}
🎯 Çıktı:

|   Merhaba|
|Merhaba   |
✔ %10s → Sağdan hizalar ve boşluk ekler.
✔ %-10s → Soldan hizalar ve boşluk ekler.

7️⃣ Sayıları Sıfır ile Doldurma
Sayının önüne sıfır eklemek için %0Xd kullanılabilir (X karakter sayısıdır).

public class Main {
public static void main(String[] args) {
System.out.printf("%05d\n", 42);
}
}
🎯 Çıktı:

00042
✔ %05d → 5 haneli yapar ve eksik kısımları 0 ile doldurur.

8️⃣ Para Birimi Formatlama
Locale kullanarak farklı ülkelerin para birimini formatlayabiliriz.

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
public static void main(String[] args) {
double amount = 1234567.89;
NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
System.out.println(currencyFormatter.format(amount)); // ABD formatı
}
}
🎯 Çıktı:

$1,234,567.89
✔ Locale.US → Amerikan dolar formatına göre gösterir.
✔ Locale.FRANCE → Fransız para formatına çevirir.

9️⃣ Tarih ve Saat Formatlama
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
public static void main(String[] args) {
Date now = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
System.out.println(sdf.format(now));
}
}
🎯 Çıktı:

15-02-2025 14:45:30
🔍 Formatter mı, String.format() mı?
Özellik	Formatter	String.format()
Nesne oluşturma	Formatter formatter = new Formatter();	String.format() ile tek satır
Bellek tüketimi	Daha fazla bellek kullanır	Daha az bellek kullanır
Kullanım kolaylığı	Daha karmaşık	Daha kolay
📌 Genellikle String.format() önerilir!

✅ Özet
Formatter, Java'da metin, sayı ve tarih biçimlendirmek için kullanılır.
String.format() ve printf(), Formatter sınıfını kullanmanın en yaygın yollarıdır.
Sayıları ve tarihleri formatlamak, ondalık hassasiyet eklemek, hizalama yapmak için çok kullanışlıdır.
Java'da biçimlendirilmiş çıktılar oluşturmak için Formatter sınıfını etkili şekilde kullanabilirsin! 🚀

Renk Çıktıları
Java'nın standart System.out.println() veya System.out.printf() çıktıları renkli desteklemez, ancak ANSI kaçış kodları (ANSI Escape Codes) kullanarak terminalde renkli metinler yazdırabilirsiniz. 🚀

📌 1️⃣ ANSI Kaçış Kodları ile Renkli Çıktılar
Java'da terminale renkli metin yazdırmak için aşağıdaki ANSI kodlarını kullanabilirsiniz:

🟢 Renk Kodu Tablosu
Renk	Kod
🔴 Kırmızı	\033[31m
🟢 Yeşil	\033[32m
🟡 Sarı	\033[33m
🔵 Mavi	\033[34m
🟣 Mor	\033[35m
🔵 Açık Mavi	\033[36m
⚪ Beyaz	\033[37m
🖤 Siyah	\033[30m
⚫ Arkaplan Siyah	\033[40m
🔴 Arkaplan Kırmızı	\033[41m
🟢 Arkaplan Yeşil	\033[42m
🔵 Arkaplan Mavi	\033[44m
⚠️ Önemli Not: Bu yöntem Windows Terminal, macOS, Linux, IntelliJ IDEA ve bazı IDE'lerde çalışır, ancak Eclipse gibi IDE'lerde desteklenmeyebilir.

🛠 Örnek: Java'da Renkli Çıktı
public class Main {
// ANSI Renk Kodları
public static final String RESET = "\033[0m";  // Renk sıfırlama
public static final String RED = "\033[31m";   // Kırmızı
public static final String GREEN = "\033[32m"; // Yeşil
public static final String YELLOW = "\033[33m";// Sarı
public static final String BLUE = "\033[34m";  // Mavi
public static final String PURPLE = "\033[35m";// Mor
public static final String CYAN = "\033[36m";  // Açık Mavi

    public static void main(String[] args) {
        System.out.println(RED + "Bu kırmızı renkte!" + RESET);
        System.out.println(GREEN + "Bu yeşil renkte!" + RESET);
        System.out.println(YELLOW + "Bu sarı renkte!" + RESET);
        System.out.println(BLUE + "Bu mavi renkte!" + RESET);
        System.out.println(PURPLE + "Bu mor renkte!" + RESET);
        System.out.println(CYAN + "Bu açık mavi renkte!" + RESET);
    }
}
🎯 Çıktı (Terminalde):

🔴 Bu kırmızı renkte!
🟢 Bu yeşil renkte!
🟡 Bu sarı renkte!
🔵 Bu mavi renkte!
🟣 Bu mor renkte!
🔵 Bu açık mavi renkte!
✔ RESET → Yazdırdıktan sonra rengi sıfırlar.
✔ Her rengin sonunda + RESET eklenmelidir, yoksa sonraki tüm çıktılar o renkte kalır.

📌 2️⃣ String.format() ile Renkli Çıktı
String.format() ile de renk kodlarını kullanabiliriz:

public class Main {
public static final String GREEN = "\033[32m"; // Yeşil
public static final String RESET = "\033[0m";  // Renk sıfırlama

    public static void main(String[] args) {
        String formattedString = String.format(GREEN + "Merhaba %s, yaşınız %d" + RESET, "Hamit", 30);
        System.out.println(formattedString);
    }
}
🎯 Çıktı (Terminalde Yeşil Renkli)

Merhaba Hamit, yaşınız 30
📌 3️⃣ System.out.printf() ile Renkli Çıktı
Aynı yöntemi printf() ile de uygulayabiliriz:

public class Main {
public static final String RED = "\033[31m";   // Kırmızı
public static final String RESET = "\033[0m";  // Sıfırlama

    public static void main(String[] args) {
        System.out.printf(RED + "Hata: %s dosyası bulunamadı!%n" + RESET, "config.txt");
    }
}
🎯 Çıktı (Kırmızı Renk)

Hata: config.txt dosyası bulunamadı!
📌 4️⃣ Renkli Metin Formatlama Metodu
Tekrar eden renk kodlarından kurtulmak için bir metot yazabiliriz:

public class Main {
public static final String RESET = "\033[0m";
public static final String BLUE = "\033[34m";
public static final String GREEN = "\033[32m";
public static final String RED = "\033[31m";

    public static String colorText(String text, String color) {
        return color + text + RESET;
    }

    public static void main(String[] args) {
        System.out.println(colorText("Bu mavi renkte!", BLUE));
        System.out.println(colorText("Bu yeşil renkte!", GREEN));
        System.out.println(colorText("Bu kırmızı renkte!", RED));
    }
}
✔ colorText() metodu ile her seferinde renk kodlarını eklemeye gerek kalmaz.
✔ Kod daha okunaklı hale gelir. 🚀

📌 5️⃣ Renkli Arkaplan Kullanalım!
Metin rengi yerine arkaplan rengini değiştirebiliriz:

public class Main {
public static final String RESET = "\033[0m";
public static final String BLACK_BG = "\033[40m"; // Siyah Arkaplan
public static final String RED_BG = "\033[41m";   // Kırmızı Arkaplan
public static final String GREEN_BG = "\033[42m"; // Yeşil Arkaplan

    public static void main(String[] args) {
        System.out.println(RED_BG + "Bu metnin arka planı kırmızı!" + RESET);
        System.out.println(GREEN_BG + "Bu metnin arka planı yeşil!" + RESET);
    }
}
🎯 Çıktı (Terminalde Arkaplan Renkli)

🟥 Bu metnin arka planı kırmızı!
🟩 Bu metnin arka planı yeşil!
⚠️ Önemli Notlar
❌ Eclipse gibi IDE'lerde ANSI renkleri desteklenmez.
✅ Terminal, IntelliJ IDEA ve VS Code Terminal'de çalışır.
✅ Windows 10+ veya Linux/macOS’ta desteklenir.
✅ Windows'ta CMD yerine PowerShell veya Windows Terminal kullanmalısınız.

🎯 Sonuç
✔ Java'da renkli metinler yazdırmak için ANSI kaçış kodlarını kullanabilirsin.
✔ String.format(), printf() ve System.out.println() ile renkli çıktı alınabilir.
✔ Renk kodlarını metodlaştırarak daha temiz bir kod yazabilirsin.
✔ Arkaplan renkleri de desteklenir!

Bu yöntemle Java çıktılarınızı daha okunaklı ve şık hale getirebilirsiniz! 🚀✨

Array (Diziler)
Java'da Diziler (Arrays) Detaylı Açıklama
Java'da diziler (arrays), aynı türdeki verileri belirli bir sıralamada saklamak için kullanılan veri yapılarıdır. Java'daki diziler, sabit boyutlu, sıralı ve indeks tabanlı veri yapılarıdır.

1. Dizi Tanımlama ve Başlatma
   Bir dizi, belirli bir veri tipindeki elemanları saklayan nesne olarak oluşturulur.

1.1. Dizi Tanımlama (Declaration)
Bir dizi değişkeni tanımlamak için aşağıdaki sözdizimi kullanılır:

veri_tipi[] dizi_adi;  // Tercih edilen kullanım
veri_tipi dizi_adi[];  // Alternatif kullanım
Örnek:

int[] sayilar; // Tercih edilen kullanım
double ondaliklar[]; // Alternatif kullanım
1.2. Dizi Oluşturma (Instantiation)
Java'da diziler, new anahtar kelimesi kullanılarak oluşturulur. Dizinin boyutu sabittir ve sonradan değiştirilemez.

dizi_adi = new veri_tipi[boyut];
Örnek:

sayilar = new int[5]; // 5 elemanlı bir int dizisi oluşturuldu.
Tek satırda tanımlama ve oluşturma:

int[] sayilar = new int[5];
2. Diziye Değer Atama
   Bir diziye değer atamak için indeks (index) numarası kullanılır. Java'da diziler 0'dan başlar.

Örnek:

int[] sayilar = new int[5];

sayilar[0] = 10;
sayilar[1] = 20;
sayilar[2] = 30;
sayilar[3] = 40;
sayilar[4] = 50;
Alternatif olarak, diziyi doğrudan başlatabilirsiniz:

int[] sayilar = {10, 20, 30, 40, 50};
3. Dizinin Uzunluğunu Bulma
   Dizinin uzunluğu .length özelliği ile bulunur:

System.out.println("Dizinin uzunluğu: " + sayilar.length);
4. Dizi Elemanlarını Döngüyle Erişme
   Dizilerde elemanlara erişmek için for ve foreach döngüleri kullanılabilir.

4.1. For Döngüsü ile Erişim
for (int i = 0; i < sayilar.length; i++) {
System.out.println("Eleman " + i + ": " + sayilar[i]);
}
4.2. Foreach Döngüsü ile Erişim
for (int eleman : sayilar) {
System.out.println(eleman);
}
5. Çok Boyutlu Diziler
   Java'da çok boyutlu diziler (matrisler) oluşturulabilir.

5.1. İki Boyutlu Dizi Tanımlama
int[][] matris = new int[3][3]; // 3x3 boyutunda bir matris
5.2. Matris İçin Değer Atama
matris[0][0] = 1;
matris[0][1] = 2;
matris[0][2] = 3;
matris[1][0] = 4;
matris[1][1] = 5;
matris[1][2] = 6;
matris[2][0] = 7;
matris[2][1] = 8;
matris[2][2] = 9;
5.3. Matris İçin Döngü Kullanımı
for (int i = 0; i < matris.length; i++) {
for (int j = 0; j < matris[i].length; j++) {
System.out.print(matris[i][j] + " ");
}
System.out.println();
}
6. Dizi ile İlgili Önemli Metotlar
   Java'da diziler için bazı kullanışlı metotlar Arrays sınıfı ile sağlanır.

import java.util.Arrays;

public class DiziMetotlari {
public static void main(String[] args) {
int[] sayilar = {5, 3, 8, 1, 2};

        // Diziyi sıralama
        Arrays.sort(sayilar);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(sayilar));

        // Belirli bir elemanı arama (binary search)
        int index = Arrays.binarySearch(sayilar, 3);
        System.out.println("3 sayısının indeksi: " + index);

        // Diziyi belirli bir değerle doldurma
        Arrays.fill(sayilar, 7);
        System.out.println("Dizi 7 ile dolduruldu: " + Arrays.toString(sayilar));
    }
}
7. Dizi Kullanımında Dikkat Edilmesi Gerekenler
   Dizilerin Boyutu Sabittir: Java'da diziler dinamik değildir, yani oluşturulduktan sonra boyutları değiştirilemez. Daha esnek bir yapı için ArrayList kullanılabilir.

Dizilerde Varsayılan Değerler: Diziler oluşturulduğunda içindeki elemanlar şu varsayılan değerlere sahip olur:

int → 0
double → 0.0
boolean → false
String ve diğer referans tipleri → null
ArrayIndexOutOfBoundsException: Dizinin sınırlarını aşan bir indekse erişmeye çalışırsanız hata alırsınız:

int[] dizi = {1, 2, 3};
System.out.println(dizi[3]); // Hata: ArrayIndexOutOfBoundsException
8. Alternatif: List Kullanımı (Dizi Yerine)
   Eğer boyutu değişebilen bir diziye ihtiyacınız varsa, ArrayList kullanabilirsiniz:

import java.util.ArrayList;

public class DiziAlternatif {
public static void main(String[] args) {
ArrayList<Integer> sayilar = new ArrayList<>();
sayilar.add(10);
sayilar.add(20);
sayilar.add(30);

        System.out.println("Liste: " + sayilar);
        sayilar.remove(1); // 2. elemanı siler
        System.out.println("Güncellenmiş Liste: " + sayilar);
    }
}
Sonuç
Java'da diziler, aynı türdeki verileri saklamak için kullanılan sabit boyutlu veri yapılarıdır. Temel özellikleri: ✅ Hızlı ve etkili bellek kullanımı sağlar.
✅ Sabit boyutlu oldukları için dinamik değişime uygun değildir.
✅ Arrays sınıfı ile ek işlemler yapılabilir.
✅ Alternatif olarak ArrayList gibi koleksiyonlar kullanılabilir.

Bu detaylı rehberle, Java dizileri hakkında kapsamlı bir bilgiye sahip oldunuz! 🚀

Array Büyükten küçüğe
Java'da bir diziyi büyükten küçüğe sıralamak için aşağıdaki yöntemlerden birini kullanabilirsiniz:

1. Arrays.sort() ile Büyükten Küçüğe Sıralama (Tersten Yazdırma)
   Java'da Arrays.sort() metodu küçükten büyüğe sıralama yapar. Büyükten küçüğe sıralamak için tersine çevirmeliyiz.

Örnek:
import java.util.Arrays;
import java.util.Collections;

public class BuyuktenKucugeSiralama {
public static void main(String[] args) {
Integer[] sayilar = {5, 2, 9, 1, 3};

        // Arrays.sort() + Collections.reverseOrder() ile büyükten küçüğe sıralama
        Arrays.sort(sayilar, Collections.reverseOrder());

        System.out.println("Büyükten Küçüğe Sıralanmış Dizi: " + Arrays.toString(sayilar));
    }
}
Çıktı:

Büyükten Küçüğe Sıralanmış Dizi: [9, 5, 3, 2, 1]
2. Arrays.sort() ile Küçükten Büyüğe Sıralayıp Ters Çevirme
   Eğer primitive veri tipi (int, double) kullanıyorsanız, Collections.reverseOrder() çalışmaz. Bu durumda önce Arrays.sort() ile küçükten büyüğe sıralayıp, sonra ters çevirebiliriz.

Örnek (Primitive Tiplerle)
import java.util.Arrays;

public class BuyuktenKucugeSiralamaPrimitive {
public static void main(String[] args) {
int[] sayilar = {5, 2, 9, 1, 3};

        // Küçükten büyüğe sırala
        Arrays.sort(sayilar);

        // Ters çevirerek büyükten küçüğe yazdır
        System.out.print("Büyükten Küçüğe Sıralanmış Dizi: ");
        for (int i = sayilar.length - 1; i >= 0; i--) {
            System.out.print(sayilar[i] + " ");
        }
    }
}
Çıktı:

Büyükten Küçüğe Sıralanmış Dizi: 9 5 3 2 1
3. Arrays.stream().boxed() ile Büyükten Küçüğe Sıralama (Java 8+)
   Java 8 ve üstü sürümlerde Streams API kullanarak sıralama yapabilirsiniz.

Örnek (Lambda ile)
import java.util.Arrays;
import java.util.Comparator;

public class StreamSirala {
public static void main(String[] args) {
int[] sayilar = {5, 2, 9, 1, 3};

        // Stream ile büyükten küçüğe sıralama
        int[] sirali = Arrays.stream(sayilar)
                             .boxed()
                             .sorted(Comparator.reverseOrder())
                             .mapToInt(Integer::intValue)
                             .toArray();

        System.out.println("Büyükten Küçüğe Sıralanmış Dizi: " + Arrays.toString(sirali));
    }
}
Çıktı:

Büyükten Küçüğe Sıralanmış Dizi: [9, 5, 3, 2, 1]
Hangi Yöntemi Kullanmalıyım?
Yöntem	Kullanım Durumu
Arrays.sort() + Collections.reverseOrder()	Integer[] dizisi için en hızlı yöntem.
Arrays.sort() + for döngüsüyle ters yazdırma	int[] dizisi için uygun (primitive tip).
Streams API (Java 8+)	Modern ve kısa kod yazmak isteyenler için.
Eğer int[] kullanıyorsanız 2. yöntemi, Integer[] kullanıyorsanız 1. yöntemi tercih edebilirsiniz. Java 8 ve sonrası için 3. yöntem daha okunaklıdır.

Hangi yöntemi seçerseniz seçin, büyükten küçüğe sıralamayı başarıyla yapabilirsiniz! 🚀

Cipher (AES/DES/RSA/HASHING)

Diğer

