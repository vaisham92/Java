package org.vaisham.basicprograms.unit5;

public class Unit5 {

    /**
     * given a positive integer convert the number to binary form
     *
     * eg:
     *
     * 2 -> return "10"
     * 3 -> return "11"
     * 10 -> return "1010"
     * 0 -> return "0"
     *
     * @param number
     * @return
     */
    public String toBinaryString(int number) {
        if(number == 0) return "0";
        StringBuilder binaryStringBuilder = new StringBuilder();
        while(number > 0) {
            binaryStringBuilder.append(String.valueOf(number % 2));
            number = number / 2;
        }
        return binaryStringBuilder.reverse().toString();
    }

    /**
     * given a binaryString convert
     * the given string to its integer format
     * and return the value
     *
     * eg:
     *
     * "10" -> return 2
     * "11" -> return 3
     * "1010" -> return 10
     * "0" -> return 0
     *
     *
     * @param binaryString
     * @return
     */
    public int toInteger(String binaryString) {
        int number = 0;
        int binaryPositionValue = 1;
        for(int index = binaryString.length() - 1; index >= 0; index--) {
            if(binaryString.charAt(index) == '1') {
                number += binaryPositionValue;
            }
            binaryPositionValue = binaryPositionValue * 2;
        }
        return number;
    }
}
