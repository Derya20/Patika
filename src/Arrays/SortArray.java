package Arrays;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Listenin eleman sayısını giriniz: ");
        int sayi=scan.nextInt();
        int [] newArray= new int[sayi];
        System.out.println("Listenin elemanlarını giriniz: ");
        for (int i = 0; i < sayi; i++) {
            System.out.print(i+". eleman: " );
            newArray[i]=scan.nextInt();
        }
        System.out.println("*******************************");
        System.out.println("Girdiğiniz liste ilk hali: ");
        for(int k: newArray){
            System.out.print(k+" ");
        }
        System.out.println("\n*******************************");
        System.out.println("Listenin sıralanmış hali : ");

        for (int i = 0; i < newArray.length; i++) {
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[i]>newArray[j]){

                    int temp=newArray[i];

                    newArray[i]=newArray[j];
                    newArray[j]=temp;
                }

            }
        }


        for(int k: newArray){
            System.out.print(k+" ");
        }
    }
}
