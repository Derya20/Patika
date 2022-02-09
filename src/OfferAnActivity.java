import java.util.Scanner;

public class OfferAnActivity {
    /*
    Koşullar :
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

     */
    public static void main(String[] args) {

        int heat,i=0;

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen sıcaklığı giriniz: ");
        heat=scan.nextInt();

        if (heat<5){
            System.out.println("Kayağa gidebilirsin");
        }else if(heat<=25){
            System.out.println("Pikniğe gidebilirsin");
            while ( heat<=15 && i==0){
                System.out.println("Sinemaya gidebilirsin");
                i++;
            }
        }else
            System.out.println("Yürümeye gidebilirsin");





    }
}
