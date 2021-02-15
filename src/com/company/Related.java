package com.company;

import java.util.Scanner;

public class Related {
    public static boolean Realted(String first, String second) {
        int result=0;
        if(first.length()!=second.length())
            return false;
        for(int i=0;i<first.length();i++){
            result+= first.charAt(i);
        }
        for(int i=0;i<second.length();i++){
            result-= second.charAt(i);
        }
        return (result==0);
    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String first=scanner.next();
        String second=scanner.next();
        System.out.printf("Do these make other words by rearranging them? \n" + Realted(first,second));
    }
}
