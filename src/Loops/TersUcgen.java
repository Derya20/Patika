package Loops;

import java.util.Scanner;

/*
Java ile basamak sayısının kullanıcıdan alınan
ve döngüler kullanılarak,
 yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
 */
public class TersUcgen {
    public static void main(String[] args) {

        int sayi;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir değer giriniz: ");
        sayi=scan.nextInt();
        // girilen sayı değerini sondan başa doğru yazdırdık
        for (int i=sayi; i>=1; i--){
            for (int j = 0; j < sayi-i ; j++) {

                System.out.print(" ");
            }
            for (int k = 0; k < (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
