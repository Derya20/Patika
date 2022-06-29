package Threadss;

import java.util.ArrayList;

public class ThreadOperation extends Thread{

    private ArrayList<Integer> odd = new ArrayList<>();
    private ArrayList<Integer> even = new ArrayList<>();
    private ArrayList<Integer> normal;

    public ThreadOperation(ArrayList<Integer> normal) {
        this.normal = normal;
    }

    @Override
    public void run() {

        for (Integer i : normal) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        printEven();
        printOdd();

        //for stop threads
        Runtime.getRuntime().exit(0);
    }

    public synchronized void printOdd(){

        System.out.println(this.odd);
    }

    public synchronized void printEven(){

        System.out.println(this.even);
    }

}

