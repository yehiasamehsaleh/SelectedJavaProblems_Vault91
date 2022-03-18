import java.util.*;
import java.lang.*;



public class lab4_2 {
    public static void main(String[] args) {
        String word = null;
        String line = null;
        String replace = null;
        Scanner s = new Scanner(System.in);


        System.out.println("Enter the String: ");
        line = s.nextLine();

        System.out.println("Enter the new Character ");
        replace = s.nextLine();


        boolean done = false;
        while (!done) {
            System.out.println("Enter the part you want to replace: ");
            word = s.nextLine();
            String ReplacedString = line.replace(word, replace);
            System.out.println(ReplacedString);

            if ("Done".equals(replace)) {
                done = true;

            } else if (line.contains(word)) {
                System.out.println("Character successfully replaced:");
                System.out.println(ReplacedString);
                break;


            }
        }



    }

    }
