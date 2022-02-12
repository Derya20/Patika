package Loops;
/*
Asal sayılar, sadece iki pozitif tam sayı böleni
 olan doğal sayılardır.
  Sadece kendisine ve 1 sayısına
  kalansız bölünebilen 1'den büyük tam sayılardır.
 */
/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
 */

public class PrimeNumber {
    public static void main(String[] args) {



        int str =2;
        int end = 100;
        for(int i = str;i<end ;i++){
            boolean isPrime=true;
            for (int n = 2; n <=i-1; n++) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(" "+i);
            }
        }



    }
}

