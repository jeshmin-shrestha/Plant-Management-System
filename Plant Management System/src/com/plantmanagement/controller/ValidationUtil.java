 
package com.plantmanagement.controller;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;
/**
 *
 * @author Jeshmin Shrestha 
 * LUMID 23048596
 */
public class ValidationUtil {
//  For validating various input fields
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+( [a-zA-Z]+)*$");
    private static final Pattern PLANTID_PATTERN = Pattern.compile("^\\d{7}$");
    private static final Pattern CATEGORY_PATTERN = Pattern.compile("^(Indoor|Outdoor|Flowering)$");
    private static final Pattern GROWTHSTATUS_PATTERN = Pattern.compile("^(Sprouting|Budding|Flowering|Fruiting|Dormant)$");
    private static final Pattern PRICE_PATTERN = Pattern.compile("^\\d+(\\.\\d{1,2})?$");
    private static final Pattern STOCKQUANTITY_PATTERN = Pattern.compile("^\\d+$");
    private static final Pattern ADDEDDATE_PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
    private static final Pattern BLOOM_PATTERN = Pattern.compile("^(Summer|Winter|Autumn|Spring|Year Round)$");
    private static final Pattern SEARCH_PATTERN=Pattern.compile("^\\d{7}$");
    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();// Validates name format  
    }

    /**
     * Validates if the Plant ID is exactly 7 digits.
     *
     * @param plantId the Plant ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPlantId(int plantId) {
        return PLANTID_PATTERN.matcher(String.valueOf(plantId)).matches();// Checks if plant ID matches the 7-digit format
    }

    /**
     * Validates if the plantCategory is one of the allowed options.
     *
     * @param plantCategory the program to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPlantCategory(String plantCategory) {
        if(!CATEGORY_PATTERN.matcher(String.valueOf(plantCategory)).matches()){
             // Show error message if the category is invalid
            JOptionPane.showMessageDialog(null, "Plant Category must be 'Indoor', 'Outdoor', or 'Flowering'.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return false;// Return false for invalid category
        }
        return true;  // Return true for valid category
    }
/**
     * Validates if the plantBloom is one of the allowed options.
     *
     * @param plantBloomSeason the program to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPlantBloomSeason(String plantBloomSeason) {
        if(!BLOOM_PATTERN.matcher(String.valueOf(plantBloomSeason)).matches()){
            // Show error message if the blooming season is invalid
            JOptionPane.showMessageDialog(null, "Plant BloomingSeason must be 'Summer', 'Winter', 'Spring','Autumn'or 'Year Round'.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return false; // Return false for invalid bloom season
        }
        return true; // Return true for valid bloom season
    }
    /**
     * Validates if the growthStatus is one of the allowed options.
     *
     * @param growthStatus the growth to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidGrowthStatus(String growthStatus) {
        if(!GROWTHSTATUS_PATTERN.matcher(String.valueOf(growthStatus)).matches()){
             // Show error message if the growth status is invalid
            JOptionPane.showMessageDialog(null, "Growth Stage must be 'Sprouting', 'Budding', 'Flowering', 'Fruiting', or 'Dormant'.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return false;// Return false for invalid growth statu
        }
        return true;  // Return true for valid growth status 
    }

    /**
     * Validates if the price is a digit (inclusive).
     *
     * @param price the price to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPrice(double price) {
    if (price <= 0 || !PRICE_PATTERN.matcher(String.valueOf(price)).matches()) {
        // Show error message if the price is invalid
            JOptionPane.showMessageDialog(null, "Price must be a positive number with up to two decimal places.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return false;// Return false for invalid price
        }
        return true;// Return true for valid price
    }
     /**
     * Validates if the input value is not null or empty and matches the given criteria.
     *
     * @param value the value to validate
     * @param isCriteria the criteria to check against
     * @return true if valid, otherwise false
     */
    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;// Check if the value is not empty and matches the criteria
    }
    
    
    /**
     * Validates if the stockQuantity is a positive number (inclusive).
     *
     * @param stockQuantity the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidStockQuantity(int stockQuantity) {
        if (stockQuantity < 0|| !STOCKQUANTITY_PATTERN.matcher(String.valueOf(stockQuantity)).matches()) {
            JOptionPane.showMessageDialog(null, "Stock Quantity must be a positive integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return false;// Return false for invalid stock quantity
        }
        return true;// Return true for valid stock quantity
    }
    /**
     * Validates if the price text can be parsed and is a valid price.
     *
     * @param priceText the price text to validate
     * @return true if valid, otherwise false
     */
    public static boolean validatePrice(String priceText) {
        try {
            double price = Double.parseDouble(priceText.trim());
            return isValidPrice(price);// Check if the parsed price is valid
        } catch (NumberFormatException e) {
            return false;// Return false if parsing fails
        }
    }
    /**
     * Validates if the Plant ID is exactly 7 digits.
     *
     * @param searchId the Plant ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidSearchId(int searchId) {
        return SEARCH_PATTERN.matcher(String.valueOf(searchId)).matches();// Checks if plant ID matches the 7-digit format
    }


}