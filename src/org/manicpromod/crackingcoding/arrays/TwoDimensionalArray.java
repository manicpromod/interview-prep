package org.manicpromod.crackingcoding.arrays;

import java.util.Arrays;

/**
 * Created by pmanickam on 8/28/2020 at 4:41 PM
 *[a,b,c,d]
 *[e,f,g,h]
 *
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {
        String alpha = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[][] aphabets = new char[6][6];
        int c =0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                aphabets[i][j] = alpha.charAt(c);
                System.out.print(alpha.charAt(c));
                c++;
            }
            System.out.println();
        }

    }

}
