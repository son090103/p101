/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GarbageCollection;
import view.GarbageCollectionvew;

/**
 *
 * @author son
 */
public class GarbageCollectioncontroller {
     private GarbageCollection model;
    private  GarbageCollectionvew  view;

    public GarbageCollectioncontroller(GarbageCollection model, GarbageCollectionvew view) {
        this.model = model;
        this.view = view;
    }

   

    public void updateView() {
        view.printTotalCost(model.getTotalCost());
    }

    public void calculateCost() {
        model.calculateCost();
    }
}
