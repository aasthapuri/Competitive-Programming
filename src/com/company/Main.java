package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean Realted(String first, String second) {
        first=first.toUpperCase();
        second=second.toUpperCase();
        char[] one=first.toCharArray();
        char[] two=second.toCharArray();

        if(first.length()==second.length()){
            Arrays.sort(one);
            Arrays.sort(two);
            if(Arrays.equals(one,two))
                return true;

            
            else{
                return false;
            }
        }
        else{
            return  false;
        }
    public static void main (String[]args){
        // write your code here
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first string: ");
        String first=scanner.next();
        System.out.println("Enter second string: ");
        String second=scanner.next();
        System.out.printf("Do these make other words by rearranging them? \n" + Realted(first,second));
    }
}
