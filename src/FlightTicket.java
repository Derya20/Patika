import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

     int age,distance,travelType;
     double perDistance=0.10, totalCost,cutPrice, rateDiscount = 0, ageDiscount,tripDiscount;

     Scanner scan=new Scanner(System.in);
     //take inputs and check
        System.out.print("Please enter your distance(KM): ");
        distance=scan.nextInt();
        if (distance<0){
            System.out.print("Invalid input for distance. Please try again!");
            distance=scan.nextInt();
        }
        System.out.print("Please enter your age: ");
        age=scan.nextInt();
        if (age<0){
            System.out.print("Invalid input for age. Try again!");
            age=scan.nextInt();
        }
        System.out.print("Please enter your travel type(1-One Way, 2-Round-trip ): ");
        travelType=scan.nextInt();
        if (travelType!=1 && travelType!=2){
            System.out.print("You can print 1 or 2 only. Please try again!");
            travelType=scan.nextInt();
        }
        // before the discount we need to initialize total Cost
        totalCost=distance*perDistance;

        //check age discount
        if (age<12){
            //indirim oranı= %50
            rateDiscount=0.50;
        }else if ( age<=24){
            rateDiscount=0.10;
        }else if (age>65){
            rateDiscount=0.30;
        }

        ageDiscount=totalCost*rateDiscount;

        cutPrice=totalCost-ageDiscount;

        //check the travelType
        if (travelType==2){

            tripDiscount=cutPrice*0.20;
            totalCost=(cutPrice-tripDiscount)*2;
        }
        System.out.println(totalCost);












    }
}
