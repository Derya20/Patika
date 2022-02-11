package Loops;

import java.util.Scanner;

/*
Java döngüler ile tek bir sayı girilene kadar
 kullanıcıdan girişleri kabul eden ve
  girilen değerlerden çift ve 4'ün katları olan sayıları
   toplayıp ekrana basan programı yazıyoruz.
 */
public class SumNumbers {
    public static void main(String[] args) {

        int number=0, sum=0;

        Scanner scan=new Scanner(System.in);


        while (number%2==0){
            System.out.print("Lütfen bir sayı giriniz:");
            number=scan.nextInt();
            if (number%4==0){
                sum+=number;

            }
        }
        System.out.println("4'ün katı olan sayıların toplamı: "+ sum);
        if (number%2==1){
            System.out.println("Tek sayı girdiniz.");
            System.out.println("Döngüden çıkıldı.");
        }





    }
}
