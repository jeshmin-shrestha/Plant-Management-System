/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.plantmanagement.controller.algorithms;

import com.PlantManagement.model.PlantModel;
import java.util.ArrayList;
import java.util.List;

/**
 *Implements the MergeSort algorithm to sort a list of PlantModel objects 
 * by their Plant Name in either ascending or descending order.
 * 
 * @author Jeshmin Shrestha
 * LUMID 23048596
 */
public class MergeSort {

    /**
     * Sorts a list of PlantModel objects by PlantName using Merge Sort.
     *
     * @param plantList The list of PlantModel objects to be sorted.
     * @param descending If true, sorts in descending order; otherwise,
     * ascending.
     * @return The sorted list of PlantModel objects.
     */
    public List<PlantModel> mergeSortByPlantName(List<PlantModel> plantList, boolean descending) {
        if (plantList == null || plantList.isEmpty()) {
            throw new IllegalArgumentException("Plant list cannot be null or empty.");
        }

        if (plantList.size() <= 1) {
            return plantList;
        }

        // Split the list into two halves
        int mid = plantList.size() / 2;
        List<PlantModel> left = new ArrayList<>(plantList.subList(0, mid));
        List<PlantModel> right = new ArrayList<>(plantList.subList(mid, plantList.size()));

        // Recursively sort both halves
        left = mergeSortByPlantName(left, descending);
        right = mergeSortByPlantName(right, descending);

        // Merge the sorted halves
        List<PlantModel> merged = new ArrayList<>(plantList.size());
        merge(left, right, merged, descending);

        return merged;
    }

    /**
     * Merges two sorted lists into a single sorted list.
     *
     * @param left The left sorted list.
     * @param right The right sorted list.
     * @param merged The list to store the merged result.
     * @param descending If true, merges in descending order; otherwise,
     * ascending.
     */
    private void merge(List<PlantModel> left, List<PlantModel> right, List<PlantModel> merged, boolean descending) {
        int lCounter = 0; // Counter for the left list
        int rCounter = 0; // Counter for the right list
        int mCounter = 0; // Counter for the merged list

        // Finding the minimum/maximum value and merging
        while (lCounter < left.size() && rCounter < right.size()) {
            int comparison = left.get(lCounter).getPlantName().compareTo(right.get(rCounter).getPlantName());
            if (descending) {
                comparison = -comparison; // Reverse for descending order
            }

            if (comparison <= 0) {
                merged.add(mCounter++, left.get(lCounter++));
            } else {
                merged.add(mCounter++, right.get(rCounter++));
            }
        }

        // Merge remaining elements from the left list
        while (lCounter < left.size()) {
            merged.add(mCounter++, left.get(lCounter++));
        }

        // Merge remaining elements from the right list
        while (rCounter < right.size()) {
            merged.add(mCounter++, right.get(rCounter++));
        }
    }
}
