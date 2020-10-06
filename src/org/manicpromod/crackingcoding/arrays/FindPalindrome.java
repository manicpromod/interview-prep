package org.manicpromod.crackingcoding.arrays;

import java.util.Arrays;

/**
 * Created by pmanickam on 10/5/2020 at 6:43 PM
 */
public class FindPalindrome {


    private static String sortString(String s) {

        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static void main(String[] args){

        String s1 = "BUG";
        String s2 = "GUB";

        if(s1.length() != s2.length()) {

            System.out.println("Strings are not palindrome to each other");
        }

        if(sortString(s1).equals(sortString(s2))) {

            System.out.println("Strings are palindrome to each other");
        } else {

            System.out.println("Strings are not palindrome to each other");
        }

    }



}
