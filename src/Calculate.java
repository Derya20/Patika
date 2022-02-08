import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        int mat, fızık,kımya,turkce,tarıh,muzık;
        Scanner verıAl =new Scanner(System.in);
        System.out.println("Lütfen matematik notunuzu giriniz: ");
        mat= verıAl.nextInt();
        System.out.println("Lütfen fizik notunuzu giriniz: ");
        fızık = verıAl.nextInt();
        System.out.println("Lütfen kimya notunuzu giriniz: ");
        kımya= verıAl.nextInt();
        System.out.println("Lütfen türkçe notunuzu giriniz: ");
        turkce= verıAl.nextInt();
        System.out.println("Lütfen tarih notunuzu giriniz: ");
        tarıh= verıAl.nextInt();
        System.out.println("Lütfen müzik notunuzu giriniz: ");
        muzık= verıAl.nextInt();
        int toplam= mat+ fızık +kımya+turkce+tarıh+muzık;
        double sonuc=(toplam)/6;
        System.out.println("Ortalama : "+sonuc);

       if (sonuc >60){
           System.out.println("Sınıfı geçti.");
       } else {
           System.out.println("Sınıfta kaldı.");
       }

    }
}
