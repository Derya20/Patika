package Methods;

import java.util.Scanner;

public class Numbers {
    static void number(int n, int count){
             int result;

            result=n-5;
            System.out.print(result+" ");

        count++;

        if (result ==0 || result<0) {
            reverse(count, result);

        } else {
            number(result,count);
        }
    }
        static void reverse(int k, int result){

            for (int i = 0; i < k; i++) {
                result+=5;
                System.out.print(result+" ");
            }
        }

    public static void main(String[] args) {

        int sayac=0;

        Scanner scan=new Scanner(System.in);

        int number=scan.nextInt();
        System.out.print(number+" ");

        number(number, sayac);
    }
}
