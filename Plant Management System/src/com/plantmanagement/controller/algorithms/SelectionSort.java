/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.SelectionSort to edit this template
 */
package com.plantmanagement.controller.algorithms;

import com.PlantManagement.model.PlantModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeshmin Shrestha 
 * LUMID 23048596
 */
public class SelectionSort {

    List<PlantModel> plantSortList;

    public SelectionSort() {
        plantSortList = new ArrayList<>();

    }

    /**
     * Sorts a list of PlantModel objects by their Plant ID in ascending or
     * descending order.
     *
     * @param plantList the list of PlantModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<PlantModel> sortByPlantId(List<PlantModel> plantList, boolean isDesc) {
        this.plantSortList.clear();
        this.plantSortList.addAll(plantList);
        if (plantSortList == null || plantSortList.isEmpty()) {
            throw new IllegalArgumentException("Plant list cannot be null or empty.");
        }

        for (int i = 0; i < plantSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(plantSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(plantSortList, i, extremumIndex);
            }
        }

        return plantSortList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param plantSortList the list of PlantModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<PlantModel> plantSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < plantSortList.size(); j++) {
            if (shouldSwap(plantSortList.get(j).getPlantId(), plantSortList.get(extremumIndex).getPlantId(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param plantSortList the list of PlantModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<PlantModel> plantSortList, int i, int j) {
        PlantModel temp = plantSortList.get(i);
        plantSortList.set(i, plantSortList.get(j));
        plantSortList.set(j, temp);
    }
}
