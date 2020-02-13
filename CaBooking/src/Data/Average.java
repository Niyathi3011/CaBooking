package Data;

import java.util.List;

public class Average {

    public static double average(List<Double> list){

        double avg=0;
        for(Double it:list)
            avg+=it;

        double i = avg / list.size();
        return i;

    }

}
