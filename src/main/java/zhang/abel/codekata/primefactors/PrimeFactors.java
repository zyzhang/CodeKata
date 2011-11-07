package zhang.abel.codekata.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        List<Integer> result = new ArrayList<Integer>();

        for (int candidate = 2; number > 1; candidate++) {
            for (;number % candidate == 0; number /= candidate) {
                result.add(candidate);
            }
        }

        return result;
    }
}
