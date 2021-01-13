package interviewbit.math;

import java.util.ArrayList;

public class FizzBuzz {

    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            if (i % 15 == 0) {
                ret.add("FizzBuzz");
            } else if (i % 5 == 0) {
                ret.add("Buzz");
            } else if (i % 3 == 0) {
                ret.add("Fizz");
            } else {
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }

}
