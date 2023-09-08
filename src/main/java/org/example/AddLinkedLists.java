package org.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class AddLinkedLists {

    public static LinkedList<Integer> addLinkedLists(LinkedList<Integer> l1, LinkedList<Integer>l2){
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

        ListIterator<Integer> listIterator1 = l1.listIterator(l1.size());
        ListIterator<Integer> listIterator2 = l2.listIterator(l2.size());

        while (listIterator1.hasPrevious() || listIterator2.hasPrevious() || carry > 0){

            int sum = carry;

            if(listIterator1.hasPrevious()){
                sum += listIterator1.previous();
            }
            if (listIterator2.hasPrevious()){
                sum += listIterator2.previous();
            }
            carry = sum / 10;
            result.addFirst(sum % 10);
        }
        return result;
    }
}
