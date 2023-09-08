package org.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        AddLinkedLists addLLists = new AddLinkedLists();
        LongestSubstring lSubstring = new LongestSubstring();

        String b = "abaab";

        int n = lSubstring.longestSubString(b);
        System.out.println("This is n" + n);
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add(new String("Kevine"));
//        linkedList.add(new String("Oyanda"));
//
//        ListIterator<String> listIterator = linkedList.listIterator();
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        LinkedList<Integer> sumList = addLLists.addLinkedLists(l1, l2);
        ListIterator<Integer> listIterator = sumList.listIterator(sumList.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous());
        }

    }
}