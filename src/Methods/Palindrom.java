package Methods;

import java.util.Scanner;

public class Palindrom {

    static void isPolindrom(int number) {

        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;//son basamak degerını elde etmek ıcın

            reverseNumber = (reverseNumber * 10) + lastNumber;// (0*10)+2=2  (2*10)+5= 25  (25*10)+4=254 bir basamak sola kaydırmak için yapıyoruz

            temp /= 10;// son basamağı sılmek ıcın
        }
        if (number == reverseNumber) {
            System.out.println("Palindrom bir sayıdır");

        }else
            System.out.println("Palindrom bir sayı değildir!");

    }


    public static void main(String[] args) {

        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n=scan.nextInt();
        isPolindrom(n);

    }
}
