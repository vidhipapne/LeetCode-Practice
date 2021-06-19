/*
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean carry=true; // to check whether carry is generated or not
        for(int i=n-1;i>=0;i--){
            if(digits[i]==9) digits[i]=0; //if digit it 9 and we add 1 it become 0 with carry 1
            else{
                digits[i]++; // else invrementing the other digits
                carry=false;
                break;
            }
        }
        if(carry){ // if carry is generated increase the sixe of result by 1
            int[] result = new int[digits.length + 1];
            result[0] = 1;  //the first element of list will be 1
            return result;
        }
        return digits;
    }
}