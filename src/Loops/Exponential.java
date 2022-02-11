package Loops;

import java.util.Scanner;

/*
Java ile kullanıcının girdiği değerler ile
 üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 n^r== n*n*n* ... (r tane n in çarpımı)
 */
public class Exponential {
    public static void main(String[] args) {

        int n, r, us=1;
        Scanner veriAl=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n=veriAl.nextInt();
        System.out.print("Üs değerini giriniz: ");
        r=veriAl.nextInt();

        for (int i=1; i<=r; i++){
            us*=n;
        }
        System.out.println(us);
    }
}
