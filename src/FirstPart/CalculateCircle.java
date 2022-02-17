package FirstPart;

import java.util.Scanner;

public class CalculateCircle {
    /*
    Area Formula : π * r * r;
    Circumference Formula : 2 * π * r;

    𝜋  = 3.14
    merkez açısının ölçüsü 𝛼
    yarıcap=r
    Formula : (𝜋 * (r*r) * 𝛼) / 360
     */
    public static void main(String[] args) {

        double pi=3.14,a,area;
        int r;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dairenin merkez açı ölçüsünü giriniz: ");
        a=scan.nextDouble();
        System.out.println("Lütfen dairenin yarıçapını giriniz: ");
        r=scan.nextInt();
        if(a<0 || a>360){
            System.out.println("Invalid input for a");
        }else{
            area=(pi*(r*r)*a/360);

            System.out.println("Dairenin alanı: "+area);

        }





    }
}
