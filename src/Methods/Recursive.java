package Methods;

import java.util.Scanner;

public class Recursive {
    static void exponentCalc(){

        int base, exponent, answer, result=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        base=scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        exponent=scan.nextInt();
        if (exponent==0 || base==1){
            System.out.println("Result: "+1);
        }

        for (int i=1; i<=exponent; i++){
           result*=base;
        }


        System.out.println("Result: "+result);
        System.out.println("Tekrar hesaplama yapmak ister misiniz: ");
        System.out.println("1-Yes\n2-No");
        answer=scan.nextInt();
        if (answer==1) exponentCalc();

    }
    public static void main(String[] args) {

        exponentCalc();

    }
}
