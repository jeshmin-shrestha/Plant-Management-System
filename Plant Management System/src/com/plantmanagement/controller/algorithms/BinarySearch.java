/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.plantmanagement.controller.algorithms;

import com.PlantManagement.model.PlantModel;

import java.util.List;

/**
 *Implements the Binary Search  to search from list of PlantModel objects 
 * by their Plant Name 
 * @author Jeshmin Shrestha
 * LUMID 23048596
 */

public class BinarySearch {

    /**
     * 
     * Method to perform binary search on a sorted list of plants by name
     * 
     * @param searchValue the name of the plant to search for (case-insensitive)
     * @param plantList the list of plants, which should be sorted by plant name
     * @param left the starting index of the search range (inclusive)
     * @param right the ending index of the search range (inclusive)
     * @return the `PlantModel` object that matches the search value, or `null` if not found
     */
    public PlantModel searchByPlantName(String searchValue, List<PlantModel> plantList,
            int left, int right) {
        if (plantList == null || plantList.isEmpty()) {
    return null;
}
        // Base case: If the range is invalid, return null (not found)
        if (right < left) {
            return null;
        }

        // Calculate the middle index
        int mid = (left + right) / 2;

        // Compare the search value with the plant name at the mid-point
        int comparison = searchValue.compareToIgnoreCase(plantList.get(mid).getPlantName());

        if (comparison == 0) {
            // If the search value matches the mid-point plant name, return the plant
            return plantList.get(mid);
        } else if (comparison < 0) {
            // If the search value is smaller, search the left half
            return searchByPlantName(searchValue, plantList, left, mid - 1);
        } else {
            // If the search value is larger, search the right half
            return searchByPlantName(searchValue, plantList, mid + 1, right);
        }
    }
}
