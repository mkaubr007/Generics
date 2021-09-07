package com.biz.generics;

public class Maximum{


    public static  <E extends Comparable> E getMaximum(E a, E b, E c){
        E max=a;
        if(b.compareTo(a)>0 && b.compareTo(a)>0){
            max=b;
        }else if(c.compareTo(max)>0){
            max=c;
        }
        printMax(a,b,c,max);
        return max;
    }
    public static <E> void printMax(E a,E b,E c,E max){
        System.out.println("Max "+a+" "+b+" "+c+" "+max);
    }
}

