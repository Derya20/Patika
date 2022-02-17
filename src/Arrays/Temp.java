package Arrays;
/*
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

Harmonik Seri:  1+ 1/2+ 1/3+ 1/4 ...
 */
public class Temp {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        double sum = 0;
        for (int number : numbers) {
            sum += 1.0/number;
        }
        System.out.println(numbers.length / sum);

    }
}
