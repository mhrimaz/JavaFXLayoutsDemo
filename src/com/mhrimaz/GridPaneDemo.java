/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class GridPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        Scene scene = new Scene(root);

        root.setPadding(new Insets(10));
        root.setHgap(20);
        root.setVgap(5);

        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(90, 150, Double.MAX_VALUE);
        column2.setHgrow(Priority.ALWAYS);

        root.getColumnConstraints().addAll(column1, column2);

        Label formLbl = new Label("Enter your First name and last name");
        Label fNameLbl = new Label("First Name");
        TextField fNameFld = new TextField();
        Label lNameLbl = new Label("Last Name");
        TextField lNameFld = new TextField();

        Button saveButton = new Button("Save");

        // form label
        GridPane.setHalignment(formLbl, HPos.LEFT);
        root.add(formLbl, 0, 0, 2, 1);

        // First name label
        GridPane.setHalignment(fNameLbl, HPos.LEFT);
        root.add(fNameLbl, 0, 1);

        // Last name label
        GridPane.setHalignment(lNameLbl, HPos.LEFT);
        root.add(lNameLbl, 0, 2);

        // First name field
        GridPane.setHalignment(fNameFld, HPos.LEFT);
        root.add(fNameFld, 1, 1);

        // Last name field
        GridPane.setHalignment(lNameFld, HPos.LEFT);
        root.add(lNameFld, 1, 2);

        // Save button
        GridPane.setHalignment(saveButton, HPos.RIGHT);
        root.add(saveButton, 2, 3);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
