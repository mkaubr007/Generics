package com.biz.generics;

public class Maximum{
    public static void main(String[] args) {
        Integer a=3,b=2,c=1;
        System.out.println(getMaximum(a,b,c));
    }
    public static Integer getMaximum(Integer a,Integer b,Integer c){
        Integer max=a;
        if(b.compareTo(a)>0 && b.compareTo(a)>0){
            max=b;
        }else if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
}

