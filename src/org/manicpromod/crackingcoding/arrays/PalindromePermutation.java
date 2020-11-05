package org.manicpromod.crackingcoding.arrays;

/**
 * Created by pmanickam on 10/8/2020 at 11:38 AM
 */
public class PalindromePermutation {

    public static void main(String[] args){

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        char c = 'f';
        int val = Character.getNumericValue(c);
        System.out.println("Value of val "+ (val -a) );
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + z );
    }

    private static boolean checkForMorethanOneChar(int [] table){
        boolean isMorethanOne = false;
        for( int i : table){
            if((i%2 == 1)) {
                if(isMorethanOne) {
                    return false;
                }
                isMorethanOne = true;
            }
        }
        return false;
    }
}
