package com.ebubekir.sample4LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkyListys {

    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<String>();
        linky.add("Ebubekir");
        linky.add("Medine");
        linky.add("Mina");

        linky.remove();

        System.out.println(linky.getLast());
        System.out.println(linky.getFirst());
        System.out.println(linky.peek());
        System.out.println(linky.isEmpty());
        System.out.println(linky.contains("Ebubekir"));

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(12);
        linkedList.add(34);
        linkedList.add(06);

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(34)){
                System.out.println("We found Istanbul! The next element of the list is " + iterator.next());
            }
        }

    }

}
