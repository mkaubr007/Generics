package com.biz.generics;

public class Maximum{
    public static void main(String[] args) {
        Float a=3.1f,b=2.1f,c=1.1f;
        System.out.println(getMaximum(a,b,c));
    }
    public static Float getMaximum(Float a,Float b,Float c){
        Float max=a;
        if(b.compareTo(a)>0 && b.compareTo(a)>0){
            max=b;
        }else if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
}

