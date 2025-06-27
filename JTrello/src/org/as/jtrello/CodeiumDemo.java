package org.as.jtrello;

import java.util.ArrayList;

public class CodeiumDemo {

    /**
     * Check if a number is present in the given list.
     *
     * @param  number	The number to check for in the list.
     * @param  list		The list of integers to search for the number.
     * @return         	True if the number is found in the list, false otherwise.
     */
    public boolean isNumberInList(int number, ArrayList<Integer> list) {
        return list.contains(number);
    }


}
