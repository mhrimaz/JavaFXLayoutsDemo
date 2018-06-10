/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import java.util.Scanner;
import javafx.application.Application;

/**
 *
 * @author mhrimaz
 */
public class JavaFXLayoutsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please Slecet a Layout Demo: \n"
                + "1:  BoarderPane\n2:  AnchorPane\n3:  HBox&VBoxPane\n4:  StackPane"
                + "\n5:  GridPane\n6:  ScrollPane\n7:  FlowPane\n8:  TilePane"
                + "\n9:  SplitPane\n10: TabPane");
        Class[] classes = {BorderPaneDemo.class, AnchorPaneDemo.class,
            HBoxVBoxDemo.class, StackPaneDemo.class, GridPaneDemo.class,
            ScrollPaneDemo.class, FlowPaneDemo.class, TilePaneDemo.class,
            FlowPaneDemo.class, TilePaneDemo.class, SplitPaneDemo.class,
            TabPaneDemo.class};
        try (Scanner scanner = new Scanner(System.in)) {
            int layoutIndex = scanner.nextInt();
            Application.launch(classes[layoutIndex], args);
        }

    }

}
