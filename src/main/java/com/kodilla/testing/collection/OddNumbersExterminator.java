package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Integer l : numbers) {
            if (l % 2 == 0)
                list.add(l);
        }
        return list;
    }
}
