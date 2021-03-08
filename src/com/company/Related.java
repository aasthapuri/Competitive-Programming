package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Related2 {
    public static boolean Realted(String first, String second) {


        if(first.length()!=second.length())
            return false;
            int i=0;
            int j=0;
        while(i<first.length() && j<second.length()){
            if(first.charAt(i)==second.charAt(j)){
                    second = second.substring(0, j) + second.substring(j + 1);
                    i++;
                    j++;
                    break;
            }
        return (second.length()==0);
    }
    public static void main (String[]args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two strings: "+"\n");
            String first = scanner.next();
            String second = scanner.next();
            System.out.printf("Do these make other words by rearranging them? \n" + Realted(first, second));


    }
}
