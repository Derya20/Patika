package Loops;
/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan
 programı yazınız.
 */
import java.util.Scanner;

public class UcDort {
    public static void main(String[] args) {

        int deger, adet=0,toplam=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        deger=scan.nextInt();

        for (int i=0; i<=deger; i++){
            if (i%3==0 && i%4==0){
                toplam+=i;
                adet++;
            }
        }

        int ortalama=toplam/adet;
        System.out.println("Ortalama: "+ortalama);

    }
}
