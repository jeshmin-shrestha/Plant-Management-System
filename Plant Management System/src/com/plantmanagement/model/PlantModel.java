/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PlantManagement.model;

/**
 *
 * @author Jeshmin Shrestha
 * LUMID 23048596
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
    // Default constructor

    public PlantModel() {
    }
// Parameterized constructor to initialize the attributes

    public PlantModel(int plantId, String plantName, String plantCategory, String growthStage, String plantBloomSeason, int stockQuantity, double price, String addedDate) {
        this.plantId = plantId;
        this.plantName = plantName;
        this.plantCategory = plantCategory;
        this.growthStage = growthStage;
        this.plantBloomSeason = plantBloomSeason;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.addedDate = addedDate;
    }
// Getter and setter methods for each attribute
    // Getter and setter methods for plantId

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }
// Getter and setter methods for plantName

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }
// Getter and setter methods for plantcategory

    public String getPlantCategory() {
        return plantCategory;
    }

    public void setPlantCategory(String plantCategory) {
        this.plantCategory = plantCategory;
    }
// Getter and setter methods for plantGrowthStage

    public String getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(String growthStage) {
        this.growthStage = growthStage;
    }
    // Getter and setter methods for plantBloomSeason

    public String getPlantBloomSeason() {
        return plantBloomSeason;
    }

    public void setPlantBloomSeason(String plantBloomSeason) {
        this.plantBloomSeason = plantBloomSeason;
    }
    // Getter and setter methods for stockQuantity

    public int getStockQuantity() {  // Return stockQuantity correctly
        return stockQuantity;  // Now returns the actual stock quantity
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    // Getter and setter methods for price

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Getter and setter methods for addedDate

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }
}
