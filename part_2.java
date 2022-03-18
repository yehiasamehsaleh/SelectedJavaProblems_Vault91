
import java.math.*;
import java.util.*;

public class part_2 {



        public Object part_2(double MaxAmount)
        {

            double InitialYear = 2011 , FinalYear = 2012;
            double InitialPopulation = 7.0;
            double GrowthRate = 1.2;
            double CurrentPopulation = InitialPopulation;


            int count = 0;
            while ((count >= 0) && (MaxAmount > CurrentPopulation))
            {
                FinalYear++;
                CurrentPopulation = InitialPopulation * Math.exp((FinalYear - InitialYear) * (((GrowthRate) / 100)));
                System.out.println(String.format("%.3f", CurrentPopulation));
                count++;

            }
            if (MaxAmount > 0)                                 // mandatory return statement
                return (int)count +" cycles";
            else
                return 0;
        }

}




