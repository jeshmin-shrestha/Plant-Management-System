/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.plantmanagement.controller.algorithms;
import com.PlantManagement.model.PlantModel;

import java.util.List;
/**
 *
 * @author Jeshmin Shrestha 
 * LUMID 23048596
 */

public class BinarySearch {

   /**
     * Sorts a list of PlantModel objects by plantId and then performs a binary search.
     *
     * @param plantList The list of PlantModel objects.
     * @param plantId   The plantId to search for.
     * @return The PlantModel object if found; otherwise, null.
     */
    public PlantModel binarySearchByIdWithSorting(List<PlantModel> plantList, int plantId) {
        // Step 1: Sort the list by plantId
        plantList.sort((a, b) -> Integer.compare(a.getPlantId(), b.getPlantId()));

        // Step 2: Perform binary search
        int low = 0;
        int high = plantList.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            PlantModel midPlant = plantList.get(mid);

            if (midPlant.getPlantId() == plantId) {
                return midPlant; // Plant found
            } else if (midPlant.getPlantId() < plantId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null; // Plant not found
    }
}
