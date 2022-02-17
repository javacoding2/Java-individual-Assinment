package individualassinment;

import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public static void main(String[] args) {
        // Initializing the array
        String array[] = { "Ram","Hari","Pradip","Kiran","Zyan" };

        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the elements
        System.out.println(Arrays.toString(array));
    }
    }

