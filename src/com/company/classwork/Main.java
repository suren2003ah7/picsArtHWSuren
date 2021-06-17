package com.company.classwork;

public class Main {
    public static void main(String args[]) {
        MyLinkedList<Integer> s = new MyLinkedList<>();
        s.add(4);
        s.add(54);
        s.add(7);
        s.add(2);
        s.add(null);
        s.add(91);
        System.out.println(s);
        System.out.println(s.get(3));
        System.out.println(s.size());
        s.remove(0);
        s.remove((Integer) 64);
    }
}
