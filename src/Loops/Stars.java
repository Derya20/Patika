package Loops;
/*
Elmas yapımı
 */
import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir değer giriniz: ");
       int n=scan.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(i*2)-1 ; k++) {

                System.out.print("*");
            }
            System.out.println();
            
        }
        for (int a = 1; a < n; a++){
            for (int b=0; b <= a; b++){
                System.out.print(" ");
            }
            for (int c =1; c <= 2*(n-a)-1; c++){
                System.out.print("*");
            }
            System.out.println();
        }


        }


    }

