package com.val;

public class Main {

    public static void main(String[] args) {

        demoOne();
        demoTwo();
    }

    public static void demoTwo() {

        String s1 = "Hello there";
        char[] charArray = new char[5];
        System.out.printf("s1: %s", s1);

        System.out.printf("%nLength of s1: %d", s1.length());

        System.out.printf("%nThe string without reversing is: ");

        for (int count = 0; count < s1.length(); count++) {
            System.out.printf("%c", s1.charAt(count));
        }

        System.out.printf("%nThe string reversed is: ");

        for (int count = s1.length() - 1; count >= 0; count--) {
            System.out.printf("%c", s1.charAt(count));
        }

        s1.getChars(0,5,charArray,0);

        System.out.printf("%nThe character array is: ");

        for(char character: charArray) {
            System.out.print(character);
        }

        System.out.println();
    }

    public static void demoOne() {

        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};

        String s = new String("Hello");
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);


        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);

    }
}
