package Threadss;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        //create thread pools
        ExecutorService execute = Executors.newFixedThreadPool(4);

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            array.add(i);
        }

        ThreadOperation thread = new ThreadOperation(array);

        execute.execute(thread);

    }
}
