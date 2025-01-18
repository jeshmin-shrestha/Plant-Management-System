/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PlantManagement.model;

/**
 * Represents a plant with various attributes such as ID, name, category, growth
 * stage, stock quantity, price, added date, and blooming season. Provides
 * getter and setter methods to access and modify these attributes.
 *
 * @author Jeshmin Shrestha LUMID 23048596
 */
public class PlantModel {
    // Attributes to store details of each plant

    private int plantId;
    private String plantName;
    private String plantCategory;
    private String growthStage;
    private int stockQuantity;
    private double price;
    private String addedDate;
    private String plantBloomSeason;

    /**
     * Default constructor to create an empty PlantModel object.
     */
    public PlantModel() {
    }

    /**
     * Parameterized constructor to initialize the attributes of the plant.
     *
     * @param plantId The unique identifier for the plant.
     * @param plantName The name of the plant.
     * @param plantCategory The category of the plant (e.g., Indoor, Outdoor).
     * @param growthStage The current growth stage of the plant.
     * @param plantBloomSeason The season in which the plant blooms.
     * @param stockQuantity The number of plants available in stock.
     * @param price The price of the plant.
     * @param addedDate The date the plant was added to the system.
     */
    public PlantModel(int plantId, String plantName, String plantCategory, String growthStage, String plantBloomSeason,
            int stockQuantity, double price, String addedDate) {
        this.plantId = plantId;
        this.plantName = plantName;
        this.plantCategory = plantCategory;
        this.growthStage = growthStage;
        this.plantBloomSeason = plantBloomSeason;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.addedDate = addedDate;
    }


    /**
     * Gets the unique identifier for the plant.
     *
     * @return The plant ID.
     */
    public int getPlantId() {
        return plantId;
    }

    /**
     * Sets the unique identifier for the plant.
     *
     * @param plantId The plant ID to set.
     */
    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    /**
     * Gets the name of the plant.
     *
     * @return The plant name.
     */
    public String getPlantName() {
        return plantName;
    }

    /**
     * Sets the name of the plant.
     *
     * @param plantName The name to set for the plant.
     */
    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    /**
     * Gets the category of the plant.
     *
     * @return The plant category.
     */
    public String getPlantCategory() {
        return plantCategory;
    }

    /**
     * Sets the category of the plant.
     *
     * @param plantCategory The category to set for the plant (e.g., Indoor,
     * Outdoor).
     */
    public void setPlantCategory(String plantCategory) {
        this.plantCategory = plantCategory;
    }

    /**
     * Gets the current growth stage of the plant.
     *
     * @return The plant growth stage.
     */
    public String getGrowthStage() {
        return growthStage;
    }

    /**
     * Sets the current growth stage of the plant.
     *
     * @param growthStage The growth stage to set for the plant.
     */
    public void setGrowthStage(String growthStage) {
        this.growthStage = growthStage;
    }

    /**
     * Gets the blooming season of the plant.
     *
     * @return The plant blooming season.
     */
    public String getPlantBloomSeason() {
        return plantBloomSeason;
    }

    /**
     * Sets the blooming season of the plant.
     *
     * @param plantBloomSeason The blooming season to set for the plant.
     */
    public void setPlantBloomSeason(String plantBloomSeason) {
        this.plantBloomSeason = plantBloomSeason;
    }

    /**
     * Gets the quantity of the plant available in stock.
     *
     * @return The stock quantity.
     */
    public int getStockQuantity() {  // Return stockQuantity correctly
        return stockQuantity;  // Now returns the actual stock quantity
    }

    /**
     * Sets the quantity of the plant available in stock.
     *
     * @param stockQuantity The stock quantity to set for the plant.
     */
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /**
     * Gets the price of the plant.
     *
     * @return The plant price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the plant.
     *
     * @param price The price to set for the plant.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the date when the plant was added to the system.
     *
     * @return The added date.
     */
    public String getAddedDate() {
        return addedDate;
    }

    /**
     * Sets the date when the plant was added to the system.
     *
     * @param addedDate The date to set for the plant.
     */
    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }
}
