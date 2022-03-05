package Arrays;

public class Frequency {
    public static void main(String[] args) {

        int[] arr = new int[]{5,5,4,7,8,4,7,5,8,8,4,4,5,5,0,9};
        int n = arr.length, counter = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int l: arr){
            System.out.print(l+" ");
        }

        System.out.println(" ");


        int curItem, prevItem;

        for (int i=1; i<n; i++) {
            curItem = arr[i];
            prevItem = arr[i - 1];

            if (curItem == prevItem) {
                counter +=1;
            }
            if (curItem != prevItem || i == 7) {
                System.out.println("The integer " + prevItem + " has been repeated " + counter + " time(s).");
                counter = 1;
            }

        }

    }

}




