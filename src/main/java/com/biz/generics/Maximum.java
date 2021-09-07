package com.biz.generics;

public class Maximum{
    public static void main(String[] args) {
        String a="ab",b="cd",c="ef";
        System.out.println(getMaximum(a,b,c));
    }
    public static String getMaximum(String a,String b,String c){
        String max=a;
        if(b.compareTo(a)>0 && b.compareTo(a)>0){
            max=b;
        }else if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
}

