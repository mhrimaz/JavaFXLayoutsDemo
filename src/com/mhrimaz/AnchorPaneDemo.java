/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class AnchorPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane root = new AnchorPane();

        Button button = new Button("You Can Click Me");

        AnchorPane.setLeftAnchor(button, 30D);
        AnchorPane.setRightAnchor(button, 30D);
        AnchorPane.setTopAnchor(button, 30D);

        root.getChildren().add(button);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
