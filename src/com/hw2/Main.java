package com.hw2;
import java.util.Locale;
public class Main {

    public static void main (String[] args){
        String str = "    My    Hillel    Java homework  ";
        String str1 = "Aboba";
        String str2 = "RaDar";
        String str3 = "Hillel";
        System.out.print(str+" -> "+wordsCount(str)+"\n");
        System.out.print(str1+" -> "+isPalindrome(str1)+"\n");
        System.out.print(str2+" -> "+isPalindrome(str2)+"\n");
        System.out.print(str3+" -> "+isPalindrome(str3)+"\n");
    }
    static int wordsCount(String str0)
    {
        int counter = 0;
        String str1 = str0.trim();
        String[] words = str1.split(" +");
        counter = words.length;
        return (counter);
    }
    static boolean isPalindrome(String str0)
    {
        boolean pal = false;
        String str1 = str0.toLowerCase(Locale.ROOT);
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        String result = str2.toString();
        if (result.equals(str1)) {
            pal = true;
        }
        else {
            pal = false;
        }
        return pal;
    }
}