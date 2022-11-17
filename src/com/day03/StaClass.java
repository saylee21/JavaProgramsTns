package com.day03;

public class StaClass {
    private static String str = "TNS Java Sessions";

    static class MyNestedClass{
        public void disp() {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        StaClass.MyNestedClass obj = new StaClass.MyNestedClass();
        obj.disp();
    } 
}
