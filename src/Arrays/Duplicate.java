package Arrays;
//duplicate even numbers
import java.util.Arrays;

public class Duplicate {

    static boolean findDouble(int[] array, int deger){
        for(int i: array){
            if (i== deger){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int index=0;
        int [] arr={4,8,7,15,21,42,8,10,32,10,4,10,42,21,56,0,7};
        int l= arr.length/2;
        int [] newArray=new int[l];


        for (int i=0; i<arr.length; i++){

            for (int j = 0; j < arr.length; j++) {
                if (!(i == j) && (arr[i] == arr[j])&& arr[i]%2==0) {
                    if (findDouble(newArray, arr[i])){
                        newArray[index++]=arr[i];
                    }
                    break;
                }
            }

        }
        System.out.print(Arrays.toString(newArray));
    }
}
