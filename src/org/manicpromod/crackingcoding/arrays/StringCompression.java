package org.manicpromod.crackingcoding.arrays;

/**
 * Created by pmanickam on 10/14/2020 at 10:46 AM
 */
public class StringCompression {


    public static void main(String[] args) {

        String s = "aabbcccddddd";
        StringBuilder sb = new StringBuilder();
        int count =0;

        for(int i=0;i<s.length();i++) {
            count++;
            if(i+1>= s.length() || s.charAt(i) != s.charAt(i+1)) {
                sb.append(s.charAt(i));
                sb.append(count);
                count = 0;
            }
        }

        System.out.println("The compressed String is " + sb);
    }

}
