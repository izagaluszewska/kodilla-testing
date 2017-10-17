package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void showTestBegin() {
        System.out.println("Test Case: begin");
    }

    @After
    public void showTestEnd() {
        System.out.println("Test Case: end\n");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> emptyListAfterOddNumbersExterminator = exterminator.exterminate(emptyList);
        //Then
        Assert.assertTrue(emptyListAfterOddNumbersExterminator.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Integer> normalList = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            normalList.add(i+1);
        }
        ArrayList<Integer> normalListAfterOddNumbersExterminator = exterminator.exterminate(normalList);
        for (Integer number : normalListAfterOddNumbersExterminator) {
            if (number % 2 == 0) {
                testList.add(number);
            }
        }
        //Then
        Assert.assertTrue(normalListAfterOddNumbersExterminator.size() == testList.size());
    }
}