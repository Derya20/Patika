import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        double tutar, kdvOran, kdvTutar;



        Scanner input=new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar=input.nextDouble();
        if (tutar>=0 && tutar<1000){
            kdvOran = 0.18;
        }else{
            kdvOran=0.08;
        }

        kdvTutar=(kdvOran*tutar);

        System.out.println("KDV'li fiyat: "+(tutar+kdvTutar));
        System.out.println("KDV'siz fiyat: "+tutar);
        System.out.println("KDV tutarı: "+kdvTutar);
        System.out.println("KDV oranı : "+kdvOran);

       // System.out.println(kdvTutar);

    }
}
