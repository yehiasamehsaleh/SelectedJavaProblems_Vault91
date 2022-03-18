import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;



import java.util.Scanner;
import java.text.DecimalFormat;


public class lab_3_population {
        public static void main(String[] args) {



            DecimalFormat df = new DecimalFormat("#0.000");
            Scanner keyb = new Scanner(System.in);

            int InitialYear = 2011;        // initial year
            double GrowthRate  = 1.2;     // growth rate  in %
            double InitialPopulation = 7.0; // initial population, in milliard humans

            double CurrentPopulation = InitialPopulation; // word population for the current year
            int CurrentYear = InitialYear;              // year for calculation


            System.out.println("====---- PART 1 ----====");
            System.out.println("Population in " + CurrentYear + " : " + df.format(CurrentPopulation));

            /*******************************************
             * Complete the program from here.
             *******************************************/

            // ===== PART 1 =====
            // use this instruction to ask your question:
            int FinalYear = 0;

            // add counter and a loop
            while (InitialYear > FinalYear) {
                System.out.println("What year (> " + InitialYear + ") ? ");
                FinalYear = keyb.nextInt();


                if (InitialYear<FinalYear) {
                    CurrentPopulation = (InitialPopulation * (Math.exp((FinalYear - InitialYear) * (1.2 / 100))));

                    System.out.println(String.format("%.3f", CurrentPopulation));
                }

            }




            // ===== PART 2 =====
            System.out.println("\n====---- PART 2 ----====");

            System.out.println("How many billions (> " + InitialYear + ") ? ");
            double z = keyb.nextDouble();
            part_2 p2 = new part_2();
            Object x=p2.part_2(z);
            System.out.println(x);

            // ===== PART 3 =====
            System.out.println("\n====---- PART 3 ----====");
            int ans = 0;
            double ansReference = ans;
//            double CurrentPopulation = InitialPopulation;

            do {
                ++ans;
                CurrentPopulation = InitialPopulation * Math.exp((ans - ansReference) * (GrowthRate / 100.0));         // Important
                if (CurrentPopulation >= 2.0 * InitialPopulation)
                { GrowthRate /= 2.0;
                    InitialPopulation = CurrentPopulation;
                    ansReference = ans; }
                System.out.print("Population en " + (InitialYear + ans) + " : " + df.format(CurrentPopulation));
                System.out.println(" ; Grwoth Rate : " + GrowthRate + "%"); } while (CurrentPopulation < z);



            //part_3 p3 = new part_3();
            //p3.part_3(60);







            /*******************************************
             * Do not modify anything after this line.
             *******************************************/
        }
    }
