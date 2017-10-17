package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        Iterator<Integer> iteratorNumbers = numbers.iterator();
        while(iteratorNumbers.hasNext()) {
            int currentNumber = iteratorNumbers.next();
            if ((currentNumber % 2) != 0) {
                iteratorNumbers.remove();
            }
        }
        return numbers;
    }
}
