package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.println("Kaç Adet Fibonnacci Sayısı Görmek İstiyorsunuz?");
        int sayi=klavye.nextInt();
        int first =0;
        int sec =1;
        int third = first + sec;

        System.out.println("Fibonacci Sayıları ");
        System.out.print(first + " "+ sec + " ");

        while(sayi-2>0){
            System.out.print(third + " ");
            sayi--;
            first = sec;
            sec = third;
            third = first + sec;

        }
    }
}
