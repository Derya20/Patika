import java.util.Scanner;
/*
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
public class Taximeter {
    public static void main(String[] args) {


        int KM ;
        double perKM=2.20, total=10;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mesafeyi KM cinsinden giriniz: ");
       KM= scan.nextInt();

        total+=(KM*perKM);

        total = (total<20) ? 20 : total;
        System.out.println("Toplam ödenecek tutar :"+total);





    }
}
