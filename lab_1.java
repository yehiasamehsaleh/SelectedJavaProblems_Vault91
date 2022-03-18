import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;


import java.util.*;

//pass by value

public class lab_1 {                                             //another solution is to use an arraylist - if you need it in a method on its own
    public static void main(String[] args) {
        int x, y, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swapping numbers: "+ "\n"+ x +"  "+ y);
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: "+ "\n" + x +"   "+ y);
        System.out.println();
    }
}
