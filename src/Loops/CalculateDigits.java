package Loops;

import java.util.Scanner;

/*
Bir sayının basamak sayılarının toplamını hesaplayan program

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */
public class CalculateDigits {
    public static void main(String[] args) {

      int total=0, basValue ;

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
       int number=scan.nextInt();
        int tempNumber=number;

        while (tempNumber!=0){

            tempNumber/=10;

        }
        tempNumber=number;


        while (tempNumber != 0){
           basValue= tempNumber%10;
            total+=basValue;

            tempNumber /= 10;

        }
        System.out.println("Basamak değerleri toplamı: "+total);



    }






}
