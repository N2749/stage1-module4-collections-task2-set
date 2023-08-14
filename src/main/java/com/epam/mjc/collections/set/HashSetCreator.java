package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    /* If the element x from List<Integer> is even, then add to the HashSet values: x, x/2, (x/2)/2 ... ((x/2)/2)../2) (dividing by 2 until the last inserted element is an odd number)
     * If the element x from List<Integer> is odd, then add to the HashSetvalues: x and 2x
     */
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integers = new HashSet<>();
        for (Integer element : sourceList) {
            if (element % 2 == 1) {
                integers.add(element);
                integers.add(element * 2);
                continue;
            }
            while (element % 2 == 0) {
                integers.add(element);
                element /= 2;
            }
            integers.add(element);
        }
        return integers;
    }
}
