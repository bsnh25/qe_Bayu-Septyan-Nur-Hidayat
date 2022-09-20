package Case2;// Java program to remove duplicates from ArrayList

import java.util.*;

public class GFG {

    // Function to remove duplicates from an ArrayList
    public static <String> ArrayList<String>
    removeDuplicates(ArrayList<String> list) {
        // Create a new ArrayList
        ArrayList<String> newList = new ArrayList<String>();

        // Traverse through the first list
        for (String element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }
        // return the new list
        return newList;
    }

    // Driver code
    public static void main(String args[]) {

        // Get the ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        // Remove duplicates
        ArrayList<Integer> newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}
