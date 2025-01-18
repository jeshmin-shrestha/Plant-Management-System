/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.plantmanagement.controller.datastructure;
import com.PlantManagement.model.PlantModel;
import java.util.LinkedList;
/**
 *Implements the Plant Stack through list of PlantModel objects 
 * 
 * @author Jeshmin Shrestha 
 * LUMID 23048596
 */
public class PlantStack {
private LinkedList<PlantModel> stack;

    // Constructor to initialize the stack
    public PlantStack() {
        this.stack = new LinkedList<>(); // Initializes the stack when the object is created
    }  

/**
     * Pushes a PlantModel object onto the stack.
     * 
     * @param plant the PlantModel object to be pushed onto the stack
     */
    public void push(PlantModel plant) {
        stack.push(plant);
    }
/**
     * Removes and returns the PlantModel object at the top of the stack.
     * 
     * @return the PlantModel object at the top of the stack, or null if the stack is empty
     */
    public PlantModel pop() {
    if (stack.isEmpty()) {
        return null; // Return null if the stack is empty
    } else {
        return stack.pop(); // Otherwise, pop and return the top element
    }
    }
 /**
     * Checks whether the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
