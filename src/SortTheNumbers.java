import java.util.Scanner;

public class SortTheNumbers {
    public static void main(String[] args) {

        int a, b, c;
        Scanner scan=new Scanner(System.in);

        System.out.print("1.sayı(a): ");
        a=scan.nextInt();
        System.out.print("2.sayı(b): ");
        b=scan.nextInt();
        System.out.print("3.sayı(c): ");
        c=scan.nextInt();

        //from largest to smallest

      if ((a>b) && (a>c) ){
          if (b>c){
              System.out.println("a>b>c");
          }else
              System.out.println("a>c>b");
      }
        if ((b>a) && (b>c) ){
            if (a>c){
                System.out.println("b>a>c");
            }else
                System.out.println("b>c>a");
        }
        if ((c>b) && (c>a) ){
            if (b>a){
                System.out.println("c>b>a");
            }else
                System.out.println("c>a>b");
        }

    }
}
