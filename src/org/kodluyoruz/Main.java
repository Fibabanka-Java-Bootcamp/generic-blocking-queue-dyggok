package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.add(2);
        queue.add(3);
        queue.add(4);

       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
    }
    }

