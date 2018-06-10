/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class HBoxVBoxDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        
        VBox vbox = new VBox(10);
        root.setLeft(vbox);
        for (int i = 0; i < 5; i++) {
            Rectangle rectangle = new Rectangle(40, 40);
            vbox.getChildren().add(rectangle);
        }
        
        HBox hbox = new HBox(40);
        hbox.setAlignment(Pos.CENTER);
        root.setTop(hbox);
        for (int i = 0; i < 5; i++) {
            Circle circle = new Circle(20);
            hbox.getChildren().add(circle);
        }
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
