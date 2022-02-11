package Loops;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {

        int number;
        double total=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number=scan.nextInt();

        for (double i = 1; i <=number ; i++) {
            System.out.println(1/i);
            total+=1/i;
            System.out.println(total);

        }
        System.out.println("Harmonik sayı: "+total);



    }
}
