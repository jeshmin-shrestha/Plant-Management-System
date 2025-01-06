package com.plantmanagement.controller.algorithms;

import com.PlantManagement.model.PlantModel;
import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    /**
     * Sorts a list of PlantModel objects by price using Insertion Sort.
     *
     * @param plantList   The list of PlantModel objects to be sorted.
     * @param descending  If true, sorts in descending order; otherwise, ascending.
     * @return The sorted list of PlantModel objects.
     */
    public static List<PlantModel> sortByPrice(List<PlantModel> plantList, boolean descending) {
        // Create a copy of the input list to avoid modifying the original
        List<PlantModel> sortedList = new ArrayList<>(plantList);

        // Perform Insertion Sort
        for (int i = 1; i < sortedList.size(); i++) {
            PlantModel key = sortedList.get(i);
            int j = i - 1;

            // Compare price based on the descending flag
            while (j >= 0) {
                int comparison = Double.compare(sortedList.get(j).getPrice(), key.getPrice());
                if (descending) {
                    comparison = -comparison; // Reverse comparison for descending order
                }

                if (comparison > 0) {
                    sortedList.set(j + 1, sortedList.get(j));
                    j--;
                } else {
                    break;
                }
            }
            sortedList.set(j + 1, key);
        }

        return sortedList;
    }
}
