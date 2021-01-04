package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public <T> List<Integer> of(int number) {
        if(numberIsEqualsToOne(number)) return new ArrayList<>();
        // left for all the rest of numbers
        // because for them test has not been created yet.
        return null;
    }

    private boolean numberIsEqualsToOne(int number) {
        return number == 1;
    }
}
