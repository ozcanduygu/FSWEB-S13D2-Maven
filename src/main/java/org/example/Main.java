package org.example;

public class Main {
    public static boolean isPalindrome(int number){
        number=Math.abs(number);
        String original = String.valueOf(number);
        String reversed = "";

        for(int i= original.length()-1; i>=0; i--){
            reversed+= original.charAt(i);
        }
        return original.equals(reversed);

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String numStr = String.valueOf(number);
        String result = "";

        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);

            switch (ch) {
                case '0': result += "Zero "; break;
                case '1': result += "One "; break;
                case '2': result += "Two "; break;
                case '3': result += "Three "; break;
                case '4': result += "Four "; break;
                case '5': result += "Five "; break;
                case '6': result += "Six "; break;
                case '7': result += "Seven "; break;
                case '8': result += "Eight "; break;
                case '9': result += "Nine "; break;
            }
        }

        return result.trim();
    }


}
