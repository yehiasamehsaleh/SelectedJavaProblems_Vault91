import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;



import java.util.Scanner;

public class lab4
{
   public static void main(String[] args)
          {
             String string;
             Scanner scan = new Scanner (System.in);

             System.out.print("Enter your string: ");
             string = scan.nextLine();
             if (palindrome(string.toUpperCase()))
                System.out.println(string+" is a palindrome!");
             else
                System.out.println(string+" is not a palindrome!");
          }



          private static boolean palindrome(String x)
          {
             int length = x.length();
             return (x.length() <= 1) || (x.charAt(0) == x.charAt(length-1) && palindrome(x.substring(1,length-1)));
          }
}

