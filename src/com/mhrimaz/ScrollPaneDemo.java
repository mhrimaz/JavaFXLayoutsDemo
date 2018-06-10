/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class ScrollPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stackPane = new StackPane();
        ScrollPane root = new ScrollPane();
        root.setPannable(true);
        root.setFitToHeight(true);
        root.setFitToWidth(true);

        Rectangle rectangle = new Rectangle(900, 400);
        stackPane.getChildren().add(rectangle);

        root.setContent(stackPane);
        Scene scene = new Scene(root, 600, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
