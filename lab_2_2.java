import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;


import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;

import java.util.Scanner;

public class lab_2_2 {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Think of a character: Miss Rose, ");
        System.out.println("Professor Violet, the Colonel Mustard");
        System.out.println("Reverend Olive or Mme Leblanc.\n");

        System.out.print("Does your character have mustaches?�");
        System.out.print("(true: yes, false: no)");
        boolean mustache = clavier.nextBoolean();

        System.out.print("Does your character wear glasses?�");
        boolean glasses = clavier.nextBoolean();

        System.out.print("Does your character wear a hat?�");
        boolean hat = clavier.nextBoolean();

        System.out.print("==> The character you are thinking of is: ");

        if ((hat) && (!mustache)) {
            /*******************************************
             * Complete the program from here.
             *******************************************/
            System.out.print("Professor Plum");

            /*******************************************
             * Do not modify anything after this line.
             *******************************************/
        }
        else if ((!hat) && (mustache)){
            System.out.print("Colonel Mustard");
        }
        else if  (glasses==false){
            System.out.print("M Rose");
        }
        else{
            System.out.println("Reverend Olive & Mme Leblanc both have glasses, no hat and no mustache");
        }
        System.out.println();
        // Also note that the code we give already includes the println at the end. So be careful not to use println in your displays
    }
}
