package com.company;

public class Main {

    public static void main(String[] args) {
        UnorderedArray uo = new UnorderedArray(100);
        uo.addLast(5);
        uo.addLast(23);
        uo.addLast(14);
        uo.addLast(1);
        uo.addLast(-5);

        uo.insertionSort();
        int s = uo.binarySearch(558);

        System.out.println(uo.listItems());
        System.out.println(s);
    }
}
