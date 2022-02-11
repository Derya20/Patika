package Loops;

import java.util.Scanner;

/*
Java döngüler ile girilen sayıya kadar olan
 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
public class ThirdHw {
    public static void main(String[] args) {

        int deger;
        Scanner scan=new Scanner(System.in);

        System.out.println("Deger giriniz: ");
        deger=scan.nextInt();

        for (int i=1; i<deger; i*=4){
            System.out.println("4'ün katları: "+i);

        }

        System.out.println("*******************************************");
        for (int j=1; j<deger; j*=5){
            System.out.println("5'in katları: "+j);
        }

    }
}
