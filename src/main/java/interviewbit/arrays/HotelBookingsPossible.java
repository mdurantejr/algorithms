package interviewbit.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HotelBookingsPossible {

    public static void main(String[] args) {
//        A = [1, 3, 5]
//        B = [2, 6, 8]
//        C = 1 -> false
        List<Integer> arrive = Arrays.asList(1, 3, 5);
        List<Integer> depart = Arrays.asList(2, 6, 8);
        int k = 1;
        System.out.println(new HotelBookingsPossible().hotel(arrive, depart, k));

    }

    public boolean hotel(List<Integer> arrive, List<Integer> depart, int K) {
        /*
            Explanation from interview bit participant:
            The idea is to simply sort the 2 arrays (Array for arrival dates and Array for departure dates) first.
            Now, the next step would be to check how many overlaps are present in one particular range. If the number of
            overlaps are greater than the number of rooms, we can say that we have less rooms to accommodate guests.
            So, for a particular range where arrival date(ith of Arrival array) being the start date and departure
            date(ith of departure array) being the end date, overlap can be only possible if the next arrival
            dates(from i+1th) are less than end date of the range and greater than or equal to start date of the range
            (Since this is a sorted array, we don’t need to take care about the latter condition).
            Considering the fact, that we have sorted array, we directly need to check if the next Kth (i+Kth)
            arrival date falls in the range, if it does, all the dates before that arrival date will also fall in the taken
            range, resulting in K+1 overlaps with the range in question, hence exceeding the number of rooms.
         */

        Collections.sort(arrive);
        Collections.sort(depart);

        for (int i = 0; i < arrive.size(); i++) {
            if (i + K < arrive.size() && arrive.get(i + K) < depart.get(i))
                return false;
        }
        return true;
    }

}
