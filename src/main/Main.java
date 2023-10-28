/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.GarbageCollectioncontroller;
import java.util.Scanner;
import model.GarbageCollection;
import view.GarbageCollectionvew;

/**
 *
 * @author son
 */
public class Main {

    public static void main(String[] args) {
        int[] garbageAtStations = {1765, 2808, 952, 4206, 3102, 3902, 1292, 3985, 8324, 1928, 4426, 397, 3277};

        GarbageCollection model = new GarbageCollection(garbageAtStations);
        GarbageCollectionvew view = new GarbageCollectionvew();

        // Create object of Controller
        GarbageCollectioncontroller controller = new GarbageCollectioncontroller(model, view);

        // Calculate cost and update view
        controller.calculateCost();
        controller.updateView();
    }

}
