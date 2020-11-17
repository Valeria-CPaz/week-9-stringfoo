package com.val;

public class Main {

    public static void main(String[] args) {
//        demoOne();
//        demoTwo();

          demoThree();
    }

    private static void demoThree() {

        String firstName = "john";
        String lastName = "smith";
        char[] letterArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] pinArray = {"1","2","3","4","5","6","7","8","9","10","11",
                "12","13","14","15","16","17","18","19","20","21","22","23","24","25","26"};

        System.out.printf("account number is: %c%c - %s -", firstName.charAt(0), lastName.charAt(0), (firstName.length() + lastName.length()));

        for (int i = 0; i < firstName.length(); i++) {
            for (int j = 0; j < pinArray.length; j++) {
                if (firstName.charAt(i) == letterArray[j]) {
                    System.out.print(pinArray[j]);
                    break;
                }
            }
        }

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
