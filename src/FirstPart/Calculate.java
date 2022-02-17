package FirstPart;

import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        int mat, fizik, kimya,turkce, tarih, muzik;
        Scanner veriAl =new Scanner(System.in);
        System.out.println("Lütfen matematik notunuzu giriniz: ");
        mat= veriAl.nextInt();
        System.out.println("Lütfen fizik notunuzu giriniz: ");
        fizik = veriAl.nextInt();
        System.out.println("Lütfen kimya notunuzu giriniz: ");
        kimya = veriAl.nextInt();
        System.out.println("Lütfen türkçe notunuzu giriniz: ");
        turkce= veriAl.nextInt();
        System.out.println("Lütfen tarih notunuzu giriniz: ");
        tarih = veriAl.nextInt();
        System.out.println("Lütfen müzik notunuzu giriniz: ");
        muzik = veriAl.nextInt();
        int toplam= mat+ fizik + kimya +turkce+ tarih + muzik;
        int sonuc=(toplam)/6;
        System.out.println("Ortalama : "+sonuc);

       if (sonuc >60){
           System.out.println("Sınıfı geçti.");
       } else {
           System.out.println("Sınıfta kaldı.");
       }

    }
}
