package org.manicpromod.crackingcoding.arrays;

/**
 * Created by pmanickam on 10/5/2020 at 9:10 AM
 */
public class IsUniqueChar {


    private static boolean isUnique(String s){

        boolean[] charSet = new boolean[128];
        if(s.length()>128) {
            return false;
        }

        for(int i=0; i< s.length();i++) {
            int val = s.charAt(i);
            if(charSet[val]){

                return false;
            }
            charSet[val] = true;
        }

        return true;
    }


    public static void main(String[] args){

        System.out.println("This program is used to identify the string is unique or not");
        String s = "abcdef";
        System.out.println("This is " + isUnique(s));
    }

}
