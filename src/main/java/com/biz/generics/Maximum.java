package com.biz.generics;

public class Maximum{

    public static  <E extends Comparable> E getMaximum(E...elements) {
        E max = elements[0];
        for (E element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

