package Loops;

import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {

        int number,count,maxNumber=0,minNumber=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayı gireceksiniz : ");
        count = input.nextInt();

        for (int i = 1; i <=count; i++){
            System.out.print(i +" . sayiyi giriniz : ");
            number = input.nextInt();
            if (number > maxNumber){
                maxNumber=number;
            }else if (number < minNumber || number > 0){
                minNumber = number;
            }
        }

        System.out.println("Girilen En Buyuk Sayi : "+ maxNumber);
        System.out.println("Girilen En Kucuk Sayi : "+ minNumber);
    }
}
