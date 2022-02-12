package Loops;
     /*
//bu durumda döngü küçük sayı kadar döner
        //algoritma açısından kötü bi tasarım
       if (firstN<secN){
           for (int i = 1; i <= firstN; i++) {
               if (firstN%i==0 && secN%i==0){
                  ebob=i;
               }
               count++;
           }
       }else {
           for (int i = 1; i <= secN; i++) {
               if (firstN%i==0 && secN%i==0){
                 ebob=i;
               }
               count++;
           }
       }
        System.out.println("döngü: "+count);
        System.out.println(ebob);
*/
//        System.out.println("check: " +(firstN*secN)/ebob);
/*
        if (firstN<secN){
            for (int k = firstN; k >=1 ; k--) {
                if (firstN%k==0 && secN%k==0){
                    ebob=k;
                    break;
                }
               count++;
            }
        }else{
            for (int k = secN; k >=1 ; k--) {
                if (firstN%k==0 && secN%k==0){
                    ebob=k;
                    break;
                }
            count++;
            }
        }
        System.out.println("Döngü sayımız: "+count);
        System.out.println("Degerimiz: "+ebob);


        for (int i = 1; i <=(firstN*secN) ; i++) {
            if (i%firstN==0&& i%secN==0){
             ekok=i;
                break;
            }

        }
        System.out.println("Ekok değeri: "+ekok);

*/
import java.util.Scanner;
//Java ile iki sayının
// EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
public class ObebOkek {
    public static void main(String[] args) {

        int firstN, secN;
        int ebob=1, count=0, ekok=1;

        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        firstN=scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        secN=scan.nextInt();


     int a = Math.min(firstN, secN);//Returns the smaller of two int values
        while (a>=1){
            if (firstN%a==0 && secN%a==0){
                ebob=a;
                break;
            }
            a--;
            count++;
        }
        System.out.println("Döngü sayımız: "+count);
        System.out.println("Degerimiz: "+ebob);

        a=1;
        while (a<=(firstN*secN)){
            if (a%firstN==0 && a%secN==0){
                ekok=a;
                break;
            }
            a++;

        }
        System.out.println("Ekok değeri: "+ekok);





    }
}
