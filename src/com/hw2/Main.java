package com.hw2;
import java.util.Locale;
public class Main {

    public static void main (String[] args){
        System.out.print("Hello world");
        String str = "My Hillel Java homework";
        String str1 = "Aboba";
        String str2 = "RaDar";
        String str3 = "Hillel";
        wordsCount(str);
        isPalindrome(str1);
        isPalindrome(str2);
        isPalindrome(str3);
    }
    static void wordsCount(String str0)
    {
        String[] words = str0.split(" ");
        System.out.print(str0+" -> "+words.length+"\n");
    }
    static void isPalindrome(String str0)
    {

        String str1 = str0.toLowerCase(Locale.ROOT);
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        String result = str2.toString();
        if (result.equals(str1)) {
            System.out.print(str0+" -> true\n");
        }
        else {
            System.out.print(str0+" -> false\n");
        }
    }
}