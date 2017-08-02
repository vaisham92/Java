package org.vaisham.basicprograms.unit4;

public class Unit4 {

    /**
     * compare two character arrays for equality.
     * return true if both the inputs are same
     *
     *
     * @param input1
     * @param input2
     * @return
     */
    public boolean isEqual(char[] input1, char[] input2) {
        if(input1 == null && input2 == null) return true;
        if(input1 == null || input2 == null) return false;
        if(input1.length != input2.length) return false;

        for(int index = 0; index < input1.length; index++) {
            if(input1[index] != input2[index]) return false;
        }

        return true;
    }

    /**
     * given two Strings
     * compare both the Strings and return true if
     * they are equal
     * and return false if
     * they are unequal
     *
     *
     * @param input1
     * @param input2
     * @return
     */
    public boolean isEqual(String input1, String input2) {

        /*
            return isEqual(input1.toCharArray(), input2.toCharArray());
         */

        if(input1 == null && input2 == null) return true;
        if(input1 == null || input2 == null) return false;
        if(input1.length() != input2.length()) return false;

        for(int index = 0; index < input1.length(); index++) {
            if(input1.charAt(index) != input2.charAt(index)) return false;
        }

        return true;
    }

    /**
     * given a string,
     *
     * return true if the string is palindrome
     * or false if it is not
     *
     * eg: madam -> return true
     * eg: apple -> return false
     *
     * @param input
     * @return
     */
    public boolean isPalindrome(String input) {
        if(input == null) return false;
        if(input.length() == 0) return true;

        for(int start = 0, end = input.length() - 1; start <= end; start++, end--) {
            if(input.charAt(start) != input.charAt(end)) return false;
        }

        return true;
    }
}
