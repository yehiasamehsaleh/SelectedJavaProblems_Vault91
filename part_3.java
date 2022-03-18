/*
public class part_3 {


    static double InitialPopulation = 7.0;
    static double CurrentPopulation = InitialPopulation;
    static double counter = 2.0;
    static double GrowthRate = 1.2;




/*
        // 1st Solution
     public static void part_3(int InitialYear, int FinalYear) {
        while (InitialYear <= FinalYear) {
            CurrentPopulation = InitialPopulation * Math.exp((FinalYear - InitialYear) * (((GrowthRate * 2) / counter) / 100));

            System.out.println(String.format("%.3f", CurrentPopulation));
            InitialYear++;

            }
        }
*/


/*
        // 2nd Solution:
        public static Object part_3(int nyears){


            if (nyears==0)
                System.out.println("\n"+InitialPopulation);              //error?
            else {
                CurrentPopulation = InitialPopulation * Math.exp((nyears) * (GrowthRate / 100));
                System.out.println(String.format("%.3f", CurrentPopulation) + part_3(nyears-1));
            }
            return "";
        }
    }


*/



