package Loops;
/*
Bir sayının kendisi hariç pozitif tam sayı çarpanları
 (kalansız bölen sayıların) toplamı
 kendisine eşit olan sayıya mükemmel sayı denir.
 */
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        int number, deger=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number=scan.nextInt();

        for (int i=1; i<number; i++){
            if (number%i==0){
                deger+=i;
            }
        }
        if (deger==number){
            System.out.println(number+" mükemmel bir sayıdır!");
        }else
            System.out.println(number+" mükemmel bir sayı değildir!");


    }
}
