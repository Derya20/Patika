package FirstPart;

import java.util.Scanner;

public class ManavKasa {
    /*

    Java ile kullanıcıların manavdan almış oldukları ürünlerin
    kilogram  değerlerine göre toplam tutarını
     ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları :
    -Armut : 2,14 TL
    -Elma : 3,67 TL
    -Domates : 1,11 TL
    -Muz: 0,95 TL
    -Patlıcan : 5,00 TL
     */
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican =5.00;
        double kg, total;

        Scanner scan=new Scanner(System.in);

        System.out.print("Armut kaç kilo? ");
        kg=scan.nextDouble();
        total=armut*kg;

        System.out.print("Elma kaç kilo? ");
        kg=scan.nextDouble();
        total+=elma*kg;

        System.out.print("Domates kaç kilo? ");
        kg=scan.nextDouble();
        total+=domates*kg;

        System.out.print("Muz kaç kilo? ");
        kg=scan.nextDouble();
        total+=muz*kg;

        System.out.print("Patlıcan kaç kilo? ");
        kg=scan.nextDouble();
        total+= patlican *kg;
        System.out.println("Toplam tutar: "+total);




    }
}
