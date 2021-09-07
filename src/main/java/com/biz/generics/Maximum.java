package com.biz.generics;

public class Maximum<E extends Comparable>{
    E value1;
    E value2;
    E value3;

    public Maximum(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

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

