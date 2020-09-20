package com.practice.coursera.modules.week3;

public class SumOfNumbersInString {

    public static void main(String[] args) {


        String str = "12abc20yz68";

        System.out.println(findSum(str));
/*
        String str = "a23b1r1";

        int i=0,j=0, flag=0, sum =0;
        StringBuilder numStr = new StringBuilder();

        char [] charArr = str.toCharArray();

        while(j<charArr.length){

            if (!Character.isDigit(charArr[j])){
                flag =0;
                i++;
            }
            else{
                flag =1;
                numStr.append(charArr[j]);
            }

            j++;

            if(j-i > 0  && flag == 0){
                sum = sum + Integer.parseInt(numStr.toString());
                i =j;
                numStr = new StringBuilder();
            }
        }
        System.out.println(sum);
*/
    }

    static int findSum(String str)
    {
        // A temporary string
        String temp = "";

        // holds sum of all numbers present in the string
        int sum = 0;

        // read each character in input string
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            // if current character is a digit
            if (Character.isDigit(ch))
                temp += ch;

                // if current character is an alphabet
            else
            {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);

                // reset temporary string to empty
                temp = "0";
            }
        }

        // atoi(temp.c_str()) takes care of trailing
        // numbers
        return sum + Integer.parseInt(temp);
    }

    // Driver code




}
