package com.exercises.chapters.containersindepth.ex40_41_42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex40 {
    public static void main(String[] args) {
        final int size = 5;
        List<Container> containerList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            containerList.add(Container.getContainer());
        }
        Container[] containers = new Container[size];
        for (int i = 0; i < size; i++) {
            containers[i] = Container.getContainer();
        }
        var arrayListItem = containerList.get(0);
        var arrayItem = containers[0];

        System.out.println(containerList);
        System.out.println(Arrays.toString(containers));

        Collections.sort(containerList);
        Arrays.sort(containers);

        System.out.println(containerList);
        System.out.println(Arrays.toString(containers));

        System.out.println(Collections.binarySearch(containerList, arrayListItem));
        System.out.println(Arrays.binarySearch(containers, arrayItem));

        System.out.println("====================");

        Collections.sort(containerList, Container.COMPARE_BY_SECOND_VALUE);
        Arrays.sort(containers, Container.COMPARE_BY_SECOND_VALUE);

        System.out.println(containerList);
        System.out.println(Arrays.toString(containers));

        System.out.println(Collections.binarySearch(containerList, arrayListItem));
        System.out.println(Arrays.binarySearch(containers, arrayItem));
    }
}
