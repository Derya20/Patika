package Loops;

import java.util.Scanner;

/*
N elemanlı bir kümenin elemanları ile oluşturulacak
r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Kombinasyon Formulu

C(n,r) = n! / (r! * (n-r)!)

 */
public class Combination {
    public static void main(String[] args) {

        int n, r, nFakt=1, Fakt=1,rFakt=1;
        int com;

        Scanner veriAl =new Scanner(System.in);
        System.out.println("Kombinasyon hesabı için iki veri giriniz: ");
        System.out.print("n : ");
        n= veriAl.nextInt();
        System.out.print("r: ");
        r= veriAl.nextInt();

        for (int i=1; i<=n; i++){
            nFakt*=i;
        }
        for (int i=1; i<=(n-r); i++){
            Fakt*=i;
        }
        for (int i=1; i<=r; i++){
            rFakt*=i;

        }

        System.out.println("n faktoriyel: "+nFakt);
        System.out.println("r faktoriyel: "+rFakt);
        System.out.println("n-r faktoriyel: "+Fakt);

        com=(nFakt/(Fakt*rFakt));

        System.out.println("Kombinasyon sonucu: "+com);

    }
}
