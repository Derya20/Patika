package FirstPart;

import java.util.Scanner;
/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
 Mesafe başına ücret 0,10 TL / km olarak alın.
 İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
public class FlightTicket {
    public static void main(String[] args) {

     int age,distance,travelType;
     double perDistance=0.10, totalCost,cutPrice, rateDiscount = 0, ageDiscount,tripDiscount;

     Scanner scan=new Scanner(System.in);
     //take inputs and check
        System.out.print("Please enter your distance(KM): ");
        distance=scan.nextInt();
        if (distance<0){
            System.out.print("Invalid input for distance. Please try again!");
            distance=scan.nextInt();
        }
        System.out.print("Please enter your age: ");
        age=scan.nextInt();
        if (age<0){
            System.out.print("Invalid input for age. Try again!");
            age=scan.nextInt();
        }
        System.out.print("Please enter your travel type(1-One Way, 2-Round-trip ): ");
        travelType=scan.nextInt();
        if (travelType!=1 && travelType!=2){
            System.out.print("You can print 1 or 2 only. Please try again!");
            travelType=scan.nextInt();
        }
        // before the discount we need to initialize total Cost
        totalCost=distance*perDistance;

        //check age discount
        if (age<12){
            //indirim oranı= %50
            rateDiscount=0.50;
        }else if ( age<=24){
            rateDiscount=0.10;
        }else if (age>65){
            rateDiscount=0.30;
        }

        ageDiscount=totalCost*rateDiscount;

        cutPrice=totalCost-ageDiscount;

        //check the travelType
        if (travelType==2){

            tripDiscount=cutPrice*0.20;
            totalCost=(cutPrice-tripDiscount)*2;
        }
        System.out.println(totalCost);












    }
}
